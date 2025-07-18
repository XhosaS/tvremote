package com.google.android.apps.play.movies.mobileux.screen.details.title;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.hjr;
import defpackage.hke;
import defpackage.htc;
import defpackage.hvc;
import defpackage.ieg;
import defpackage.lcu;
import defpackage.mnu;
import defpackage.naf;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TitleSectionView extends RelativeLayout implements nbo<naf> {
    private ImageView a;
    private TextView b;
    private TextView c;
    private ImageView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private ImageView j;

    public TitleSectionView(Context context) {
        super(context);
    }

    private static final CharSequence c(Drawable drawable, String str, boolean z) {
        int i;
        String strConcat;
        ImageSpan imageSpan = new ImageSpan(drawable);
        int length = str.length();
        if (z) {
            strConcat = "  ".concat(String.valueOf(str));
            i = 0;
        } else {
            String strConcat2 = String.valueOf(str).concat("  ");
            i = length;
            strConcat = strConcat2;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strConcat);
        spannableStringBuilder.setSpan(imageSpan, i, i + 1, 33);
        return spannableStringBuilder;
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(naf nafVar) {
        boolean z = nafVar.q;
        this.a.setVisibility(true != z ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = (int) (layoutParams.width / nafVar.j);
        this.a.setLayoutParams(layoutParams);
        ((hke) hjr.c(getContext()).e(nafVar.i).g(htc.b()).h(hvc.d(R.color.play_movies_thumbnail_placeholder)).m()).k(this.a);
        this.b.setVisibility(0);
        this.b.setText(nafVar.a);
        this.c.setVisibility(8);
        this.d.setVisibility(8);
        ieg iegVar = nafVar.d;
        if (iegVar.m()) {
            String str = (String) nafVar.e.g();
            String str2 = (String) iegVar.g();
            ieg iegVarM = mnu.m(str);
            ieg iegVarO = mnu.o(str);
            if (nafVar.m && iegVarM.m()) {
                this.d.setVisibility(0);
                this.d.setImageResource(((Integer) iegVarM.g()).intValue());
                this.d.setContentDescription(getResources().getString(R.string.accessibility_movie_rating, str2));
            } else if (nafVar.n && iegVarO.m()) {
                this.d.setVisibility(0);
                this.d.setImageResource(((Integer) iegVarO.g()).intValue());
                this.d.setContentDescription(getResources().getString(R.string.accessibility_movie_rating, str2));
            } else {
                this.c.setVisibility(0);
                this.c.setText(str2);
                this.c.setContentDescription(getResources().getString(R.string.accessibility_movie_rating, str2));
            }
        }
        ieg iegVar2 = nafVar.b;
        if (iegVar2.m()) {
            this.e.setVisibility(0);
            this.e.setText((CharSequence) iegVar2.g());
            this.e.setContentDescription((CharSequence) nafVar.c.c);
        } else {
            this.e.setVisibility(8);
        }
        this.f.setVisibility(true != nafVar.o ? 8 : 0);
        if (z) {
            this.g.setVisibility(8);
        } else {
            ieg iegVar3 = nafVar.h;
            if (iegVar3.m()) {
                String str3 = String.format("%.1f", iegVar3.g());
                this.g.setVisibility(0);
                TextView textView = this.g;
                Drawable drawable = AppCompatResources.getDrawable(getContext(), R.drawable.ic_star_rate_18dp);
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                textView.setText(c(drawable, str3, false));
                this.g.setContentDescription(getResources().getString(R.string.accessibility_star_rating_description, str3));
            } else {
                this.g.setVisibility(8);
            }
        }
        ieg iegVar4 = nafVar.f;
        if (iegVar4.m()) {
            this.h.setVisibility(0);
            float fFloatValue = ((Float) iegVar4.g()).floatValue();
            Resources resources = getResources();
            Integer numValueOf = Integer.valueOf((int) fFloatValue);
            String string = resources.getString(R.string.review_percent, numValueOf);
            ieg iegVar5 = nafVar.g;
            if (iegVar5.m()) {
                int iOrdinal = ((lcu) iegVar5.g()).ordinal();
                Drawable drawable2 = AppCompatResources.getDrawable(getContext(), iOrdinal != 2 ? iOrdinal != 3 ? R.drawable.ic_rotten : R.drawable.ic_certified_fresh : R.drawable.ic_fresh);
                int lineHeight = this.h.getLineHeight();
                drawable2.setBounds(0, 0, lineHeight, lineHeight);
                this.h.setText(c(drawable2, string, true));
                TextView textView2 = this.h;
                Resources resources2 = getResources();
                Resources resources3 = getResources();
                int iOrdinal2 = ((lcu) iegVar5.g()).ordinal();
                textView2.setContentDescription(resources2.getString(R.string.accessibility_rotten_tomatoes_rating_status, numValueOf, resources3.getString(iOrdinal2 != 2 ? iOrdinal2 != 3 ? R.string.accessibility_rotten_tomatoes_rotten : R.string.accessibility_rotten_tomatoes_certified_fresh : R.string.accessibility_rotten_tomatoes_fresh)));
            } else {
                this.h.setText(string);
                this.h.setContentDescription(getResources().getString(R.string.accessibility_rotten_tomatoes_rating, numValueOf));
            }
        } else {
            this.h.setVisibility(8);
        }
        if (nafVar.k) {
            this.i.setVisibility(0);
            String string2 = getResources().getString(R.string.details_bundle);
            Drawable drawable3 = AppCompatResources.getDrawable(getContext(), R.drawable.ic_bundles);
            int lineHeight2 = this.i.getLineHeight();
            drawable3.setBounds(0, 0, lineHeight2, lineHeight2);
            this.i.setText(c(drawable3, string2, true));
            this.i.setContentDescription(string2);
        } else {
            this.i.setVisibility(8);
        }
        this.j.setVisibility(true == nafVar.l ? 0 : 8);
        if (nafVar.p) {
            this.b.setOnLongClickListener(new View.OnLongClickListener() { // from class: nad
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return kff.s(view, new nac());
                }
            });
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.thumbnail_frame);
        this.b = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.content_rating);
        this.d = (ImageView) findViewById(R.id.content_rating_image);
        this.e = (TextView) findViewById(R.id.subtitle);
        this.f = (TextView) findViewById(R.id.audio_description);
        this.g = (TextView) findViewById(R.id.star_rating);
        this.h = (TextView) findViewById(R.id.tomato_rating);
        this.i = (TextView) findViewById(R.id.bundle);
        this.j = (ImageView) findViewById(R.id.badge_4k);
    }

    public TitleSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TitleSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TitleSectionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
