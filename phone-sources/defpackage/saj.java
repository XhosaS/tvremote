package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class saj implements sak {
    public final saq a;
    public final ImmutableSet b;
    public final ImmutableSet c;
    public final ImmutableSet d;

    public saj() {
        throw null;
    }

    @Override // defpackage.sak
    public final Object a() {
        vtw vtwVarM = wgo.a.m();
        Object obj = this.a.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wgo wgoVar = (wgo) vtwVarM.b;
        wgoVar.c = (wgp) obj;
        wgoVar.b |= 2;
        ImmutableSet immutableSet = this.b;
        if (!immutableSet.isEmpty() || !this.c.isEmpty()) {
            udi udiVarD = rrx.D(immutableSet, this.c);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wgo wgoVar2 = (wgo) vtwVarM.b;
            udiVarD.getClass();
            wgoVar2.d = udiVarD;
            wgoVar2.b |= 16;
        }
        vtw vtwVarM2 = wgy.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wgy wgyVar = (wgy) vtwVarM2.b;
        wgo wgoVar3 = (wgo) vtwVarM.r();
        wgoVar3.getClass();
        wgyVar.d = wgoVar3;
        wgyVar.b |= 2;
        return new sbf(vtwVarM2, this.d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof saj) {
            saj sajVar = (saj) obj;
            if (this.a.equals(sajVar.a) && this.b.equals(sajVar.b) && this.c.equals(sajVar.c) && this.d.equals(sajVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
    }

    public final String toString() {
        ImmutableSet immutableSet = this.d;
        ImmutableSet immutableSet2 = this.c;
        ImmutableSet immutableSet3 = this.b;
        return "PageAnalyticsEventData{contentType=" + String.valueOf(this.a) + ", extensions=" + String.valueOf(immutableSet3) + ", playExtensions=" + String.valueOf(immutableSet2) + ", testCodes=" + String.valueOf(immutableSet) + ", serverData=null}";
    }

    public saj(saq saqVar, ImmutableSet immutableSet, ImmutableSet immutableSet2, ImmutableSet immutableSet3) {
        this.a = saqVar;
        this.b = immutableSet;
        this.c = immutableSet2;
        this.d = immutableSet3;
    }
}
