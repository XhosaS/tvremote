package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nnt extends jys {
    final /* synthetic */ nnu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nnt(nnu nnuVar) {
        super((char[]) null);
        this.a = nnuVar;
    }

    @Override // defpackage.jys
    public final void z() {
        nsf nsfVar = nnu.a;
        nsf.e();
        nnu nnuVar = this.a;
        nnuVar.c();
        vtw vtwVarC = nnuVar.d.c(nnuVar.f);
        ucn ucnVar = ((uco) vtwVarC.b).k;
        if (ucnVar == null) {
            ucnVar = ucn.a;
        }
        vtw vtwVarN = ucn.a.n(ucnVar);
        if (!vtwVarN.b.A()) {
            vtwVarN.u();
        }
        vuc vucVar = vtwVarN.b;
        ucn ucnVar2 = (ucn) vucVar;
        ucnVar2.b |= RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;
        ucnVar2.j = 0;
        if (!vucVar.A()) {
            vtwVarN.u();
        }
        ucn ucnVar3 = (ucn) vtwVarN.b;
        ucnVar3.b |= 8192;
        ucnVar3.k = 101;
        ucn ucnVar4 = (ucn) vtwVarN.r();
        if (!vtwVarC.b.A()) {
            vtwVarC.u();
        }
        uco ucoVar = (uco) vtwVarC.b;
        ucnVar4.getClass();
        ucoVar.k = ucnVar4;
        ucoVar.c |= 2;
        nnuVar.b.a((uco) vtwVarC.r(), 232);
    }
}
