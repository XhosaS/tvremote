package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lif implements lio {
    public final lio a;
    public final liq b;

    public lif(int i, lio lioVar) {
        this(liq.e(i), lioVar);
    }

    @Override // defpackage.lio
    public final int a() {
        return (this.b.hashCode() * 31) + this.a.a();
    }

    @Override // defpackage.lio
    public final lio b() {
        return this.a;
    }

    @Override // defpackage.lio
    public final liq c() {
        return this.b;
    }

    @Override // defpackage.lio
    public final void d(liq liqVar) {
        if (nqq.e(this, liqVar) || !liqVar.b.isEmpty()) {
            this.a.d(this.b);
        }
    }

    @Override // defpackage.lio
    public final boolean e(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lif lifVar = (lif) obj;
        if (this.b.equals(lifVar.b)) {
            return this.a.e(lifVar.a);
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return e(obj);
    }

    public final int hashCode() {
        return a();
    }

    public lif(liq liqVar, lio lioVar) {
        lioVar.getClass();
        this.a = lioVar;
        liqVar.getClass();
        this.b = liqVar;
    }
}
