package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class md implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ mm a;

    public md(mm mmVar) {
        this.a = mmVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        mm mmVar = this.a;
        if (!mmVar.a.u()) {
            mmVar.b();
        }
        ViewTreeObserver viewTreeObserver = mmVar.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
