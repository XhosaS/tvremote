package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpm {
    public clx a;
    public cmi b;
    public bnp c;
    public long d = 0;

    public bpm(clx clxVar, cmi cmiVar, bnp bnpVar) {
        this.a = clxVar;
        this.b = cmiVar;
        this.c = bnpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpm)) {
            return false;
        }
        bpm bpmVar = (bpm) obj;
        return yks.e(this.a, bpmVar.a) && this.b == bpmVar.b && yks.e(this.c, bpmVar.c) && a.s(this.d, bpmVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.k(this.d);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) bna.d(this.d)) + ')';
    }
}
