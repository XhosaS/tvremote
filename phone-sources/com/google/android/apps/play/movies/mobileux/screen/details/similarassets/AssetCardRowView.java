package com.google.android.apps.play.movies.mobileux.screen.details.similarassets;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.apps.play.movies.mobileux.component.assetcollectionheader.AssetCollectionHeaderView;
import com.google.android.apps.play.movies.mobileux.view.widget.LeadingEdgeSnapRecyclerView;
import com.google.android.videos.R;
import defpackage.icy;
import defpackage.idh;
import defpackage.iff;
import defpackage.ksd;
import defpackage.lis;
import defpackage.mcm;
import defpackage.muk;
import defpackage.mwo;
import defpackage.mzp;
import defpackage.nbo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AssetCardRowView extends LinearLayout implements nbo<mzp> {
    public LeadingEdgeSnapRecyclerView a;
    public mwo b;
    private AssetCollectionHeaderView c;

    public AssetCardRowView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.mzp r6) {
        /*
            r5 = this;
            tst r0 = r6.d
            boolean r0 = r0.g()
            if (r0 == 0) goto L14
            lik r0 = new lik
            r1 = 19
            r0.<init>(r5, r6, r1)
            ieg r0 = defpackage.ieg.f(r0)
            goto L16
        L14:
            ieg r0 = defpackage.ieg.a
        L16:
            mwo r1 = r5.b
            idr r1 = r1.a
            r1.c(r0)
            mwo r0 = r5.b
            com.google.common.collect.ImmutableList r1 = r6.c
            com.google.android.apps.play.movies.mobileux.view.widget.LeadingEdgeSnapRecyclerView r2 = r5.a
            r0.a(r1, r2)
            com.google.android.apps.play.movies.mobileux.view.widget.LeadingEdgeSnapRecyclerView r0 = r5.a
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r1)
            r1 = 1000(0x3e8, double:4.94E-321)
            r0.setDuration(r1)
            com.google.android.apps.play.movies.mobileux.component.assetcollectionheader.AssetCollectionHeaderView r0 = r5.c
            mul r1 = r6.a
            r2 = 8
            if (r1 == 0) goto L83
            java.lang.CharSequence r3 = r1.a
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L50
            java.lang.CharSequence r4 = r1.b
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L50
            goto L83
        L50:
            r4 = 0
            r0.setVisibility(r4)
            r0.c(r3)
            java.lang.CharSequence r3 = r1.b
            r0.b(r3)
            r3 = 1
            r0.d = r3
            android.widget.ImageView r3 = r0.c
            r3.setVisibility(r2)
            r2 = 0
            r0.setOnClickListener(r2)
            android.content.res.Resources r2 = r0.getResources()
            r3 = 2
            int r2 = defpackage.sfy.d(r2, r3)
            android.widget.ImageView r3 = r0.b
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            r4.width = r2
            r4.height = r2
            r3.setLayoutParams(r4)
            sdk r1 = r1.c
            r0.a = r1
            goto L86
        L83:
            r0.setVisibility(r2)
        L86:
            tst r6 = r6.f
            boolean r0 = r6.g()
            if (r0 == 0) goto Lae
            java.lang.Object r6 = r6.c()
            kvd r6 = (defpackage.kvd) r6
            int r0 = r6.a
            int r1 = r6.b
            if (r0 == r1) goto La6
            int[] r0 = new int[]{r0, r1}
            android.graphics.drawable.GradientDrawable$Orientation r6 = r6.c
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>(r6, r0)
            goto Lab
        La6:
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r1.<init>(r0)
        Lab:
            r5.setBackground(r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobileux.screen.details.similarassets.AssetCardRowView.a(mzp):void");
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (AssetCollectionHeaderView) findViewById(R.id.similar_asset_header);
        this.a = (LeadingEdgeSnapRecyclerView) findViewById(R.id.similar_asset_list);
        icy icyVar = new icy(new LinearLayoutManager(getContext(), 0, false));
        icy icyVar2 = new icy(Long.valueOf(ksd.a()));
        iff iffVar = new iff();
        iffVar.f(R.layout.asset_card);
        idh idhVarD = idh.d();
        idhVarD.e(new mcm(18));
        iffVar.e = idhVarD.b(ksd.b());
        iffVar.e(new mcm(19), false);
        iffVar.c = new muk(new lis() { // from class: mzn
            @Override // defpackage.lis
            public final void a(Object obj, View view, lid lidVar) {
                muj mujVar = (muj) obj;
                Optional optional = mujVar.l;
                if (optional.isPresent()) {
                    ((pjx) optional.get()).a(pjw.b(), view);
                }
                kff.s(view, new mzq(mujVar, view));
            }
        });
        this.b = mwo.b(icyVar, icyVar2, new icy(iffVar.b()));
        LeadingEdgeSnapRecyclerView leadingEdgeSnapRecyclerView = this.a;
        leadingEdgeSnapRecyclerView.b(leadingEdgeSnapRecyclerView.getPaddingStart());
        this.a.c();
        this.a.setItemAnimator(null);
        this.c.animate().alpha(1.0f).setDuration(1000L);
    }

    public AssetCardRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AssetCardRowView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AssetCardRowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
