package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ziu extends zjh {
    static final zjs c = new zit(ziu.class);
    public final byte[] a;
    public final int b;

    public ziu(long j) {
        this.a = BigInteger.valueOf(j).toByteArray();
        this.b = 0;
    }

    public static int b(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        int iMax = Math.max(i, length - 4);
        int i3 = i2 & bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return i3;
            }
            i3 = (i3 << 8) | (bArr[iMax] & 255);
        }
    }

    static int g(byte[] bArr) {
        int length = bArr.length - 1;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            if (bArr[i] != (bArr[i2] >> 7)) {
                break;
            }
            i = i2;
        }
        return i;
    }

    public static ziu m(Object obj) {
        if (obj == null || (obj instanceof ziu)) {
            return (ziu) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
        }
        try {
            return (ziu) c.c((byte[]) obj);
        } catch (Exception e) {
            throw new IllegalArgumentException("encoding error in getInstance: ".concat(String.valueOf(e.toString())));
        }
    }

    public static ziu n(zjr zjrVar, boolean z) {
        return (ziu) c.d(zjrVar, z);
    }

    static boolean r(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return (length == 1 || bArr[0] != (bArr[1] >> 7) || zxp.b("org.bouncycastle.asn1.allow_unsafe_integer")) ? false : true;
        }
        return true;
    }

    @Override // defpackage.zjh
    public final int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    @Override // defpackage.zjh
    public final void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 2, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof ziu) {
            return Arrays.equals(this.a, ((ziu) zjhVar).a);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    public final int f() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        if (length - i <= 4) {
            return b(bArr, i, -1);
        }
        throw new ArithmeticException("ASN.1 Integer out of int range");
    }

    public final long h() {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i = this.b;
        if (length - i > 8) {
            throw new ArithmeticException("ASN.1 Integer out of long range");
        }
        int iMax = Math.max(i, length - 8);
        long j = bArr[iMax];
        while (true) {
            iMax++;
            if (iMax >= length) {
                return j;
            }
            j = (j << 8) | (bArr[iMax] & 255);
        }
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.a);
    }

    public final BigInteger i() {
        return new BigInteger(1, this.a);
    }

    public final BigInteger j() {
        return new BigInteger(this.a);
    }

    public final boolean o(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        int i2 = this.b;
        return length - i2 <= 4 && b(bArr, i2, -1) == i;
    }

    public final boolean q(BigInteger bigInteger) {
        return bigInteger != null && b(this.a, this.b, -1) == bigInteger.intValue() && j().equals(bigInteger);
    }

    public final String toString() {
        return j().toString();
    }

    public ziu(BigInteger bigInteger) {
        this.a = bigInteger.toByteArray();
        this.b = 0;
    }

    public ziu(byte[] bArr) {
        if (!r(bArr)) {
            this.a = bArr;
            this.b = g(bArr);
            return;
        }
        throw new IllegalArgumentException("malformed integer");
    }
}
