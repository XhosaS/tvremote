package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahxb implements Serializable, Comparable {
    public static final ahxa a = new ahxa();
    public static final ahxb b = new ahxb(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] c;
    public transient int d;
    public transient String e;

    public ahxb(byte[] bArr) {
        bArr.getClass();
        this.c = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException, IllegalArgumentException {
        int i = objectInputStream.readInt();
        objectInputStream.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.b(i, "byteCount < 0: "));
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
        ahxb ahxbVar = new ahxb(bArr);
        Field declaredField = ahxb.class.getDeclaredField("c");
        declaredField.setAccessible(true);
        declaredField.set(this, ahxbVar.c);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.c.length);
        objectOutputStream.write(this.c);
    }

    public byte a(int i) {
        return this.c[i];
    }

    public int b() {
        return this.c.length;
    }

    public String c() {
        byte[] bArr = this.c;
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b2 : bArr) {
            char[] cArr2 = ahxv.a;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            cArr[i + 1] = cArr2[b2 & 15];
            i += 2;
        }
        return new String(cArr);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ahxb ahxbVar = (ahxb) obj;
        ahxbVar.getClass();
        int iB = b();
        int iB2 = ahxbVar.b();
        int iMin = Math.min(iB, iB2);
        for (int i = 0; i < iMin; i++) {
            int iA = a(i) & 255;
            int iA2 = ahxbVar.a(i) & 255;
            if (iA != iA2) {
                return iA >= iA2 ? 1 : -1;
            }
        }
        if (iB == iB2) {
            return 0;
        }
        return iB >= iB2 ? 1 : -1;
    }

    public final String d() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        String strA = ahxt.a(h());
        this.e = strA;
        return strA;
    }

    public ahxb e() {
        int i = 0;
        while (true) {
            byte[] bArr = this.c;
            int length = bArr.length;
            if (i >= length) {
                return this;
            }
            int i2 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                bArrCopyOf.getClass();
                bArrCopyOf[i] = (byte) (b2 + 32);
                while (i2 < bArrCopyOf.length) {
                    int i3 = i2 + 1;
                    byte b3 = bArrCopyOf[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArrCopyOf[i2] = (byte) (b3 + 32);
                    }
                    i2 = i3;
                }
                return new ahxb(bArrCopyOf);
            }
            i = i2;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahxb) {
            ahxb ahxbVar = (ahxb) obj;
            int iB = ahxbVar.b();
            byte[] bArr = this.c;
            int length = bArr.length;
            return iB == length && ahxbVar.f(0, bArr, 0, length);
        }
        return false;
    }

    public boolean f(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.c;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && ahwt.b(bArr2, i, bArr, i2, i3);
    }

    public final boolean g(ahxb ahxbVar) {
        ahxbVar.getClass();
        return j(ahxbVar, ahxbVar.b());
    }

    public byte[] h() {
        return this.c;
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c);
        this.d = iHashCode;
        return iHashCode;
    }

    public byte[] i() {
        byte[] bArr = this.c;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        bArrCopyOf.getClass();
        return bArrCopyOf;
    }

    public boolean j(ahxb ahxbVar, int i) {
        return ahxbVar.f(0, this.c, 0, i);
    }

    public void k(ahwx ahwxVar, int i) {
        char[] cArr = ahxv.a;
        ahwxVar.s(this.c, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x004e, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087 A[PHI: r4 r10
  0x0087: PHI (r4v13 int) = (r4v10 int), (r4v14 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x0087: PHI (r10v13 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a A[PHI: r4 r10
  0x008a: PHI (r4v11 int) = (r4v10 int), (r4v14 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]
  0x008a: PHI (r10v11 int) = (r10v10 int), (r10v17 int) binds: [B:85:0x00d1, B:55:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahxb.toString():java.lang.String");
    }
}
