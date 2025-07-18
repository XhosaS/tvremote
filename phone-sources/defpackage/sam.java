package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sam implements sak {
    public final saq a;
    public final boolean b;
    public final ImmutableSet c;
    public final ImmutableSet d;
    public final ImmutableSet e;

    public sam() {
        throw null;
    }

    @Override // defpackage.sak
    public final Object a() {
        vtw vtwVarM = wgx.a.m();
        Object obj = this.a.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wgx wgxVar = (wgx) vucVar;
        wgxVar.c = (wgp) obj;
        wgxVar.b |= 2;
        boolean z = this.b;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        wgx wgxVar2 = (wgx) vtwVarM.b;
        wgxVar2.b |= 16;
        wgxVar2.d = z;
        ImmutableSet immutableSet = this.c;
        if (!immutableSet.isEmpty() || !this.d.isEmpty()) {
            udi udiVarD = rrx.D(immutableSet, this.d);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wgx wgxVar3 = (wgx) vtwVarM.b;
            udiVarD.getClass();
            wgxVar3.e = udiVarD;
            wgxVar3.b |= 32;
        }
        vtw vtwVarM2 = wgy.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wgy wgyVar = (wgy) vtwVarM2.b;
        wgx wgxVar4 = (wgx) vtwVarM.r();
        wgxVar4.getClass();
        wgyVar.g = wgxVar4;
        wgyVar.b |= 16;
        return new sbf(vtwVarM2, this.e);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sam) {
            sam samVar = (sam) obj;
            if (this.a.equals(samVar.a) && this.b == samVar.b && this.c.equals(samVar.c) && this.d.equals(samVar.d) && this.e.equals(samVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() ^ 1000003) * (-721379959)) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
    }

    public final String toString() {
        ImmutableSet immutableSet = this.e;
        ImmutableSet immutableSet2 = this.d;
        ImmutableSet immutableSet3 = this.c;
        return "SelectableAnalyticsEventDataImpl{contentType=" + String.valueOf(this.a) + ", position=null, isSelected=" + this.b + ", extensions=" + String.valueOf(immutableSet3) + ", playExtensions=" + String.valueOf(immutableSet2) + ", testCodes=" + String.valueOf(immutableSet) + ", serverData=null}";
    }

    public sam(saq saqVar, boolean z, ImmutableSet immutableSet, ImmutableSet immutableSet2, ImmutableSet immutableSet3) {
        this.a = saqVar;
        this.b = z;
        this.c = immutableSet;
        this.d = immutableSet2;
        this.e = immutableSet3;
    }
}
