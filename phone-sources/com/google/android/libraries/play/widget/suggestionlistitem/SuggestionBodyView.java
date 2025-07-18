package com.google.android.libraries.play.widget.suggestionlistitem;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.sfc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SuggestionBodyView extends LinearLayout implements sfc {
    private TextView a;

    public SuggestionBodyView(Context context) {
        super(context);
    }

    @Override // defpackage.sfc
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.sfc
    public final int b() {
        return this.a.getVisibility() == 8 ? 16 : 48;
    }

    @Override // defpackage.sfc
    public final /* synthetic */ int c() {
        return 0;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.subtitle);
    }

    public SuggestionBodyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
