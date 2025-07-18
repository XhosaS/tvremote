package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class clz implements clx {
    private final float a;
    private final float b;
    private final cmn c;

    public clz(float f, float f2, cmn cmnVar) {
        this.a = f;
        this.b = f2;
        this.c = cmnVar;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.a;
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.b;
    }

    @Override // defpackage.cmd
    public final float cn(long j) {
        if (a.s(cmk.c(j), 4294967296L)) {
            return this.c.b(cmk.a(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.clx
    public final /* synthetic */ float co(float f) {
        return cme.g(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cp(int i) {
        return cme.h(this, i);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cq(long j) {
        return cme.i(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cr(float f) {
        return cme.j(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ int cu(float f) {
        return cme.k(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cv(long j) {
        return cme.l(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cw(long j) {
        return cme.m(this, j);
    }

    @Override // defpackage.cmd
    public final long cx(float f) {
        return clw.u(this.c.a(f));
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cy(float f) {
        return cme.n(this, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clz)) {
            return false;
        }
        clz clzVar = (clz) obj;
        return Float.compare(this.a, clzVar.a) == 0 && Float.compare(this.b, clzVar.b) == 0 && yks.e(this.c, clzVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
