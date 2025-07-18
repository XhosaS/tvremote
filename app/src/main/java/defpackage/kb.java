package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class kb implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ kd a;

    public kb(kd kdVar) {
        this.a = kdVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        kd kdVar = this.a;
        if (kdVar.u()) {
            pc pcVar = kdVar.a;
            if (pcVar.p) {
                return;
            }
            View view = kdVar.c;
            if (view == null || !view.isShown()) {
                kdVar.f();
            } else {
                pcVar.s();
            }
        }
    }
}
