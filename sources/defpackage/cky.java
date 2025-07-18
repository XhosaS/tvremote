package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cky {
    private static volatile int e = 100;
    int a;
    int b;
    final int c = e;
    ckz d;

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
                throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
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
                throw new cmh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw new cmh("CodedInputStream encountered a malformed varint.");
    }

    public static long J(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static cky K(InputStream inputStream) {
        return inputStream == null ? L(cmf.b) : new ckx(inputStream);
    }

    public static cky L(byte[] bArr) {
        int length = bArr.length;
        return P(bArr, 0);
    }

    static cky P(byte[] bArr, int i) {
        ckw ckwVar = new ckw(bArr, i);
        try {
            ckwVar.e(i);
            return ckwVar;
        } catch (cmh e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract void A(int i);

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E(int i);

    public abstract byte[] F();

    public final void M() throws cmh {
        if (this.a + this.b >= this.c) {
            throw new cmh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void N() {
        if (this.b == 0) {
            z(0);
        }
    }

    public final void O() throws cmh {
        int iM;
        do {
            iM = m();
            if (iM == 0) {
                return;
            }
            M();
            this.b++;
            this.b--;
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

    public abstract ckv w();

    public abstract String x();

    public abstract String y();

    public abstract void z(int i);
}
