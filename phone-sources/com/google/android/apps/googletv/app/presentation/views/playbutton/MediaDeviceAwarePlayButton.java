package com.google.android.apps.googletv.app.presentation.views.playbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import defpackage.hju;
import defpackage.itm;
import defpackage.kkb;
import defpackage.sqr;
import defpackage.wfo;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaDeviceAwarePlayButton extends MaterialButton {
    private final String a;
    private final String b;
    private kkb c;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDeviceAwarePlayButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = "#ffe3e3e3";
        this.b = "#ff303030";
        this.d = context.getResources().getDisplayMetrics().densityDpi / 160;
    }

    public final void a(kkb kkbVar) {
        int iE;
        this.c = kkbVar;
        b();
        kkbVar.a.c().ea(new itm(this, 16));
        boolean z = kkbVar.c;
        if (z) {
            iE = Color.parseColor(this.a);
        } else {
            Context context = getContext();
            context.getClass();
            iE = hju.E(context, R.attr.colorOnPrimary);
        }
        setSupportBackgroundTintList(ColorStateList.valueOf(iE));
        v();
        if (this.i != 0) {
            this.i = 0;
            setCompoundDrawablePadding(0);
        }
        sqr sqrVar = this.e;
        sqrVar.f(0, sqrVar.h);
        sqrVar.f(sqrVar.g, 0);
        if (z) {
            getBackground().setAlpha(255);
            k(this.d * 12);
        } else {
            getBackground().setAlpha(221);
        }
        if (z && kkbVar.d) {
            wfo wfoVar = kkbVar.e;
            setSupportBackgroundTintList(ColorStateList.valueOf(wfoVar != null ? wfoVar.k() : 0));
            n(ColorStateList.valueOf(wfoVar != null ? wfoVar.e() : 0));
            k(this.d * 100);
            getLayoutParams().height = (getLayoutParams().width * 4) / 5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r8 = this;
            kkb r0 = r8.c
            if (r0 != 0) goto L5
            return
        L5:
            itk r1 = r0.a
            ith r1 = r1.e()
            r2 = 2130969048(0x7f0401d8, float:1.7546767E38)
            r3 = 2131231380(0x7f080294, float:1.807884E38)
            r4 = 2131231378(0x7f080292, float:1.8078835E38)
            r5 = 1
            if (r1 == 0) goto L3c
            iua r1 = (defpackage.iua) r1
            boolean r6 = r1.d
            if (r6 == 0) goto L1e
            goto L3c
        L1e:
            boolean r6 = r1.k
            r7 = 2130969085(0x7f0401fd, float:1.7546842E38)
            if (r6 == 0) goto L2a
            r1 = 2131231354(0x7f08027a, float:1.8078787E38)
        L28:
            r2 = r7
            goto L43
        L2a:
            fux r1 = r1.i
            r6 = 2131231393(0x7f0802a1, float:1.8078866E38)
            if (r1 == 0) goto L33
        L31:
            r1 = r6
            goto L28
        L33:
            boolean r1 = r0.b
            if (r1 == 0) goto L31
            boolean r1 = r0.c
            if (r5 == r1) goto L41
            goto L42
        L3c:
            boolean r1 = r0.c
            if (r5 == r1) goto L41
            goto L42
        L41:
            r3 = r4
        L42:
            r1 = r3
        L43:
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r1 = r3.getDrawable(r1)
            r8.m(r1)
            boolean r0 = r0.c
            if (r0 == 0) goto L59
            java.lang.String r0 = r8.b
            int r0 = android.graphics.Color.parseColor(r0)
            goto L64
        L59:
            android.content.Context r0 = r8.getContext()
            r0.getClass()
            int r0 = defpackage.hju.E(r0, r2)
        L64:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r8.n(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton.b():void");
    }

    public /* synthetic */ MediaDeviceAwarePlayButton(Context context, AttributeSet attributeSet, int i, ykn yknVar) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
