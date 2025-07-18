package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.bhc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    private boolean e;

    public SearchBar$ScrollingViewBehavior() {
        this.e = false;
    }

    @Override // defpackage.bhf
    public final boolean aa() {
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, defpackage.bhh, defpackage.mo
    public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.f(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, defpackage.mo
    public final void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.i(coordinatorLayout, view, view2);
        if (this.e || !(view2 instanceof bhc)) {
            return;
        }
        this.e = true;
        ((bhc) view2).setBackgroundColor(0);
        throw null;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }
}
