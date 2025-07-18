package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tzs {
    public static final tzs d = new tzp("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final tzs e = new tzp("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final tzs f;

    static {
        new tzr("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new tzr("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        f = new tzo(new tzn("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public abstract int a(byte[] bArr, CharSequence charSequence);

    public abstract void b(Appendable appendable, byte[] bArr, int i);

    public abstract int d(int i);

    public abstract int e(int i);

    public abstract tzs f();

    public CharSequence g(CharSequence charSequence) {
        throw null;
    }

    public final String i(byte[] bArr) {
        int length = bArr.length;
        sij.w(0, length, length);
        StringBuilder sb = new StringBuilder(e(length));
        try {
            b(sb, bArr, length);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public final byte[] j(CharSequence charSequence) {
        try {
            CharSequence charSequenceG = g(charSequence);
            int iD = d(charSequenceG.length());
            byte[] bArr = new byte[iD];
            int iA = a(bArr, charSequenceG);
            if (iA == iD) {
                return bArr;
            }
            byte[] bArr2 = new byte[iA];
            System.arraycopy(bArr, 0, bArr2, 0, iA);
            return bArr2;
        } catch (tzq e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
