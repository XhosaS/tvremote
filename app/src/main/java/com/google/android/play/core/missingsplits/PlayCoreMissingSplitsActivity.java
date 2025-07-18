package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.vdd;
import defpackage.vdg;
import defpackage.vdh;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    private final String a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    private final void b(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(a.e(str, "market://details?id=", "&referrer=utm_source%3Dplay.core.missingsplits"))).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e) {
            vdd vddVar = new vdd(getClass().getName());
            Object[] objArr = {str};
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", vdd.a(vddVar.a, "Couldn't start missing splits activity for %s", objArr), e);
            }
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            b(getPackageName());
        }
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) throws NoSuchAlgorithmException {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        vdd vddVar = vdh.a;
        try {
            if (getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        vdh.a.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String strA = vdg.a(signature.toByteArray());
                            arrayList.add(strA);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA))) {
                                neutralButton.setMessage("The app " + a() + " is missing required components and must be reinstalled from the Google Play Store.").setPositiveButton("Reinstall", this);
                                break;
                            }
                        }
                        vdd vddVar2 = vdh.a;
                        StringBuilder sb = new StringBuilder();
                        Iterator it = arrayList.iterator();
                        if (it.hasNext()) {
                            while (true) {
                                sb.append((CharSequence) it.next());
                                if (!it.hasNext()) {
                                    break;
                                } else {
                                    sb.append((CharSequence) ", ");
                                }
                            }
                        }
                        vddVar2.b(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", sb.toString()), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    vdh.a.b("Play Store package is not found.", new Object[0]);
                }
            } else {
                vdh.a.b("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            vdh.a.b("Play Store package is not found.", new Object[0]);
        }
        neutralButton.setMessage("The app " + a() + " is missing required components and must be reinstalled from an official store.");
        neutralButton.create().show();
    }
}
