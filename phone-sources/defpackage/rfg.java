package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfg {
    public final tst a;
    public final tst b;
    public final tst c;
    public final tst d;
    public final tst e;
    public final rfp f;
    public final tst g;
    public final tst h;
    public final ImmutableList i;
    public final rfo j;
    public final tst k;
    public final tst l;
    public final tst m;
    public final boolean n;
    public final Runnable o;
    public final int p;
    public final rrx q;
    public final rrx r;

    public rfg() {
        throw null;
    }

    public static rff a() {
        rff rffVar = new rff((byte[]) null);
        rffVar.j = new rrx();
        rffVar.b(ImmutableList.of());
        rffVar.g = (byte) (rffVar.g | 1);
        rffVar.c(false);
        rffVar.h = 1;
        rffVar.e = rfo.a;
        rffVar.b = new rfr(trk.a);
        rffVar.f = new ehq(10);
        rffVar.i = new rrx();
        return rffVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfg) {
            rfg rfgVar = (rfg) obj;
            if (this.a.equals(rfgVar.a) && this.b.equals(rfgVar.b) && this.c.equals(rfgVar.c) && this.d.equals(rfgVar.d) && this.r.equals(rfgVar.r) && this.e.equals(rfgVar.e) && this.f.equals(rfgVar.f) && this.g.equals(rfgVar.g) && this.h.equals(rfgVar.h) && this.i.equals(rfgVar.i) && this.j.equals(rfgVar.j) && this.k.equals(rfgVar.k) && this.l.equals(rfgVar.l) && this.m.equals(rfgVar.m)) {
                int i = this.p;
                int i2 = rfgVar.p;
                if (i == 0) {
                    throw null;
                }
                if (i2 == 1 && this.q.equals(rfgVar.q) && this.n == rfgVar.n && this.o.equals(rfgVar.o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.d.hashCode() ^ (-2127709203)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
        a.bl(this.p);
        return (((((((((((((((iHashCode * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.q.hashCode()) * 1000003) ^ (true == this.n ? 1231 : 1237)) * 1000003) ^ this.o.hashCode();
    }

    public final String toString() {
        Runnable runnable = this.o;
        rrx rrxVar = this.q;
        tst tstVar = this.m;
        tst tstVar2 = this.l;
        tst tstVar3 = this.k;
        rfo rfoVar = this.j;
        ImmutableList immutableList = this.i;
        tst tstVar4 = this.h;
        tst tstVar5 = this.g;
        rfp rfpVar = this.f;
        tst tstVar6 = this.e;
        rrx rrxVar2 = this.r;
        tst tstVar7 = this.d;
        tst tstVar8 = this.c;
        tst tstVar9 = this.b;
        return "AccountMenuFeatures{deactivatedAccountsFeature=" + String.valueOf(this.a) + ", incognitoFeature=" + String.valueOf(tstVar9) + ", customIncognitoActionFeature=" + String.valueOf(tstVar8) + ", obakeFeature=" + String.valueOf(tstVar7) + ", policyFooterCustomizer=" + String.valueOf(rrxVar2) + ", useWithoutAnAccountActionFeature=" + String.valueOf(tstVar6) + ", flavorsFeature=" + String.valueOf(rfpVar) + ", criticalAlertFeature=" + String.valueOf(tstVar5) + ", accountMessagesFeature=" + String.valueOf(tstVar4) + ", commonActions=" + String.valueOf(immutableList) + ", educationManager=" + String.valueOf(rfoVar) + ", countDecorationGenerator=" + String.valueOf(tstVar3) + ", disableAccountSwitchingFeature=" + String.valueOf(tstVar2) + ", launcherAppSpec=" + String.valueOf(tstVar) + ", isExperimental=false, largeScreenDialogAlignment=" + rrx.O(this.p) + ", materialVersion=" + String.valueOf(rrxVar) + ", enableQuickProfileSwitching=" + this.n + ", onSlowAccountSwitchingRunnable=" + String.valueOf(runnable) + "}";
    }

    public rfg(tst tstVar, tst tstVar2, tst tstVar3, tst tstVar4, rrx rrxVar, tst tstVar5, rfp rfpVar, tst tstVar6, tst tstVar7, ImmutableList immutableList, rfo rfoVar, tst tstVar8, tst tstVar9, tst tstVar10, rrx rrxVar2, boolean z, Runnable runnable) {
        this.a = tstVar;
        this.b = tstVar2;
        this.c = tstVar3;
        this.d = tstVar4;
        this.r = rrxVar;
        this.e = tstVar5;
        this.f = rfpVar;
        this.g = tstVar6;
        this.h = tstVar7;
        this.i = immutableList;
        this.j = rfoVar;
        this.k = tstVar8;
        this.l = tstVar9;
        this.m = tstVar10;
        this.p = 1;
        this.q = rrxVar2;
        this.n = z;
        this.o = runnable;
    }
}
