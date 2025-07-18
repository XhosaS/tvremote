package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v7.appcompat.R;
import defpackage.hih;
import defpackage.hiy;
import defpackage.hjs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    private ResultReceiver a;
    private boolean b;
    private boolean c;
    private int d;
    private long e;
    private boolean f;

    private final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    private final Intent b(int i, long j) {
        Intent intentA = a();
        intentA.putExtra("RESPONSE_CODE", 6);
        intentA.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
        intentA.putExtra("FAILURE_LOGGING_PAYLOAD", hih.b(i, 2, hjs.i(6, 0, "An internal error occurred.")).h());
        intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
        intentA.putExtra("billingClientTransactionId", j);
        intentA.putExtra("wasServiceAutoReconnected", this.f);
        return intentA;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f4  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle != null) {
            int i = hiy.a;
            this.b = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("in_app_message_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
            this.c = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            this.d = bundle.getInt("activity_code", 100);
            if (bundle.containsKey("billingClientTransactionId")) {
                this.e = bundle.getLong("billingClientTransactionId");
            }
            if (bundle.containsKey("wasServiceAutoReconnected")) {
                this.f = bundle.getBoolean("wasServiceAutoReconnected");
                return;
            }
            return;
        }
        int i2 = hiy.a;
        this.d = 100;
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.c = true;
                this.d = R.styleable.AppCompatTheme_textColorAlertDialogListItem;
            }
        } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
            this.d = 101;
        } else {
            pendingIntent = null;
        }
        if (getIntent().hasExtra("billingClientTransactionId")) {
            this.e = getIntent().getLongExtra("billingClientTransactionId", 0L);
        }
        if (getIntent().hasExtra("wasServiceAutoReconnected")) {
            this.f = getIntent().getBooleanExtra("wasServiceAutoReconnected", false);
        }
        try {
            this.b = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), this.d, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e) {
            hiy.f("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
            ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(0, null);
            } else {
                Intent intentB = b(149, this.e);
                if (this.c) {
                    intentB.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                }
                sendBroadcast(intentB);
            }
            this.b = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.b) {
            Intent intentA = a();
            intentA.putExtra("RESPONSE_CODE", 1);
            intentA.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            if (this.c) {
                intentA.putExtra("IS_FIRST_PARTY_PURCHASE", true);
            }
            int i = this.d;
            if (i == 110 || i == 100) {
                intentA.putExtra("INTENT_SOURCE", "LAUNCH_BILLING_FLOW");
                intentA.putExtra("billingClientTransactionId", this.e);
            }
            sendBroadcast(intentA);
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.b);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.c);
        bundle.putInt("activity_code", this.d);
        bundle.putLong("billingClientTransactionId", this.e);
        bundle.putBoolean("wasServiceAutoReconnected", this.f);
    }
}
