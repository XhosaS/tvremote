package defpackage;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqb {
    private static final dze d;
    public final ConditionVariable a;
    public final eou b;
    public final eph c;
    private final HandlerThread e;
    private final Handler f;

    static {
        dzd dzdVar = new dzd();
        dzdVar.q = new dza(new dyz[0]);
        d = new dze(dzdVar);
    }

    public eqb(eou eouVar, eph ephVar) {
        this.b = eouVar;
        this.c = ephVar;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:OfflineLicenseHelper");
        this.e = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
        this.a = new ConditionVariable();
        ephVar.s(new Handler(handlerThread.getLooper()), new eqa(this));
    }

    private final void d() {
        final uic uicVar = new uic();
        this.f.post(new Runnable() { // from class: epy
            @Override // java.lang.Runnable
            public final void run() {
                eqb eqbVar = this.a;
                uic uicVar2 = uicVar;
                try {
                    eqbVar.b.en();
                    uicVar2.b((Object) null);
                } catch (Throwable th) {
                    uicVar2.e(th);
                }
            }
        });
        try {
            uicVar.s();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException(e);
        }
    }

    private final byte[] e(final int i, final byte[] bArr, final dze dzeVar) throws eow {
        dzeVar.ac.getClass();
        final uic uicVar = new uic();
        this.a.close();
        this.f.post(new Runnable() { // from class: epw
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                eqb eqbVar = this.a;
                byte[] bArr2 = bArr;
                uic uicVar2 = uicVar;
                dze dzeVar2 = dzeVar;
                try {
                    eou eouVar = eqbVar.b;
                    Looper looperMyLooper = Looper.myLooper();
                    looperMyLooper.getClass();
                    eouVar.eo(looperMyLooper, elk.a);
                    eouVar.em();
                    try {
                        eouVar.e(i2, bArr2);
                        eox eoxVarEp = eouVar.ep(eqbVar.c, dzeVar2);
                        eoxVarEp.getClass();
                        uicVar2.b(eoxVarEp);
                    } catch (Throwable th) {
                        eqbVar.b.en();
                        throw th;
                    }
                } catch (Throwable th2) {
                    uicVar2.e(th2);
                }
            }
        });
        try {
            final eox eoxVar = (eox) uicVar.s();
            this.a.block();
            final uic uicVar2 = new uic();
            this.f.post(new Runnable() { // from class: epx
                @Override // java.lang.Runnable
                public final void run() {
                    eqb eqbVar = this.a;
                    eox eoxVar2 = eoxVar;
                    uic uicVar3 = uicVar2;
                    try {
                        eow eowVarC = eoxVar2.c();
                        if (eoxVar2.a() == 1) {
                            eoxVar2.p(eqbVar.c);
                            eqbVar.b.en();
                        }
                        uicVar3.b(eowVarC);
                    } catch (Throwable th) {
                        uicVar3.e(th);
                        eoxVar2.p(eqbVar.c);
                        eqbVar.b.en();
                    }
                }
            });
            try {
                if (uicVar2.s() != null) {
                    throw ((eow) uicVar2.s());
                }
                final uic uicVar3 = new uic();
                this.f.post(new Runnable() { // from class: epz
                    @Override // java.lang.Runnable
                    public final void run() {
                        eqb eqbVar = this.a;
                        try {
                            uicVar3.b(eoxVar.n());
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                });
                try {
                    try {
                        byte[] bArr2 = (byte[]) uicVar3.s();
                        bArr2.getClass();
                        d();
                        return bArr2;
                    } catch (InterruptedException | ExecutionException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (Throwable th) {
                    d();
                    throw th;
                }
            } catch (InterruptedException | ExecutionException e2) {
                throw new IllegalStateException(e2);
            }
        } catch (InterruptedException | ExecutionException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public final void a() {
        this.e.quit();
    }

    public final synchronized void b(byte[] bArr) {
        e(3, bArr, d);
    }

    public final synchronized byte[] c(dze dzeVar) {
        a.H(dzeVar.ac != null);
        return e(2, null, dzeVar);
    }
}
