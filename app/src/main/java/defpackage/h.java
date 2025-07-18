package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class h {
    public final g d;
    public m a = null;
    public float b = 0.0f;
    boolean c = false;
    boolean e = false;

    public h(i iVar) {
        this.d = new g(this, iVar);
    }

    public final void a(m mVar) {
        m mVar2 = this.a;
        if (mVar2 != null) {
            this.d.f(mVar2, -1.0f);
            this.a = null;
        }
        g gVar = this.d;
        float f = -gVar.c(mVar);
        this.a = mVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        int i = gVar.f;
        for (int i2 = 0; i != -1 && i2 < gVar.a; i2++) {
            float[] fArr = gVar.e;
            fArr[i] = fArr[i] / f;
            i = gVar.d[i];
        }
    }

    public final void b(m mVar, m mVar2) {
        g gVar = this.d;
        gVar.f(mVar, 1.0f);
        gVar.f(mVar2, -1.0f);
    }

    final void c(m mVar, m mVar2, int i, float f, m mVar3, m mVar4, int i2) {
        if (mVar2 == mVar3) {
            g gVar = this.d;
            gVar.f(mVar, 1.0f);
            gVar.f(mVar4, 1.0f);
            gVar.f(mVar2, -2.0f);
            return;
        }
        if (f == 0.5f) {
            g gVar2 = this.d;
            gVar2.f(mVar, 1.0f);
            gVar2.f(mVar2, -1.0f);
            gVar2.f(mVar3, -1.0f);
            gVar2.f(mVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.b = (-i) + i2;
                return;
            }
            return;
        }
        if (f <= 0.0f) {
            g gVar3 = this.d;
            gVar3.f(mVar, -1.0f);
            gVar3.f(mVar2, 1.0f);
            this.b = i;
            return;
        }
        if (f >= 1.0f) {
            g gVar4 = this.d;
            gVar4.f(mVar3, -1.0f);
            gVar4.f(mVar4, 1.0f);
            this.b = i2;
            return;
        }
        g gVar5 = this.d;
        float f2 = 1.0f - f;
        gVar5.f(mVar, f2);
        gVar5.f(mVar2, -f2);
        gVar5.f(mVar3, -f);
        gVar5.f(mVar4, f);
        if (i > 0 || i2 > 0) {
            this.b = ((-i) * f2) + (i2 * f);
        }
    }

    public final void d(m mVar, m mVar2, m mVar3, m mVar4, float f) {
        g gVar = this.d;
        gVar.f(mVar, -1.0f);
        gVar.f(mVar2, 1.0f);
        gVar.f(mVar3, f);
        gVar.f(mVar4, -f);
    }

    public final void e(float f, float f2, float f3, m mVar, int i, m mVar2, int i2, m mVar3, int i3, m mVar4, int i4) {
        int i5 = (-i) - i2;
        if (f2 == 0.0f || f == f3) {
            this.b = i5 + i3 + i4;
            g gVar = this.d;
            gVar.f(mVar, 1.0f);
            gVar.f(mVar2, -1.0f);
            gVar.f(mVar4, 1.0f);
            gVar.f(mVar3, -1.0f);
            return;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.b = i5 + (i3 * f4) + (i4 * f4);
        g gVar2 = this.d;
        gVar2.f(mVar, 1.0f);
        gVar2.f(mVar2, -1.0f);
        gVar2.f(mVar4, f4);
        gVar2.f(mVar3, -f4);
    }

    public final void f(m mVar, int i) {
        if (i < 0) {
            this.b = -i;
            this.d.f(mVar, 1.0f);
        } else {
            this.b = i;
            this.d.f(mVar, -1.0f);
        }
    }

    public final void g(m mVar, m mVar2, int i) {
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
                g gVar = this.d;
                gVar.f(mVar, 1.0f);
                gVar.f(mVar2, -1.0f);
                return;
            }
        }
        g gVar2 = this.d;
        gVar2.f(mVar, -1.0f);
        gVar2.f(mVar2, 1.0f);
    }

    public final void h(m mVar, m mVar2, m mVar3, int i) {
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
                g gVar = this.d;
                gVar.f(mVar, 1.0f);
                gVar.f(mVar2, -1.0f);
                gVar.f(mVar3, -1.0f);
                return;
            }
        }
        g gVar2 = this.d;
        gVar2.f(mVar, -1.0f);
        gVar2.f(mVar2, 1.0f);
        gVar2.f(mVar3, 1.0f);
    }

    public final void i(m mVar, m mVar2, m mVar3, int i) {
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
                g gVar = this.d;
                gVar.f(mVar, 1.0f);
                gVar.f(mVar2, -1.0f);
                gVar.f(mVar3, 1.0f);
                return;
            }
        }
        g gVar2 = this.d;
        gVar2.f(mVar, -1.0f);
        gVar2.f(mVar2, 1.0f);
        gVar2.f(mVar3, -1.0f);
    }

    public final String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            m mVar = this.a;
            Objects.toString(mVar);
            strConcat = "".concat(String.valueOf(mVar));
        }
        float f = this.b;
        String strConcat2 = strConcat.concat(" = ");
        if (f != 0.0f) {
            strConcat2 = strConcat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        g gVar = this.d;
        int i = gVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (gVar.d(i2) != null) {
                float fB = gVar.b(i2);
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
