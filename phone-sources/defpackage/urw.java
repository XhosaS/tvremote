package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class urw {
    public final Object a;
    public final String b;
    public final tsj c;

    public urw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof urw) {
            urw urwVar = (urw) obj;
            if (this.a.equals(urwVar.a) && this.b.equals(urwVar.b) && this.c.equals(urwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        tsj tsjVar = this.c;
        return "CacheKey{account=" + this.a.toString() + ", name=" + this.b + ", key=" + tsjVar.toString() + "}";
    }

    public urw(Object obj, String str, tsj tsjVar) {
        this.a = obj;
        this.b = str;
        this.c = tsjVar;
    }
}
