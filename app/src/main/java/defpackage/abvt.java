package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class abvt {
    private static volatile int a = 100;
    public static final /* synthetic */ int g = 0;
    int b;
    int c;
    final int d = a;
    public int e = Integer.MAX_VALUE;
    abvu f;

    public static int H(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static int I(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new abxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new abxv("CodedInputStream encountered a malformed varint.");
    }

    public static long J(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static abvt K(InputStream inputStream, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferSize must be > 0");
        }
        if (inputStream != null) {
            return new abvr(inputStream, i);
        }
        byte[] bArr = abxt.b;
        int length = bArr.length;
        return L(bArr, 0, 0, false);
    }

    public static abvt L(byte[] bArr, int i, int i2, boolean z) {
        abvp abvpVar = new abvp(bArr, i, i2, z);
        try {
            abvpVar.e(i2);
            return abvpVar;
        } catch (abxv e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static abvt P(Iterable iterable) {
        Iterator it = iterable.iterator();
        int i = 0;
        int iRemaining = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new abvq(iterable, iRemaining) : K(new abxw(iterable), 4096);
    }

    public static abvt Q(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return L(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), false);
        }
        if (byteBuffer.isDirect()) {
            int i = abvs.a;
            if (acah.b) {
                return new abvs(byteBuffer);
            }
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return L(bArr, 0, iRemaining, true);
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public final void M() throws abxv {
        if (this.b + this.c >= this.d) {
            throw new abxv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void N() {
        if (this.c == 0) {
            z(0);
        }
    }

    public final void O() throws abxv {
        int iM;
        do {
            iM = m();
            if (iM == 0) {
                return;
            }
            M();
            this.c++;
            this.c--;
        } while (E(iM));
    }

    public abstract double b();

    public abstract float c();

    public abstract int d();

    public abstract int e(int i);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract long o();

    public abstract long p();

    public abstract long r();

    public abstract long t();

    public abstract long u();

    public abstract long v();

    public abstract abvo w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
