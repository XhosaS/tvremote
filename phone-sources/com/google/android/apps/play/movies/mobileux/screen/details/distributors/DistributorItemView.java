package com.google.android.apps.play.movies.mobileux.screen.details.distributors;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.a;
import defpackage.hjr;
import defpackage.htc;
import defpackage.mxe;
import defpackage.nbo;
import defpackage.sij;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DistributorItemView extends RelativeLayout implements nbo<mxe> {
    public TextView a;
    public TextView b;
    private ImageView c;
    private ImageView d;
    private TextView e;

    public DistributorItemView(Context context) {
        super(context);
    }

    public final void b() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.addRule(15, -1);
        this.e.setLayoutParams(layoutParams);
    }

    public final void c() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.removeRule(15);
        this.e.setLayoutParams(layoutParams);
    }

    @Override // defpackage.nbo
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(mxe mxeVar) {
        int i;
        this.c.setVisibility(0);
        hjr.c(getContext()).e(mxeVar.c).g(htc.b()).k(this.c);
        this.e.setVisibility(0);
        this.e.setText(mxeVar.d);
        String strCq = mxeVar.e;
        boolean z = mxeVar.g;
        if (z) {
            String str = mxeVar.f;
            if (!sij.F(str) && (!mxeVar.h || !mxeVar.i || ((i = mxeVar.b) != 1 && i != 4))) {
                strCq = sij.F(strCq) ? str : a.cq(str, strCq, " • ");
            }
        }
        if (sij.F(strCq)) {
            this.a.setVisibility(4);
            b();
        } else {
            this.a.setVisibility(0);
            this.a.setText(strCq);
            c();
        }
        String str2 = mxeVar.f;
        if (sij.F(str2) || z) {
            this.b.setVisibility(4);
            this.b.setText("");
        } else {
            this.b.setVisibility(0);
            this.b.setText(str2);
        }
        e(1);
        requestLayout();
    }

    public final void e(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            this.d.setVisibility(8);
        } else if (i2 != 1) {
            this.d.setVisibility(0);
            this.d.setImageResource(R.drawable.ic_group_indicator_collapsed);
        } else {
            this.d.setVisibility(0);
            this.d.setImageResource(R.drawable.ic_group_indicator_expanded);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.distributor_icon);
        this.d = (ImageView) findViewById(R.id.distributor_group_indicator);
        this.e = (TextView) findViewById(R.id.distributor_item_title);
        this.a = (TextView) findViewById(R.id.distributor_item_subtitle);
        this.b = (TextView) findViewById(R.id.distributor_item_price);
    }

    public DistributorItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DistributorItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DistributorItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
