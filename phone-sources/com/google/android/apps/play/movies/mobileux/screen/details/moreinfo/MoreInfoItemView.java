package com.google.android.apps.play.movies.mobileux.screen.details.moreinfo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;
import defpackage.mwx;
import defpackage.myw;
import defpackage.nbo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MoreInfoItemView extends LinearLayout implements nbo<myw> {
    private TextView a;
    private TextView b;

    public MoreInfoItemView(Context context) {
        super(context);
    }

    private static void c(Drawable drawable, SpannableString spannableString) {
        spannableString.setSpan(new mwx(drawable), 0, 1, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    @Override // defpackage.nbo
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.myw r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.a
            java.lang.String r1 = r10.a
            r0.setText(r1)
            java.lang.String r0 = r10.c
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            if (r2 != 0) goto L94
            android.widget.TextView r2 = r9.b
            ieg r4 = defpackage.ieg.a
            boolean r5 = defpackage.mnu.p(r0)
            if (r5 == 0) goto L26
            ieg r4 = defpackage.mnu.m(r0)
            ieg r0 = defpackage.mnu.l(r0)
        L22:
            r8 = r4
            r4 = r0
            r0 = r8
            goto L36
        L26:
            boolean r5 = defpackage.mnu.q(r0)
            if (r5 == 0) goto L35
            ieg r4 = defpackage.mnu.o(r0)
            ieg r0 = defpackage.mnu.n(r0)
            goto L22
        L35:
            r0 = r4
        L36:
            android.widget.TextView r5 = r9.b
            android.content.Context r5 = r5.getContext()
            java.lang.Object r4 = r4.g()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.String r4 = r5.getString(r4)
            android.text.SpannableString r6 = new android.text.SpannableString
            java.lang.String r7 = "   "
            java.lang.String r4 = r7.concat(r4)
            r6.<init>(r4)
            java.lang.Object r0 = r0.g()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.graphics.drawable.Drawable r0 = r5.getDrawable(r0)
            if (r0 == 0) goto L70
            int r4 = r0.getIntrinsicWidth()
            int r5 = r0.getIntrinsicHeight()
            r0.setBounds(r3, r3, r4, r5)
        L70:
            c(r0, r6)
            r2.setText(r6)
            java.lang.CharSequence r10 = r10.b
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.setContentDescription(r10)
            goto Lff
        L94:
            ieg r0 = r10.d
            boolean r1 = r0.m()
            if (r1 == 0) goto Lf8
            android.widget.TextView r10 = r9.b
            r1 = 17
            r10.setForegroundGravity(r1)
            android.widget.TextView r10 = r9.b
            java.lang.Object r0 = r0.g()
            mza r0 = (defpackage.mza) r0
            android.widget.TextView r1 = r9.b
            android.content.Context r1 = r1.getContext()
            int r2 = r0.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r2
            r2 = 2132017610(0x7f1401ca, float:1.9673503E38)
            java.lang.String r2 = r1.getString(r2, r5)
            android.text.SpannableString r5 = new android.text.SpannableString
            java.lang.String r6 = r0.c
            android.net.Uri r6 = android.net.Uri.parse(r6)
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r3] = r2
            r7[r4] = r6
            r2 = 2132017611(0x7f1401cb, float:1.9673505E38)
            java.lang.String r2 = r1.getString(r2, r7)
            android.text.Spanned r2 = defpackage.ksk.b(r2)
            r5.<init>(r2)
            int r0 = r0.b
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.widget.TextView r1 = r9.b
            int r1 = r1.getLineHeight()
            if (r0 == 0) goto Lf1
            r0.setBounds(r3, r3, r1, r1)
        Lf1:
            c(r0, r5)
            r10.setText(r5)
            goto Lff
        Lf8:
            android.widget.TextView r0 = r9.b
            java.lang.CharSequence r10 = r10.b
            r0.setText(r10)
        Lff:
            android.widget.TextView r10 = r9.b
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r10.setMovementMethod(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobileux.screen.details.moreinfo.MoreInfoItemView.a(myw):void");
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.details_moreinfo_item_title);
        this.b = (TextView) findViewById(R.id.details_moreinfo_item_description);
    }

    public MoreInfoItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MoreInfoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MoreInfoItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
