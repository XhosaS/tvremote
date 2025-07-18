package com.google.android.material.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.son;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    private boolean e;

    public SearchBar$ScrollingViewBehavior() {
        this.e = false;
    }

    @Override // defpackage.soj
    public final boolean J() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.sol, defpackage.cqv
    public /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.f(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.cqv
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
        super.k(coordinatorLayout, view, view2);
        if (this.e || !(view2 instanceof AppBarLayout)) {
            return;
        }
        this.e = true;
        AppBarLayout appBarLayout = (AppBarLayout) view2;
        appBarLayout.setBackgroundColor(0);
        son.a(appBarLayout, 0.0f);
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }
}
