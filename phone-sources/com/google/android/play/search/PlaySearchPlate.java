package com.google.android.play.search;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchPlate extends FrameLayout {
    public PlaySearchNavigationButton a;
    public PlaySearchPlateTextContainer b;
    public PlaySearchActionButtonsContainer c;

    public PlaySearchPlate(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (PlaySearchNavigationButton) findViewById(R.id.navigation_button);
        this.b = (PlaySearchPlateTextContainer) findViewById(R.id.text_container);
        this.c = (PlaySearchActionButtonsContainer) findViewById(R.id.search_plate_actions_container);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchPlate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
