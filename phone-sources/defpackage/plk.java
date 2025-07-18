package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class plk implements pjk, plh {
    public final ucz a;
    public final List b;
    public final pjw c;
    public final long d;
    public final boolean e;

    public plk(ucz uczVar, List list, pjw pjwVar, long j, boolean z) {
        this.a = uczVar;
        this.b = list;
        this.c = pjwVar;
        this.d = j;
        this.e = z;
    }

    @Override // defpackage.plh
    public final /* synthetic */ pka a() {
        return qtl.aq(this);
    }

    @Override // defpackage.plh
    public final List b() {
        return this.b;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        ucy ucyVar = qtl.aq(this).d;
        if (ucyVar == null) {
            ucyVar = ucy.a;
        }
        tssVarH.d("rootVeId", ucyVar.d);
        ucy ucyVar2 = qtl.ar(this).d;
        if (ucyVar2 == null) {
            ucyVar2 = ucy.a;
        }
        tssVarH.d("targetVeId", ucyVar2.d);
        return tssVarH.toString();
    }
}
