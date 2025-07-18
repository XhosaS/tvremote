package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class miy implements mik {
    private static final int[] a = new int[0];
    private final int b;
    private final int c;
    private final ByteBuffer d;
    private mil e;

    public miy(aefs aefsVar) {
        this.b = aefsVar.h();
        this.c = aefsVar.i();
        this.d = aefsVar.f(6) == null ? ByteBuffer.allocate(0) : aefsVar.f(6).slice();
        this.e = null;
    }

    @Override // defpackage.mik
    public final mil a(mii miiVar) {
        if (!b(miiVar)) {
            return null;
        }
        if (this.e == null) {
            this.e = miiVar.b.a(this.d);
        }
        return miiVar.b(this.e);
    }

    @Override // defpackage.mik
    public final boolean b(mii miiVar) {
        return this.c == 1 && this.b == miiVar.a;
    }

    @Override // defpackage.mil
    public final int c() {
        return this.b;
    }

    @Override // defpackage.mil
    public final yyk d(int i) {
        if (this.b != i) {
            int i2 = yyk.e;
            return zcg.b;
        }
        if (this.e == null) {
            return yyk.o(this.d);
        }
        throw new IllegalArgumentException(getClass().getSimpleName() + ": field number " + i + " is a previously retrieved extension.");
    }

    @Override // defpackage.mil
    public final byte[] e() {
        if (this.c != 2) {
            throw new UnsupportedOperationException("Cannot serialize to proto bytes for ".concat(String.valueOf(getClass().getSimpleName())));
        }
        int i = this.b;
        if (i == 0) {
            return new byte[0];
        }
        ByteBuffer byteBuffer = this.d;
        int i2 = i << 3;
        int iH = abvz.H(i2);
        int iCapacity = byteBuffer.capacity();
        int iH2 = iH + abvz.H(iCapacity) + iCapacity;
        byte[] bArr = new byte[iH2];
        abvw abvwVar = new abvw(bArr, 0, iH2);
        try {
            abvwVar.x(i2 | 2);
            abvwVar.x(byteBuffer.capacity());
            if (byteBuffer.hasArray()) {
                abvwVar.f(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return bArr;
            }
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.clear();
            abvwVar.e(byteBufferDuplicate);
            return bArr;
        } catch (IOException e) {
            throw new IllegalStateException(a.x(this, "Serializing ", " to a byte array threw an IOException (should never happen)."), e);
        }
    }

    @Override // defpackage.mil
    public final int[] f() {
        int i = this.b;
        return i != 0 ? new int[]{i} : a;
    }
}
