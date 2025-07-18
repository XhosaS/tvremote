package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ceg {
    public final bqm a;
    public final int b;

    public ceg(bqm bqmVar, int i) {
        this.a = bqmVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceg)) {
            return false;
        }
        ceg cegVar = (ceg) obj;
        return yks.e(this.a, cegVar.a) && this.b == cegVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "ImageVectorEntry(imageVector=" + this.a + ", configFlags=" + this.b + ')';
    }
}
