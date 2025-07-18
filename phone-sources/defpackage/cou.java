package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cou {
    coy a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public cot e;

    public cou() {
    }

    public static final boolean l(coy coyVar) {
        return coyVar.l <= 1;
    }

    public final coy a(boolean[] zArr, coy coyVar) {
        int i;
        int i2 = this.e.a;
        coy coyVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                coy coyVarD = this.e.d(i3);
                if ((zArr == null || !zArr[coyVarD.c]) && coyVarD != coyVar && (((i = coyVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    coyVar2 = coyVarD;
                }
            }
        }
        return coyVar2;
    }

    final void b(coy coyVar) {
        coy coyVar2 = this.a;
        if (coyVar2 != null) {
            this.e.g(coyVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(coyVar, true);
        this.a = coyVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        cot cotVar = this.e;
        int i = cotVar.e;
        for (int i2 = 0; i != -1 && i2 < cotVar.a; i2++) {
            float[] fArr = cotVar.d;
            fArr[i] = fArr[i] / f;
            i = cotVar.c[i];
        }
    }

    public final void c(cov covVar, coy coyVar, boolean z) {
        if (coyVar == null || !coyVar.g) {
            return;
        }
        this.b += coyVar.f * this.e.a(coyVar);
        this.e.c(coyVar, z);
        if (z) {
            coyVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            covVar.c = true;
        }
    }

    public void d(cov covVar, cou couVar, boolean z) {
        cot cotVar = this.e;
        float fA = cotVar.a(couVar.a);
        cotVar.c(couVar.a, z);
        cot cotVar2 = couVar.e;
        int i = cotVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            coy coyVarD = cotVar2.d(i2);
            cotVar.e(coyVarD, cotVar2.a(coyVarD) * fA, z);
        }
        this.b += couVar.b * fA;
        if (z) {
            couVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        covVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(cov covVar, int i) {
        this.e.g(covVar.p(i), 1.0f);
        this.e.g(covVar.p(i), -1.0f);
    }

    public final void g(coy coyVar, coy coyVar2, coy coyVar3, coy coyVar4, float f) {
        this.e.g(coyVar, -1.0f);
        this.e.g(coyVar2, 1.0f);
        this.e.g(coyVar3, f);
        this.e.g(coyVar4, -f);
    }

    public final void h(coy coyVar, coy coyVar2, coy coyVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(coyVar, 1.0f);
                this.e.g(coyVar2, -1.0f);
                this.e.g(coyVar3, -1.0f);
                return;
            }
        }
        this.e.g(coyVar, -1.0f);
        this.e.g(coyVar2, 1.0f);
        this.e.g(coyVar3, 1.0f);
    }

    public final void i(coy coyVar, coy coyVar2, coy coyVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(coyVar, 1.0f);
                this.e.g(coyVar2, -1.0f);
                this.e.g(coyVar3, 1.0f);
                return;
            }
        }
        this.e.g(coyVar, -1.0f);
        this.e.g(coyVar2, 1.0f);
        this.e.g(coyVar3, -1.0f);
    }

    public final void j(coy coyVar, coy coyVar2, coy coyVar3, coy coyVar4, float f) {
        this.e.g(coyVar3, 0.5f);
        this.e.g(coyVar4, 0.5f);
        this.e.g(coyVar, -0.5f);
        this.e.g(coyVar2, -0.5f);
        this.b = -f;
    }

    public coy k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            coy coyVar = this.a;
            Objects.toString(coyVar);
            strConcat = "".concat(String.valueOf(coyVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            coy coyVarD = this.e.d(i2);
            if (coyVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    String string = coyVarD.toString();
                    if (z) {
                        if (fB > 0.0f) {
                            str = " + ";
                        } else {
                            fB = -fB;
                            str = " - ";
                        }
                        strConcat2 = strConcat2.concat(str);
                    } else if (fB < 0.0f) {
                        fB = -fB;
                        strConcat2 = strConcat2.concat("- ");
                    }
                    strConcat2 = fB == 1.0f ? strConcat2.concat(string) : strConcat2 + fB + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }

    public cou(ivx ivxVar) {
        this.e = new cot(this, ivxVar);
    }
}
