package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwe {
    public final ksy a;
    public final tst b;
    public final tst c;
    public final kwd d;

    public kwe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwe) {
            kwe kweVar = (kwe) obj;
            if (this.a.equals(kweVar.a) && this.b.equals(kweVar.b) && this.c.equals(kweVar.c) && this.d.equals(kweVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        kwd kwdVar = this.d;
        tst tstVar = this.c;
        tst tstVar2 = this.b;
        return "PurchasedAsset{assetId=" + String.valueOf(this.a) + ", showId=" + String.valueOf(tstVar2) + ", seasonId=" + String.valueOf(tstVar) + ", purchaseDetails=" + String.valueOf(kwdVar) + "}";
    }

    public kwe(ksy ksyVar, tst tstVar, tst tstVar2, kwd kwdVar) {
        this.a = ksyVar;
        this.b = tstVar;
        this.c = tstVar2;
        this.d = kwdVar;
    }
}
