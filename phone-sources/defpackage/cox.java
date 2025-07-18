package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cox extends cou {
    public int f;
    final cow g;
    private coy[] h;
    private coy[] i;

    public cox(ivx ivxVar) {
        super(ivxVar);
        this.h = new coy[128];
        this.i = new coy[128];
        this.f = 0;
        this.g = new cow(this);
    }

    @Override // defpackage.cou
    public final void d(cov covVar, cou couVar, boolean z) {
        coy coyVar = couVar.a;
        if (coyVar == null) {
            return;
        }
        cot cotVar = couVar.e;
        int i = cotVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            coy coyVarD = cotVar.d(i2);
            float fB = cotVar.b(i2);
            cow cowVar = this.g;
            cowVar.a = coyVarD;
            if (cowVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = cowVar.a.i;
                    float f = fArr[i3] + (coyVar.i[i3] * fB);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        cowVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    cowVar.b.n(cowVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = coyVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fB;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        cowVar.a.i[i4] = f3;
                    } else {
                        cowVar.a.i[i4] = 0.0f;
                    }
                }
                m(coyVarD);
            }
            this.b += couVar.b * fB;
        }
        n(coyVar);
    }

    @Override // defpackage.cou
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.cou
    public final coy k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            coy[] coyVarArr = this.h;
            coy coyVar = coyVarArr[i2];
            if (!zArr[coyVar.c]) {
                cow cowVar = this.g;
                cowVar.a = coyVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = cowVar.a.i[i3];
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
                    coy coyVar2 = coyVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = coyVar2.i[i3];
                            float f3 = cowVar.a.i[i3];
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

    public final void m(coy coyVar) {
        int i;
        int i2 = this.f + 1;
        coy[] coyVarArr = this.h;
        int length = coyVarArr.length;
        if (i2 > length) {
            coy[] coyVarArr2 = (coy[]) Arrays.copyOf(coyVarArr, length + length);
            this.h = coyVarArr2;
            int length2 = coyVarArr2.length;
            this.i = (coy[]) Arrays.copyOf(coyVarArr2, length2 + length2);
        }
        coy[] coyVarArr3 = this.h;
        int i3 = this.f;
        coyVarArr3[i3] = coyVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && coyVarArr3[i3].c > coyVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new bxy(6));
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        coyVar.b = true;
        coyVar.a(this);
    }

    public final void n(coy coyVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == coyVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        coyVar.b = false;
                        return;
                    } else {
                        coy[] coyVarArr = this.h;
                        int i3 = i + 1;
                        coyVarArr[i] = coyVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.cou
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            coy coyVar = this.h[i];
            cow cowVar = this.g;
            cowVar.a = coyVar;
            str = str + cowVar + " ";
        }
        return str;
    }
}
