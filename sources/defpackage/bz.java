package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bz extends re {
    final /* synthetic */ ca a;

    public bz(ca caVar) {
        this.a = caVar;
    }

    @Override // defpackage.re, defpackage.rd
    public final void a() {
        cj cjVar = this.a.a;
        cjVar.q.setVisibility(8);
        PopupWindow popupWindow = cjVar.r;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (cjVar.q.getParent() instanceof View) {
            View view = (View) cjVar.q.getParent();
            int[] iArr = qv.a;
            qk.j(view);
        }
        cjVar.q.i();
        cjVar.K.R(null);
        cjVar.K = null;
        ViewGroup viewGroup = cjVar.v;
        int[] iArr2 = qv.a;
        qk.j(viewGroup);
    }
}
