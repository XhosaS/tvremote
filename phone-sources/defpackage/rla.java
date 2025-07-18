package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rla implements rjq {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;
    private final Object d;

    public rla(rjq rjqVar, int i, rzy rzyVar, String str, int i2) {
        this.c = i2;
        this.a = rjqVar;
        this.b = new rld(rjqVar, i, rzyVar, str);
        this.d = new rld(rjqVar, i, rzyVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    private final uhp g(tsl tslVar) {
        AtomicReference atomicReference = (AtomicReference) this.b;
        return atomicReference.get() != null ? (uhp) tslVar.apply((rjq) atomicReference.get()) : trf.d(szg.k(new rjs(this.a, 0), this.d)).f(new pap(this, tslVar, 7, null), ugk.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uhs] */
    private final void h(Runnable runnable) {
        if (((AtomicReference) this.b).get() != null) {
            runnable.run();
        } else {
            this.d.execute(trc.f(new qto(this, runnable, 20)));
        }
    }

    @Override // defpackage.rjq
    public final uhp a() {
        return this.c != 0 ? g(new prn(17)) : ((rld) this.b).a(true);
    }

    @Override // defpackage.rjq
    public final uhp b() {
        return this.c != 0 ? g(new prn(18)) : ((rld) this.b).a(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rjq] */
    @Override // defpackage.rjq
    public final void c(rjp rjpVar) {
        if (this.c != 0) {
            h(new rmz(this, rjpVar, 1, null));
        } else {
            this.a.c(rjpVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, rjq] */
    @Override // defpackage.rjq
    public final void d(rjp rjpVar) {
        if (this.c != 0) {
            h(new qto(this, rjpVar, 19, null));
        } else {
            this.a.d(rjpVar);
        }
    }

    @Override // defpackage.rjq
    public final uhp e(String str, int i) {
        return this.c != 0 ? g(new rjt(str, i, 1)) : ((rld) this.d).b(true, str, i);
    }

    @Override // defpackage.rjq
    public final uhp f(String str, int i) {
        return this.c != 0 ? g(new rjt(str, i, 0)) : ((rld) this.d).b(false, str, i);
    }

    public rla(ExecutorService executorService, ttm ttmVar, int i) {
        this.c = i;
        this.b = new AtomicReference();
        this.d = sfy.v(executorService);
        this.a = sij.l(ttmVar);
    }
}
