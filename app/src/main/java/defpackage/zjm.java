package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class zjm {
    private static final char[] a = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract boolean c(zjm zjmVar);

    public abstract byte[] d();

    public byte[] e() {
        return d();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zjm) {
            zjm zjmVar = (zjm) obj;
            if (b() == zjmVar.b() && c(zjmVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrE = e();
        int i = bArrE[0] & 255;
        for (int i2 = 1; i2 < bArrE.length; i2++) {
            i |= (bArrE[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrE = e();
        int length = bArrE.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArrE) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
