package com.google.android.apps.play.movies.mobile.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScrollingAwareFabBehavior extends FloatingActionButton.Behavior {
    public ScrollingAwareFabBehavior(Context context, AttributeSet attributeSet) {
        context.getClass();
        attributeSet.getClass();
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
    /* renamed from: D */
    public final void k(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
        floatingActionButton.getClass();
        view.getClass();
        super.k(coordinatorLayout, floatingActionButton, view);
        if (coordinatorLayout.findViewById(R.id.appBar).getTop() >= 0) {
            floatingActionButton.h(null);
        } else {
            floatingActionButton.f(null);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, defpackage.cqv
    public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2) {
        k(coordinatorLayout, (FloatingActionButton) view, view2);
    }
}
