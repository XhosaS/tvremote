package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vwi extends vwk {
    public vwi(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.vwk
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // defpackage.vwk
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.vwk
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.vwk
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.vwk
    public final void e(Object obj, long j, boolean z) {
        if (vwl.d) {
            vwl.o(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            vwl.p(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.vwk
    public final void f(Object obj, long j, byte b) {
        if (vwl.d) {
            vwl.o(obj, j, b);
        } else {
            vwl.p(obj, j, b);
        }
    }

    @Override // defpackage.vwk
    public final void g(Object obj, long j, double d) {
        m(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.vwk
    public final void h(Object obj, long j, float f) {
        l(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.vwk
    public final boolean i(Object obj, long j) {
        return vwl.d ? vwl.x(obj, j) : vwl.y(obj, j);
    }
}
