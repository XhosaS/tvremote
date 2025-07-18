package com.google.android.apps.play.movies.mobileux.screen.player.infocards.actors.filmography;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.hjr;
import defpackage.htc;
import defpackage.jys;
import defpackage.nay;
import defpackage.nba;
import defpackage.nbo;
import defpackage.rzy;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActorFilmographyView extends RelativeLayout implements nbo<nba> {
    public ImageView a;
    public rzy b;
    public rzy c;
    public jys d;
    private TextView e;
    private TextView f;
    private ImageButton g;

    public ActorFilmographyView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(nba nbaVar) {
        TextView textView = this.e;
        String str = nbaVar.a;
        textView.setText(str);
        tst tstVar = nbaVar.c;
        if (tstVar.g()) {
            this.f.setVisibility(0);
            this.f.setText((CharSequence) tstVar.c());
        } else {
            this.f.setVisibility(4);
        }
        tst tstVar2 = nbaVar.d;
        if (!tstVar2.g() || this.d == null) {
            this.a.setVisibility(4);
        } else {
            this.a.setVisibility(0);
            int i = nbaVar.b.a;
            Resources resources = getResources();
            if (i == 6) {
                this.a.setLayoutParams(new LinearLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.film_poster_image_width), resources.getDimensionPixelSize(R.dimen.movie_poster_image_height)));
            } else if (i == 18) {
                this.a.setLayoutParams(new LinearLayout.LayoutParams(resources.getDimensionPixelSize(R.dimen.film_poster_image_width), resources.getDimensionPixelSize(R.dimen.show_poster_image_height)));
            }
            hjr.c(getContext()).g((String) tstVar2.c()).g(htc.b()).k(this.a);
        }
        setOnClickListener(new nay(this, nbaVar, 1));
        if (nbaVar.e) {
            this.g.setImageResource(R.drawable.ic_watchlist_added_check_24px_white);
            this.g.setContentDescription(getContext().getString(R.string.content_description_button_remove_from_wishlist_disambiguate, str));
        } else {
            this.g.setImageResource(R.drawable.ic_watchlist_add_24px);
            this.g.setContentDescription(getContext().getString(R.string.content_description_button_add_to_wishlist_disambiguate, str));
        }
        this.g.setOnClickListener(new nay(this, nbaVar, 0));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.filmography_item_poster);
        this.e = (TextView) findViewById(R.id.filmography_item_title);
        this.f = (TextView) findViewById(R.id.filmography_years_and_duration);
        this.g = (ImageButton) findViewById(R.id.filmography_item_watchlisted);
    }

    public ActorFilmographyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ActorFilmographyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
