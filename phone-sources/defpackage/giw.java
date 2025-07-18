package defpackage;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class giw extends Animation {
    final /* synthetic */ SwipeRefreshLayout a;

    public giw(SwipeRefreshLayout swipeRefreshLayout) {
        this.a = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        SwipeRefreshLayout swipeRefreshLayout = this.a;
        boolean z = swipeRefreshLayout.j;
        int iAbs = swipeRefreshLayout.g - Math.abs(swipeRefreshLayout.f);
        swipeRefreshLayout.e((swipeRefreshLayout.e + ((int) ((iAbs - r1) * f))) - swipeRefreshLayout.d.getTop());
        swipeRefreshLayout.h.c(1.0f - f);
    }
}
