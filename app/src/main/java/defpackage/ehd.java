package defpackage;

import android.view.ViewTreeObserver;
import com.facebook.litho.widget.LithoScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ehd implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ int a;
    final /* synthetic */ LithoScrollView b;

    public ehd(LithoScrollView lithoScrollView, int i) {
        this.a = i;
        this.b = lithoScrollView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        LithoScrollView lithoScrollView = this.b;
        lithoScrollView.setScrollY(this.a);
        ViewTreeObserver viewTreeObserver = lithoScrollView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
