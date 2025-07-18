package com.google.android.apps.tvsearch.logging.primes.libas.ipc;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import defpackage.gme;
import defpackage.gmg;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LatencyLoggerService extends gme {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/primes/libas/ipc/LatencyLoggerService");
    Messenger b;
    public gmg c;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Messenger messenger = this.b;
        messenger.getClass();
        return messenger.getBinder();
    }

    @Override // defpackage.gme, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.b = new Messenger(this.c);
    }
}
