package com.google.android.libraries.material.opensearchbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.ImageButton;
import com.google.android.videos.R;
import defpackage.csq;
import defpackage.sip;
import defpackage.sys;
import defpackage.tde;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class OpenSearchView extends sys {
    public OpenSearchView(Context context) {
        this(context, null);
    }

    @Override // defpackage.sys
    protected final int b() {
        return R.drawable.quantum_gm_ic_arrow_back_vd_theme_24;
    }

    public OpenSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.openSearchViewStyle);
    }

    public OpenSearchView(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(tde.a(context, attributeSet, i, R.style.Widget_GoogleMaterial_OpenSearchView), R.style.ThemeOverlay_GoogleMaterial_OpenSearchView_AttributeMigration), attributeSet, i);
        ((ImageButton) findViewById(R.id.open_search_view_clear_button)).setImageResource(R.drawable.quantum_gm_ic_clear_vd_theme_24);
        findViewById(R.id.open_search_view_divider).setBackgroundColor(csq.g(sip.c(this, R.attr.colorOnSurface), Math.round(30.599998f)));
    }
}
