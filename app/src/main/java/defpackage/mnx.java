package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mnx implements ViewTreeObserver.OnWindowFocusChangeListener {
    public View a;

    public final void a() {
        View view = this.a;
        if (view != null) {
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.a = null;
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        View view;
        if (z && (view = this.a) != null) {
            mny.a(view);
        }
        a();
    }
}
