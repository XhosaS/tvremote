package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zgn implements Serializable, Comparable {
    public static final zgn a = new zgn(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] b;
    public transient int c;
    public transient String d;

    public zgn(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static final zgn i(byte... bArr) {
        bArr.getClass();
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return new zgn(bArrCopyOf);
    }

    public static /* synthetic */ int q(zgn zgnVar, zgn zgnVar2) {
        zgnVar2.getClass();
        return zgnVar.v(zgnVar2.b);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.cf(i, "byteCount < 0: "));
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        zgn zgnVar = new zgn(bArr);
        Field declaredField = zgn.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, zgnVar.b);
    }

    public static /* synthetic */ zgn s(zgn zgnVar, int i, int i2, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -1234567890;
        }
        return zgnVar.j(i, i2);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.b.length);
        objectOutputStream.write(this.b);
    }

    public byte a(int i) {
        return this.b[i];
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zgn zgnVar) {
        zgnVar.getClass();
        int iC = c();
        int iC2 = zgnVar.c();
        int iMin = Math.min(iC, iC2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = zgnVar.a(i) & 255;
            if (iA != iA2) {
                return iA >= iA2 ? 1 : -1;
            }
        }
        if (iC == iC2) {
            return 0;
        }
        return iC >= iC2 ? 1 : -1;
    }

    public int c() {
        return this.b.length;
    }

    public final int d(zgn zgnVar, int i) {
        zgnVar.getClass();
        return e(zgnVar.b, i);
    }

    public int e(byte[] bArr, int i) {
        bArr.getClass();
        int length = this.b.length - bArr.length;
        int iMax = Math.max(i, 0);
        if (iMax > length) {
            return -1;
        }
        while (!wcq.aH(this.b, iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zgn) {
            zgn zgnVar = (zgn) obj;
            int iC = zgnVar.c();
            byte[] bArr = this.b;
            int length = bArr.length;
            return iC == length && zgnVar.l(0, bArr, 0, length);
        }
        return false;
    }

    public final String f() {
        int length;
        int i;
        byte[] bArr = zge.a;
        byte[] bArr2 = this.b;
        bArr2.getClass();
        bArr.getClass();
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = bArr2.length;
            i = length - (length % 3);
            if (i2 >= i) {
                break;
            }
            int i4 = i3 + 3;
            byte b = bArr2[i2];
            int i5 = i2 + 2;
            byte b2 = bArr2[i2 + 1];
            i2 += 3;
            byte b3 = bArr2[i5];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int i6 = length - i;
        if (i6 == 1) {
            byte b4 = bArr2[i2];
            bArr3[i3] = bArr[(b4 & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (i6 == 2) {
            int i7 = i2 + 1;
            byte b5 = bArr2[i2];
            byte b6 = bArr2[i7];
            bArr3[i3] = bArr[(b5 & 255) >> 2];
            bArr3[i3 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i3 + 3] = 61;
        }
        return wcq.ax(bArr3);
    }

    public String g() {
        byte[] bArr = this.b;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = zht.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public final String h() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String strAx = wcq.ax(n());
        this.d = strAx;
        return strAx;
    }

    public int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.b);
        this.c = iHashCode;
        return iHashCode;
    }

    public zgn j(int i, int i2) {
        int iAE = wcq.aE(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.b;
        int length = bArr.length;
        if (iAE > length) {
            throw new IllegalArgumentException(a.cd(length, "endIndex > length(", ")"));
        }
        if (iAE - i >= 0) {
            return (i == 0 && iAE == length) ? this : new zgn(yfm.aG(bArr, i, iAE));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    public zgn k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.b;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                bArrCopyOf.getClass();
                bArrCopyOf[i] = (byte) (b + 32);
                while (i2 < bArrCopyOf.length) {
                    int i3 = i2 + 1;
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                    i2 = i3;
                }
                return new zgn(bArrCopyOf);
            }
            i = i2;
        }
    }

    public boolean l(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.b;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && wcq.aH(bArr2, i, bArr, i2, i3);
    }

    public final boolean m(zgn zgnVar) {
        zgnVar.getClass();
        return r(0, zgnVar, zgnVar.c());
    }

    public byte[] n() {
        return this.b;
    }

    public byte[] o() {
        byte[] bArr = this.b;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public boolean r(int i, zgn zgnVar, int i2) {
        zgnVar.getClass();
        return zgnVar.l(0, this.b, i, i2);
    }

    public void t(zgk zgkVar, int i) {
        char[] cArr = zht.a;
        zgkVar.K(this.b, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x004e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[PHI: r4 r10
  0x0087: PHI (r4v12 int) = (r4v9 int), (r4v13 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r10v13 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a A[PHI: r4 r10
  0x008a: PHI (r4v10 int) = (r4v9 int), (r4v13 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r10v11 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zgn.toString():java.lang.String");
    }

    public final zgn u() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(this.b, 0, c());
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new zgn(bArrDigest);
    }

    public int v(byte[] bArr) {
        bArr.getClass();
        for (int iMin = Math.min(wcq.aE(this, -1234567890), this.b.length - bArr.length); iMin >= 0; iMin--) {
            if (wcq.aH(this.b, iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
