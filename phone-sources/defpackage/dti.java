package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dti implements yow {
    public final AtomicReference a = new AtomicReference(null);
    final /* synthetic */ yow b;
    final /* synthetic */ yjz c;
    final /* synthetic */ AtomicReference d;
    final /* synthetic */ czt e;
    private final /* synthetic */ yow f;

    public dti(yow yowVar, czt cztVar, yow yowVar2, yjz yjzVar, AtomicReference atomicReference) {
        this.e = cztVar;
        this.b = yowVar2;
        this.c = yjzVar;
        this.d = atomicReference;
        this.f = yowVar;
    }

    public final long a() {
        Long l = (Long) this.a.get();
        if (l == null) {
            return ynm.a;
        }
        long jLongValue = l.longValue() - System.currentTimeMillis();
        long j = ynm.a;
        return ylh.p(jLongValue, yno.c);
    }

    public final void b(long j) {
        if (ynm.k(j) <= 0) {
            yoz.n(this.b, new dtf("Timed out immediately", this.c.hashCode()));
            return;
        }
        if (ynm.b(a(), j) < 0) {
            return;
        }
        AtomicReference atomicReference = this.a;
        czt cztVar = this.e;
        atomicReference.set(Long.valueOf(System.currentTimeMillis() + ynm.k(j)));
        AtomicReference atomicReference2 = this.d;
        yow yowVar = this.b;
        yqe yqeVar = (yqe) atomicReference2.getAndSet(ykr.q(yowVar, null, 0, new ajo(this, cztVar, yowVar, this.c, (yih) null, 7), 3));
        if (yqeVar != null) {
            yqeVar.t(null);
        }
    }

    @Override // defpackage.yow
    public final yil c() {
        return this.f.c();
    }
}
