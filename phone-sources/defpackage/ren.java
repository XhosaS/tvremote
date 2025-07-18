package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ren {
    public final ret a;
    public final rei b;
    public final tst c;
    public final rel d;

    public ren() {
        throw null;
    }

    public static uie a() {
        uie uieVar = new uie(null, null, null);
        rek rekVar = new rek();
        rekVar.b(105607);
        rekVar.c(105606);
        rekVar.d(105606);
        uieVar.c = rekVar.a();
        return uieVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ren) {
            ren renVar = (ren) obj;
            if (this.a.equals(renVar.a) && this.b.equals(renVar.b) && this.c.equals(renVar.c) && this.d.equals(renVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        rel relVar = this.d;
        tst tstVar = this.c;
        rei reiVar = this.b;
        return "TextualCardInitialData{cardIcon=" + String.valueOf(this.a) + ", titleData=" + String.valueOf(reiVar) + ", highlightId=" + String.valueOf(tstVar) + ", visualElementsInfo=" + String.valueOf(relVar) + "}";
    }

    public ren(ret retVar, rei reiVar, tst tstVar, rel relVar) {
        this.a = retVar;
        this.b = reiVar;
        this.c = tstVar;
        this.d = relVar;
    }
}
