package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phz implements pfr {
    public final oxp a;
    public final uhs b;
    public final tfc c;
    public final pkg d;
    private final uhs e;

    public phz(tfc tfcVar, uhs uhsVar, pkg pkgVar, oxp oxpVar, uhs uhsVar2) {
        this.c = tfcVar;
        this.e = uhsVar;
        this.d = pkgVar;
        this.a = oxpVar;
        this.b = uhsVar2;
    }

    @Override // defpackage.pfr
    public final View a(by byVar, uyr uyrVar) {
        return null;
    }

    @Override // defpackage.pfr
    public final void b(by byVar, View view, oyd oydVar, uyv uyvVar) {
        Object objQ;
        tfg tfgVar = this.c.a;
        if (tfgVar.a == null) {
            tfg.c.am("Play Store app is either not installed or not the official version", new Object[0]);
            objQ = osk.q(new tez());
        } else {
            kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
            tfgVar.a.e(new tfe(tfgVar, kwyVar, kwyVar), kwyVar);
            objQ = kwyVar.a;
        }
        onz onzVar = (onz) objQ;
        onzVar.l(this.e, new nva(this, oydVar, byVar, 2));
    }

    @Override // defpackage.pfr
    public final boolean c(uyq uyqVar) {
        return uyqVar == uyq.UITYPE_RATING_NATIVE_STORE_REVIEW_DIALOG;
    }
}
