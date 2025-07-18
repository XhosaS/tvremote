package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afw {
    public static final afw a = new afw(0, 127);
    public final int b;
    public final Boolean c;
    public final int d;
    private final int e;
    private final cki f;
    private final Boolean g;
    private final ckq h;

    public /* synthetic */ afw(int i, int i2) {
        this.b = 1 != (i2 & 1) ? 0 : -1;
        this.c = null;
        this.d = 0;
        this.e = (i2 & 8) != 0 ? -1 : i;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final int a() {
        cjz cjzVar = new cjz(this.e);
        if (true == a.r(cjzVar.a, -1)) {
            cjzVar = null;
        }
        if (cjzVar != null) {
            return cjzVar.a;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afw)) {
            return false;
        }
        afw afwVar = (afw) obj;
        if (!a.r(this.b, afwVar.b)) {
            return false;
        }
        Boolean bool = afwVar.c;
        if (!yks.e(null, null)) {
            return false;
        }
        int i = afwVar.d;
        if (!a.r(0, 0) || !a.r(this.e, afwVar.e)) {
            return false;
        }
        cki ckiVar = afwVar.f;
        if (!yks.e(null, null)) {
            return false;
        }
        Boolean bool2 = afwVar.g;
        if (!yks.e(null, null)) {
            return false;
        }
        ckq ckqVar = afwVar.h;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return ((this.b * 29791) + this.e) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) ckc.a(this.b)) + ", autoCorrectEnabled=null, keyboardType=" + ((Object) ckd.a(0)) + ", imeAction=" + ((Object) cjz.a(this.e)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
