package defpackage;

import android.app.Dialog;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class pnp implements duv {
    final /* synthetic */ pnq a;
    final /* synthetic */ Dialog b;
    final /* synthetic */ bl c;
    final /* synthetic */ pnr d;
    private boolean e = false;

    public pnp(pnr pnrVar, pnq pnqVar, Dialog dialog, bl blVar) {
        this.a = pnqVar;
        this.b = dialog;
        this.c = blVar;
        this.d = pnrVar;
    }

    @Override // defpackage.duv
    public final void k() {
        if (this.e) {
            return;
        }
        pnq pnqVar = this.a;
        Dialog dialog = this.b;
        bl blVar = this.c;
        pnqVar.a(dialog, qtl.ad(blVar));
        try {
            pnqVar.b(blVar);
            this.e = true;
        } catch (RuntimeException e) {
            this.d.b.a(e);
        }
    }

    @Override // defpackage.duv
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void l() {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void e(dvk dvkVar) {
    }

    @Override // defpackage.duv
    public final /* synthetic */ void f(dvk dvkVar) {
    }
}
