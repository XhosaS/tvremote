package defpackage;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes.dex */
class ijv implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ScrollView a;
    final /* synthetic */ ijy b;

    public ijv(ijy ijyVar, ScrollView scrollView) {
        this.a = scrollView;
        this.b = ijyVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ijy ijyVar = this.b;
        if (!ijyVar.bb()) {
            ijyVar.aV();
        }
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
