package defpackage;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
class iiw implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ScrollView a;
    final /* synthetic */ iiz b;

    public iiw(iiz iizVar, ScrollView scrollView) {
        this.a = scrollView;
        this.b = iizVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        iiz iizVar = this.b;
        if (!iizVar.bb()) {
            iizVar.aS();
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
