package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import defpackage.a;
import defpackage.nve;
import defpackage.nvj;
import defpackage.nzg;
import defpackage.ocv;
import defpackage.ogf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    protected int a = 0;

    private final void a() {
        GoogleApiActivity googleApiActivity;
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
        if (pendingIntent == null) {
            ocv.aF(num);
            nvj.a.d(this, num.intValue(), 2, this);
            this.a = 1;
            return;
        }
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
        } catch (ActivityNotFoundException e3) {
            e = e3;
            if (extras.getBoolean("notify_manager", true)) {
                nzg.c(this).d(new nve(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String strCh = a.ch(pendingIntent, "Activity not found while launching ", ".");
                if (Build.FINGERPRINT.contains("generic")) {
                    strCh = strCh.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", strCh, e);
            }
            googleApiActivity.a = 1;
            finish();
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
            finish();
        }
    }

    public static Intent getIntentForErrorCode(Context context, int i, int i2) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("error_code", i);
        intent.putExtra("failing_client_id", i2);
        intent.putExtra("notify_manager", false);
        return intent;
    }

    public static Intent getIntentForResolution(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    public static PendingIntent wrapPendingIntent(Context context, PendingIntent pendingIntent, int i) {
        return wrapPendingIntent(context, pendingIntent, i, true);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                nzg nzgVarC = nzg.c(this);
                if (i2 == -1) {
                    nzgVarC.e();
                } else if (i2 == 0) {
                    nzgVarC.d(new nve(13, null), getIntent().getIntExtra("failing_client_id", -1));
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

    public static PendingIntent wrapPendingIntent(Context context, PendingIntent pendingIntent, int i, boolean z) {
        return PendingIntent.getActivity(context, 0, getIntentForResolution(context, pendingIntent, i, z), ogf.a | 134217728);
    }
}
