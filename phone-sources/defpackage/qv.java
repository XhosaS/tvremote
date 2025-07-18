package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qv extends qg {
    public qv(kw kwVar, rs rsVar, boolean z, boolean z2, String str, cez cezVar, yjk yjkVar) {
        super(kwVar, rsVar, z, z2, str, cezVar, yjkVar);
    }

    @Override // defpackage.qg
    protected final void A(KeyEvent keyEvent) {
        ((qg) this).b.a();
    }

    @Override // defpackage.qg
    public final Object b(bte bteVar, yih yihVar) {
        Object objA = wf.a(bteVar, new qx(this, (yih) null, 1), new kb(this, 10), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.qg
    protected final boolean r(KeyEvent keyEvent) {
        return false;
    }
}
