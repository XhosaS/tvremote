package defpackage;

import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dqw extends dqz {
    public dqw(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.dqz
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.dqz
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.dqz
    public final void c(Object obj, long j, boolean z) {
        if (dra.d) {
            dra.l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            dra.m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.dqz
    public final void d(Object obj, long j, byte b) {
        if (dra.d) {
            dra.l(obj, j, b);
        } else {
            dra.m(obj, j, b);
        }
    }

    @Override // defpackage.dqz
    public final void e(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.dqz
    public final void f(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.dqz
    public final boolean g(Object obj, long j) {
        return dra.d ? dra.u(obj, j) : dra.v(obj, j);
    }

    @Override // defpackage.dqz
    public final boolean h() {
        return false;
    }
}
