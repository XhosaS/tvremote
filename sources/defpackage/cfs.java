package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cfs {
    private static final char[] a = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int b = 0;

    public abstract int a();

    public abstract int b();

    public abstract boolean c(cfs cfsVar);

    public byte[] d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfs) {
            cfs cfsVar = (cfs) obj;
            if (b() == cfsVar.b() && c(cfsVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (b() >= 32) {
            return a();
        }
        byte[] bArrD = d();
        int i = bArrD[0] & 255;
        for (int i2 = 1; i2 < bArrD.length; i2++) {
            i |= (bArrD[i2] & 255) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrD = d();
        int length = bArrD.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b2 : bArrD) {
            char[] cArr = a;
            sb.append(cArr[(b2 >> 4) & 15]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
