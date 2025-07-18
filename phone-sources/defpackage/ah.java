package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ah {
    public final ag d;
    public ak a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public ah(ivx ivxVar) {
        this.d = new ag(this, ivxVar);
    }

    public final void a(ak akVar) {
        ak akVar2 = this.a;
        if (akVar2 != null) {
            this.d.f(akVar2, -1.0f);
            this.a = null;
        }
        ag agVar = this.d;
        float f = -agVar.c(akVar);
        this.a = akVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        int i = agVar.e;
        for (int i2 = 0; i != -1 && i2 < agVar.a; i2++) {
            float[] fArr = agVar.d;
            fArr[i] = fArr[i] / f;
            i = agVar.c[i];
        }
    }

    final void b() {
        ag agVar = this.d;
        int i = agVar.e;
        for (int i2 = 0; i != -1 && i2 < agVar.a; i2++) {
            ak akVar = ((ak[]) agVar.h.c)[agVar.b[i]];
            int i3 = 0;
            while (true) {
                int i4 = akVar.g;
                if (i3 >= i4) {
                    ah[] ahVarArr = akVar.f;
                    int length = ahVarArr.length;
                    if (i4 >= length) {
                        akVar.f = (ah[]) Arrays.copyOf(ahVarArr, length + length);
                    }
                    ah[] ahVarArr2 = akVar.f;
                    int i5 = akVar.g;
                    ahVarArr2[i5] = this;
                    akVar.g = i5 + 1;
                } else if (akVar.f[i3] == this) {
                    break;
                } else {
                    i3++;
                }
            }
            i = agVar.c[i];
        }
    }

    public final void c(ak akVar, ak akVar2) {
        ag agVar = this.d;
        agVar.f(akVar, 1.0f);
        agVar.f(akVar2, -1.0f);
    }

    final void d(ak akVar, ak akVar2, int i, float f, ak akVar3, ak akVar4, int i2) {
        if (akVar2 == akVar3) {
            ag agVar = this.d;
            agVar.f(akVar, 1.0f);
            agVar.f(akVar4, 1.0f);
            agVar.f(akVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            ag agVar2 = this.d;
            agVar2.f(akVar, 1.0f);
            agVar2.f(akVar2, -1.0f);
            agVar2.f(akVar3, -1.0f);
            agVar2.f(akVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            ag agVar3 = this.d;
            agVar3.f(akVar, -1.0f);
            agVar3.f(akVar2, 1.0f);
            this.b = i;
            return;
        }
        if (f >= 1.0f) {
            ag agVar4 = this.d;
            agVar4.f(akVar3, -1.0f);
            agVar4.f(akVar4, 1.0f);
            this.b = i2;
            return;
        }
        ag agVar5 = this.d;
        float f2 = 1.0f - f;
        agVar5.f(akVar, f2);
        agVar5.f(akVar2, -f2);
        agVar5.f(akVar3, -f);
        agVar5.f(akVar4, f);
        if (i > 0 || i2 > 0) {
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void e(ak akVar, ak akVar2, ak akVar3, ak akVar4, float f) {
        ag agVar = this.d;
        agVar.f(akVar, -1.0f);
        agVar.f(akVar2, 1.0f);
        agVar.f(akVar3, f);
        agVar.f(akVar4, -f);
    }

    public final void f(float f, float f2, float f3, ak akVar, int i, ak akVar2, int i2, ak akVar3, int i3, ak akVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 == 0.0f || f == f3) {
            this.b = i5 + i3 + i4;
            ag agVar = this.d;
            agVar.f(akVar, 1.0f);
            agVar.f(akVar2, -1.0f);
            agVar.f(akVar4, 1.0f);
            agVar.f(akVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = i5 + (i3 * f4) + (i4 * f4);
        ag agVar2 = this.d;
        agVar2.f(akVar, 1.0f);
        agVar2.f(akVar2, -1.0f);
        agVar2.f(akVar4, f4);
        agVar2.f(akVar3, -f4);
    }

    public final void g(ak akVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(akVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(akVar, -1.0f);
        }
    }

    public final void h(ak akVar, ak akVar2, int i) {
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
                ag agVar = this.d;
                agVar.f(akVar, 1.0f);
                agVar.f(akVar2, -1.0f);
                return;
            }
        }
        ag agVar2 = this.d;
        agVar2.f(akVar, -1.0f);
        agVar2.f(akVar2, 1.0f);
    }

    public final void i(ak akVar, ak akVar2, ak akVar3, int i) {
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
                ag agVar = this.d;
                agVar.f(akVar, 1.0f);
                agVar.f(akVar2, -1.0f);
                agVar.f(akVar3, -1.0f);
                return;
            }
        }
        ag agVar2 = this.d;
        agVar2.f(akVar, -1.0f);
        agVar2.f(akVar2, 1.0f);
        agVar2.f(akVar3, 1.0f);
    }

    public final void j(ak akVar, ak akVar2, ak akVar3, int i) {
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
                ag agVar = this.d;
                agVar.f(akVar, 1.0f);
                agVar.f(akVar2, -1.0f);
                agVar.f(akVar3, 1.0f);
                return;
            }
        }
        ag agVar2 = this.d;
        agVar2.f(akVar, -1.0f);
        agVar2.f(akVar2, 1.0f);
        agVar2.f(akVar3, -1.0f);
    }

    public final void k(ah ahVar) {
        this.d.g(this, ahVar);
    }

    public final String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            ak akVar = this.a;
            Objects.toString(akVar);
            strConcat = "".concat(String.valueOf(akVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        ag agVar = this.d;
        int i = agVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (agVar.d(i2) != null) {
                float fB = agVar.b(i2);
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
                strConcat2 = fB == 1.0f ? strConcat2.concat("null") : strConcat2 + fB + " null";
                z = true;
            }
        }
        return !z ? strConcat2.concat("0.0") : strConcat2;
    }
}
