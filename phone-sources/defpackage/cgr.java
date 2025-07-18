package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgr {
    public final cgq a;
    public final cgp b;

    public cgr(cgp cgpVar) {
        this.a = null;
        this.b = cgpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgr)) {
            return false;
        }
        cgr cgrVar = (cgr) obj;
        if (!yks.e(this.b, cgrVar.b)) {
            return false;
        }
        cgq cgqVar = cgrVar.a;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=null, paragraphSyle=" + this.b + ')';
    }

    public cgr() {
        this(new cgp(null));
    }
}
