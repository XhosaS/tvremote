package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sae implements sak {
    public final saq a;
    public final ImmutableSet b;
    public final ImmutableSet c;
    public final ImmutableSet d;

    public sae() {
        throw null;
    }

    @Override // defpackage.sak
    public final Object a() {
        vtw vtwVarM = wgk.a.m();
        Object obj = this.a.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wgk wgkVar = (wgk) vtwVarM.b;
        wgkVar.c = (wgp) obj;
        wgkVar.b |= 2;
        ImmutableSet immutableSet = this.b;
        if (!immutableSet.isEmpty() || !this.c.isEmpty()) {
            udi udiVarD = rrx.D(immutableSet, this.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wgk wgkVar2 = (wgk) vtwVarM.b;
            udiVarD.getClass();
            wgkVar2.d = udiVarD;
            wgkVar2.b |= 16;
        }
        vtw vtwVarM2 = wgy.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wgy wgyVar = (wgy) vtwVarM2.b;
        wgk wgkVar3 = (wgk) vtwVarM.r();
        wgkVar3.getClass();
        wgyVar.f = wgkVar3;
        wgyVar.b |= 8;
        return new sbf(vtwVarM2, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sae) {
            sae saeVar = (sae) obj;
            if (this.a.equals(saeVar.a) && this.b.equals(saeVar.b) && this.c.equals(saeVar.c) && this.d.equals(saeVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
    }

    public final String toString() {
        ImmutableSet immutableSet = this.d;
        ImmutableSet immutableSet2 = this.c;
        ImmutableSet immutableSet3 = this.b;
        return "ActionableAnalyticsEventDataImpl{contentType=" + String.valueOf(this.a) + ", position=null, extensions=" + String.valueOf(immutableSet3) + ", playExtensions=" + String.valueOf(immutableSet2) + ", testCodes=" + String.valueOf(immutableSet) + ", serverData=null}";
    }

    public sae(saq saqVar, ImmutableSet immutableSet, ImmutableSet immutableSet2, ImmutableSet immutableSet3) {
        this.a = saqVar;
        this.b = immutableSet;
        this.c = immutableSet2;
        this.d = immutableSet3;
    }
}
