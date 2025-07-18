package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class phh {
    public final View a;
    public final phg b;
    public final int c;
    public final int d;

    public phh(View view, View view2, int i, int i2) {
        view.getClass();
        view2.getClass();
        this.a = view2;
        this.c = i;
        this.d = i2;
        phg phgVar = new phg(view.getContext());
        this.b = phgVar;
        phgVar.e = view;
        phgVar.c = new PopupWindow(phgVar, 0, 0, !oyb.b(phgVar.getContext()) && xfi.a.get().a());
        phgVar.addView(view);
        if (xfi.b()) {
            int[] iArr = cww.a;
            phgVar.setImportantForAccessibility(4);
        }
    }

    public final void a() {
        PopupWindow popupWindow = this.b.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean b() {
        return this.b.isShown();
    }
}
