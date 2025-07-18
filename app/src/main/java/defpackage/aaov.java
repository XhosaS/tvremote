package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaov extends Service {
    private Binder a;
    private int d;
    final ExecutorService b = kor.a.a(1, new klw("Firebase-Messaging-Intent-Handle"));
    private final Object c = new Object();
    private int e = 0;

    public final lvf f(final Intent intent) {
        final lvj lvjVar = new lvj();
        this.b.execute(new Runnable() { // from class: aaot
            @Override // java.lang.Runnable
            public final void run() {
                aaov aaovVar = this.a;
                Intent intent2 = intent;
                lvj lvjVar2 = lvjVar;
                try {
                    aaovVar.h(intent2);
                } finally {
                    lvjVar2.a.p(null);
                }
            }
        });
        return lvjVar.a;
    }

    public final void g(Intent intent) {
        if (intent != null) {
            aaqt.b(intent);
        }
        synchronized (this.c) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    public abstract void h(Intent intent);

    protected Intent i() {
        throw null;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.a == null) {
            this.a = new aaqw(new aaou(this));
        }
        return this.a;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.b.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intentI = i();
        if (intentI == null) {
            g(intent);
            return 2;
        }
        lvf lvfVarF = f(intentI);
        if (lvfVarF.h()) {
            g(intent);
            return 2;
        }
        lvfVarF.l(new Executor() { // from class: aaor
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new luu() { // from class: aaos
            @Override // defpackage.luu
            public final void a(lvf lvfVar) {
                this.a.g(intent);
            }
        });
        return 3;
    }
}
