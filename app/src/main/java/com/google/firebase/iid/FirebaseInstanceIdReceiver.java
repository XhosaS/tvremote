package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import defpackage.aaow;
import defpackage.aapb;
import defpackage.aapt;
import defpackage.kbs;
import defpackage.lvq;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends kbs {
    @Override // defpackage.kbs
    protected final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) lvq.d(aapb.b(cloudMessage.a, context, new aaow()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.kbs
    protected final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (aapt.f(intentPutExtras)) {
            aapt.d("_nd", intentPutExtras.getExtras());
        }
    }
}
