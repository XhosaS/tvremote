package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccj extends bko implements cef {
    public ViewGroup a;

    public ccj(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // defpackage.cef
    public final Object e(bvc bvcVar, yjk yjkVar, yih yihVar) {
        long jQ = bty.q(bvcVar);
        Object objA = yjkVar.a();
        bmy bmyVarI = objA != null ? ((bmy) objA).i(jQ) : null;
        if (bmyVarI != null) {
            this.a.requestRectangleOnScreen(bnj.m(bmyVarI), false);
        }
        return ygi.a;
    }
}
