package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class uoj extends Service {
    private Binder a;
    private final Object b;
    private int c;
    private int d;
    final ExecutorService e;

    public uoj() {
        ocv ocvVar = ogg.a;
        this.e = ocv.o(new ocy("Firebase-Messaging-Intent-Handle", 0));
        this.b = new Object();
        this.d = 0;
    }

    public final onz f(Intent intent) {
        kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
        this.e.execute(new rvp(this, intent, kwyVar, 5, (char[]) null));
        return (onz) kwyVar.a;
    }

    public final void g(Intent intent) {
        if (intent != null) {
            uph.b(intent);
        }
        synchronized (this.b) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                stopSelfResult(this.c);
            }
        }
    }

    public abstract void h(Intent intent);

    protected Intent i() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.a == null) {
            this.a = new upi(new zft(this, null));
        }
        return this.a;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.e.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.b) {
            this.c = i2;
            this.d++;
        }
        Intent intentI = i();
        if (intentI == null) {
            g(intent);
            return 2;
        }
        onz onzVarF = f(intentI);
        if (onzVarF.h()) {
            g(intent);
            return 2;
        }
        onzVarF.l(new fba(10), new tfl(this, intent, 2));
        return 3;
    }
}
