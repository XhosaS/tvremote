package com.google.android.apps.play.movies.mobileux.screen.details.header;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.myr;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HeaderView extends LinearLayout implements nbo<myr> {
    public AppCompatButton a;

    public HeaderView(Context context) {
        this(context, null);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(myr myrVar) {
        boolean zG = myrVar.b.g();
        int dimensionPixelSize = myrVar.a;
        if (zG) {
            this.a.setVisibility(true != myrVar.d.a() ? 0 : 8);
            this.a.setContentDescription(getContext().getString(R.string.content_description_play_trailer, myrVar.c));
            dimensionPixelSize += getResources().getDimensionPixelSize(R.dimen.details_header_section_additional_height);
        } else {
            this.a.setVisibility(8);
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, dimensionPixelSize));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (AppCompatButton) findViewById(R.id.trailer_button);
    }

    public HeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
