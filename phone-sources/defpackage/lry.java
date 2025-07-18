package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lry {
    public final ksy a;
    public final ieg b;
    public final lbh c;
    public final tst d;

    public lry() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lry) {
            lry lryVar = (lry) obj;
            if (this.a.equals(lryVar.a) && this.b.equals(lryVar.b) && this.c.equals(lryVar.c) && this.d.equals(lryVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        tst tstVar = this.d;
        lbh lbhVar = this.c;
        ieg iegVar = this.b;
        return "GetStreamsRequest{assetId=" + String.valueOf(this.a) + ", account=" + String.valueOf(iegVar) + ", hdcpLevel=" + String.valueOf(lbhVar) + ", locale=" + String.valueOf(tstVar) + "}";
    }

    public lry(ksy ksyVar, ieg iegVar, lbh lbhVar, tst tstVar) {
        this.a = ksyVar;
        this.b = iegVar;
        this.c = lbhVar;
        this.d = tstVar;
    }
}
