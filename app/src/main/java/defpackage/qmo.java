package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qmo implements qlz {
    public final yrp a;
    public final AtomicReference b = new AtomicReference();
    private final zyg c;

    public qmo(ExecutorService executorService, yrp yrpVar) {
        this.c = zyn.a(executorService);
        this.a = yru.a(yrpVar);
    }

    private final zyd g(final yqi yqiVar) {
        AtomicReference atomicReference = this.b;
        if (atomicReference.get() != null) {
            return (zyd) yqiVar.apply((qlz) atomicReference.get());
        }
        final yrp yrpVar = this.a;
        yrpVar.getClass();
        Callable callable = new Callable() { // from class: qmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (qlz) yrpVar.eV();
            }
        };
        return wzx.g(zxn.k(wyo.i(callable), this.c)).i(new zvi() { // from class: qmj
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qlz qlzVar = (qlz) obj;
                this.a.b.set(qlzVar);
                return (zyd) yqiVar.apply(qlzVar);
            }
        }, zwk.a);
    }

    private final void h(final Runnable runnable) {
        if (this.b.get() != null) {
            runnable.run();
        } else {
            this.c.execute(wyo.h(new Runnable() { // from class: qmh
                @Override // java.lang.Runnable
                public final void run() {
                    qmo qmoVar = this.a;
                    qmoVar.b.set((qlz) qmoVar.a.eV());
                    runnable.run();
                }
            }));
        }
    }

    @Override // defpackage.qlz
    public final zyd a() {
        return g(new yqi() { // from class: qmg
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((qlz) obj).a();
            }
        });
    }

    @Override // defpackage.qlz
    public final zyd b() {
        return g(new yqi() { // from class: qmn
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((qlz) obj).b();
            }
        });
    }

    @Override // defpackage.qlz
    public final void c(final qly qlyVar) {
        h(new Runnable() { // from class: qmk
            @Override // java.lang.Runnable
            public final void run() {
                ((qlz) this.a.b.get()).c(qlyVar);
            }
        });
    }

    @Override // defpackage.qlz
    public final void d(final qly qlyVar) {
        h(new Runnable() { // from class: qmf
            @Override // java.lang.Runnable
            public final void run() {
                ((qlz) this.a.b.get()).d(qlyVar);
            }
        });
    }

    @Override // defpackage.qlz
    public final zyd e(final String str, final int i) {
        return g(new yqi() { // from class: qml
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((qlz) obj).e(str, i);
            }
        });
    }

    @Override // defpackage.qlz
    public final zyd f(final String str, final int i) {
        return g(new yqi() { // from class: qmm
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((qlz) obj).f(str, i);
            }
        });
    }
}
