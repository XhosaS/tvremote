package com.android.billingclient.api;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.fl;
import defpackage.gp;
import defpackage.gv;
import defpackage.hb;
import defpackage.hiq;
import defpackage.hiy;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends fl {
    public ResultReceiver a;
    public ResultReceiver b;
    public ResultReceiver c;
    public ResultReceiver d;
    private gp e;
    private gp f;
    private gp g;
    private gp h;

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.e = registerForActivityResult(new hb(), new hiq(this, 0));
        this.f = registerForActivityResult(new hb(), new hiq(this, 2));
        this.g = registerForActivityResult(new hb(), new hiq(this, 3));
        this.h = registerForActivityResult(new hb(), new hiq(this, 4));
        if (bundle != null) {
            if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.a = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.b = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
            }
            if (bundle.containsKey("external_offer_flow_result_receiver")) {
                this.c = (ResultReceiver) bundle.getParcelable("external_offer_flow_result_receiver");
            }
            if (bundle.containsKey("install_external_app_result_receiver")) {
                this.d = (ResultReceiver) bundle.getParcelable("install_external_app_result_receiver");
                return;
            }
            return;
        }
        int i = hiy.a;
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.a = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.e.b(new gv(pendingIntent).a());
            return;
        }
        if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
            this.b = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
            this.f.b(new gv(pendingIntent2).a());
        } else if (getIntent().hasExtra("external_offer_flow_pending_intent")) {
            PendingIntent pendingIntent3 = (PendingIntent) getIntent().getParcelableExtra("external_offer_flow_pending_intent");
            this.c = (ResultReceiver) getIntent().getParcelableExtra("external_offer_flow_result_receiver");
            this.g.b(new gv(pendingIntent3).a());
        } else if (getIntent().hasExtra("install_external_app_flow_pending_intent")) {
            PendingIntent pendingIntent4 = (PendingIntent) getIntent().getParcelableExtra("install_external_app_flow_pending_intent");
            this.d = (ResultReceiver) getIntent().getParcelableExtra("install_external_app_result_receiver");
            this.h.b(new gv(pendingIntent4).a());
        }
    }

    @Override // defpackage.fl, defpackage.ds, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.a;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.c;
        if (resultReceiver3 != null) {
            bundle.putParcelable("external_offer_flow_result_receiver", resultReceiver3);
        }
        ResultReceiver resultReceiver4 = this.d;
        if (resultReceiver4 != null) {
            bundle.putParcelable("install_external_app_result_receiver", resultReceiver4);
        }
    }
}
