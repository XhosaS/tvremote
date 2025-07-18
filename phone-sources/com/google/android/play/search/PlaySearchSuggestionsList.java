package com.google.android.play.search;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import com.google.android.videos.R;
import defpackage.giv;
import defpackage.jcd;
import defpackage.tgw;
import defpackage.tgx;
import defpackage.tgz;
import defpackage.tha;
import defpackage.thb;
import defpackage.thc;
import defpackage.thd;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchSuggestionsList extends LinearLayout implements tgx {
    public RecyclerView a;
    public tgw b;
    public Animation c;
    public boolean d;
    public tgz e;
    private final int f;
    private final float g;
    private int h;
    private RecyclerView.AdapterDataObserver i;
    private int j;

    public PlaySearchSuggestionsList(Context context) {
        this(context, null);
    }

    private final void g(boolean z) {
        this.d = z;
        Animation animation = this.c;
        if (animation != null) {
            animation.cancel();
        }
        int measuredHeight = 0;
        if (z) {
            setVisibility(0);
            this.a.setVisibility(0);
            if (this.h == 0) {
                return;
            }
        }
        int height = this.a.getHeight();
        if (z) {
            this.a.measure(0, View.MeasureSpec.makeMeasureSpec(this.h, Integer.MIN_VALUE));
            measuredHeight = this.a.getMeasuredHeight();
        }
        if (height == measuredHeight) {
            return;
        }
        thd thdVar = new thd(this, height, measuredHeight - height);
        thdVar.setAnimationListener(new giv(this, 2));
        thdVar.setDuration(Math.max(50, Math.min(200, (int) (r0 / this.g))));
        this.c = thdVar;
        this.a.startAnimation(thdVar);
    }

    private final void h() {
        tgz tgzVar = this.e;
        if (tgzVar != null) {
            List list = tgzVar.a;
            List list2 = Collections.EMPTY_LIST;
            list.clear();
            list.addAll(list2);
            tgzVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.tgx
    public final void a(String str) {
        h();
    }

    @Override // defpackage.tgx
    public final void b(tha thaVar) {
        h();
    }

    public final void c() {
        tgw tgwVar = this.b;
        if (tgwVar == null) {
            return;
        }
        int i = tgwVar.b;
        if (this.e.getItemCount() <= 0 || i == 1 || i == 2 || i == 4) {
            g(false);
        } else {
            g(true);
        }
    }

    @Override // defpackage.tgx
    public final void d(int i) {
        if (i == 1) {
            h();
        } else {
            c();
        }
    }

    public final void f(tgz tgzVar) {
        if (this.i == null) {
            this.i = new thc(this);
        }
        tgz tgzVar2 = this.e;
        if (tgzVar2 != null) {
            tgzVar2.unregisterAdapterDataObserver(this.i);
            this.e.b = null;
        }
        this.e = tgzVar;
        if (tgzVar != null) {
            tgzVar.registerAdapterDataObserver(this.i);
            this.a.setAdapter(this.e);
            this.e.b = this.b;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animation animation = this.c;
        if (animation != null) {
            animation.cancel();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = 0;
            this.a.setLayoutParams(layoutParams);
            this.d = false;
            this.a.setVisibility(8);
            setVisibility(8);
            this.a.layout(0, 0, 0, 0);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.suggestion_list_recycler_view);
        this.a = recyclerView;
        recyclerView.setLayoutManager(new thb(this, getContext()));
        f(new tgz());
        this.a.setOnTouchListener(new jcd((InputMethodManager) getContext().getSystemService("input_method"), 9));
        this.j = getContext().getResources().getDisplayMetrics().heightPixels;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.h == 0) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (rect.top > 0) {
                this.h = ((this.j - rect.top) - this.a.getTop()) + this.f;
            }
            c();
        }
    }

    public PlaySearchSuggestionsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.play_search_suggestions_list_bottom_margin);
        this.g = getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.tgx
    public final void m() {
    }

    @Override // defpackage.tgx
    public final void e(String str, boolean z) {
    }
}
