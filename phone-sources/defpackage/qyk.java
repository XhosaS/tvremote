package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyk {
    public final Context a;
    public final qxc b;
    public final vrs c;
    public final qzd d;
    public final tst e;
    public final tst f;
    public final tst g;
    public final tst h;
    public final tst i;
    public final tst j;
    public final tst k;
    public final rbi l;
    public final rbi m;
    public final rdd n;
    public final xzg o;
    public final vxr p;
    public final cb q;

    public qyk(Context context, xzg xzgVar, qxc qxcVar, vrs vrsVar, rbi rbiVar, cb cbVar, qzd qzdVar, tst tstVar, tst tstVar2, tst tstVar3, vxr vxrVar, tst tstVar4, rdd rddVar, tst tstVar5, tst tstVar6, rbi rbiVar2, tst tstVar7) {
        this.a = context;
        this.o = xzgVar;
        this.b = qxcVar;
        this.c = vrsVar;
        this.m = rbiVar;
        this.q = cbVar;
        this.d = qzdVar;
        this.e = tstVar;
        this.f = tstVar2;
        this.g = tstVar3;
        this.p = vxrVar;
        this.h = tstVar4;
        this.n = rddVar;
        this.i = tstVar5;
        this.j = tstVar6;
        this.l = rbiVar2;
        this.k = tstVar7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyk)) {
            return false;
        }
        qyk qykVar = (qyk) obj;
        return yks.e(this.a, qykVar.a) && yks.e(this.o, qykVar.o) && yks.e(this.b, qykVar.b) && yks.e(this.c, qykVar.c) && yks.e(this.m, qykVar.m) && yks.e(this.q, qykVar.q) && yks.e(this.d, qykVar.d) && yks.e(this.e, qykVar.e) && yks.e(this.f, qykVar.f) && yks.e(this.g, qykVar.g) && yks.e(this.p, qykVar.p) && yks.e(this.h, qykVar.h) && yks.e(this.n, qykVar.n) && yks.e(this.i, qykVar.i) && yks.e(this.j, qykVar.j) && yks.e(this.l, qykVar.l) && yks.e(this.k, qykVar.k);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.o.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.m.hashCode()) * 31) + this.q.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 2040732332) * 31) + 2040732332) * 31) + this.p.hashCode()) * 31) + 2040732332) * 31) + this.n.hashCode()) * 31) + 2040732332) * 31) + 2040732332) * 31) + this.l.hashCode()) * 31) + 2040732332;
    }

    public final String toString() {
        return "ViewModelData(context=" + this.a + ", interactionEventBus=" + this.o + ", accountCapabilitiesRetriever=" + this.b + ", tapMapper=" + this.c + ", inAppReachData=" + this.m + ", interactionEventHandler=" + this.q + ", obakeFeatureExtractor=" + this.d + ", appName=" + this.e + ", appNameStringRes=" + this.f + ", storageCardExtractor=" + this.g + ", externalIdMapping=" + this.p + ", actionStacksFlowWrapper=" + this.h + ", topRightDiscContext=" + this.n + ", backupSyncCardExtractor=" + this.i + ", discDecorationsData=" + this.j + ", restrictedAccountsRetriever=" + this.l + ", accountTrailingContentChecker=" + this.k + ")";
    }
}
