package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cly implements clx {
    private final float a;
    private final float b;

    public cly(float f, float f2) {
        this.a = f;
        this.b = f2;
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
    public final /* synthetic */ float cn(long j) {
        return cme.e(this, j);
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
    public final /* synthetic */ long cx(float f) {
        return cme.f(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cy(float f) {
        return cme.n(this, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cly)) {
            return false;
        }
        cly clyVar = (cly) obj;
        return Float.compare(this.a, clyVar.a) == 0 && Float.compare(this.b, clyVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "DensityImpl(density=" + this.a + ", fontScale=" + this.b + ')';
    }
}
