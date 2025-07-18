package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zkl {
    public static final zkl d = new zki("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final zkl e = new zki("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final zkl f;

    static {
        new zkk("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zkk("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f = new zkh(new zkg("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void c(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract zkl f();

    public abstract zkl g();

    public CharSequence h(CharSequence charSequence) {
        throw null;
    }

    public final byte[] j(CharSequence charSequence) {
        try {
            CharSequence charSequenceH = h(charSequence);
            int iD = d(charSequenceH.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceH);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (zkj e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final String k(byte[] bArr, int i) {
        yqw.K(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(e(i));
        try {
            c(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
