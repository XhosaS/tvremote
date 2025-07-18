package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmw implements ont {
    final /* synthetic */ kmy a;

    public kmw(kmy kmyVar) {
        this.a = kmyVar;
    }

    @Override // defpackage.ont
    public final void a(onz onzVar) {
        if (!onzVar.i()) {
            krd.d("Error fetching CastContext", onzVar.d());
            return;
        }
        nnm nnmVarH = ((nmg) onzVar.e()).h();
        kmy kmyVar = this.a;
        nnmVarH.c(kmyVar.h, nmq.class);
        kmyVar.f = true;
        kmyVar.l.e.ea(new itm(kmyVar, 17));
        nmg nmgVarC = nmg.c();
        if (nmgVarC != null) {
            pku pkuVar = new pku(kmyVar);
            nom nomVar = nmgVarC.i;
            Set set = nomVar.b;
            if (!set.contains(pkuVar)) {
                set.add(pkuVar);
                pkuVar.b(nomVar.R());
            }
        }
        kmyVar.c();
    }
}
