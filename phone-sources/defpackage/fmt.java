package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmt implements fmu {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final fdr c;
    private final fel d;
    private final fmx e;
    private final int f;
    private final byte[] g;
    private final edi h;
    private final int i;
    private final dze j;
    private int k;
    private long l;
    private int m;
    private long n;

    public fmt(fdr fdrVar, fel felVar, fmx fmxVar) throws eaf {
        this.c = fdrVar;
        this.d = felVar;
        this.e = fmxVar;
        int iMax = Math.max(1, fmxVar.c / 10);
        this.i = iMax;
        edi ediVar = new edi(fmxVar.f);
        ediVar.h();
        int iH = ediVar.h();
        this.f = iH;
        int i = fmxVar.b;
        int i2 = (((fmxVar.d - (i * 4)) * 8) / (fmxVar.e * i)) + 1;
        if (iH != i2) {
            throw new eaf(a.ce(iH, i2, "Expected frames per block: ", "; got: "), null, true, 1);
        }
        int iC = edt.c(iMax, iH);
        this.g = new byte[fmxVar.d * iC];
        this.h = new edi(iC * (iH + iH) * i);
        int i3 = ((fmxVar.c * fmxVar.d) * 8) / iH;
        dzd dzdVar = new dzd();
        dzdVar.d("audio/raw");
        dzdVar.h = i3;
        dzdVar.i = i3;
        dzdVar.n = (iMax + iMax) * i;
        dzdVar.E = fmxVar.b;
        dzdVar.F = fmxVar.c;
        dzdVar.G = 2;
        this.j = new dze(dzdVar);
    }

    private final int d(int i) {
        int i2 = this.e.b;
        return i / (i2 + i2);
    }

    private final int e(int i) {
        return (i + i) * this.e.b;
    }

    private final void f(int i) {
        long jB = this.l + edt.B(this.n, 1000000L, this.e.c);
        int iE = e(i);
        this.d.e(jB, 1, iE, this.m - iE, null);
        this.n += i;
        this.m -= iE;
    }

    @Override // defpackage.fmu
    public final void a(int i, long j) {
        this.c.r(new fmz(this.e, this.f, i, j));
        fel felVar = this.d;
        felVar.b(this.j);
        felVar.f();
    }

    @Override // defpackage.fmu
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x001f). Please report as a decompilation issue!!! */
    @Override // defpackage.fmu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.fdq r27, long r28) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmt.c(fdq, long):boolean");
    }
}
