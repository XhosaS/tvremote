package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjg {
    public final String a;
    public final float b;

    public cjg(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cjg) {
            cjg cjgVar = (cjg) obj;
            if (yks.e(this.a, cjgVar.a) && this.b == cjgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ')';
    }
}
