package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bvn {
    public final long[] a;
    public final float[] b = new float[20];
    public int c = 0;

    public bvn() {
        long[] jArr = new long[20];
        this.a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public final float a(float f) {
        double dSignum = Math.signum(f);
        float fAbs = Math.abs(f);
        return (float) (dSignum * Math.sqrt(fAbs + fAbs));
    }

    public final void b(long j, float f) {
        int i = (this.c + 1) % 20;
        this.c = i;
        this.a[i] = j;
        this.b[i] = f;
    }
}
