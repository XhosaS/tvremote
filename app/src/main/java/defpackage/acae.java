package defpackage;

import libcore.io.Memory;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acae extends acag {
    public acae(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.acag
    public final byte a(long j) {
        return Memory.peekByte((int) j);
    }

    @Override // defpackage.acag
    public final double b(Object obj, long j) {
        return Double.longBitsToDouble(this.a.getLong(obj, j));
    }

    @Override // defpackage.acag
    public final float c(Object obj, long j) {
        return Float.intBitsToFloat(this.a.getInt(obj, j));
    }

    @Override // defpackage.acag
    public final void d(long j, byte[] bArr, long j2, long j3) {
        Memory.peekByteArray((int) j, bArr, (int) j2, (int) j3);
    }

    @Override // defpackage.acag
    public final void e(Object obj, long j, boolean z) {
        if (acah.e) {
            acah.g(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            acah.h(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.acag
    public final void f(Object obj, long j, byte b) {
        if (acah.e) {
            acah.g(obj, j, b);
        } else {
            acah.h(obj, j, b);
        }
    }

    @Override // defpackage.acag
    public final void g(Object obj, long j, double d) {
        this.a.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.acag
    public final void h(Object obj, long j, float f) {
        this.a.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.acag
    public final boolean i(Object obj, long j) {
        return acah.e ? acah.j(obj, j) : acah.k(obj, j);
    }
}
