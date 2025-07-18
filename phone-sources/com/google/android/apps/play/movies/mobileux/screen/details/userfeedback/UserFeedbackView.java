package com.google.android.apps.play.movies.mobileux.screen.details.userfeedback;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.mvb;
import defpackage.nau;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UserFeedbackView extends LinearLayout implements nbo<nau> {
    public View a;
    public View b;
    public View c;
    public View d;
    public View e;
    public mvb f;
    public ImageView g;
    public TextView h;
    private View i;
    private View j;
    private View k;
    private ImageView l;
    private ImageView m;
    private ImageView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private int r;
    private int s;
    private int t;

    public UserFeedbackView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(nau nauVar) {
        boolean z = nauVar.h;
        int i = R.style.GtvDetailsUserFeedbackSectionItemClickedTextMedium;
        int i2 = R.style.GtvDetailsUserFeedbackSectionItemTextMedium;
        if (z) {
            this.a.setVisibility(0);
            this.l.setImageResource(R.drawable.ic_thumb_up_grey700_24dp);
            this.o.setVisibility(0);
            this.o.setTextAppearance(R.style.GtvDetailsUserFeedbackSectionItemTextMedium);
            this.o.setTextColor(getResources().getColor(R.color.gray_700, null));
            this.i.setVisibility(0);
        } else {
            this.a.setVisibility(0);
            this.o.setVisibility(true != nauVar.f ? 8 : 0);
            View view = this.i;
            boolean z2 = nauVar.g;
            view.setVisibility(true != z2 ? 8 : 0);
            this.o.setSelected(false);
            this.o.setText(getResources().getString(R.string.like));
            this.o.setTextAppearance(true != z2 ? R.style.DetailsUserFeedbackSectionItemTextMedium : R.style.GtvDetailsUserFeedbackSectionItemTextMedium);
            this.r = true != z2 ? R.drawable.ic_thumb_up_unselected_24dp : R.drawable.ic_thumb_up_grey600_24dp;
            String string = getContext().getString(R.string.content_description_button_thumb_up_unselected);
            if (nauVar.d.a) {
                this.a.setAlpha(0.16f);
            } else if (nauVar.b.d == 1) {
                this.r = true != z2 ? 2131232554 : R.drawable.ic_thumb_up_selected_blue;
                this.o.setSelected(true);
                this.o.setText(getResources().getString(R.string.liked));
                this.o.setTextAppearance(true != z2 ? R.style.DetailsUserFeedbackSectionItemTextMedium : R.style.GtvDetailsUserFeedbackSectionItemClickedTextMedium);
                string = getContext().getString(R.string.content_description_button_thumb_up_selected);
            }
            this.l.setImageResource(this.r);
            this.a.setContentDescription(string);
        }
        if (z) {
            this.b.setVisibility(0);
            this.m.setImageResource(R.drawable.ic_thumb_down_grey700_24dp);
            this.p.setVisibility(0);
            this.p.setTextAppearance(R.style.GtvDetailsUserFeedbackSectionItemTextMedium);
            this.p.setTextColor(getResources().getColor(R.color.gray_700, null));
            this.j.setVisibility(0);
        } else {
            this.b.setVisibility(0);
            this.p.setVisibility(true != nauVar.f ? 8 : 0);
            View view2 = this.j;
            boolean z3 = nauVar.g;
            view2.setVisibility(true != z3 ? 8 : 0);
            this.p.setSelected(false);
            this.p.setTextAppearance(true != z3 ? R.style.DetailsUserFeedbackSectionItemTextMedium : R.style.GtvDetailsUserFeedbackSectionItemTextMedium);
            this.p.setText(getResources().getString(R.string.dislike));
            this.s = true != z3 ? R.drawable.ic_thumb_down_unselected_24dp : R.drawable.ic_thumb_down_grey600_24dp;
            String string2 = getContext().getString(R.string.content_description_button_thumb_down_unselected);
            if (nauVar.d.b) {
                this.b.setAlpha(0.16f);
            } else if (nauVar.b.d == 2) {
                this.s = true != z3 ? 2131232551 : R.drawable.ic_thumb_down_selected_blue;
                this.p.setSelected(true);
                this.p.setText(getResources().getString(R.string.disliked));
                this.p.setTextAppearance(true != z3 ? R.style.DetailsUserFeedbackSectionItemTextMedium : R.style.GtvDetailsUserFeedbackSectionItemClickedTextMedium);
                string2 = getContext().getString(R.string.content_description_button_thumb_down_selected);
            }
            this.m.setImageResource(this.s);
            this.b.setContentDescription(string2);
        }
        if (z) {
            this.c.setVisibility(0);
            this.n.setImageResource(R.drawable.ic_bookmark_border_grey700_24dp);
            this.q.setVisibility(0);
            this.q.setTextAppearance(R.style.GtvDetailsUserFeedbackSectionItemTextMedium);
            this.q.setTextColor(getResources().getColor(R.color.gray_700, null));
            this.k.setVisibility(0);
            return;
        }
        this.c.setVisibility(0);
        this.q.setVisibility(true != nauVar.f ? 8 : 0);
        View view3 = this.k;
        boolean z4 = nauVar.g;
        view3.setVisibility(true == z4 ? 0 : 8);
        this.q.setSelected(false);
        TextView textView = this.q;
        if (true != z4) {
            i2 = R.style.DetailsUserFeedbackSectionItemTextMedium;
        }
        textView.setTextAppearance(i2);
        this.q.setText(getResources().getString(R.string.button_add_to_wishlist));
        this.t = true != z4 ? R.drawable.ic_watchlist_add_24px : R.drawable.ic_bookmark_border_grey600_24dp;
        String string3 = getContext().getString(R.string.content_description_button_add_to_wishlist);
        if (nauVar.d.c) {
            this.c.setAlpha(0.16f);
        } else if (nauVar.c) {
            this.t = true != z4 ? R.drawable.ic_watchlist_added_check_24px_white : R.drawable.ic_watchlisted;
            this.q.setSelected(true);
            this.q.setText(getResources().getString(true != z4 ? R.string.added : R.string.button_added_to_wishlist));
            TextView textView2 = this.q;
            if (true != z4) {
                i = R.style.DetailsUserFeedbackSectionItemTextMedium;
            }
            textView2.setTextAppearance(i);
            string3 = getContext().getString(R.string.content_description_button_remove_from_wishlist);
        }
        this.n.setImageResource(this.t);
        this.c.setContentDescription(string3);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = findViewById(R.id.thumb_up_button);
        this.i = findViewById(R.id.gtv_thumb_up_button_image_margin);
        this.b = findViewById(R.id.thumb_down_button);
        this.j = findViewById(R.id.gtv_thumb_down_button_image_margin);
        this.c = findViewById(R.id.watchlist_button);
        this.k = findViewById(R.id.gtv_watchlist_button_image_margin);
        this.d = findViewById(R.id.download_button);
        this.e = findViewById(R.id.gtv_download_button_image_margin);
        this.l = (ImageView) findViewById(R.id.thumb_up_button_image);
        this.o = (TextView) findViewById(R.id.thumb_up_button_text);
        this.m = (ImageView) findViewById(R.id.thumb_down_button_image);
        this.p = (TextView) findViewById(R.id.thumb_down_button_text);
        this.n = (ImageView) findViewById(R.id.watchlist_button_image);
        this.q = (TextView) findViewById(R.id.watchlist_button_text);
        this.f = (mvb) findViewById(R.id.feedback_section_download);
        this.h = (TextView) findViewById(R.id.download_button_text);
        this.g = (ImageView) findViewById(R.id.download_button_image);
    }

    public UserFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserFeedbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
