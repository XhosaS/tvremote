package defpackage;

import io.grpc.Status;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aauo extends afeq {
    public afep c;
    private final zyd e;
    private final Executor f = new zyt(zwk.a);
    public final Queue a = new ArrayDeque();
    public afeq b = null;
    public boolean d = false;

    public aauo(zyd zydVar) {
        this.e = zydVar;
    }

    private final void f(final Runnable runnable) {
        this.f.execute(wyo.h(new Runnable() { // from class: aauj
            @Override // java.lang.Runnable
            public final void run() {
                aauo aauoVar = this.a;
                if (aauoVar.d) {
                    return;
                }
                Runnable runnable2 = runnable;
                if (aauoVar.b == null) {
                    aauoVar.a.add(runnable2);
                    return;
                }
                try {
                    runnable2.run();
                } catch (Throwable th) {
                    aauoVar.c.a(Status.b(th), new afih());
                }
            }
        }));
    }

    @Override // defpackage.afeq
    public final void a(final afep afepVar, final afih afihVar) {
        this.c = afepVar;
        zxn.p(this.e, wyo.f(new aaun(this, afepVar)), this.f);
        f(new Runnable() { // from class: aaui
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.a(afepVar, afihVar);
            }
        });
    }

    @Override // defpackage.afeq
    public final void b(final String str, final Throwable th) {
        f(new Runnable() { // from class: aauh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.b(str, th);
            }
        });
    }

    @Override // defpackage.afeq
    public final void c() {
        f(new Runnable() { // from class: aaum
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.c();
            }
        });
    }

    @Override // defpackage.afeq
    public final void d(final int i) {
        f(new Runnable() { // from class: aaul
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.d(i);
            }
        });
    }

    @Override // defpackage.afeq
    public final void e(final Object obj) {
        f(new Runnable() { // from class: aauk
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b.e(obj);
            }
        });
    }

    public final String toString() {
        return super.toString() + "delegate=[" + String.valueOf(this.b) + "]";
    }
}
