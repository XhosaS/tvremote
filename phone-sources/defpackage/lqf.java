package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqf {
    public final ksy a;
    public final tst b;
    public final tst c;
    private final tst d;
    private final tst e;
    private final tst f;
    private final ImmutableList g;
    private final tst h;
    private final int i;

    public lqf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqf) {
            lqf lqfVar = (lqf) obj;
            if (this.a.equals(lqfVar.a) && this.b.equals(lqfVar.b) && this.c.equals(lqfVar.c) && this.d.equals(lqfVar.d) && this.e.equals(lqfVar.e) && this.f.equals(lqfVar.f)) {
                int i = this.i;
                int i2 = lqfVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.g.equals(lqfVar.g) && this.h.equals(lqfVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        int i = this.i;
        a.bl(i);
        return (((((iHashCode * 1000003) ^ i) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        tst tstVar = this.h;
        ImmutableList immutableList = this.g;
        tst tstVar2 = this.f;
        tst tstVar3 = this.e;
        tst tstVar4 = this.d;
        tst tstVar5 = this.c;
        tst tstVar6 = this.b;
        return "CollectionAssetItem{assetId=" + String.valueOf(this.a) + ", entitlementAnnotation=" + String.valueOf(tstVar6) + ", loggingToken=" + String.valueOf(tstVar5) + ", continueWatchingDistributorId=" + String.valueOf(tstVar4) + ", continueWatchingSuggestionReason=" + String.valueOf(tstVar3) + ", continueWatchingPositionMillis=" + String.valueOf(tstVar2) + ", userSentiment=" + ktw.k(this.i) + ", imageList=" + String.valueOf(immutableList) + ", title=" + String.valueOf(tstVar) + "}";
    }

    public lqf(ksy ksyVar, tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4, tst tstVar5, int i, ImmutableList immutableList, tst tstVar6) {
        this.a = ksyVar;
        this.b = tstVar;
        this.c = tstVar2;
        this.d = tstVar3;
        this.e = tstVar4;
        this.f = tstVar5;
        this.i = i;
        this.g = immutableList;
        this.h = tstVar6;
    }
}
