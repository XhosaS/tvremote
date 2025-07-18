package com.google.android.apps.play.movies.mobileux.screen.details.trailers;

import android.content.Context;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.hjr;
import defpackage.hke;
import defpackage.htc;
import defpackage.hvc;
import defpackage.jyr;
import defpackage.nah;
import defpackage.nai;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrailerItemView extends LinearLayout implements nbo<nah> {
    private ImageView a;
    private ImageButton b;
    private TextView c;

    public TrailerItemView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(nah nahVar) {
        int dimension = (((int) getResources().getDimension(R.dimen.details_trailers_item_height)) - this.a.getPaddingTop()) - this.a.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.height = dimension;
        layoutParams.width = (int) ((dimension * getResources().getDimension(R.dimen.details_trailer_width)) / getResources().getDimension(R.dimen.details_trailer_height));
        this.a.setLayoutParams(layoutParams);
        ((hke) hjr.c(getContext()).e(nahVar.a).g(htc.b()).h(hvc.d(R.color.play_movies_thumbnail_placeholder)).m()).k(this.a);
        this.c.setText(nahVar.b);
        this.b.setImageDrawable(AppCompatResources.getDrawable(getContext(), R.drawable.ic_play_btn_continuewatching));
        jyr jyrVar = new jyr(new nai(nahVar.c, nahVar.d), 20);
        this.b.setOnClickListener(jyrVar);
        this.a.setOnClickListener(jyrVar);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageView) findViewById(R.id.details_trailers_item_thumbnail);
        this.c = (TextView) findViewById(R.id.details_trailers_item_title);
        this.b = (ImageButton) findViewById(R.id.details_trailers_item_play_button);
    }

    public TrailerItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TrailerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TrailerItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
