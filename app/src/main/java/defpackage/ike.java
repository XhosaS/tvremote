package defpackage;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ike implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ScrollView a;
    final /* synthetic */ ikh b;

    public ike(ikh ikhVar, ScrollView scrollView) {
        this.a = scrollView;
        this.b = ikhVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ikh ikhVar = this.b;
        if (!ikhVar.bb()) {
            ikhVar.aV();
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
