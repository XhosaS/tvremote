package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pv {
    public final ne a;
    public final nl b;
    public final int c = 0;

    public pv(ne neVar, nl nlVar) {
        this.a = neVar;
        this.b = nlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        if (!yks.e(this.a, pvVar.a) || !yks.e(this.b, pvVar.b)) {
            return false;
        }
        int i = pvVar.c;
        return a.r(0, 0);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
