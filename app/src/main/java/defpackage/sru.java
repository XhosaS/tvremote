package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sru {
    public final int a;
    public final sjs b;
    public final boolean c;

    public sru() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sru)) {
            return false;
        }
        sru sruVar = (sru) obj;
        return this.a == sruVar.a && agvy.c(this.b, sruVar.b) && this.c == sruVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SessionRouteData(routeToken=" + this.a + ", routeData=" + this.b + ", isInactive=" + this.c + ")";
    }

    public sru(int i, sjs sjsVar, boolean z) {
        this.a = i;
        this.b = sjsVar;
        this.c = z;
    }

    public /* synthetic */ sru(byte[] bArr) {
        this(-1, sjs.b(), true);
    }
}
