package com.google.android.gms.common.api;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import defpackage.aeq;
import defpackage.aer;
import defpackage.aeu;
import defpackage.ahf;
import defpackage.aie;
import defpackage.aih;
import defpackage.b;
import defpackage.qp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int a = 0;

    private final void a() {
        GoogleApiActivity googleApiActivity;
        AlertDialog alertDialogCreate;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent != null) {
            try {
                googleApiActivity = this;
            } catch (ActivityNotFoundException e) {
                e = e;
                googleApiActivity = this;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
            }
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.a = 1;
                return;
            } catch (ActivityNotFoundException e3) {
                e = e3;
                if (extras.getBoolean("notify_manager", true)) {
                    ahf.c(this).d(new aeq(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String strI = b.i(pendingIntent, "Activity not found while launching ", ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        strI = strI.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", strI, e);
                }
                googleApiActivity.a = 1;
                finish();
                return;
            } catch (IntentSender.SendIntentException e4) {
                e = e4;
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
                return;
            }
        }
        qp.p(num);
        int iIntValue = num.intValue();
        aih aihVar = new aih(aeu.a.d(this, iIntValue, "d"), this);
        if (iIntValue == 0) {
            alertDialogCreate = null;
        } else {
            TypedValue typedValue = new TypedValue();
            getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(this, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(this);
            }
            builder.setMessage(aie.b(this, iIntValue));
            builder.setOnCancelListener(this);
            Resources resources = getResources();
            String string = iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.tv.remote.service.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.tv.remote.service.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.tv.remote.service.R.string.common_google_play_services_install_button);
            if (string != null) {
                builder.setPositiveButton(string, aihVar);
            }
            String strC = aie.c(this, iIntValue);
            if (strC != null) {
                builder.setTitle(strC);
            }
            Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", num), new IllegalArgumentException());
            alertDialogCreate = builder.create();
        }
        if (alertDialogCreate != null) {
            FragmentManager fragmentManager = getFragmentManager();
            aer aerVar = new aer();
            alertDialogCreate.setOnCancelListener(null);
            alertDialogCreate.setOnDismissListener(null);
            aerVar.a = alertDialogCreate;
            aerVar.b = this;
            aerVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
        }
        this.a = 1;
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                ahf ahfVarC = ahf.c(this);
                if (i2 == -1) {
                    Handler handler = ahfVarC.k;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    ahfVarC.d(new aeq(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            a();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}
