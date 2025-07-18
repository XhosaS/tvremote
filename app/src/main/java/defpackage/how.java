package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class how extends ayq {
    public final hox i;
    public final hmb j;
    private final hmc k;

    public how(hox hoxVar, hmb hmbVar, hmc hmcVar) {
        this.i = hoxVar;
        this.j = hmbVar;
        this.k = hmcVar;
    }

    @Override // defpackage.ayq
    public final void n(ayo ayoVar) {
        hpz hpzVar = (hpz) ayoVar.t;
        uuk uukVar = uuk.a;
        hox hoxVar = this.i;
        hpzVar.d(uukVar.a(hoxVar.d));
        boolean z = false;
        if (hoxVar.m && hoxVar.e) {
            z = true;
        }
        hpzVar.e(z);
        View view = ayoVar.a;
        hoxVar.c(view);
        hmc hmcVar = this.k;
        pan panVarA = paq.a(view);
        if (hmcVar.E() && panVarA != null && (panVarA.a().b & 1) == 0) {
            this.j.q().u(hmcVar.y(), view, hoxVar.g);
        }
    }

    @Override // defpackage.ayq
    public final void o(final ayo ayoVar) {
        hpz hpzVar = (hpz) ayoVar.t;
        if (this.i.s != null) {
            hpzVar.c().setOnClickListener(new View.OnClickListener() { // from class: hou
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ayo ayoVar2 = ayoVar;
                    hox hoxVar = this.a.i;
                    ayo ayoVar3 = (ayo) hoxVar.b.l(ayoVar2.a);
                    awk awkVar = hoxVar.s;
                    if (awkVar != null) {
                        awkVar.ew(ayoVar2.t, ayoVar3.u, hoxVar, hoxVar.j);
                    }
                }
            });
        }
        if (this.j.t() != null) {
            hpzVar.c().setOnLongClickListener(new View.OnLongClickListener() { // from class: hov
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    how howVar = this.a;
                    hpa hpaVarT = howVar.j.t();
                    if (hpaVarT == null) {
                        return false;
                    }
                    ayo ayoVar2 = ayoVar;
                    hox hoxVar = howVar.i;
                    return hpaVarT.N(ayoVar2.t, ((ayo) hoxVar.b.l(ayoVar2.a)).u, hoxVar.j);
                }
            });
        }
    }

    @Override // defpackage.ayq
    protected final void q(ayo ayoVar) {
        ((hpz) ayoVar.t).e(false);
    }

    @Override // defpackage.ayq
    public final void r(ayo ayoVar) {
        if (this.i.s != null) {
            ((hpz) ayoVar.t).c().setOnClickListener(null);
        }
        if (this.j.t() != null) {
            ((hpz) ayoVar.t).c().setOnLongClickListener(null);
        }
    }
}
