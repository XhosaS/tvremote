package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfu {
    private static final ulp a = new ulp("PhoneskyVerificationUtils", (byte[]) null);

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        a.ao("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String strD = sio.d(signature.toByteArray());
                            arrayList.add(strD);
                            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strD) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strD))) {
                                return true;
                            }
                        }
                        a.ao(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", a.ac(arrayList)), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    a.ao("Play Store package is not found.", new Object[0]);
                }
            } else {
                a.ao("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            a.ao("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
