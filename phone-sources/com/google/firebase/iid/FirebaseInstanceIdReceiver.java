package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import defpackage.fba;
import defpackage.num;
import defpackage.nuq;
import defpackage.osk;
import defpackage.uiv;
import defpackage.uol;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends nuq {
    @Override // defpackage.nuq
    protected final int a(Context context, num numVar) {
        try {
            return ((Integer) osk.s(uol.b(numVar.a, context, new fba(11)))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.nuq
    protected final void b(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (uiv.z(intentPutExtras)) {
            uiv.x("_nd", intentPutExtras.getExtras());
        }
    }
}
