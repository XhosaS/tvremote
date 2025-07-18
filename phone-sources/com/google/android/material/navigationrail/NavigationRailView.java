package com.google.android.material.navigationrail;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActivityChooserView;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.android.videos.R;
import defpackage.gji;
import defpackage.gjk;
import defpackage.gjy;
import defpackage.gkc;
import defpackage.sil;
import defpackage.sin;
import defpackage.sns;
import defpackage.suy;
import defpackage.svt;
import defpackage.svw;
import defpackage.svz;
import defpackage.swa;
import defpackage.swj;
import defpackage.swl;
import defpackage.swm;
import defpackage.swo;
import defpackage.swp;
import defpackage.swq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NavigationRailView extends swj {
    private static final TimeInterpolator i = new PathInterpolator(0.38f, 1.21f, 0.22f, 1.0f);
    public Boolean f;
    public Boolean g;
    public Boolean h;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final boolean n;
    private boolean o;
    private View p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private swm z;

    public NavigationRailView(Context context) {
        this(context, null);
    }

    private final swo r() {
        return (swo) this.b;
    }

    @Override // defpackage.swj
    public final int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.swj
    protected final /* synthetic */ swa b(Context context) {
        return new swo(context);
    }

    public final boolean c(Boolean bool) {
        return bool != null ? bool.booleanValue() : getFitsSystemWindows();
    }

    @Override // defpackage.swj
    public final int d() {
        return 7;
    }

    @Override // defpackage.swj
    public final void j(int i2) throws Resources.NotFoundException {
        this.u = i2;
        this.x = i2;
        super.j(i2);
    }

    @Override // defpackage.swj
    public final void k(int i2) throws Resources.NotFoundException {
        this.t = i2;
        this.w = i2;
        super.k(i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int iMakeMeasureSpec = (View.MeasureSpec.getMode(i2) == 1073741824 || suggestedMinimumWidth <= 0) ? i2 : View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        if (this.q) {
            measureChild(r(), i2, i3);
            View view = this.p;
            if (view != null) {
                measureChild(view, i2, i3);
            }
            int childCount = r().getChildCount();
            int iMax = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = r().getChildAt(i4);
                if (childAt.getVisibility() != 8 && !(childAt instanceof svt)) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            int iMin = Math.min(this.l, View.MeasureSpec.getSize(i2));
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                int iMax2 = Math.max(iMax, iMin);
                View view2 = this.p;
                if (view2 != null) {
                    iMax2 = Math.max(iMax2, view2.getMeasuredWidth());
                }
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max(getSuggestedMinimumWidth(), Math.min(iMax2, this.m)), 1073741824);
            }
            if (this.b.y == -1) {
                swo swoVarR = r();
                int size = View.MeasureSpec.getSize(i2);
                svz[] svzVarArr = swoVarR.e;
                if (svzVarArr != null) {
                    for (svz svzVar : svzVarArr) {
                        if (svzVar instanceof svw) {
                            ((svw) svzVar).J(size);
                        }
                    }
                }
            }
            iMakeMeasureSpec = i2;
        }
        super.onMeasure(iMakeMeasureSpec, i3);
        if (this.z.getMeasuredHeight() < getMeasuredHeight()) {
            measureChild(this.z, iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // defpackage.swj
    protected final boolean p() {
        return true;
    }

    @Override // defpackage.swj
    public final boolean q() {
        return true;
    }

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationRailStyle);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, R.style.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i2, int i3) throws Resources.NotFoundException {
        super(context, attributeSet, i2, i3);
        this.f = null;
        this.g = null;
        this.h = null;
        this.q = false;
        this.s = -1;
        this.t = 0;
        this.u = 49;
        Context context2 = getContext();
        this.y = getContext().getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_expanded_item_spacing);
        this.x = 8388627;
        this.w = 1;
        TintTypedArray tintTypedArrayB = suy.b(context2, attributeSet, swq.a, i2, i3, new int[0]);
        this.j = tintTypedArrayB.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        this.k = tintTypedArrayB.getDimensionPixelSize(7, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_rail_margin));
        this.n = tintTypedArrayB.getBoolean(14, false);
        boolean z = tintTypedArrayB.getBoolean(17, false);
        if (this.o != z) {
            this.o = z;
            swo swoVarR = r();
            if (swoVarR.N != z) {
                swoVarR.N = z;
                svz[] svzVarArr = swoVarR.e;
                if (svzVarArr != null) {
                    for (svz svzVar : svzVarArr) {
                        if (svzVar instanceof svt) {
                            ((svt) svzVar).a(z);
                        }
                    }
                }
            }
        }
        swa swaVar = this.b;
        swm swmVar = new swm(getContext());
        this.z = swmVar;
        swmVar.a = this.j;
        swmVar.b = this.n;
        swmVar.setClipChildren(false);
        this.z.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        swaVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.z.addView(swaVar);
        if (!this.n) {
            addView(this.z);
        } else {
            ScrollView scrollView = new ScrollView(getContext());
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.addView(this.z);
            scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(scrollView);
        }
        int resourceId = tintTypedArrayB.getResourceId(6, 0);
        if (resourceId != 0) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
            View view = this.p;
            if (view != null) {
                this.z.removeView(view);
            }
            this.p = viewInflate;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 49;
            layoutParams.bottomMargin = this.k;
            this.z.addView(viewInflate, 0, layoutParams);
        }
        int i4 = tintTypedArrayB.getInt(10, 49);
        swo swoVarR2 = r();
        if (swoVarR2.a.gravity != i4) {
            swoVarR2.a.gravity = i4;
            swoVarR2.setLayoutParams(swoVarR2.a);
        }
        int dimensionPixelSize = tintTypedArrayB.getDimensionPixelSize(8, -1);
        int dimensionPixelSize2 = tintTypedArrayB.getDimensionPixelSize(8, -1);
        dimensionPixelSize = tintTypedArrayB.hasValue(0) ? tintTypedArrayB.getDimensionPixelSize(0, -1) : dimensionPixelSize;
        dimensionPixelSize2 = tintTypedArrayB.hasValue(3) ? tintTypedArrayB.getDimensionPixelSize(3, -1) : dimensionPixelSize2;
        this.s = dimensionPixelSize;
        if (!this.q) {
            ((swo) this.b).l(dimensionPixelSize);
        }
        this.v = dimensionPixelSize2;
        if (this.q) {
            ((swo) this.b).l(dimensionPixelSize2);
        }
        this.l = tintTypedArrayB.getDimensionPixelSize(5, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_min_expanded_width));
        this.m = tintTypedArrayB.getDimensionPixelSize(4, context2.getResources().getDimensionPixelSize(R.dimen.m3_navigation_rail_max_expanded_width));
        if (tintTypedArrayB.hasValue(13)) {
            this.f = Boolean.valueOf(tintTypedArrayB.getBoolean(13, false));
        }
        if (tintTypedArrayB.hasValue(11)) {
            this.g = Boolean.valueOf(tintTypedArrayB.getBoolean(11, false));
        }
        if (tintTypedArrayB.hasValue(12)) {
            this.h = Boolean.valueOf(tintTypedArrayB.getBoolean(12, false));
        }
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_top_with_large_font);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.m3_navigation_rail_item_padding_bottom_with_large_font);
        float fA = sns.a(0.0f, 1.0f, 0.3f, 1.0f, sin.e(context2) - 1.0f);
        float fB = sns.b(this.b.r, dimensionPixelOffset, fA);
        float fB2 = sns.b(this.b.s, dimensionPixelOffset2, fA);
        m(Math.round(fB));
        l(Math.round(fB2));
        int dimensionPixelSize3 = tintTypedArrayB.getDimensionPixelSize(9, 0);
        this.r = dimensionPixelSize3;
        if (!this.q) {
            r().m(dimensionPixelSize3);
        }
        boolean z2 = tintTypedArrayB.getBoolean(2, false);
        if (this.q != z2) {
            if (isLaidOut()) {
                gji gjiVar = new gji();
                gjiVar.b = 500L;
                gjiVar.c = i;
                gjk gjkVar = new gjk();
                gjkVar.b = 100L;
                gjk gjkVar2 = new gjk();
                gjkVar2.b = 100L;
                swl swlVar = new swl();
                gjk gjkVar3 = new gjk();
                gjkVar3.b = 100L;
                int childCount = r().getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = r().getChildAt(i5);
                    if (childAt instanceof svw) {
                        svw svwVar = (svw) childAt;
                        gjiVar.E(svwVar.f);
                        gjiVar.E(svwVar.g);
                        if (this.q) {
                            gjkVar2.D(svwVar.g);
                            gjkVar.D(svwVar.f);
                        } else {
                            gjkVar2.D(svwVar.f);
                            gjkVar.D(svwVar.g);
                        }
                        swlVar.D(svwVar.g);
                    }
                    gjkVar3.D(childAt);
                }
                gkc gkcVar = new gkc();
                gkcVar.R(0);
                gkcVar.P(gjiVar);
                gkcVar.P(gjkVar);
                gkcVar.P(swlVar);
                if (!this.q) {
                    gkcVar.P(gjkVar3);
                }
                gkc gkcVar2 = new gkc();
                gkcVar2.R(0);
                gkcVar2.P(gjkVar2);
                if (this.q) {
                    gkcVar2.P(gjkVar3);
                }
                gkc gkcVar3 = new gkc();
                gkcVar3.R(1);
                gkcVar3.P(gkcVar2);
                gkcVar3.P(gkcVar);
                gjy.c((ViewGroup) getParent(), gkcVar3);
            }
            this.q = z2;
            int i6 = this.t;
            int i7 = this.r;
            int i8 = this.s;
            int i9 = this.u;
            if (z2) {
                i6 = this.w;
                i7 = this.y;
                i8 = this.v;
                i9 = this.x;
            }
            r().h(i9);
            super.k(i6);
            r().m(i7);
            r().l(i8);
            swo swoVarR3 = r();
            swoVarR3.L = z2;
            svz[] svzVarArr2 = swoVarR3.e;
            if (svzVarArr2 != null) {
                for (svz svzVar2 : svzVarArr2) {
                    svzVar2.ex(z2);
                }
            }
        }
        tintTypedArrayB.recycle();
        sil.n(this, new swp(this, 0));
    }
}
