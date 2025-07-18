package com.google.android.apps.play.movies.mobileux.screen.details.seasonpicker;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.mqw;
import defpackage.mzl;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SeasonPickerView extends FrameLayout implements nbo<mzl> {
    private TextView a;

    public SeasonPickerView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    public final /* synthetic */ void a(Object obj) {
        mzl mzlVar = (mzl) obj;
        this.a.setText(mzlVar.c.a.e);
        setOnClickListener(new mqw(mzlVar, 16));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.details_seasonpicker_current_season);
    }

    public SeasonPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeasonPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
