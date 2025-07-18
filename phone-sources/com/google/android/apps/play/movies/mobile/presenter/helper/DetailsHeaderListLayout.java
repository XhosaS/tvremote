package com.google.android.apps.play.movies.mobile.presenter.helper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.util.AttributeSet;
import com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout;
import com.google.android.apps.play.movies.mobileux.component.search.MoviesSearchToolbar;
import com.google.android.videos.R;
import defpackage.mwm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DetailsHeaderListLayout extends PlayHeaderListLayout {
    private String g;

    public DetailsHeaderListLayout(Context context) {
        super(context);
        this.g = "";
    }

    private final boolean z() {
        AppCompatActivity appCompatActivity = (AppCompatActivity) getContext();
        return (appCompatActivity == null || appCompatActivity.getSupportFragmentManager().f("TRAILER_PLAYER_FRAGMENT_TAG") == null) ? false : true;
    }

    @Override // com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout
    public final void b(Toolbar toolbar, float f) {
        if (!z()) {
            super.b(toolbar, f);
        }
        ((MoviesSearchToolbar) toolbar).a = false;
        if (f == 0.0f && !z()) {
            toolbar.setTitle("");
            return;
        }
        SpannableString spannableString = new SpannableString(this.g);
        spannableString.setSpan(new mwm(getContext(), R.style.Theme_GoogleTv_Dark), 0, this.g.length(), 33);
        toolbar.setTitle(spannableString);
    }

    @Override // com.google.android.apps.play.movies.mobileux.component.playheaderlist.PlayHeaderListLayout
    protected final void c(float f, float f2) {
        if (z()) {
            return;
        }
        super.c(f, f2);
    }

    public final void d(CharSequence charSequence) {
        this.g = charSequence.toString();
        MoviesSearchToolbar moviesSearchToolbar = (MoviesSearchToolbar) this.b;
        moviesSearchToolbar.setTitle("");
        moviesSearchToolbar.a = true;
    }

    public DetailsHeaderListLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = "";
    }

    public DetailsHeaderListLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = "";
    }
}
