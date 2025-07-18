package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqw {
    public final ksn a;
    public final ksy b;
    public final ImmutableList c;
    private final String d;

    public lqw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqw) {
            lqw lqwVar = (lqw) obj;
            if (this.a.equals(lqwVar.a) && this.b.equals(lqwVar.b) && this.d.equals(lqwVar.d) && this.c.equals(lqwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.c;
        ksy ksyVar = this.b;
        return "UnshareAssetRequest{account=" + this.a.toString() + ", assetId=" + ksyVar.toString() + ", title=" + this.d + ", purchaseIds=" + immutableList.toString() + "}";
    }

    public lqw(ksn ksnVar, ksy ksyVar, String str, ImmutableList immutableList) {
        this.a = ksnVar;
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.b = ksyVar;
        this.d = str;
        if (immutableList == null) {
            throw new NullPointerException("Null purchaseIds");
        }
        this.c = immutableList;
    }
}
