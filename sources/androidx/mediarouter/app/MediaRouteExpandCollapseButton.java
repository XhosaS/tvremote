package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.fo;

/* compiled from: PG */
/* loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends fo {
    public final AnimationDrawable a;
    public final AnimationDrawable b;
    public final String c;
    public final String d;
    public boolean e;
    public View.OnClickListener f;

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MediaRouteExpandCollapseButton(android.content.Context r12, android.util.AttributeSet r13, int r14) throws android.content.res.Resources.NotFoundException {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            r13 = 2131231204(0x7f0801e4, float:1.8078482E38)
            android.graphics.drawable.Drawable r13 = r12.getDrawable(r13)
            android.graphics.drawable.AnimationDrawable r13 = (android.graphics.drawable.AnimationDrawable) r13
            r11.a = r13
            r0 = 2131231203(0x7f0801e3, float:1.807848E38)
            android.graphics.drawable.Drawable r0 = r12.getDrawable(r0)
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r11.b = r0
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            r2 = 2130968868(0x7f040124, float:1.7546402E38)
            r3 = 0
            if (r14 == 0) goto L32
            int[] r4 = new int[]{r2}
            android.content.res.TypedArray r14 = r12.obtainStyledAttributes(r14, r4)
            int r4 = r14.getColor(r3, r3)
            r14.recycle()
            if (r4 != 0) goto L50
        L32:
            android.util.TypedValue r14 = new android.util.TypedValue
            r14.<init>()
            android.content.res.Resources$Theme r4 = r12.getTheme()
            r5 = 1
            r4.resolveAttribute(r2, r14, r5)
            int r2 = r14.resourceId
            if (r2 == 0) goto L4e
            android.content.res.Resources r2 = r12.getResources()
            int r14 = r14.resourceId
            int r4 = r2.getColor(r14)
            goto L50
        L4e:
            int r4 = r14.data
        L50:
            int r14 = defpackage.ns.a
            int r14 = android.graphics.Color.alpha(r4)
            r2 = 255(0xff, float:3.57E-43)
            if (r14 != r2) goto Lb8
            r14 = -1
            int r5 = android.graphics.Color.alpha(r14)
            if (r5 >= r2) goto L66
            int r2 = defpackage.ns.c(r14, r4)
            goto L67
        L66:
            r2 = r14
        L67:
            double r5 = defpackage.ns.a(r2)
            r7 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r5 = r5 + r7
            double r9 = defpackage.ns.a(r4)
            double r9 = r9 + r7
            double r7 = java.lang.Math.max(r5, r9)
            double r4 = java.lang.Math.min(r5, r9)
            double r7 = r7 / r4
            r4 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 < 0) goto L86
            goto L88
        L86:
            r14 = -570425344(0xffffffffde000000, float:-2.305843E18)
        L88:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r14, r2)
            r13.setColorFilter(r1)
            r0.setColorFilter(r1)
            r14 = 2131951799(0x7f1300b7, float:1.9540023E38)
            java.lang.String r14 = r12.getString(r14)
            r11.c = r14
            r0 = 2131951797(0x7f1300b5, float:1.9540019E38)
            java.lang.String r12 = r12.getString(r0)
            r11.d = r12
            android.graphics.drawable.Drawable r12 = r13.getFrame(r3)
            r11.setImageDrawable(r12)
            r11.setContentDescription(r14)
            yr r12 = new yr
            r12.<init>(r11)
            super.setOnClickListener(r12)
            return
        Lb8:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = java.lang.Integer.toHexString(r4)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = "background can not be translucent: #"
            java.lang.String r13 = r14.concat(r13)
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.MediaRouteExpandCollapseButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
