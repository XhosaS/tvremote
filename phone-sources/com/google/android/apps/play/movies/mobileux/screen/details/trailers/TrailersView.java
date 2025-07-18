package com.google.android.apps.play.movies.mobileux.screen.details.trailers;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.icy;
import defpackage.iff;
import defpackage.ksd;
import defpackage.mlw;
import defpackage.mwo;
import defpackage.naj;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TrailersView extends LinearLayout implements nbo<naj> {
    public RecyclerView a;
    public mwo b;

    public TrailersView(Context context) {
        super(context);
    }

    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(naj najVar) {
        this.b.a(najVar.a, this.a);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (RecyclerView) findViewById(R.id.details_trailers_items);
        icy icyVar = new icy(new LinearLayoutManager(getContext(), 0, false));
        icy icyVar2 = new icy(Long.valueOf(ksd.a()));
        iff iffVar = new iff();
        iffVar.f(R.layout.details_trailers_item);
        iffVar.e = ksd.b();
        iffVar.c = new mlw(10);
        this.b = mwo.b(icyVar, icyVar2, new icy(iffVar.b()));
    }

    public TrailersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TrailersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TrailersView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
