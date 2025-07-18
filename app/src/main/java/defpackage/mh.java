package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class mh implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ mj a;

    public mh(mj mjVar) {
        this.a = mjVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        mj mjVar = this.a;
        mm mmVar = mjVar.d;
        if (!mmVar.isAttachedToWindow() || !mmVar.getGlobalVisibleRect(mjVar.c)) {
            mjVar.f();
        } else {
            mjVar.n();
            super/*oz*/.s();
        }
    }
}
