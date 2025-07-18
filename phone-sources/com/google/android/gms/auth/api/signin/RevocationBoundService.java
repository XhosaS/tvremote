package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import defpackage.njq;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class RevocationBoundService extends Service {
    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(intent.getAction()) || "com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(intent.getAction())) {
            return new njq(this, 0);
        }
        Log.w("RevocationService", "Unknown action sent to RevocationBoundService: ".concat(String.valueOf(intent.getAction())));
        return null;
    }
}
