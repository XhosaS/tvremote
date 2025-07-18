package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class yg extends ya {
    public int f;
    final yf g;
    private yh[] h;
    private yh[] i;

    public yg(yb ybVar) {
        super(ybVar);
        this.h = new yh[128];
        this.i = new yh[128];
        this.f = 0;
        this.g = new yf(this);
    }

    @Override // defpackage.ya
    public final void d(yc ycVar, ya yaVar, boolean z) {
        yh yhVar = yaVar.a;
        if (yhVar == null) {
            return;
        }
        xz xzVar = yaVar.e;
        int i = xzVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            yh yhVarD = xzVar.d(i2);
            float fB = xzVar.b(i2);
            yf yfVar = this.g;
            yfVar.a = yhVarD;
            if (yfVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = yfVar.a.i;
                    float f = fArr[i3] + (yhVar.i[i3] * fB);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        yfVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    yfVar.b.n(yfVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = yhVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fB;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        yfVar.a.i[i4] = f3;
                    } else {
                        yfVar.a.i[i4] = 0.0f;
                    }
                }
                m(yhVarD);
            }
            this.b += yaVar.b * fB;
        }
        n(yhVar);
    }

    @Override // defpackage.ya
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.ya
    public final yh k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            yh[] yhVarArr = this.h;
            yh yhVar = yhVarArr[i2];
            if (!zArr[yhVar.c]) {
                yf yfVar = this.g;
                yfVar.a = yhVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = yfVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    yh yhVar2 = yhVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = yhVar2.i[i3];
                            float f3 = yfVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(yh yhVar) {
        int i;
        int i2 = this.f + 1;
        yh[] yhVarArr = this.h;
        int length = yhVarArr.length;
        if (i2 > length) {
            yh[] yhVarArr2 = (yh[]) Arrays.copyOf(yhVarArr, length + length);
            this.h = yhVarArr2;
            int length2 = yhVarArr2.length;
            this.i = (yh[]) Arrays.copyOf(yhVarArr2, length2 + length2);
        }
        yh[] yhVarArr3 = this.h;
        int i3 = this.f;
        yhVarArr3[i3] = yhVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && yhVarArr3[i3].c > yhVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new ye());
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        yhVar.b = true;
        yhVar.a(this);
    }

    public final void n(yh yhVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == yhVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        yhVar.b = false;
                        return;
                    } else {
                        yh[] yhVarArr = this.h;
                        int i3 = i + 1;
                        yhVarArr[i] = yhVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.ya
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            yh yhVar = this.h[i];
            yf yfVar = this.g;
            yfVar.a = yhVar;
            str = str + yfVar + " ";
        }
        return str;
    }
}
