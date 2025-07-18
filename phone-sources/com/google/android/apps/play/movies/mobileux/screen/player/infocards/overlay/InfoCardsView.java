package com.google.android.apps.play.movies.mobileux.screen.player.infocards.overlay;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.apps.play.movies.mobileux.view.widget.LeadingEdgeSnapRecyclerView;
import com.google.android.videos.R;
import defpackage.icy;
import defpackage.iff;
import defpackage.ksd;
import defpackage.mlw;
import defpackage.mwo;
import defpackage.mzs;
import defpackage.nbk;
import defpackage.nbo;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class InfoCardsView extends LinearLayout implements nbo<List<nbk>> {
    private LeadingEdgeSnapRecyclerView a;
    private mwo b;

    public InfoCardsView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(List list) {
        this.b.a(list, this.a);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (LeadingEdgeSnapRecyclerView) findViewById(R.id.info_card_list);
        icy icyVar = new icy(new LinearLayoutManager(getContext(), 0, false));
        icy icyVar2 = new icy(Long.valueOf(ksd.a()));
        iff iffVar = new iff();
        iffVar.f(R.layout.info_card);
        iffVar.c = new mlw(11);
        iffVar.e(new mzs(4), false);
        iffVar.e = ksd.b();
        this.b = mwo.b(icyVar, icyVar2, new icy(iffVar.b()));
        LeadingEdgeSnapRecyclerView leadingEdgeSnapRecyclerView = this.a;
        leadingEdgeSnapRecyclerView.b(leadingEdgeSnapRecyclerView.getPaddingStart());
        this.a.c();
    }

    public InfoCardsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InfoCardsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
