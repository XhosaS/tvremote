package com.google.android.apps.play.movies.mobileux.component.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.search.PlaySearchOneSuggestion;
import com.google.android.videos.R;
import defpackage.tha;
import defpackage.ulp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MoviesSearchSuggestionItemView extends PlaySearchOneSuggestion {
    private FifeImageView a;
    private TextView b;
    private TextView c;
    private Drawable d;
    private ulp e;

    public MoviesSearchSuggestionItemView(Context context) {
        super(context);
    }

    @Override // com.google.android.play.search.PlaySearchOneSuggestion
    public final void a(tha thaVar, String str) {
        this.b.setText(this.e.aB(str, (String) thaVar.c, R.style.MovieSuggestionItem_Query, R.style.MovieSuggestionItem_Suggested));
        Object obj = thaVar.d;
        if (TextUtils.isEmpty(null)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText((CharSequence) null);
        }
        b(thaVar, this.a, this.d);
        if (thaVar.e == null) {
            this.d.setTint(getResources().getColor(R.color.gray_300, null));
            invalidate();
        }
    }

    @Override // com.google.android.play.search.PlaySearchOneSuggestion, android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (FifeImageView) findViewById(R.id.icon);
        this.b = (TextView) findViewById(R.id.suggest_text);
        this.c = (TextView) findViewById(R.id.suggest_subtext);
        this.d = getContext().getResources().getDrawable(2131231878);
        this.e = new ulp((Object) getContext(), (byte[]) null);
    }

    public MoviesSearchSuggestionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MoviesSearchSuggestionItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
