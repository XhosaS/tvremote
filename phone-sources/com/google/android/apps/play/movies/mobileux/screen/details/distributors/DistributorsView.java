package com.google.android.apps.play.movies.mobileux.screen.details.distributors;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.cww;
import defpackage.mxn;
import defpackage.mxo;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DistributorsView extends RelativeLayout implements nbo<mxo> {
    private RelativeLayout a;
    private TextView b;
    private LinearLayout c;
    private DistributorItemView d;

    public DistributorsView(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.mxo r10) {
        /*
            r9 = this;
            ieg r0 = r10.e
            boolean r1 = r0.m()
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L26
            android.widget.RelativeLayout r10 = r9.a
            r10.setVisibility(r2)
            android.widget.TextView r10 = r9.b
            r10.setVisibility(r3)
            android.widget.TextView r10 = r9.b
            java.lang.Object r0 = r0.g()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r10.setText(r0)
            android.widget.LinearLayout r10 = r9.c
            r10.setVisibility(r2)
            return
        L26:
            android.widget.TextView r0 = r9.b
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r9.c
            r0.setVisibility(r3)
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            r0.setVisibility(r3)
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            mxe r1 = r10.c
            r0.a(r1)
            com.google.common.collect.ImmutableList r0 = r10.b
            boolean r0 = r0.isEmpty()
            r4 = 1
            r5 = 4
            if (r0 != 0) goto L8f
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            r0.setClickable(r4)
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            r6 = 3
            r0.e(r6)
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            boolean r6 = r10.g
            if (r6 == 0) goto L6d
            int r6 = r1.b
            r7 = 5
            if (r6 != r7) goto L64
            boolean r6 = r10.f
            if (r6 != 0) goto L62
            r6 = r7
            goto L64
        L62:
            r6 = r3
            goto L6e
        L64:
            boolean r7 = r1.i
            if (r7 == 0) goto L6d
            if (r6 == r4) goto L62
            if (r6 != r5) goto L6d
            goto L62
        L6d:
            r6 = r2
        L6e:
            if (r6 != r2) goto L73
            r0.b()
        L73:
            android.widget.TextView r7 = r0.a
            r7.setVisibility(r6)
            android.widget.TextView r0 = r0.b
            r0.setVisibility(r6)
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            mxg r6 = new mxg
            r6.<init>(r10)
            jyr r7 = new jyr
            r8 = 20
            r7.<init>(r6, r8)
            r0.setOnClickListener(r7)
            goto L94
        L8f:
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            r0.setClickable(r3)
        L94:
            boolean r0 = r10.i
            if (r0 == 0) goto Lc9
            com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorItemView r0 = r9.d
            int r6 = r1.b
            if (r6 == r5) goto L9f
            goto Lc9
        L9f:
            android.widget.TextView r6 = r0.b
            r6.setVisibility(r5)
            android.widget.TextView r6 = r0.b
            java.lang.String r7 = ""
            r6.setText(r7)
            java.lang.String r1 = r1.f
            boolean r6 = defpackage.sij.F(r1)
            if (r6 != 0) goto Lc1
            android.widget.TextView r5 = r0.a
            r5.setVisibility(r3)
            android.widget.TextView r5 = r0.a
            r5.setText(r1)
            r0.c()
            goto Lc9
        Lc1:
            android.widget.TextView r1 = r0.a
            r1.setVisibility(r5)
            r0.b()
        Lc9:
            android.widget.RelativeLayout r0 = r9.a
            boolean r10 = r10.d
            if (r4 == r10) goto Ld0
            goto Ld1
        Ld0:
            r2 = r3
        Ld1:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobileux.screen.details.distributors.DistributorsView.a(mxo):void");
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (RelativeLayout) findViewById(R.id.distributor_tooltip);
        this.b = (TextView) findViewById(R.id.oow_message);
        this.c = (LinearLayout) findViewById(R.id.current_distributor_container);
        DistributorItemView distributorItemView = (DistributorItemView) findViewById(R.id.current_distributor);
        this.d = distributorItemView;
        cww.p(distributorItemView, new mxn());
    }

    public DistributorsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DistributorsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
