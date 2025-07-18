package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import com.google.android.videos.R;
import defpackage.sym;
import defpackage.tde;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class OpenSearchBar extends sym {

    /* compiled from: PG */
    @Deprecated
    public class ScrollingViewBehavior extends SearchBar$ScrollingViewBehavior {
        @Override // com.google.android.material.search.SearchBar$ScrollingViewBehavior, com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.sol, defpackage.cqv
        public final /* bridge */ /* synthetic */ boolean f(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.f(coordinatorLayout, view, i);
            return true;
        }
    }

    public OpenSearchBar(Context context) {
        this(context, null);
    }

    @Override // defpackage.sym
    protected final int a() {
        return R.dimen.google_opensearchbar_margin_vertical;
    }

    @Override // defpackage.sym
    protected final int b() {
        return R.drawable.quantum_gm_ic_search_vd_theme_24;
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchBarStyle);
    }

    public OpenSearchBar(Context context, AttributeSet attributeSet, int i) {
        super(tde.a(context, attributeSet, i, R.style.Widget_GoogleMaterial_OpenSearchBar), attributeSet, i);
    }
}
