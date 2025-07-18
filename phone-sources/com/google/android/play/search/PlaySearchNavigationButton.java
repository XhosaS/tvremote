package com.google.android.play.search;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.videos.R;
import defpackage.tbx;
import defpackage.tfw;
import defpackage.tgw;
import defpackage.tgx;
import defpackage.tha;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchNavigationButton extends ImageView implements tgx {
    public tgw a;
    public int b;
    private int c;
    private tfw d;

    public PlaySearchNavigationButton(Context context) {
        this(context, null);
    }

    private final void f(int i) {
        if (this.b == i) {
            return;
        }
        this.d.b(i, 2);
        g(i);
        this.b = i;
    }

    private final void g(int i) {
        int i2;
        if (i == 0) {
            i2 = this.c;
        } else {
            tgw tgwVar = this.a;
            i2 = (tgwVar == null || tgwVar.b != 1) ? R.string.play_accessibility_search_plate_back_button : R.string.play_accessibility_search_plate_navigate_up_button;
        }
        setContentDescription(getContext().getText(i2));
    }

    protected void c(tfw tfwVar) {
        tfwVar.setColorFilter(new PorterDuffColorFilter(getResources().getColor(R.color.play_search_plate_navigation_button_color), PorterDuff.Mode.SRC_IN));
    }

    @Override // defpackage.tgx
    public final void d(int i) {
        if (i == 1) {
            f(0);
        } else if (i == 3 || i == 2) {
            f(1);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setImageDrawable(this.d);
        this.d.b(0, 0);
        this.c = R.string.play_drawer_open;
        setOnClickListener(new tbx((View) this, 6));
        f(0);
        g(0);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchNavigationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        tfw tfwVar = new tfw(context);
        this.d = tfwVar;
        c(tfwVar);
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

    @Override // defpackage.tgx
    public final void e(String str, boolean z) {
    }
}
