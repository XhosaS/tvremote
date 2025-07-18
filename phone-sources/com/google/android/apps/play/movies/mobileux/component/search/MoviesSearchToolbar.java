package com.google.android.apps.play.movies.mobileux.component.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.play.search.PlaySearchToolbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MoviesSearchToolbar extends PlaySearchToolbar {
    public boolean a;

    public MoviesSearchToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        setContentInsetStartWithNavigation(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Rect rect = new Rect();
        if (!this.a && getAlpha() != 0.0f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i).getHitRect(rect);
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.dispatchTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.play.search.PlaySearchToolbar, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(null);
    }
}
