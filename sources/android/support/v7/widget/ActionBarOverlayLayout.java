package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.tv.remote.service.R;
import defpackage.ac;
import defpackage.ct;
import defpackage.dg;
import defpackage.du;
import defpackage.ef;
import defpackage.es;
import defpackage.et;
import defpackage.eu;
import defpackage.ev;
import defpackage.fa;
import defpackage.gt;
import defpackage.jr;
import defpackage.jx;
import defpackage.nt;
import defpackage.pt;
import defpackage.pu;
import defpackage.pv;
import defpackage.qk;
import defpackage.qm;
import defpackage.qv;
import defpackage.rp;
import defpackage.rq;
import defpackage.rr;
import defpackage.rs;
import defpackage.rt;
import defpackage.ru;
import defpackage.sc;
import defpackage.sf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements gt, pt, pu {
    static final int[] a;
    private static final sf k;
    private static final Rect l;
    private sf A;
    private sf B;
    private OverScroller C;
    private final Runnable D;
    private final Runnable E;
    private final pv F;
    private final ev G;
    private jx H;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public et h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int m;
    private ContentFrameLayout n;
    private Drawable o;
    private boolean p;
    private int q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private boolean w;
    private boolean x;
    private sf y;
    private sf z;

    static {
        new Rect();
        a = new int[]{R.attr.actionBarSize, android.R.attr.windowContentOverlay};
        ru rtVar = Build.VERSION.SDK_INT >= 34 ? new rt() : Build.VERSION.SDK_INT >= 31 ? new rs() : Build.VERSION.SDK_INT >= 30 ? new rr() : Build.VERSION.SDK_INT >= 29 ? new rq() : new rp();
        rtVar.c(nt.d(0, 1, 0, 1));
        k = rtVar.a();
        l = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void v(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.o = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.C = new OverScroller(context);
    }

    private static final boolean w(View view, int i, int i2, int i3, int i4) {
        boolean z;
        eu euVar = (eu) view.getLayoutParams();
        if (euVar.leftMargin != i) {
            euVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (euVar.topMargin != i2) {
            euVar.topMargin = i2;
            z = true;
        }
        if (euVar.rightMargin != i3) {
            euVar.rightMargin = i3;
            z = true;
        }
        if (euVar.bottomMargin == i4) {
            return z;
        }
        euVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.gt
    public final void a() {
        i();
        ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void b() {
        removeCallbacks(this.D);
        removeCallbacks(this.E);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.gt
    public final void c(int i) {
        i();
        if (i == 2) {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            this.d = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eu;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.o != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.o.setBounds(0, bottom, getWidth(), this.o.getIntrinsicHeight() + bottom);
            this.o.draw(canvas);
        }
    }

    @Override // defpackage.pt
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.pu
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.pt
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eu();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new eu(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.F.a();
    }

    @Override // defpackage.pt
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View viewFindViewById = findViewById(R.id.action_bar);
            if (!(viewFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(viewFindViewById.getClass().getSimpleName())));
            }
            this.H = ((Toolbar) viewFindViewById).x();
        }
    }

    public final void j(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public final void k(boolean z) {
        if (z != this.p) {
            this.p = z;
            if (z) {
                return;
            }
            b();
            j(0);
        }
    }

    @Override // defpackage.gt
    public final void l(Menu menu, ef efVar) {
        i();
        jx jxVar = this.H;
        if (jxVar.f == null) {
            jxVar.f = new fa(jxVar.a.getContext());
        }
        fa faVar = jxVar.f;
        faVar.e = efVar;
        Toolbar toolbar = jxVar.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.l();
        du duVar = toolbar.a.a;
        if (duVar == menu) {
            return;
        }
        if (duVar != null) {
            duVar.m(toolbar.t);
            duVar.m(toolbar.u);
        }
        if (toolbar.u == null) {
            toolbar.u = new jr(toolbar);
        }
        faVar.o();
        if (menu != null) {
            du duVar2 = (du) menu;
            duVar2.h(faVar, toolbar.j);
            duVar2.h(toolbar.u, toolbar.j);
        } else {
            faVar.b(toolbar.j, null);
            toolbar.u.b(toolbar.j, null);
            faVar.i();
            toolbar.u.i();
        }
        toolbar.a.i(toolbar.k);
        toolbar.a.j(faVar);
        toolbar.t = faVar;
        toolbar.t();
    }

    @Override // defpackage.gt
    public final void m() {
        i();
        this.H.e = true;
    }

    @Override // defpackage.gt
    public final void n(Window.Callback callback) {
        i();
        this.H.d = callback;
    }

    @Override // defpackage.gt
    public final void o(CharSequence charSequence) {
        i();
        this.H.f(charSequence);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zW;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        sf sfVar = k;
        int[] iArr = qv.a;
        ev evVar = this.G;
        Rect rect = this.v;
        qm.d(evVar, sfVar, rect);
        boolean zEquals = rect.equals(l);
        this.w = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.x = z3;
        et etVar = this.h;
        if (etVar != null) {
            ((ct) etVar).j = (z2 || z3) ? false : true;
        }
        sf sfVarO = sf.o(windowInsets, this);
        sc scVar = sfVarO.b;
        Rect rect2 = this.u;
        nt ntVarD = scVar.d();
        int i3 = ntVarD.b;
        int i4 = ntVarD.c;
        int i5 = ntVarD.d;
        rect2.set(i3, i4, i5, ntVarD.e);
        if (this.x) {
            nt ntVarF = sfVarO.f(2);
            int i6 = ntVarF.b;
            int i7 = ntVarF.d;
            this.c.setPadding(i3 - i6, i4, i5 - i7, 0);
            zW = w(this.c, i6, 0, i7, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            zW = w(this.c, i3, i4, i5, 0);
        }
        Rect rect3 = this.r;
        qm.d(this, sfVarO, rect3);
        sf sfVarM = sfVarO.m(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.y = sfVarM;
        if (this.z.equals(sfVarM)) {
            z = zW;
        } else {
            this.z = this.y;
        }
        Rect rect4 = this.s;
        if (rect4.equals(rect3)) {
            if (z) {
            }
            return sfVarO.j().l().k().e();
        }
        rect4.set(rect3);
        requestLayout();
        return sfVarO.j().l().k().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        int[] iArr = qv.a;
        qk.j(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                eu euVar = (eu) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = euVar.leftMargin + paddingLeft;
                int i7 = euVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        eu euVar = (eu) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + euVar.leftMargin + euVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + euVar.topMargin + euVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = qv.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.x) {
                measuredHeight += this.u.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        Rect rect = this.t;
        rect.set(this.r);
        sf sfVar = this.y;
        this.A = sfVar;
        if (this.d || z || !this.w) {
            nt ntVarD = this.x ? nt.d(sfVar.b(), Math.max(this.A.d(), measuredHeight), this.A.c(), Math.max(this.A.a(), 0)) : nt.d(sfVar.b(), this.A.d() + measuredHeight, this.A.c(), this.A.a());
            sf sfVar2 = this.A;
            ru rtVar = Build.VERSION.SDK_INT >= 34 ? new rt(sfVar2) : Build.VERSION.SDK_INT >= 31 ? new rs(sfVar2) : Build.VERSION.SDK_INT >= 30 ? new rr(sfVar2) : Build.VERSION.SDK_INT >= 29 ? new rq(sfVar2) : new rp(sfVar2);
            rtVar.c(ntVarD);
            this.A = rtVar.a();
        } else {
            if (this.x) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.A = this.A.m(0, measuredHeight, 0, 0);
        }
        w(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.B.equals(this.A)) {
            sf sfVar3 = this.A;
            this.B = sfVar3;
            qv.q(this.n, sfVar3);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        eu euVar2 = (eu) this.n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.n.getMeasuredWidth() + euVar2.leftMargin + euVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.n.getMeasuredHeight() + euVar2.topMargin + euVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.p || !z) {
            return false;
        }
        this.C.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.C.getFinalY() > this.c.getHeight()) {
            b();
            this.E.run();
        } else {
            b();
            this.D.run();
        }
        this.f = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.q + i2;
        this.q = i5;
        j(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ct ctVar;
        dg dgVar;
        this.F.b(i, 0);
        ActionBarContainer actionBarContainer = this.c;
        this.q = actionBarContainer != null ? -((int) actionBarContainer.getTranslationY()) : 0;
        b();
        et etVar = this.h;
        if (etVar == null || (dgVar = (ctVar = (ct) etVar).l) == null) {
            return;
        }
        dgVar.a();
        ctVar.l = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.p || this.f) {
            return;
        }
        if (this.q <= this.c.getHeight()) {
            b();
            postDelayed(this.D, 600L);
        } else {
            b();
            postDelayed(this.E, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        et etVar = this.h;
        if (etVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            ct ctVar = (ct) etVar;
            ctVar.j = (z || this.x) ? false : true;
            if (i3 == 0 || !z) {
                if (ctVar.k) {
                    ctVar.k = false;
                    ctVar.i(true);
                }
            } else if (!ctVar.k) {
                ctVar.k = true;
                ctVar.i(true);
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int[] iArr = qv.a;
        qk.j(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        et etVar = this.h;
        if (etVar != null) {
            ((ct) etVar).i = i;
        }
    }

    @Override // defpackage.gt
    public final boolean p() {
        ActionMenuView actionMenuView;
        i();
        Toolbar toolbar = this.H.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.gt
    public final boolean q() {
        fa faVar;
        i();
        ActionMenuView actionMenuView = this.H.a.a;
        return (actionMenuView == null || (faVar = actionMenuView.c) == null || !faVar.k()) ? false : true;
    }

    @Override // defpackage.gt
    public final boolean r() {
        fa faVar;
        i();
        ActionMenuView actionMenuView = this.H.a.a;
        if (actionMenuView == null || (faVar = actionMenuView.c) == null) {
            return false;
        }
        return faVar.k != null || faVar.l();
    }

    @Override // defpackage.gt
    public final boolean s() {
        i();
        return this.H.a.v();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.pt
    public final boolean t(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // defpackage.gt
    public final boolean u() {
        i();
        return this.H.a.w();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = true;
        this.x = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        sf sfVar = sf.a;
        this.y = sfVar;
        this.z = sfVar;
        this.A = sfVar;
        this.B = sfVar;
        this.j = new es(this);
        this.D = new ac(this, 6, null);
        this.E = new ac(this, 7, null);
        v(context);
        this.F = new pv();
        ev evVar = new ev(context);
        this.G = evVar;
        addView(evVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new eu(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.pt
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
