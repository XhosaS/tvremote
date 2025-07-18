package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sag implements sak {
    public final saq a;
    public final wge b;
    public final ImmutableSet c;
    public final ImmutableSet d;
    public final ImmutableSet e;

    public sag() {
        throw null;
    }

    @Override // defpackage.sak
    public final Object a() {
        vtw vtwVarM = wgm.a.m();
        Object obj = this.a.a;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wgm wgmVar = (wgm) vucVar;
        wgmVar.e = (wgp) obj;
        wgmVar.b |= 2;
        wge wgeVar = this.b;
        if (wgeVar != null) {
            if (!vucVar.A()) {
                vtwVarM.u();
            }
            wgm wgmVar2 = (wgm) vtwVarM.b;
            wgmVar2.d = wgeVar;
            wgmVar2.c = 4;
        }
        ImmutableSet immutableSet = this.c;
        if (!immutableSet.isEmpty() || !this.d.isEmpty()) {
            udi udiVarD = rrx.D(immutableSet, this.d);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            wgm wgmVar3 = (wgm) vtwVarM.b;
            udiVarD.getClass();
            wgmVar3.f = udiVarD;
            wgmVar3.b |= 16;
        }
        vtw vtwVarM2 = wgy.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wgy wgyVar = (wgy) vtwVarM2.b;
        wgm wgmVar4 = (wgm) vtwVarM.r();
        wgmVar4.getClass();
        wgyVar.e = wgmVar4;
        wgyVar.b |= 4;
        return new sbf(vtwVarM2, this.e);
    }

    public final boolean equals(Object obj) {
        wge wgeVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sag) {
            sag sagVar = (sag) obj;
            if (this.a.equals(sagVar.a) && ((wgeVar = this.b) != null ? wgeVar.equals(sagVar.b) : sagVar.b == null) && this.c.equals(sagVar.c) && this.d.equals(sagVar.d) && this.e.equals(sagVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() ^ 1000003;
        wge wgeVar = this.b;
        if (wgeVar == null) {
            iJ = 0;
        } else if (wgeVar.A()) {
            iJ = wgeVar.j();
        } else {
            int iJ2 = wgeVar.M;
            if (iJ2 == 0) {
                iJ2 = wgeVar.j();
                wgeVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((((((((iHashCode * (-721379959)) ^ iJ) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
    }

    public final String toString() {
        ImmutableSet immutableSet = this.e;
        ImmutableSet immutableSet2 = this.d;
        ImmutableSet immutableSet3 = this.c;
        wge wgeVar = this.b;
        return "CardAnalyticsEventDataImpl{contentType=" + String.valueOf(this.a) + ", position=null, docId=" + String.valueOf(wgeVar) + ", extensions=" + String.valueOf(immutableSet3) + ", playExtensions=" + String.valueOf(immutableSet2) + ", testCodes=" + String.valueOf(immutableSet) + ", serverData=null}";
    }

    public sag(saq saqVar, wge wgeVar, ImmutableSet immutableSet, ImmutableSet immutableSet2, ImmutableSet immutableSet3) {
        this.a = saqVar;
        this.b = wgeVar;
        this.c = immutableSet;
        this.d = immutableSet2;
        this.e = immutableSet3;
    }
}
