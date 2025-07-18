package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxr implements Cloneable {
    final float a;
    final int b;

    public hxr(float f) {
        this.b = 1;
        this.a = f;
    }

    public final float a(hzr hzrVar) {
        float f;
        if (this.b != 9) {
            return c(hzrVar);
        }
        hxf hxfVarB = hzrVar.b();
        if (hxfVarB == null) {
            return this.a;
        }
        float f2 = hxfVarB.c;
        if (f2 == hxfVarB.d) {
            f = this.a;
        } else {
            double dSqrt = Math.sqrt((f2 * f2) + (r6 * r6)) / 1.414213562373095d;
            f = this.a;
            f2 = (float) dSqrt;
        }
        return (f * f2) / 100.0f;
    }

    public final float b(hzr hzrVar, float f) {
        return this.b == 9 ? (this.a * f) / 100.0f : c(hzrVar);
    }

    public final float c(hzr hzrVar) {
        float f;
        switch (this.b - 1) {
            case 1:
                return this.a * hzrVar.a();
            case 2:
                return this.a * (hzrVar.d.d.getTextSize() / 2.0f);
            case 3:
                return this.a * 96.0f;
            case 4:
                f = 2.54f;
                return (this.a * 96.0f) / f;
            case 5:
                f = 25.4f;
                return (this.a * 96.0f) / f;
            case 6:
                f = 72.0f;
                return (this.a * 96.0f) / f;
            case 7:
                f = 6.0f;
                return (this.a * 96.0f) / f;
            case 8:
                hxf hxfVarB = hzrVar.b();
                if (hxfVarB != null) {
                    return (this.a * hxfVarB.c) / 100.0f;
                }
            default:
                return this.a;
        }
    }

    public final float d(hzr hzrVar) {
        if (this.b != 9) {
            return c(hzrVar);
        }
        hxf hxfVarB = hzrVar.b();
        return hxfVarB == null ? this.a : (this.a * hxfVarB.d) / 100.0f;
    }

    public final boolean e() {
        return this.a < 0.0f;
    }

    public final boolean f() {
        return this.a == 0.0f;
    }

    public final float g() {
        float f;
        int i = this.b - 1;
        if (i == 3) {
            return this.a * 96.0f;
        }
        if (i == 4) {
            f = 2.54f;
        } else if (i == 5) {
            f = 25.4f;
        } else if (i == 6) {
            f = 72.0f;
        } else {
            if (i != 7) {
                return this.a;
            }
            f = 6.0f;
        }
        return (this.a * 96.0f) / f;
    }

    public final String toString() {
        String str;
        int i = this.b;
        String strValueOf = String.valueOf(this.a);
        switch (i) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            default:
                str = "percent";
                break;
        }
        return String.valueOf(strValueOf).concat(str);
    }

    public hxr(float f, int i) {
        this.a = f;
        this.b = i;
    }
}
