package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ed implements PopupWindow.OnDismissListener {
    final /* synthetic */ ee a;

    public ed(ee eeVar) {
        this.a = eeVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
