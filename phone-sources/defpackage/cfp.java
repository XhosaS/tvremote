package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cfp {
    public int a;
    public Object b;
    public Object c;

    public cfp() {
        this.b = new long[192];
        this.c = new long[192];
    }

    public final void a(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        Object obj = this.b;
        int i7 = this.a;
        int i8 = i7 + 3;
        this.a = i8;
        long[] jArr = (long[]) obj;
        int length = jArr.length;
        if (length <= i8) {
            int iMax = Math.max(length + length, i8);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            jArrCopyOf.getClass();
            this.b = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf((long[]) this.c, iMax);
            jArrCopyOf2.getClass();
            this.c = jArrCopyOf2;
        }
        long[] jArr2 = (long[]) this.b;
        jArr2[i7] = (i3 & 4294967295L) | (i2 << 32);
        jArr2[i7 + 1] = (i4 << 32) | (i5 & 4294967295L);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = ((z2 ? 1L : 0L) << 63) | ((z ? 1L : 0L) << 62) | 2305843009213693952L | (i9 << 26) | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((i7 - i10) & 511) << 52);
                return;
            }
        }
    }

    public final void b(int i, ykb ykbVar) {
        Object obj = this.b;
        int i2 = this.a;
        int i3 = 0;
        while (true) {
            long[] jArr = (long[]) obj;
            if (i3 >= jArr.length - 2 || i3 >= i2) {
                return;
            }
            if ((67108863 & ((int) jArr[i3 + 2])) == (i & 67108863)) {
                long j = jArr[i3];
                long j2 = jArr[i3 + 1];
                ykbVar.a(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
            i3 += 3;
        }
    }

    public cfp(byte[] bArr) {
        this.b = new int[16];
        this.c = new cam[16];
    }
}
