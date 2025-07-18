package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ltm {
    public final ieh a;
    public final ltl b;
    public final int c;
    public final int d;

    public ltm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ltm) {
            ltm ltmVar = (ltm) obj;
            if (this.a.equals(ltmVar.a) && this.b.equals(ltmVar.b) && this.c == ltmVar.c && this.d == ltmVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
    }

    public final String toString() {
        ltl ltlVar = this.b;
        return "PaginationRequest{accountSupplier=" + String.valueOf(this.a) + ", fetchToken=" + String.valueOf(ltlVar) + ", maxCollections=" + this.c + ", maxAssets=" + this.d + ", stalenessTimestampMs=0}";
    }

    public ltm(ieh iehVar, ltl ltlVar, int i, int i2) {
        this.a = iehVar;
        this.b = ltlVar;
        this.c = i;
        this.d = i2;
    }
}
