package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.apps.tvsearch.results.activity.PaddingAnimationDelegate;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hey implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ hfg a;

    public hey(hfg hfgVar) {
        this.a = hfgVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View viewA;
        hfg hfgVar = this.a;
        FrameLayout frameLayout = hfgVar.c;
        if (frameLayout.getHeight() <= 0) {
            return true;
        }
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        hfgVar.a.start();
        int i = hfgVar.d;
        if (i == -1 || (viewA = hfg.a(frameLayout)) == null || viewA.getPaddingTop() == i) {
            return false;
        }
        new PaddingAnimationDelegate(frameLayout, viewA, i).a.start();
        return false;
    }
}
