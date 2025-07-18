package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nba {
    public final String a;
    public final ksy b;
    public final tst c;
    public final tst d;
    public final boolean e;

    public nba() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nba) {
            nba nbaVar = (nba) obj;
            if (this.a.equals(nbaVar.a) && this.b.equals(nbaVar.b) && this.c.equals(nbaVar.c) && this.d.equals(nbaVar.d) && this.e == nbaVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        tst tstVar = this.d;
        tst tstVar2 = this.c;
        return "ActorFilmographyViewModel{title=" + this.a + ", assetId=" + String.valueOf(this.b) + ", yearsAndDuration=" + String.valueOf(tstVar2) + ", posterUrl=" + String.valueOf(tstVar) + ", watchlisted=" + this.e + "}";
    }

    public nba(String str, ksy ksyVar, tst tstVar, tst tstVar2, boolean z) {
        this.a = str;
        this.b = ksyVar;
        this.c = tstVar;
        this.d = tstVar2;
        this.e = z;
    }
}
