package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class guu {
    public final String a;
    public final gpx b;

    public guu(String str, gpx gpxVar) {
        gpxVar.getClass();
        this.a = str;
        this.b = gpxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guu)) {
            return false;
        }
        guu guuVar = (guu) obj;
        return yks.e(this.a, guuVar.a) && this.b == guuVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
