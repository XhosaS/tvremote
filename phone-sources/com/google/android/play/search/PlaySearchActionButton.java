package com.google.android.play.search;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.tbx;
import defpackage.tgw;
import defpackage.tgx;
import defpackage.tha;
import defpackage.thh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchActionButton extends ImageView implements tgx {
    public tgw a;
    public int b;
    private Drawable c;
    private Drawable d;
    private final boolean e;

    public PlaySearchActionButton(Context context) {
        this(context, null);
    }

    private final void c() {
        tgw tgwVar = this.a;
        if (tgwVar == null) {
            return;
        }
        String str = tgwVar.d;
        if (tgwVar.i() || TextUtils.isEmpty(str)) {
            f(2);
        } else {
            f(1);
        }
    }

    private final void f(int i) {
        int i2;
        Drawable drawable;
        if (this.b == i) {
            return;
        }
        this.b = i;
        if (i == 1) {
            drawable = this.c;
            i2 = R.string.play_accessibility_search_plate_clear;
        } else if (this.e) {
            drawable = this.d;
            i2 = R.string.play_accessibility_search_plate_voice_search_button;
        } else {
            i2 = -1;
            drawable = null;
        }
        setImageDrawable(drawable);
        if (drawable != null) {
            setContentDescription(getContext().getResources().getString(i2));
            setVisibility(0);
        } else {
            setContentDescription(null);
            setVisibility(4);
        }
    }

    @Override // defpackage.tgx
    public final void d(int i) {
        c();
    }

    @Override // defpackage.tgx
    public final void e(String str, boolean z) {
        c();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new tbx((View) this, 5));
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 1;
        this.c = context.getResources().getDrawable(R.drawable.play_ic_clear);
        this.d = context.getResources().getDrawable(2131231678);
        Intent intent = thh.a;
        this.e = context.getPackageManager().queryIntentActivities(thh.a, 0).size() > 0;
        f(2);
    }

    @Override // defpackage.tgx
    public final void m() {
    }

    @Override // defpackage.tgx
    public final void a(String str) {
    }

    @Override // defpackage.tgx
    public final void b(tha thaVar) {
    }
}
