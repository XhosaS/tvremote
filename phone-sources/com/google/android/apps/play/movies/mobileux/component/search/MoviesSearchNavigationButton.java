package com.google.android.apps.play.movies.mobileux.component.search;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import com.google.android.play.search.PlaySearchNavigationButton;
import com.google.android.videos.R;
import defpackage.tfw;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class MoviesSearchNavigationButton extends PlaySearchNavigationButton {
    public MoviesSearchNavigationButton(Context context) {
        super(context);
    }

    @Override // com.google.android.play.search.PlaySearchNavigationButton
    protected final void c(tfw tfwVar) {
        tfwVar.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.gray_300), PorterDuff.Mode.SRC_IN));
    }

    public MoviesSearchNavigationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MoviesSearchNavigationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
