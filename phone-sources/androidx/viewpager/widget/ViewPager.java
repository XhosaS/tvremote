package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import defpackage.bxy;
import defpackage.cwm;
import defpackage.cwt;
import defpackage.cww;
import defpackage.gfe;
import defpackage.gll;
import defpackage.glm;
import defpackage.gln;
import defpackage.glo;
import defpackage.glp;
import defpackage.glq;
import defpackage.glr;
import defpackage.gls;
import defpackage.glt;
import defpackage.glu;
import defpackage.tbk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {R.attr.layout_gravity};
    private static final Comparator h = new bxy(9);
    private static final Interpolator i = new glm(0);
    private int A;
    private int B;
    private int C;
    private final boolean D;
    private float E;
    private float F;
    private float G;
    private float H;
    private int I;
    private VelocityTracker J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private int Q;
    private final Runnable R;
    private int S;
    public gll b;
    public int c;
    public EdgeEffect d;
    public EdgeEffect e;
    public List f;
    public List g;
    private int j;
    private final ArrayList k;
    private final glp l;
    private final Rect m;
    private int n;
    private Parcelable o;
    private Scroller p;
    private boolean q;
    private glt r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private boolean w;
    private final int x;
    private boolean y;
    private boolean z;

    public ViewPager(Context context) {
        super(context);
        this.k = new ArrayList();
        this.l = new glp();
        this.m = new Rect();
        this.n = -1;
        this.o = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.x = 1;
        this.D = true;
        this.I = -1;
        this.O = true;
        this.R = new gfe(this, 3, null);
        this.S = 0;
        q(context);
    }

    private final void A(boolean z) {
        if (this.v != z) {
            this.v = z;
        }
    }

    private final boolean B(int i2) {
        if (this.k.size() == 0) {
            if (this.O) {
                return false;
            }
            this.P = false;
            s(0, 0.0f);
            if (this.P) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        glp glpVarV = v();
        float fT = t();
        int i3 = glpVarV.b;
        float f = (i2 / fT) - glpVarV.e;
        float f2 = glpVarV.d;
        this.P = false;
        s(i3, f / (f2 + (0.0f / fT)));
        if (this.P) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean C(float f, float f2) {
        boolean z;
        float f3 = this.E - f;
        this.E = f;
        float width = f3 / getWidth();
        float height = f2 / getHeight();
        float fD = (cwt.c(this.d) != 0.0f ? -cwt.d(this.d, -width, 1.0f - height) : cwt.c(this.e) != 0.0f ? cwt.d(this.e, width, height) : 0.0f) * getWidth();
        float f4 = f3 - fD;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = fD != 0.0f;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float fT = t();
        float f5 = this.s * fT;
        float f6 = this.t * fT;
        ArrayList arrayList = this.k;
        glp glpVar = (glp) arrayList.get(0);
        glp glpVar2 = (glp) arrayList.get(arrayList.size() - 1);
        if (glpVar.b != 0) {
            f5 = glpVar.e * fT;
            z = false;
        } else {
            z = true;
        }
        if (glpVar2.b != this.b.j() - 1) {
            f6 = glpVar2.e * fT;
        } else {
            z2 = true;
        }
        if (scrollX < f5) {
            if (z) {
                cwt.d(this.d, (f5 - scrollX) / fT, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z2) {
                cwt.d(this.e, (scrollX - f6) / fT, f2 / getHeight());
            } else {
                z3 = z4;
            }
            scrollX = f6;
        } else {
            z3 = z4;
        }
        int i2 = (int) scrollX;
        this.E += scrollX - i2;
        scrollTo(i2, getScrollY());
        B(i2);
        return z3;
    }

    private final boolean D() {
        this.I = -1;
        this.y = false;
        this.z = false;
        VelocityTracker velocityTracker = this.J;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.J = null;
        }
        this.d.onRelease();
        this.e.onRelease();
        return (this.d.isFinished() && this.e.isFinished()) ? false : true;
    }

    private final void E() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int t() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.glp v() {
        /*
            r14 = this;
            int r0 = r14.t()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r14.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L16
            float r0 = (float) r0
            float r0 = r1 / r0
            goto L17
        L16:
            r0 = r1
        L17:
            r3 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r3
            r10 = r4
            r9 = r5
            r7 = r6
            r6 = r1
        L20:
            java.util.ArrayList r11 = r14.k
            int r12 = r11.size()
            if (r8 >= r12) goto L68
            java.lang.Object r12 = r11.get(r8)
            glp r12 = (defpackage.glp) r12
            if (r9 != 0) goto L43
            int r13 = r12.b
            int r10 = r10 + r5
            if (r13 == r10) goto L43
            glp r12 = r14.l
            float r1 = r1 + r6
            float r1 = r1 + r0
            r12.e = r1
            r12.b = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r12.d = r1
            int r8 = r8 + (-1)
        L43:
            r6 = r12
            float r1 = r6.e
            float r10 = r6.d
            float r10 = r10 + r1
            float r10 = r10 + r0
            if (r9 != 0) goto L50
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L68
        L50:
            int r7 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r7 < 0) goto L67
            int r7 = r11.size()
            int r7 = r7 + r4
            if (r8 != r7) goto L5c
            goto L67
        L5c:
            int r10 = r6.b
            float r7 = r6.d
            int r8 = r8 + 1
            r9 = r7
            r7 = r6
            r6 = r9
            r9 = r3
            goto L20
        L67:
            return r6
        L68:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.v():glp");
    }

    private final void w(boolean z) {
        boolean z2 = this.S == 2;
        if (z2) {
            A(false);
            if (!this.p.isFinished()) {
                this.p.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.p.getCurrX();
                int currY = this.p.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.w = false;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            glp glpVar = (glp) arrayList.get(i2);
            if (glpVar.c) {
                glpVar.c = false;
                z2 = true;
            }
            i2++;
        }
        if (z2) {
            if (!z) {
                this.R.run();
                return;
            }
            Runnable runnable = this.R;
            int[] iArr = cww.a;
            postOnAnimation(runnable);
        }
    }

    private final void x(int i2) {
        List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                gls glsVar = (gls) this.f.get(i3);
                if (glsVar != null) {
                    glsVar.b(i2);
                }
            }
        }
    }

    private final void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.E = motionEvent.getX(i2);
            this.I = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.J;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void z(int i2, boolean z, int i3, boolean z2) throws Resources.NotFoundException {
        int scrollX;
        int i4;
        int iAbs;
        glp glpVarC = c(i2);
        int iT = glpVarC != null ? (int) (t() * Math.max(this.s, Math.min(glpVarC.e, this.t))) : 0;
        if (!z) {
            if (z2) {
                x(i2);
            }
            w(false);
            scrollTo(iT, 0);
            B(iT);
            return;
        }
        if (getChildCount() == 0) {
            A(false);
        } else {
            Scroller scroller = this.p;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.q ? this.p.getCurrX() : this.p.getStartX();
                this.p.abortAnimation();
                A(false);
            }
            int i5 = scrollX;
            int scrollY = getScrollY();
            int i6 = iT - i5;
            int i7 = -scrollY;
            if (i6 != 0) {
                i4 = i6;
            } else if (i7 == 0) {
                w(false);
                f();
                l(0);
            } else {
                i4 = 0;
            }
            A(true);
            l(2);
            int iT2 = t();
            int i8 = iT2 / 2;
            float f = iT2;
            float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i4) / f) - 0.5f) * 0.47123894f);
            int iAbs2 = Math.abs(i3);
            if (iAbs2 > 0) {
                float f2 = i8;
                iAbs = Math.round(Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) * 4;
            } else {
                iAbs = (int) (((Math.abs(i4) / (f + 0.0f)) + 1.0f) * 100.0f);
            }
            int iMin = Math.min(iAbs, 600);
            this.q = false;
            this.p.startScroll(i5, scrollY, i4, i7, iMin);
            postInvalidateOnAnimation();
        }
        if (z2) {
            x(i2);
        }
    }

    final glp a(int i2, int i3) {
        glp glpVar = new glp();
        glpVar.b = i2;
        glpVar.a = this.b.c(this, i2);
        glpVar.d = 1.0f;
        if (i3 >= 0) {
            ArrayList arrayList = this.k;
            if (i3 < arrayList.size()) {
                arrayList.add(i3, glpVar);
                return glpVar;
            }
        }
        this.k.add(glpVar);
        return glpVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        glp glpVarB;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (glpVarB = b(childAt)) != null && glpVarB.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        glp glpVarB;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (glpVarB = b(childAt)) != null && glpVarB.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new glq();
        }
        glq glqVar = (glq) layoutParams;
        boolean z = glqVar.a | (view.getClass().getAnnotation(glo.class) != null);
        glqVar.a = z;
        if (!this.u) {
            super.addView(view, i2, layoutParams);
        } else {
            if (glqVar != null && z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            glqVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public final glp b(View view) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            glp glpVar = (glp) arrayList.get(i2);
            if (this.b.e(view, glpVar.a)) {
                return glpVar;
            }
            i2++;
        }
    }

    final glp c(int i2) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i3 >= arrayList.size()) {
                return null;
            }
            glp glpVar = (glp) arrayList.get(i3);
            if (glpVar.b == i2) {
                return glpVar;
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int iT = t();
        int scrollX = getScrollX();
        return i2 < 0 ? scrollX > ((int) (((float) iT) * this.s)) : i2 > 0 && scrollX < ((int) (((float) iT) * this.t));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof glq) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.q = true;
        if (this.p.isFinished() || !this.p.computeScrollOffset()) {
            w(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.p.getCurrX();
        int currY = this.p.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.p.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public final void d(gls glsVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(glsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.m(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.m(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.p()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.m(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.o()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.m(r6)
            goto L5b
        L5a:
            r6 = r2
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        glp glpVarB;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (glpVarB = b(childAt)) != null && glpVarB.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        gll gllVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (gllVar = this.b) == null || gllVar.j() <= 1)) {
            this.d.finish();
            this.e.finish();
            return;
        }
        if (this.d.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.s * width);
            this.d.setSize(height, width);
            zDraw = this.d.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.e.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.t + 1.0f)) * width2);
            this.e.setSize(height2, width2);
            zDraw |= this.e.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    public final void e() throws Resources.NotFoundException {
        int iJ = this.b.j();
        this.j = iJ;
        int i2 = this.x;
        ArrayList arrayList = this.k;
        boolean z = arrayList.size() < (i2 + i2) + 1 && arrayList.size() < iJ;
        int iMax = this.c;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < arrayList.size()) {
            glp glpVar = (glp) arrayList.get(i3);
            int iK = this.b.k(glpVar.a);
            if (iK != -1) {
                if (iK == -2) {
                    arrayList.remove(i3);
                    i3--;
                    if (!z2) {
                        this.b.d(this);
                    }
                    gll gllVar = this.b;
                    int i4 = glpVar.b;
                    gllVar.f(this, glpVar.a);
                    int i5 = this.c;
                    if (i5 == glpVar.b) {
                        iMax = Math.max(0, Math.min(i5, (-1) + iJ));
                    }
                    z = true;
                    z2 = true;
                } else {
                    int i6 = glpVar.b;
                    if (i6 != iK) {
                        if (i6 == this.c) {
                            iMax = iK;
                        }
                        glpVar.b = iK;
                        z = true;
                    }
                }
            }
            i3++;
        }
        if (z2) {
            this.b.g();
        }
        Collections.sort(arrayList, h);
        if (z) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                glq glqVar = (glq) getChildAt(i7).getLayoutParams();
                if (!glqVar.a) {
                    glqVar.c = 0.0f;
                }
            }
            j(iMax, false, true);
            requestLayout();
        }
    }

    public final void f() throws Resources.NotFoundException {
        g(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x0174 A[PHI: r4
  0x0174: PHI (r4v15 float) = (r4v14 float), (r4v17 float) binds: [B:97:0x016b, B:94:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void g(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(int):void");
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new glq();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new glq(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public final void h(gll gllVar) throws Resources.NotFoundException {
        ArrayList arrayList;
        gll gllVar2 = this.b;
        if (gllVar2 != null) {
            gllVar2.m(null);
            this.b.d(this);
            int i2 = 0;
            while (true) {
                arrayList = this.k;
                if (i2 >= arrayList.size()) {
                    break;
                }
                glp glpVar = (glp) arrayList.get(i2);
                gll gllVar3 = this.b;
                int i3 = glpVar.b;
                gllVar3.f(this, glpVar.a);
                i2++;
            }
            this.b.g();
            arrayList.clear();
            int i4 = 0;
            while (i4 < getChildCount()) {
                if (!((glq) getChildAt(i4).getLayoutParams()).a) {
                    removeViewAt(i4);
                    i4--;
                }
                i4++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = gllVar;
        this.j = 0;
        if (gllVar != null) {
            if (this.r == null) {
                this.r = new glt(this);
            }
            this.b.m(this.r);
            this.w = false;
            boolean z = this.O;
            this.O = true;
            this.j = this.b.j();
            if (this.n >= 0) {
                this.b.h(this.o);
                j(this.n, false, true);
                this.n = -1;
                this.o = null;
            } else if (z) {
                requestLayout();
            } else {
                f();
            }
        }
        List list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.g.size();
        for (int i5 = 0; i5 < size; i5++) {
            tbk tbkVar = (tbk) this.g.get(i5);
            TabLayout tabLayout = (TabLayout) tbkVar.b;
            if (tabLayout.C == this) {
                tabLayout.m(gllVar, tbkVar.a);
            }
        }
    }

    public final void i(int i2) throws Resources.NotFoundException {
        this.w = false;
        j(i2, !this.O, false);
    }

    final void j(int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        k(i2, z, z2, 0);
    }

    final void k(int i2, boolean z, boolean z2, int i3) throws Resources.NotFoundException {
        gll gllVar = this.b;
        if (gllVar == null || gllVar.j() <= 0) {
            A(false);
            return;
        }
        if (!z2 && this.c == i2 && this.k.size() != 0) {
            A(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.b.j()) {
            i2 = this.b.j() - 1;
        }
        int i4 = this.x;
        int i5 = this.c;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.k;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((glp) arrayList.get(i6)).c = true;
                i6++;
            }
        }
        boolean z3 = this.c != i2;
        if (!this.O) {
            g(i2);
            z(i2, z, i3, z3);
        } else {
            this.c = i2;
            if (z3) {
                x(i2);
            }
            requestLayout();
        }
    }

    public final void l(int i2) {
        if (this.S == i2) {
            return;
        }
        this.S = i2;
        List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                gls glsVar = (gls) this.f.get(i3);
                if (glsVar != null) {
                    glsVar.a(i2);
                }
            }
        }
    }

    public final boolean m(int i2) throws Resources.NotFoundException {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            for (ViewParent parent = viewFindFocus.getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(viewFindFocus.getClass().getSimpleName());
            for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                sb.append(" => ");
                sb.append(parent2.getClass().getSimpleName());
            }
            Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        boolean zO = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                zO = o();
            } else if (i2 == 66 || i2 == 2) {
                zO = p();
            }
        } else if (i2 == 17) {
            Rect rect = this.m;
            zO = (viewFindFocus == null || u(rect, viewFindNextFocus).left < u(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : o();
        } else if (i2 == 66) {
            Rect rect2 = this.m;
            zO = (viewFindFocus == null || u(rect2, viewFindNextFocus).left > u(rect2, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : p();
        }
        if (zO) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zO;
    }

    protected final boolean n(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && n(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    public boolean o() throws Resources.NotFoundException {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        r(i2 - 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.R);
        Scroller scroller = this.p;
        if (scroller != null && !scroller.isFinished()) {
            this.p.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            D();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.G = x;
            this.E = x;
            float y = motionEvent.getY();
            this.H = y;
            this.F = y;
            this.I = motionEvent.getPointerId(0);
            this.z = false;
            this.q = true;
            this.p.computeScrollOffset();
            if (this.S == 2 && Math.abs(this.p.getFinalX() - this.p.getCurrX()) > this.N) {
                this.p.abortAnimation();
                this.w = false;
                f();
                this.y = true;
                E();
                l(1);
            } else if (cwt.c(this.d) == 0.0f && cwt.c(this.e) == 0.0f) {
                w(false);
                this.y = false;
            } else {
                this.y = true;
                l(1);
                if (cwt.c(this.d) != 0.0f) {
                    cwt.d(this.d, 0.0f, 1.0f - (this.F / getHeight()));
                }
                if (cwt.c(this.e) != 0.0f) {
                    cwt.d(this.e, 0.0f, this.F / getHeight());
                }
            }
        } else {
            if (this.y) {
                return true;
            }
            if (this.z) {
                return false;
            }
            if (action == 2) {
                int i2 = this.I;
                if (i2 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.E;
                    float fAbs = Math.abs(f);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y2 - this.H);
                    if (f != 0.0f) {
                        float f2 = this.E;
                        if ((this.D || ((f2 >= this.B || f <= 0.0f) && (f2 <= getWidth() - this.B || f >= 0.0f))) && n(this, false, (int) f, (int) x2, (int) y2)) {
                            this.E = x2;
                            this.F = y2;
                            this.z = true;
                            return false;
                        }
                    }
                    float f3 = this.C;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.y = true;
                        E();
                        l(1);
                        this.E = f > 0.0f ? this.G + this.C : this.G - this.C;
                        this.F = y2;
                        A(true);
                    } else if (fAbs2 > f3) {
                        this.z = true;
                    }
                    if (this.y && C(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                y(motionEvent);
            }
        }
        if (this.J == null) {
            this.J = VelocityTracker.obtain();
        }
        this.J.addMovement(motionEvent);
        return this.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) throws Resources.NotFoundException {
        glq glqVar;
        glq glqVar2;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i2), getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.B = Math.min(measuredWidth / 10, this.A);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (glqVar2 = (glq) childAt.getLayoutParams()) != null && glqVar2.a) {
                int i9 = glqVar2.b;
                int i10 = i9 & 7;
                int i11 = i9 & android.support.v7.appcompat.R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                boolean z3 = (i11 == 48 || i11 == 80) ? true : z;
                if (i10 != 3 && i10 != 5) {
                    z2 = z;
                }
                int i12 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (glqVar2.width != -2) {
                    i5 = glqVar2.width != -1 ? glqVar2.width : paddingLeft;
                    i12 = 1073741824;
                } else {
                    i5 = paddingLeft;
                }
                if (glqVar2.height != -2) {
                    i6 = glqVar2.height != -1 ? glqVar2.height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i4;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i12), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.u = true;
        f();
        this.u = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((glqVar = (glq) childAt2.getLayoutParams()) == null || !glqVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * glqVar.c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        int i5;
        glp glpVarB;
        int i6 = i2 & 2;
        int childCount = getChildCount();
        if (i6 != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (glpVarB = b(childAt)) != null && glpVarB.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof glu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        glu gluVar = (glu) parcelable;
        super.onRestoreInstanceState(gluVar.getSuperState());
        gll gllVar = this.b;
        if (gllVar == null) {
            this.n = gluVar.a;
            this.o = gluVar.b;
            ClassLoader classLoader = gluVar.c;
        } else {
            Parcelable parcelable2 = gluVar.b;
            ClassLoader classLoader2 = gluVar.c;
            gllVar.h(parcelable2);
            j(gluVar.a, false, true);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        glu gluVar = new glu(super.onSaveInstanceState());
        gluVar.a = this.c;
        gll gllVar = this.b;
        if (gllVar != null) {
            gluVar.b = gllVar.a();
        }
        return gluVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 > 0 && !this.k.isEmpty()) {
                if (!this.p.isFinished()) {
                    this.p.setFinalX(this.c * t());
                    return;
                }
                scrollTo((int) ((getScrollX() / ((i4 - getPaddingLeft()) - getPaddingRight())) * ((i2 - getPaddingLeft()) - getPaddingRight())), getScrollY());
                return;
            }
            glp glpVarC = c(this.c);
            int iMin = (int) ((glpVarC != null ? Math.min(glpVarC.e, this.t) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                w(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p() throws Resources.NotFoundException {
        if (this.b == null || this.c >= r0.j() - 1) {
            return false;
        }
        r(this.c + 1);
        return true;
    }

    final void q(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.p = new Scroller(context, i);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.C = viewConfiguration.getScaledPagingTouchSlop();
        this.K = (int) (400.0f * f);
        this.L = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = new EdgeEffect(context);
        this.e = new EdgeEffect(context);
        this.M = (int) (25.0f * f);
        this.N = (int) (f + f);
        this.A = (int) (f * 16.0f);
        cww.p(this, new glr(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        cwm.l(this, new gln(this));
    }

    public final void r(int i2) throws Resources.NotFoundException {
        this.w = false;
        j(i2, true, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.u) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void s(int r13, float r14) {
        /*
            r12 = this;
            int r0 = r12.Q
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6a
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6a
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            glq r9 = (defpackage.glq) r9
            boolean r10 = r9.a
            if (r10 == 0) goto L67
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L4c
            r10 = 3
            if (r9 == r10) goto L46
            r10 = 5
            if (r9 == r10) goto L39
            r9 = r3
            goto L5b
        L39:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L58
        L46:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5b
        L4c:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L58:
            r11 = r9
            r9 = r3
            r3 = r11
        L5b:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L66
            r8.offsetLeftAndRight(r3)
        L66:
            r3 = r9
        L67:
            int r7 = r7 + 1
            goto L1b
        L6a:
            java.util.List r0 = r12.f
            if (r0 == 0) goto L84
            int r0 = r0.size()
        L72:
            if (r1 >= r0) goto L84
            java.util.List r3 = r12.f
            java.lang.Object r3 = r3.get(r1)
            gls r3 = (defpackage.gls) r3
            if (r3 == 0) goto L81
            r3.c(r13, r14)
        L81:
            int r1 = r1 + 1
            goto L72
        L84:
            r12.P = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.s(int, float):void");
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new glq();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new ArrayList();
        this.l = new glp();
        this.m = new Rect();
        this.n = -1;
        this.o = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.x = 1;
        this.D = true;
        this.I = -1;
        this.O = true;
        this.R = new gfe(this, 3, null);
        this.S = 0;
        q(context);
    }
}
