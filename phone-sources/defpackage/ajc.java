package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajc {
    public final int a;
    public final int b;

    public ajc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajc)) {
            return false;
        }
        ajc ajcVar = (ajc) obj;
        return this.a == ajcVar.a && this.b == ajcVar.b;
    }

    public final int hashCode() {
        int i = this.a;
        a.bw(i);
        int i2 = this.b;
        a.bw(i2);
        return (i * 31) + i2;
    }

    public final String toString() {
        return "SelectionWedgeAffinity(startAffinity=" + ((Object) hv.j(this.a)) + ", endAffinity=" + ((Object) hv.j(this.b)) + ')';
    }
}
