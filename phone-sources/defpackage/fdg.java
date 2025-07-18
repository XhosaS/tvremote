package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdg implements fef {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public fdg(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // defpackage.fef
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        long[] jArr = this.e;
        int iD = d(j);
        long j2 = jArr[iD];
        long[] jArr2 = this.c;
        feg fegVar = new feg(j2, jArr2[iD]);
        if (fegVar.b >= j || iD == this.a - 1) {
            return new fed(fegVar, fegVar);
        }
        int i = iD + 1;
        return new fed(fegVar, new feg(jArr[i], jArr2[i]));
    }

    public final int d(long j) {
        return edt.az(this.e, j, true);
    }

    public final String toString() {
        long[] jArr = this.d;
        long[] jArr2 = this.e;
        long[] jArr3 = this.c;
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
