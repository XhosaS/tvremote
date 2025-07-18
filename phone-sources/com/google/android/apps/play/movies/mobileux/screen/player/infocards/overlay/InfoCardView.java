package com.google.android.apps.play.movies.mobileux.screen.player.infocards.overlay;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.mqw;
import defpackage.nbk;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InfoCardView extends LinearLayout implements nbo<nbk> {
    private TextView a;
    private TextView b;
    private TextView c;
    private ImageView d;

    public InfoCardView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        nbk nbkVar = (nbk) obj;
        this.a.setText(nbkVar.b());
        this.b.setText(nbkVar.a());
        if (nbkVar.e().g()) {
            this.d.setVisibility(0);
            nbkVar.d().a(getContext(), this.d, (String) nbkVar.e().c());
        } else {
            this.d.setVisibility(4);
        }
        this.c.setVisibility(true != nbkVar.f() ? 4 : 0);
        setOnClickListener(new mqw(nbkVar, 18));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.info_card_title);
        this.b = (TextView) findViewById(R.id.info_card_subtitle);
        this.c = (TextView) findViewById(R.id.info_card_just_missed);
        this.d = (ImageView) findViewById(R.id.info_card_image);
    }

    public InfoCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InfoCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
