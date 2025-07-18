package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class ewy implements ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ Runnable b;

    public ewy(ViewGroup viewGroup, Runnable runnable) {
        this.a = viewGroup;
        this.b = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        ((zdv) ((zdv) exa.a.b()).q("com/google/android/apps/tvsearch/app/hover/HoverActivityThread$3", "onWindowFocusChanged", 462, "HoverActivityThread.java")).x("#requestPauseThenRun hasFocus=`%s`", Boolean.valueOf(z));
        if (z) {
            return;
        }
        this.a.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        this.b.run();
    }
}
