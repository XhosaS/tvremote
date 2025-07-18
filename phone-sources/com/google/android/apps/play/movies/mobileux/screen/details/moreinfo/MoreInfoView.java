package com.google.android.apps.play.movies.mobileux.screen.details.moreinfo;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.icy;
import defpackage.iff;
import defpackage.ksd;
import defpackage.mlw;
import defpackage.mwo;
import defpackage.myz;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MoreInfoView extends LinearLayout implements nbo<myz> {
    private RecyclerView a;
    private mwo b;

    public MoreInfoView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    public final /* synthetic */ void a(Object obj) {
        this.b.a(((myz) obj).a, this.a);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        cww.q(findViewById(R.id.details_moreinfo_header), true);
        this.a = (RecyclerView) findViewById(R.id.details_moreinfo_items);
        icy icyVar = new icy(new GridLayoutManager(getContext(), getResources().getInteger(R.integer.details_moreinfo_column_count)));
        icy icyVar2 = new icy(Long.valueOf(ksd.a()));
        iff iffVar = new iff();
        iffVar.f(R.layout.details_moreinfo_item);
        iffVar.e = ksd.b();
        iffVar.c = new mlw(5);
        this.b = mwo.b(icyVar, icyVar2, new icy(iffVar.b()));
    }

    public MoreInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MoreInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MoreInfoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
