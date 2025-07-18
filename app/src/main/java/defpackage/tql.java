package defpackage;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tql {
    public final ByteArrayOutputStream a = new ByteArrayOutputStream();
    public int b = 0;
    private final int[] c = new int[8];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v0, types: [int] */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    public final void a(long j, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            boolean zTestBit = BigInteger.valueOf(j).testBit((i - i2) - 1);
            ?? r3 = zTestBit;
            if (zTestBit) {
                r3 = 1;
            }
            ?? r5 = this.c;
            int i3 = this.b;
            r5[i3] = r3;
            int i4 = i3 + 1;
            this.b = i4;
            if (i4 == 8) {
                int i5 = r5[0] << 7;
                int i6 = r5[1] << 6;
                int i7 = r5[2] << 5;
                int i8 = r5[3] << 4;
                int i9 = r5[4] << 3;
                int i10 = r5[5] << 2;
                ?? r7 = r5[6];
                this.a.write(i5 | i6 | i7 | i8 | i9 | i10 | (r7 + r7) | r5[7]);
                this.b = 0;
            }
        }
    }
}
