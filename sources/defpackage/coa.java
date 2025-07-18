package defpackage;

import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class coa extends coc {
    public coa(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.coc
    public final double a(Object obj, long j) {
        return Double.longBitsToDouble(i(obj, j));
    }

    @Override // defpackage.coc
    public final float b(Object obj, long j) {
        return Float.intBitsToFloat(h(obj, j));
    }

    @Override // defpackage.coc
    public final void c(Object obj, long j, boolean z) {
        if (cod.c) {
            cod.l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            cod.m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.coc
    public final void d(Object obj, long j, byte b) {
        if (cod.c) {
            cod.l(obj, j, b);
        } else {
            cod.m(obj, j, b);
        }
    }

    @Override // defpackage.coc
    public final void e(Object obj, long j, double d) {
        k(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.coc
    public final void f(Object obj, long j, float f) {
        j(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.coc
    public final boolean g(Object obj, long j) {
        return cod.c ? cod.u(obj, j) : cod.v(obj, j);
    }
}
