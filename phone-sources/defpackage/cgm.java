package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgm implements cfu {
    public final int a;
    public final int b;
    public final long c;
    public final clq d;
    public final cgp e;
    public final clj f;
    public final int g;
    public final int h;
    public final clr i;

    public cgm(int i, int i2, long j, clq clqVar, cgp cgpVar, clj cljVar, int i3, int i4, clr clrVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = clqVar;
        this.e = cgpVar;
        this.f = cljVar;
        this.g = i3;
        this.h = i4;
        this.i = clrVar;
        if (a.s(j, cmk.a) || cmk.a(j) >= 0.0f) {
            return;
        }
        cko.b("lineHeight can't be negative (" + cmk.a(j) + ')');
    }

    public final cgm a(cgm cgmVar) {
        return cgmVar == null ? this : cgn.a(this, cgmVar.a, cgmVar.b, cgmVar.c, cgmVar.d, cgmVar.e, cgmVar.f, cgmVar.g, cgmVar.h, cgmVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgm)) {
            return false;
        }
        cgm cgmVar = (cgm) obj;
        if (!a.r(this.a, cgmVar.a) || !a.r(this.b, cgmVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = cgmVar.c;
        long j3 = cmk.a;
        return a.s(j, j2) && yks.e(this.d, cgmVar.d) && yks.e(this.e, cgmVar.e) && yks.e(this.f, cgmVar.f) && a.r(this.g, cgmVar.g) && a.r(this.h, cgmVar.h) && yks.e(this.i, cgmVar.i);
    }

    public final int hashCode() {
        long j = cmk.a;
        clq clqVar = this.d;
        int iHashCode = clqVar != null ? clqVar.hashCode() : 0;
        int i = this.a;
        int i2 = this.b;
        long j2 = this.c;
        cgp cgpVar = this.e;
        int iHashCode2 = cgpVar != null ? cgpVar.hashCode() : 0;
        int iK = (((((i * 31) + i2) * 31) + a.k(j2)) * 31) + iHashCode;
        clj cljVar = this.f;
        int iHashCode3 = ((((((((iK * 31) + iHashCode2) * 31) + (cljVar != null ? cljVar.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        clr clrVar = this.i;
        return iHashCode3 + (clrVar != null ? clrVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) clk.a(this.a)) + ", textDirection=" + ((Object) clm.a(this.b)) + ", lineHeight=" + ((Object) cmk.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) clh.a(this.g)) + ", hyphens=" + ((Object) clg.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
