package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ya {
    yh a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public xz e;

    public ya() {
    }

    public final yh a(boolean[] zArr, yh yhVar) {
        int i;
        int i2 = this.e.a;
        yh yhVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float fB = this.e.b(i3);
            if (fB < 0.0f) {
                yh yhVarD = this.e.d(i3);
                if ((zArr == null || !zArr[yhVarD.c]) && yhVarD != yhVar && (((i = yhVarD.n) == 3 || i == 4) && fB < f)) {
                    f = fB;
                    yhVar2 = yhVarD;
                }
            }
        }
        return yhVar2;
    }

    final void b(yh yhVar) {
        yh yhVar2 = this.a;
        if (yhVar2 != null) {
            this.e.g(yhVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(yhVar, true);
        this.a = yhVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        xz xzVar = this.e;
        int i = xzVar.f;
        for (int i2 = 0; i != -1 && i2 < xzVar.a; i2++) {
            float[] fArr = xzVar.e;
            fArr[i] = fArr[i] / f;
            i = xzVar.d[i];
        }
    }

    public final void c(yc ycVar, yh yhVar, boolean z) {
        if (yhVar == null || !yhVar.g) {
            return;
        }
        this.b += yhVar.f * this.e.a(yhVar);
        this.e.c(yhVar, z);
        if (z) {
            yhVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            ycVar.c = true;
        }
    }

    public void d(yc ycVar, ya yaVar, boolean z) {
        xz xzVar = this.e;
        float fA = xzVar.a(yaVar.a);
        xzVar.c(yaVar.a, z);
        xz xzVar2 = yaVar.e;
        int i = xzVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            yh yhVarD = xzVar2.d(i2);
            xzVar.e(yhVarD, xzVar2.a(yhVarD) * fA, z);
        }
        this.b += yaVar.b * fA;
        if (z) {
            yaVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        ycVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(yc ycVar, int i) {
        this.e.g(ycVar.o(i), 1.0f);
        this.e.g(ycVar.o(i), -1.0f);
    }

    public final void g(yh yhVar, yh yhVar2, yh yhVar3, yh yhVar4, float f) {
        this.e.g(yhVar, -1.0f);
        this.e.g(yhVar2, 1.0f);
        this.e.g(yhVar3, f);
        this.e.g(yhVar4, -f);
    }

    public final void h(yh yhVar, yh yhVar2, yh yhVar3, int i) {
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
                this.e.g(yhVar, 1.0f);
                this.e.g(yhVar2, -1.0f);
                this.e.g(yhVar3, -1.0f);
                return;
            }
        }
        this.e.g(yhVar, -1.0f);
        this.e.g(yhVar2, 1.0f);
        this.e.g(yhVar3, 1.0f);
    }

    public final void i(yh yhVar, yh yhVar2, yh yhVar3, int i) {
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
                this.e.g(yhVar, 1.0f);
                this.e.g(yhVar2, -1.0f);
                this.e.g(yhVar3, 1.0f);
                return;
            }
        }
        this.e.g(yhVar, -1.0f);
        this.e.g(yhVar2, 1.0f);
        this.e.g(yhVar3, -1.0f);
    }

    public final void j(yh yhVar, yh yhVar2, yh yhVar3, yh yhVar4, float f) {
        this.e.g(yhVar3, 0.5f);
        this.e.g(yhVar4, 0.5f);
        this.e.g(yhVar, -0.5f);
        this.e.g(yhVar2, -0.5f);
        this.b = -f;
    }

    public yh k(boolean[] zArr) {
        return a(zArr, null);
    }

    public final boolean l(yh yhVar) {
        return yhVar.l <= 1;
    }

    public String toString() {
        String strConcat;
        boolean z;
        String str;
        if (this.a == null) {
            strConcat = "0";
        } else {
            yh yhVar = this.a;
            Objects.toString(yhVar);
            strConcat = "".concat(String.valueOf(yhVar));
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
            yh yhVarD = this.e.d(i2);
            if (yhVarD != null) {
                float fB = this.e.b(i2);
                if (fB != 0.0f) {
                    String string = yhVarD.toString();
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

    public ya(yb ybVar) {
        this.e = new xz(this, ybVar);
    }
}
