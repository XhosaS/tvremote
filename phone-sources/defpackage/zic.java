package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class zic extends zjh implements zjp, zid {
    static final zjs b = new zib(zic.class);
    private static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final byte[] a;

    public zic(byte[] bArr) {
        this.a = bArr;
    }

    static zic h(byte[] bArr) {
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
                return new zkt(bArr);
            }
        }
        return new zkj(bArr, (byte[]) null);
    }

    public static zic i(Object obj) {
        if (obj == null || (obj instanceof zic)) {
            return (zic) obj;
        }
        if (obj instanceof zih) {
            zjh zjhVarP = ((zih) obj).p();
            if (zjhVarP instanceof zic) {
                return (zic) zjhVarP;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (zic) b.c((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct BIT STRING from byte[]: ".concat(String.valueOf(e.getMessage())));
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(String.valueOf(obj.getClass().getName())));
    }

    public static zic o(zjr zjrVar) {
        return (zic) b.d(zjrVar, false);
    }

    @Override // defpackage.zjp
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
            throw new zjg("Internal error encoding BitString: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (!(zjhVar instanceof zic)) {
            return false;
        }
        byte[] bArr = this.a;
        byte[] bArr2 = ((zic) zjhVar).a;
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

    @Override // defpackage.zid
    public final int f() {
        return this.a[0] & 255;
    }

    @Override // defpackage.zid
    public final InputStream g() {
        return new ByteArrayInputStream(this.a, 1, r1.length - 1);
    }

    @Override // defpackage.zix
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

    @Override // defpackage.zjh
    public zjh k() {
        return new zkj(this.a, (byte[]) null);
    }

    @Override // defpackage.zjh
    public zjh l() {
        return new zkt(this.a);
    }

    public final byte[] m() {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (length == 1) {
            return zjd.a;
        }
        int i = bArr[0] & 255;
        byte[] bArrBh = vxr.bh(bArr, 1, length);
        int length2 = bArrBh.length - 1;
        bArrBh[length2] = (byte) (bArrBh[length2] & ((byte) (255 << i)));
        return bArrBh;
    }

    public final byte[] n() {
        byte[] bArr = this.a;
        if (bArr[0] == 0) {
            return vxr.bh(bArr, 1, bArr.length);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    public String toString() {
        return b();
    }

    public zic(byte[] bArr, int i) {
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

    @Override // defpackage.zld
    public final zjh j() {
        return this;
    }
}
