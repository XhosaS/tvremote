package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
class jt implements PopupWindow.OnDismissListener {
    final /* synthetic */ ju a;

    public jt(ju juVar) {
        this.a = juVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
