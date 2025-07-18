package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sst {
    public final int a;
    public final sjs b;

    public sst(int i, sjs sjsVar) {
        this.a = i;
        this.b = sjsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sst)) {
            return false;
        }
        sst sstVar = (sst) obj;
        return this.a == sstVar.a && agvy.c(this.b, sstVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SourceRouteData(routeToken=" + this.a + ", routeData=" + this.b + ")";
    }
}
