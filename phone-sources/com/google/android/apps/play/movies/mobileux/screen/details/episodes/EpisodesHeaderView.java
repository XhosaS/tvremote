package com.google.android.apps.play.movies.mobileux.screen.details.episodes;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.jyr;
import defpackage.mxx;
import defpackage.mxy;
import defpackage.myc;
import defpackage.nbo;
import defpackage.tst;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EpisodesHeaderView extends LinearLayout implements nbo<mxy> {
    private LinearLayout a;

    public EpisodesHeaderView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(mxy mxyVar) {
        tst tstVar = mxyVar.a;
        if (!tstVar.g()) {
            this.a.setVisibility(8);
            return;
        }
        this.a.setVisibility(0);
        TextView textView = (TextView) this.a.findViewById(R.id.details_episodes_hide_unavaiables_text);
        TextView textView2 = (TextView) this.a.findViewById(R.id.details_episodes_hide_unavaiables_toggle);
        textView.setText(((myc) tstVar.c()).a);
        textView2.setText(((myc) tstVar.c()).b);
        textView2.setOnClickListener(new jyr(new mxx(), 20));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (LinearLayout) findViewById(R.id.details_episodes_hide_unavailables_section);
    }

    public EpisodesHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EpisodesHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EpisodesHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
