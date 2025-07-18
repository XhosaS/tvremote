package com.google.android.apps.play.movies.mobileux.component.assetcollectionheader;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.libraries.play.widget.clusterheader.ClusterHeaderView;
import com.google.android.videos.R;
import defpackage.sdk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AssetCollectionHeaderView extends ClusterHeaderView {
    public sdk a;

    public AssetCollectionHeaderView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(this.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(null);
    }

    public AssetCollectionHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AssetCollectionHeaderView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.a = null;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.movies_general_side_padding);
        setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
    }
}
