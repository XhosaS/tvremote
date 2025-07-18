package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqt {
    public final ksn a;
    public final ksy b;
    public final ImmutableList c;
    private final String d;

    public lqt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqt) {
            lqt lqtVar = (lqt) obj;
            if (this.a.equals(lqtVar.a) && this.b.equals(lqtVar.b) && this.d.equals(lqtVar.d) && this.c.equals(lqtVar.c)) {
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
        return "ShareAssetRequest{account=" + this.a.toString() + ", assetId=" + ksyVar.toString() + ", title=" + this.d + ", purchaseIds=" + immutableList.toString() + "}";
    }

    public lqt(ksn ksnVar, ksy ksyVar, String str, ImmutableList immutableList) {
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
