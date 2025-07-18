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
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.google.android.katniss.R;
import defpackage.acs;
import defpackage.agh;
import defpackage.agi;
import defpackage.agj;
import defpackage.aha;
import defpackage.ahc;
import defpackage.ahj;
import defpackage.ail;
import defpackage.aim;
import defpackage.ain;
import defpackage.aio;
import defpackage.aip;
import defpackage.aiq;
import defpackage.aiy;
import defpackage.ajc;
import defpackage.jv;
import defpackage.kj;
import defpackage.kk;
import defpackage.kl;
import defpackage.km;
import defpackage.kn;
import defpackage.ko;
import defpackage.nb;
import defpackage.nc;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements nb, agh, agi {
    static final int[] a;
    private static final ajc k;
    private static final Rect l;
    private ajc A;
    private ajc B;
    private ajc C;
    private OverScroller D;
    private final Runnable E;
    private final Runnable F;
    private final agj G;
    private final ko H;
    public int b;
    public ActionBarContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public km h;
    public ViewPropertyAnimator i;
    public final AnimatorListenerAdapter j;
    private int m;
    private ContentFrameLayout n;
    private nc o;
    private Drawable p;
    private boolean q;
    private int r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private final Rect v;
    private final Rect w;
    private boolean x;
    private boolean y;
    private ajc z;

    static {
        new Rect();
        a = new int[]{R.attr.actionBarSize, android.R.attr.windowContentOverlay};
        aiq aipVar = Build.VERSION.SDK_INT >= 34 ? new aip() : Build.VERSION.SDK_INT >= 31 ? new aio() : Build.VERSION.SDK_INT >= 30 ? new ain() : Build.VERSION.SDK_INT >= 29 ? new aim() : new ail();
        aipVar.c(acs.d(0, 1, 0, 1));
        k = aipVar.a();
        l = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    private final void u(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.p = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.D = new OverScroller(context);
    }

    private final boolean v(View view, int i, int i2, int i3, int i4) {
        boolean z;
        kn knVar = (kn) view.getLayoutParams();
        if (knVar.leftMargin != i) {
            knVar.leftMargin = i;
            z = true;
        } else {
            z = false;
        }
        if (knVar.topMargin != i2) {
            knVar.topMargin = i2;
            z = true;
        }
        if (knVar.rightMargin != i3) {
            knVar.rightMargin = i3;
            z = true;
        }
        if (knVar.bottomMargin == i4) {
            return z;
        }
        knVar.bottomMargin = i4;
        return true;
    }

    @Override // defpackage.nb
    public final void a() {
        i();
        this.o.f();
    }

    public final void b() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        ViewPropertyAnimator viewPropertyAnimator = this.i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.nb
    public final void c(int i) {
        i();
        if (i == 2) {
            this.o.h();
        } else if (i == 5) {
            this.o.g();
        } else {
            if (i != 109) {
                return;
            }
            this.d = true;
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kn;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.p != null) {
            int bottom = this.c.getVisibility() == 0 ? (int) (this.c.getBottom() + this.c.getTranslationY() + 0.5f) : 0;
            this.p.setBounds(0, bottom, getWidth(), this.p.getIntrinsicHeight() + bottom);
            this.p.draw(canvas);
        }
    }

    @Override // defpackage.agh
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // defpackage.agi
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        e(view, i, i2, i3, i4, i5);
    }

    @Override // defpackage.agh
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kn();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new kn(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.c;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        agj agjVar = this.G;
        return agjVar.b | agjVar.a;
    }

    public CharSequence getTitle() {
        i();
        return this.o.d();
    }

    @Override // defpackage.agh
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    final void i() {
        nc wrapper;
        if (this.n == null) {
            this.n = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.c = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof nc) {
                wrapper = (nc) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(String.valueOf(callbackFindViewById.getClass().getSimpleName())));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.o = wrapper;
        }
    }

    public final void j(boolean z) {
        if (z != this.q) {
            this.q = z;
            if (z) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    @Override // defpackage.nb
    public final void k(Menu menu, jv jvVar) {
        i();
        this.o.l(menu, jvVar);
    }

    @Override // defpackage.nb
    public final void l() {
        i();
        this.o.m();
    }

    @Override // defpackage.nb
    public final void m(Window.Callback callback) {
        i();
        this.o.p(callback);
    }

    @Override // defpackage.nb
    public final void n(CharSequence charSequence) {
        i();
        this.o.q(charSequence);
    }

    @Override // defpackage.nb
    public final boolean o() {
        i();
        return this.o.r();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        boolean zV;
        i();
        int windowSystemUiVisibility = getWindowSystemUiVisibility();
        int i = windowSystemUiVisibility & 256;
        int i2 = windowSystemUiVisibility & 1536;
        ajc ajcVar = k;
        int[] iArr = ahj.a;
        ko koVar = this.H;
        Rect rect = this.w;
        ahc.e(koVar, ajcVar, rect);
        boolean zEquals = rect.equals(l);
        this.x = !zEquals;
        boolean z = true;
        boolean z2 = i != 0;
        boolean z3 = zEquals || (z2 && i2 != 0);
        this.y = z3;
        km kmVar = this.h;
        if (kmVar != null) {
            kmVar.h((z2 || z3) ? false : true);
        }
        ajc ajcVarG = ajc.g(windowInsets, this);
        aiy aiyVar = ajcVarG.b;
        Rect rect2 = this.v;
        acs acsVarD = aiyVar.d();
        int i3 = acsVarD.b;
        int i4 = acsVarD.c;
        int i5 = acsVarD.d;
        rect2.set(i3, i4, i5, acsVarD.e);
        if (this.y) {
            acs acsVarA = aiyVar.a(2);
            int i6 = acsVarA.b;
            int i7 = acsVarA.d;
            this.c.setPadding(i3 - i6, i4, i5 - i7, 0);
            zV = v(this.c, i6, 0, i7, 0);
        } else {
            this.c.setPadding(0, 0, 0, 0);
            zV = v(this.c, i3, i4, i5, 0);
        }
        Rect rect3 = this.s;
        ahc.e(this, ajcVarG, rect3);
        ajc ajcVarE = aiyVar.e(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.z = ajcVarE;
        if (this.A.equals(ajcVarE)) {
            z = zV;
        } else {
            this.A = this.z;
        }
        Rect rect4 = this.t;
        if (rect4.equals(rect3)) {
            if (z) {
            }
            return aiyVar.s().b.o().b.n().e();
        }
        rect4.set(rect3);
        requestLayout();
        return aiyVar.s().b.o().b.n().e();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        u(getContext());
        int[] iArr = ahj.a;
        aha.c(this);
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
                kn knVar = (kn) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = knVar.leftMargin + paddingLeft;
                int i7 = knVar.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        i();
        measureChildWithMargins(this.c, i, 0, i2, 0);
        kn knVar = (kn) this.c.getLayoutParams();
        int iMax = Math.max(0, this.c.getMeasuredWidth() + knVar.leftMargin + knVar.rightMargin);
        int iMax2 = Math.max(0, this.c.getMeasuredHeight() + knVar.topMargin + knVar.bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.c.getMeasuredState());
        int[] iArr = ahj.a;
        boolean z = (getWindowSystemUiVisibility() & 256) != 0;
        if (z) {
            measuredHeight = this.m;
            if (this.y) {
                measuredHeight += this.v.top;
            }
        } else {
            measuredHeight = this.c.getVisibility() != 8 ? this.c.getMeasuredHeight() : 0;
        }
        Rect rect = this.u;
        rect.set(this.s);
        ajc ajcVar = this.z;
        this.B = ajcVar;
        if (this.d || z || !this.x) {
            acs acsVarD = this.y ? acs.d(ajcVar.b(), Math.max(this.B.d(), measuredHeight), this.B.c(), Math.max(this.B.a(), 0)) : acs.d(ajcVar.b(), this.B.d() + measuredHeight, this.B.c(), this.B.a());
            ajc ajcVar2 = this.B;
            aiq aipVar = Build.VERSION.SDK_INT >= 34 ? new aip(ajcVar2) : Build.VERSION.SDK_INT >= 31 ? new aio(ajcVar2) : Build.VERSION.SDK_INT >= 30 ? new ain(ajcVar2) : Build.VERSION.SDK_INT >= 29 ? new aim(ajcVar2) : new ail(ajcVar2);
            aipVar.c(acsVarD);
            this.B = aipVar.a();
        } else {
            if (this.y) {
                rect.top = Math.max(rect.top, measuredHeight);
                rect.bottom = Math.max(rect.bottom, 0);
            } else {
                rect.top += measuredHeight;
                rect.bottom = rect.bottom;
            }
            this.B = this.B.b.e(0, measuredHeight, 0, 0);
        }
        v(this.n, rect.left, rect.top, rect.right, rect.bottom);
        if (!this.C.equals(this.B)) {
            ajc ajcVar3 = this.B;
            this.C = ajcVar3;
            ahj.r(this.n, ajcVar3);
        }
        measureChildWithMargins(this.n, i, 0, i2, 0);
        kn knVar2 = (kn) this.n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.n.getMeasuredWidth() + knVar2.leftMargin + knVar2.rightMargin);
        int iMax4 = Math.max(iMax2, this.n.getMeasuredHeight() + knVar2.topMargin + knVar2.bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.q || !z) {
            return false;
        }
        this.D.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.D.getFinalY() > this.c.getHeight()) {
            b();
            this.F.run();
        } else {
            b();
            this.E.run();
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
        int i5 = this.r + i2;
        this.r = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.G.a(i, 0);
        this.r = getActionBarHideOffset();
        b();
        km kmVar = this.h;
        if (kmVar != null) {
            kmVar.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.c.getVisibility() != 0) {
            return false;
        }
        return this.q;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.q || this.f) {
            return;
        }
        if (this.r <= this.c.getHeight()) {
            b();
            postDelayed(this.E, 600L);
        } else {
            b();
            postDelayed(this.F, 600L);
        }
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        i();
        int i2 = this.g ^ i;
        this.g = i;
        km kmVar = this.h;
        if (kmVar != null) {
            boolean z = (i & 256) != 0;
            int i3 = i & 4;
            kmVar.h((z || this.y) ? false : true);
            if (i3 == 0 || !z) {
                this.h.n();
            } else {
                this.h.i();
            }
        }
        if ((i2 & 256) == 0 || this.h == null) {
            return;
        }
        int[] iArr = ahj.a;
        aha.c(this);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        km kmVar = this.h;
        if (kmVar != null) {
            kmVar.k(i);
        }
    }

    @Override // defpackage.nb
    public final boolean p() {
        i();
        return this.o.t();
    }

    @Override // defpackage.nb
    public final boolean q() {
        i();
        return this.o.u();
    }

    @Override // defpackage.nb
    public final boolean r() {
        i();
        return this.o.v();
    }

    @Override // defpackage.agh
    public final boolean s(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.c.setTranslationY(-Math.max(0, Math.min(i, this.c.getHeight())));
    }

    public void setIcon(int i) {
        i();
        this.o.j(i);
    }

    public void setLogo(int i) {
        i();
        this.o.k(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // defpackage.nb
    public final boolean t() {
        i();
        return this.o.w();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.v = new Rect();
        this.w = new Rect();
        this.x = true;
        this.y = false;
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        ajc ajcVar = ajc.a;
        this.z = ajcVar;
        this.A = ajcVar;
        this.B = ajcVar;
        this.C = ajcVar;
        this.j = new kj(this);
        this.E = new kk(this);
        this.F = new kl(this);
        u(context);
        this.G = new agj();
        ko koVar = new ko(context);
        this.H = koVar;
        addView(koVar);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new kn(layoutParams);
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // defpackage.agh
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
    }
}
