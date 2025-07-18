package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zth {
    public static byte[] a(byte[]... bArr) {
        long length = 0;
        for (int i = 0; i < 2; i++) {
            length += bArr[i].length;
        }
        int i2 = (int) length;
        yqw.E(length == ((long) i2), "the total number of elements (%s) in the arrays must fit in an int", length);
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            byte[] bArr3 = bArr[i4];
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i3, length2);
            i3 += length2;
        }
        return bArr2;
    }
}
