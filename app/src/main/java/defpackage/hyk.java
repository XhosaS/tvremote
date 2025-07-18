package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyk implements jps {
    public hvw a;
    private float b;
    private int c;
    private final float[] d = new float[4];
    private final float[] e = new float[4];

    public hyk() {
        a();
    }

    @Override // defpackage.jps
    public final void a() {
        Arrays.fill(this.d, 0, 4, 0.0f);
        Arrays.fill(this.e, 0, 4, 0.0f);
        this.b = 0.0f;
    }

    @Override // defpackage.jps
    public final void b(long j, float[] fArr) {
        hvw hvwVar = this.a;
        if (hvwVar != null) {
            float[] fArr2 = this.e;
            int i = this.c;
            float f = hvwVar.a;
            fArr2[i] = f;
            int i2 = i - 1;
            if (i2 < 0) {
                i2 = i + 3;
            }
            int i3 = i - 2;
            if (i3 < 0) {
                i3 = i + 2;
            }
            float f2 = ((f + fArr2[i2]) + fArr2[i3]) / 3.0f;
            float f3 = this.b;
            float fMax = f2 > f3 ? f3 + ((f2 - f3) * 0.3f) : Math.max(f2, f3 * 0.92f);
            this.b = fMax;
            fArr[0] = fMax;
            for (int i4 = 1; i4 < 4; i4++) {
                int i5 = this.c - i4;
                if (i5 < 0) {
                    i5 += 4;
                }
                fArr[i4] = this.d[i5];
            }
        }
        float[] fArr3 = this.d;
        int i6 = this.c;
        fArr3[i6] = this.b;
        int i7 = i6 + 1;
        if (i7 >= 4) {
            i7 = i6 - 3;
        }
        this.c = i7;
    }
}
