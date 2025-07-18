package defpackage;

import java.math.RoundingMode;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzn {
    public final char[] a;
    final int b;
    final int c;
    final int d;
    final int e;
    public final byte[] f;
    private final String g;
    private final boolean[] h;
    private final boolean i;

    /* JADX WARN: Illegal instructions before constructor call */
    public tzn(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            sij.p(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            sij.p(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr);
    }

    final char a(int i) {
        return this.a[i];
    }

    final int b(char c) throws tzq {
        if (c > 127) {
            throw new tzq("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        byte b = this.f[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new tzq("Unrecognized character: 0x".concat(String.valueOf(Integer.toHexString(c))));
        }
        throw new tzq("Unrecognized character: " + c);
    }

    final boolean c(int i) {
        return this.h[i % this.d];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tzn) {
            tzn tznVar = (tzn) obj;
            boolean z = tznVar.i;
            if (Arrays.equals(this.a, tznVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + 1237;
    }

    public final String toString() {
        return this.g;
    }

    private tzn(String str, char[] cArr, byte[] bArr) {
        this.g = str;
        cArr.getClass();
        this.a = cArr;
        try {
            int length = cArr.length;
            int iE = udo.e(length, RoundingMode.UNNECESSARY);
            this.c = iE;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iE);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.d = i;
            this.e = iE >> iNumberOfTrailingZeros;
            this.b = length - 1;
            this.f = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.e; i2++) {
                zArr[udo.d(i2 * 8, this.c, RoundingMode.CEILING)] = true;
            }
            this.h = zArr;
            this.i = false;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }
}
