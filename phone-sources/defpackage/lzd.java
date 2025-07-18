package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lzd {
    public final ksy a;
    public final boolean b;

    public lzd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lzd) {
            lzd lzdVar = (lzd) obj;
            if (this.a.equals(lzdVar.a) && this.b == lzdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversionResult{assetId=" + this.a.toString() + ", playable=" + this.b + "}";
    }

    public lzd(ksy ksyVar, boolean z) {
        this.a = ksyVar;
        this.b = z;
    }
}
