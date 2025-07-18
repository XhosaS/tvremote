package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hmn extends ayq {
    private final hmo i;
    private final hmb j;
    private final hmc k;

    public hmn(hmo hmoVar, hmb hmbVar, hmc hmcVar) {
        this.i = hmoVar;
        this.j = hmbVar;
        this.k = hmcVar;
    }

    @Override // defpackage.ayq
    public final void n(ayo ayoVar) {
        View view = ayoVar.a;
        pan panVarA = paq.a(view);
        hmc hmcVar = this.k;
        if (hmcVar.E() && panVarA != null && (panVarA.a().b & 1) == 0) {
            this.j.q().u(hmcVar.y(), view, this.i.a.g);
        }
    }
}
