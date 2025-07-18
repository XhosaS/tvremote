package com.google.android.apps.play.movies.mobileux.component.assetcollectionheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AssetEmbeddedCollectionHeaderView extends LinearLayout {
    public AssetEmbeddedCollectionHeaderView(Context context) {
        this(context, null);
    }

    public AssetEmbeddedCollectionHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AssetEmbeddedCollectionHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AssetEmbeddedCollectionHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.asset_embedded_collection_header, (ViewGroup) this, true);
    }
}
