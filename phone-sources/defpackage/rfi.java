package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rfi extends rfp {
    private final tst a;
    private final ImmutableList b;
    private final tst c;

    public rfi() {
        throw null;
    }

    @Override // defpackage.rfp
    public final tst a() {
        return tst.i(new rrx());
    }

    @Override // defpackage.rfp
    public final ImmutableList b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rfi) {
            rfi rfiVar = (rfi) obj;
            if (this.a.equals(rfiVar.a) && this.b.equals(rfiVar.b) && this.c.equals(rfiVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 2097800333) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        tst tstVar = this.c;
        ImmutableList immutableList = this.b;
        return "CollapsibleAccountManagementFeatureImpl{commonCards=" + String.valueOf(this.a) + ", flavorCustomActions=" + immutableList.toString() + ", dynamicCards=" + String.valueOf(tstVar) + "}";
    }

    public rfi(tst tstVar, ImmutableList immutableList, tst tstVar2) {
        this.a = tstVar;
        this.b = immutableList;
        this.c = tstVar2;
    }

    @Override // defpackage.rfp
    public final void c() {
    }

    @Override // defpackage.rfp
    public final void d() {
    }
}
