package com.google.android.apps.play.movies.mobileux.component.playheaderlist;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.videos.R;
import defpackage.gls;
import defpackage.mvx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlayHeaderListTabStrip extends FrameLayout {
    public PlayHeaderListTabContainer a;
    public gls b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public PlayHeaderListTabStrip(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (PlayHeaderListTabContainer) findViewById(R.id.play_header_list_tab_container);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size > 0) {
            PlayHeaderListTabContainer playHeaderListTabContainer = this.a;
            if (playHeaderListTabContainer.d != size || !playHeaderListTabContainer.e) {
                playHeaderListTabContainer.d = size;
                playHeaderListTabContainer.a();
            }
        }
        super.onMeasure(i, i2);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayHeaderListTabStrip(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        new mvx(this);
        this.c = true;
        getResources().getColorStateList(R.color.play_header_list_tab_text_color);
    }
}
