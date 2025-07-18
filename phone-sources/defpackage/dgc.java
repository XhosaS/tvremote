package defpackage;

import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgc extends dge {
    public dgc(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.dge
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.dge
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.dge
    public final void c(Object obj, long j, boolean z) {
        if (dgf.d) {
            dgf.l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            dgf.m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.dge
    public final void d(Object obj, long j, byte b) {
        if (dgf.d) {
            dgf.l(obj, j, b);
        } else {
            dgf.m(obj, j, b);
        }
    }

    @Override // defpackage.dge
    public final void e(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.dge
    public final void f(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.dge
    public final boolean g(Object obj, long j) {
        return dgf.d ? dgf.u(obj, j) : dgf.v(obj, j);
    }

    @Override // defpackage.dge
    public final boolean h() {
        return false;
    }
}
