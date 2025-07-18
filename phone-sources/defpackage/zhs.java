package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhs {
    public static final byte[] a = wcq.ay("0123456789abcdef");
    public static final long[] b = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};

    public static final String a(zgk zgkVar, long j) {
        if (j > 0) {
            long j2 = (-1) + j;
            if (zgkVar.c(j2) == 13) {
                String strO = zgkVar.o(j2);
                zgkVar.B(2L);
                return strO;
            }
        }
        String strO2 = zgkVar.o(j);
        zgkVar.B(1L);
        return strO2;
    }

    public static final boolean b(zhj zhjVar, int i, byte[] bArr, int i2) {
        zhjVar.getClass();
        bArr.getClass();
        byte[] bArr2 = zhjVar.a;
        int i3 = zhjVar.c;
        for (int i4 = 1; i4 < i2; i4++) {
            if (i == i3) {
                zhjVar = zhjVar.f;
                zhjVar.getClass();
                byte[] bArr3 = zhjVar.a;
                int i5 = zhjVar.b;
                i3 = zhjVar.c;
                bArr2 = bArr3;
                i = i5;
            }
            if (bArr2[i] != bArr[i4]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
