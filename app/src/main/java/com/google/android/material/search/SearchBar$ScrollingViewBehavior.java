package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.uxz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout$ScrollingViewBehavior {
    private boolean e;

    public SearchBar$ScrollingViewBehavior() {
        this.e = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, defpackage.uye, defpackage.aam
    public final /* bridge */ /* synthetic */ boolean d(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.d(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior, defpackage.aam
    public final void g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.g(coordinatorLayout, view, view2);
        if (this.e || !(view2 instanceof uxz)) {
            return;
        }
        this.e = true;
        uxz uxzVar = (uxz) view2;
        uxzVar.setBackgroundColor(0);
        uxzVar.setTargetElevation(0.0f);
    }

    @Override // defpackage.uyc
    public final boolean y() {
        return true;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
    }
}
