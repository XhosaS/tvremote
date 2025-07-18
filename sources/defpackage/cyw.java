package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cyw extends dab implements daj, cyx {
    static final dam b = new cyv(cyw.class);
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public cyw(byte[] bArr) {
        this.a = bArr;
    }

    static cyw h(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalArgumentException("truncated BIT STRING detected");
        }
        int i = bArr[0] & 255;
        if (i > 0) {
            if (i > 7 || length < 2) {
                throw new IllegalArgumentException("invalid pad bits detected");
            }
            byte b2 = bArr[length - 1];
            if (b2 != ((byte) ((255 << i) & b2))) {
                return new dbn(bArr);
            }
        }
        return new dbd(bArr, (byte[]) null);
    }

    public static cyw i(Object obj) {
        if (obj == null || (obj instanceof cyw)) {
            return (cyw) obj;
        }
        if (obj instanceof czb) {
            dab dabVarP = ((czb) obj).p();
            if (dabVarP instanceof cyw) {
                return (cyw) dabVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (cyw) b.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static cyw o(dal dalVar) {
        return (cyw) b.d(dalVar, false);
    }

    @Override // defpackage.daj
    public final String b() {
        try {
            byte[] bArrS = s();
            int length = bArrS.length;
            StringBuffer stringBuffer = new StringBuffer(length + length + 1);
            stringBuffer.append('#');
            for (int i = 0; i != bArrS.length; i++) {
                byte b2 = bArrS[i];
                char[] cArr = c;
                stringBuffer.append(cArr[(b2 >>> 4) & 15]);
                stringBuffer.append(cArr[b2 & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new daa("Internal error encoding BitString: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.dab
    public final boolean d(dab dabVar) {
        if (!(dabVar instanceof cyw)) {
            return false;
        }
        byte[] bArr = this.a;
        byte[] bArr2 = ((cyw) dabVar).a;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
    }

    @Override // defpackage.cyx
    public final int f() {
        return this.a[0] & 255;
    }

    @Override // defpackage.cyx
    public final InputStream g() {
        return new ByteArrayInputStream(this.a, 1, r1.length - 1);
    }

    @Override // defpackage.czr
    public final int hashCode() {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (length < 2) {
            return 1;
        }
        int i = 0;
        int i2 = length - 1;
        int i3 = (255 << (bArr[0] & 255)) & bArr[i2];
        if (bArr != null) {
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                length = (length * 257) ^ bArr[i2];
            }
            i = length;
        }
        return ((byte) i3) ^ (i * 257);
    }

    @Override // defpackage.dab
    public dab k() {
        return new dbd(this.a, (byte[]) null);
    }

    @Override // defpackage.dab
    public dab l() {
        return new dbn(this.a);
    }

    public final byte[] m() {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (length == 1) {
            return czx.a;
        }
        int i = bArr[0] & 255;
        byte[] bArrT = dos.t(bArr, 1, length);
        int length2 = bArrT.length - 1;
        bArrT[length2] = (byte) (bArrT[length2] & ((byte) (255 << i)));
        return bArrT;
    }

    public final byte[] n() {
        byte[] bArr = this.a;
        if (bArr[0] == 0) {
            return dos.t(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String toString() {
        return b();
    }

    public cyw(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("'data' cannot be null");
        }
        int length = bArr.length;
        if (length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        }
        if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        }
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = (byte) i;
        this.a = bArr2;
    }

    @Override // defpackage.dbx
    public final dab j() {
        return this;
    }
}
