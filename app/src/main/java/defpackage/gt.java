package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
class gt extends ahy {
    final /* synthetic */ gu a;

    public gt(gu guVar) {
        this.a = guVar;
    }

    @Override // defpackage.ahy, defpackage.ahx
    public final void a() {
        hf hfVar = this.a.a;
        hfVar.r.setVisibility(8);
        PopupWindow popupWindow = hfVar.s;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (hfVar.r.getParent() instanceof View) {
            View view = (View) hfVar.r.getParent();
            int[] iArr = ahj.a;
            aha.c(view);
        }
        hfVar.r.i();
        hfVar.u.d(null);
        hfVar.u = null;
        ViewGroup viewGroup = hfVar.x;
        int[] iArr2 = ahj.a;
        aha.c(viewGroup);
    }
}
