package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.cb;
import defpackage.cww;
import defpackage.cxe;
import defpackage.cyq;
import defpackage.gli;
import defpackage.glw;
import defpackage.gme;
import defpackage.gmg;
import defpackage.gmh;
import defpackage.gmi;
import defpackage.gmj;
import defpackage.gmk;
import defpackage.gml;
import defpackage.gmm;
import defpackage.gmn;
import defpackage.gmp;
import defpackage.gmr;
import defpackage.gms;
import defpackage.gmt;
import defpackage.gmu;
import defpackage.gmv;
import defpackage.gmw;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public int a;
    public boolean b;
    public LinearLayoutManager c;
    public RecyclerView d;
    public gmj e;
    public boolean f;
    public int g;
    public gli h;
    private final Rect i;
    private final Rect j;
    private final gmg k;
    private final RecyclerView.AdapterDataObserver l;
    private int m;
    private Parcelable n;
    private PagerSnapHelper o;
    private gmg p;
    private gmh q;
    private cb r;

    public ViewPager2(Context context) {
        super(context);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new gmg();
        this.b = false;
        this.l = new gmk(this);
        this.m = -1;
        this.f = true;
        this.g = -1;
        o(context, null);
    }

    private final void o(Context context, AttributeSet attributeSet) {
        this.h = new gms(this);
        gmu gmuVar = new gmu(this, context);
        this.d = gmuVar;
        gmuVar.setId(View.generateViewId());
        this.d.setDescendantFocusability(131072);
        gmp gmpVar = new gmp(this, context);
        this.c = gmpVar;
        this.d.setLayoutManager(gmpVar);
        this.d.setScrollingTouchSlop(1);
        int[] iArr = glw.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        cww.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            this.c.setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            ((gms) this.h).Y();
            typedArrayObtainStyledAttributes.recycle();
            this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.d.addOnChildAttachStateChangeListener(new gmn());
            this.e = new gmj(this);
            gmj gmjVar = this.e;
            RecyclerView recyclerView = this.d;
            this.r = new cb(gmjVar);
            gmt gmtVar = new gmt(this);
            this.o = gmtVar;
            gmtVar.attachToRecyclerView(recyclerView);
            this.d.addOnScrollListener(this.e);
            this.d.setOverScrollMode(getOverScrollMode());
            gmg gmgVar = new gmg();
            this.p = gmgVar;
            this.e.f = gmgVar;
            gml gmlVar = new gml(this);
            gmm gmmVar = new gmm(this);
            gmgVar.a(gmlVar);
            this.p.a(gmmVar);
            gli gliVar = this.h;
            this.d.setImportantForAccessibility(2);
            gms gmsVar = (gms) gliVar;
            gmsVar.a = new gmr(gmsVar);
            ViewPager2 viewPager2 = gmsVar.b;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            this.p.a(this.k);
            gmh gmhVar = new gmh();
            this.q = gmhVar;
            this.p.a(gmhVar);
            RecyclerView recyclerView2 = this.d;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p() {
        RecyclerView.Adapter adapterC;
        if (this.m == -1 || (adapterC = c()) == 0) {
            return;
        }
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            if (adapterC instanceof gme) {
                ((gme) adapterC).d(parcelable);
            }
            this.n = null;
        }
        int iMax = Math.max(0, Math.min(this.m, adapterC.getItemCount() - 1));
        this.a = iMax;
        this.m = -1;
        this.d.scrollToPosition(iMax);
        ((gms) this.h).Y();
    }

    public final int a() {
        return this.c.getOrientation() == 1 ? 1 : 0;
    }

    public final int b() {
        return this.e.b;
    }

    public final RecyclerView.Adapter c() {
        return this.d.getAdapter();
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.d.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.d.canScrollVertically(i);
    }

    public final void d(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.d.getAdapter();
        gli gliVar = this.h;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(((gms) gliVar).a);
        }
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.l);
        }
        this.d.setAdapter(adapter);
        this.a = 0;
        p();
        gms gmsVar = (gms) this.h;
        gmsVar.Y();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(gmsVar.a);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.l);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof gmv) {
            int i = ((gmv) parcelable).a;
            sparseArray.put(this.d.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        p();
    }

    public final void e(int i) {
        f(i, true);
    }

    public final void f(int i, boolean z) {
        k();
        g(i, z);
    }

    public final void g(int i, boolean z) {
        RecyclerView.Adapter adapterC = c();
        if (adapterC == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapterC.getItemCount() > 0) {
            int iMin = Math.min(Math.max(i, 0), adapterC.getItemCount() - 1);
            if (iMin == this.a && this.e.d()) {
                return;
            }
            int i2 = this.a;
            if (iMin == i2) {
                if (z) {
                    return;
                } else {
                    z = false;
                }
            }
            this.a = iMin;
            ((gms) this.h).Y();
            double d = i2;
            if (!this.e.d()) {
                gmj gmjVar = this.e;
                gmjVar.c();
                gmi gmiVar = gmjVar.c;
                d = gmiVar.a + gmiVar.b;
            }
            gmj gmjVar2 = this.e;
            gmjVar2.a = true != z ? 3 : 2;
            int i3 = gmjVar2.d;
            gmjVar2.d = iMin;
            gmjVar2.b(2);
            if (i3 != iMin) {
                gmjVar2.a(iMin);
            }
            if (!z) {
                this.d.scrollToPosition(iMin);
                return;
            }
            double d2 = iMin;
            if (Math.abs(d2 - d) <= 3.0d) {
                this.d.smoothScrollToPosition(iMin);
                return;
            }
            this.d.scrollToPosition(d2 > d ? iMin - 3 : iMin + 3);
            RecyclerView recyclerView = this.d;
            recyclerView.post(new gmw(iMin, recyclerView));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void h(int i) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.g = i;
        this.d.requestLayout();
    }

    public final void i() {
        PagerSnapHelper pagerSnapHelper = this.o;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewFindSnapView = pagerSnapHelper.findSnapView(this.c);
        if (viewFindSnapView == null) {
            return;
        }
        int position = this.c.getPosition(viewFindSnapView);
        if (position != this.a && b() == 0) {
            this.p.W(position);
        }
        this.b = false;
    }

    public final boolean j() {
        return this.c.getLayoutDirection() == 1;
    }

    public final void k() {
        Object obj = this.r.a;
    }

    public final void l() {
        this.f = false;
        ((gms) this.h).Y();
    }

    public final void m(gli gliVar) {
        this.k.a(gliVar);
    }

    public final void n(gli gliVar) {
        this.k.a.remove(gliVar);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        gli gliVar = this.h;
        cyq cyqVar = new cyq(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ((gms) gliVar).b;
        if (viewPager2.c() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.a() == 1) {
            itemCount = viewPager2.c().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.c().getItemCount();
            itemCount = 1;
        }
        cyqVar.v(cxe.k(itemCount, itemCount2, false, 0));
        RecyclerView.Adapter adapterC = viewPager2.c();
        if (adapterC == null || (itemCount3 = adapterC.getItemCount()) == 0 || !viewPager2.f) {
            return;
        }
        if (viewPager2.a > 0) {
            cyqVar.i(8192);
        }
        if (viewPager2.a < itemCount3 - 1) {
            cyqVar.i(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        }
        cyqVar.P(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight = this.d.getMeasuredHeight();
        Rect rect = this.i;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.j;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.d.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.b) {
            i();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.d, i, i2);
        int measuredWidth = this.d.getMeasuredWidth();
        int measuredHeight = this.d.getMeasuredHeight();
        int measuredState = this.d.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof gmv)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        gmv gmvVar = (gmv) parcelable;
        super.onRestoreInstanceState(gmvVar.getSuperState());
        this.m = gmvVar.b;
        this.n = gmvVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        gmv gmvVar = new gmv(super.onSaveInstanceState());
        gmvVar.a = this.d.getId();
        int i = this.m;
        if (i == -1) {
            i = this.a;
        }
        gmvVar.b = i;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            gmvVar.c = parcelable;
            return gmvVar;
        }
        Object adapter = this.d.getAdapter();
        if (adapter instanceof gme) {
            gmvVar.c = ((gme) adapter).a();
        }
        return gmvVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.h.f(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        gli gliVar = this.h;
        if (!gliVar.f(i)) {
            throw new IllegalStateException();
        }
        gms gmsVar = (gms) gliVar;
        gmsVar.a(gmsVar.b.a + (i == 8192 ? -1 : 1));
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((gms) this.h).Y();
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        RecyclerView recyclerView = this.d;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
        super.setOverScrollMode(i);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new gmg();
        this.b = false;
        this.l = new gmk(this);
        this.m = -1;
        this.f = true;
        this.g = -1;
        o(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new gmg();
        this.b = false;
        this.l = new gmk(this);
        this.m = -1;
        this.f = true;
        this.g = -1;
        o(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.i = new Rect();
        this.j = new Rect();
        this.k = new gmg();
        this.b = false;
        this.l = new gmk(this);
        this.m = -1;
        this.f = true;
        this.g = -1;
        o(context, attributeSet);
    }
}
