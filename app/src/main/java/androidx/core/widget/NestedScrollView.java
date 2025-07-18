package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import defpackage.acya;
import defpackage.acyb;
import defpackage.acyr;
import defpackage.acys;
import defpackage.afw;
import defpackage.agf;
import defpackage.agg;
import defpackage.agi;
import defpackage.agj;
import defpackage.agq;
import defpackage.ahj;
import defpackage.akv;
import defpackage.akx;
import defpackage.aky;
import defpackage.akz;
import defpackage.ala;
import defpackage.mpu;
import defpackage.mpy;
import defpackage.nyx;
import defpackage.oaa;
import defpackage.oal;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements agi {
    private static final float i = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final akx j = new akx();
    private static final int[] k = {R.attr.fillViewport};
    private final int[] A;
    private final int[] B;
    private int C;
    private int D;
    private SavedState E;
    private final agj F;
    private float G;
    public OverScroller a;
    public EdgeEffect b;
    public EdgeEffect c;
    agq d;
    public final agg e;
    final akz f;
    afw g;
    public mpu h;
    private final float l;
    private long m;
    private final Rect n;
    private int o;
    private boolean p;
    private boolean q;
    private View r;
    private boolean s;
    private VelocityTracker t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    public NestedScrollView(Context context) {
        this(context, null);
    }

    private final void A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.o = (int) motionEvent.getY(i2);
            this.z = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void B() {
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.t = null;
        }
    }

    private final void C(boolean z) {
        if (z) {
            this.e.h(2, 1);
        } else {
            this.e.b(1);
        }
        this.D = getScrollY();
        postInvalidateOnAnimation();
    }

    private final void D(View view) {
        Rect rect = this.n;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int iB = b(rect);
        if (iB != 0) {
            scrollBy(0, iB);
        }
    }

    private final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    private static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    private final boolean G(View view, int i2, int i3) {
        Rect rect = this.n;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean H(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r0.getHeight()
            int r5 = r0.getScrollY()
            int r4 = r4 + r5
            r6 = 2
            java.util.ArrayList r6 = r0.getFocusables(r6)
            int r7 = r6.size()
            r9 = 0
            r10 = 0
            r11 = 0
        L1d:
            r12 = 33
            r13 = 1
            if (r10 >= r7) goto L67
            java.lang.Object r14 = r6.get(r10)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r8 = r14.getBottom()
            if (r2 >= r8) goto L64
            if (r15 >= r3) goto L64
            if (r2 >= r15) goto L3b
            if (r8 >= r3) goto L3b
            r16 = r13
            goto L3d
        L3b:
            r16 = 0
        L3d:
            if (r9 != 0) goto L43
            r9 = r14
            r11 = r16
            goto L64
        L43:
            if (r1 != r12) goto L4c
            int r8 = r9.getTop()
            if (r15 < r8) goto L52
            goto L54
        L4c:
            int r12 = r9.getBottom()
            if (r8 <= r12) goto L54
        L52:
            r8 = r13
            goto L55
        L54:
            r8 = 0
        L55:
            if (r11 == 0) goto L5c
            if (r16 == 0) goto L64
            if (r8 == 0) goto L64
            goto L63
        L5c:
            if (r16 == 0) goto L61
            r11 = r13
        L5f:
            r9 = r14
            goto L64
        L61:
            if (r8 == 0) goto L64
        L63:
            goto L5f
        L64:
            int r10 = r10 + 1
            goto L1d
        L67:
            if (r9 != 0) goto L6a
            r9 = r0
        L6a:
            if (r2 < r5) goto L73
            if (r3 > r4) goto L70
            r8 = 0
            goto L7d
        L70:
            if (r1 != r12) goto L77
            goto L75
        L73:
            if (r1 != r12) goto L77
        L75:
            int r2 = r2 - r5
            goto L79
        L77:
            int r2 = r3 - r4
        L79:
            r0.K(r2)
            r8 = r13
        L7d:
            android.view.View r2 = r0.findFocus()
            if (r9 == r2) goto L86
            r9.requestFocus(r1)
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.H(int, int, int):boolean");
    }

    private final boolean I(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fA = akv.a(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2);
        float f = this.l * 0.015f;
        double dLog = Math.log((fAbs * 0.35f) / f);
        double d = i;
        return ((float) (((double) f) * Math.exp((d / ((-1.0d) + d)) * dLog))) < fA;
    }

    private final boolean J(MotionEvent motionEvent) {
        boolean z;
        if (akv.a(this.b) != 0.0f) {
            akv.b(this.b, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (akv.a(this.c) == 0.0f) {
            return z;
        }
        akv.b(this.c, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private final void K(int i2) {
        cG(i2, -1, null, 0, 1, true);
    }

    private static int u(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private final agq v() {
        if (this.d == null) {
            this.d = new agq(this);
        }
        return this.d;
    }

    private final void w() {
        this.a.abortAnimation();
        this.e.b(1);
    }

    private final void x() {
        this.z = -1;
        this.s = false;
        B();
        this.e.b(0);
        this.b.onRelease();
        this.c.onRelease();
    }

    private final void y() {
        if (this.t == null) {
            this.t = VelocityTracker.obtain();
        }
    }

    private final void z(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.e.f(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    protected final int b(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        if (rect.bottom > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || rect.bottom >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? -(i3 - rect.bottom) : -(scrollY - rect.top), -getScrollY());
    }

    public final int c() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public final float cF() {
        float f = this.G;
        if (f != 0.0f) {
            return f;
        }
        TypedValue typedValue = new TypedValue();
        Context context = getContext();
        if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
        }
        float dimension = typedValue.getDimension(context.getResources().getDisplayMetrics());
        this.G = dimension;
        return dimension;
    }

    final int cG(int i2, int i3, MotionEvent motionEvent, int i4, int i5, boolean z) {
        int i6;
        int i7;
        int i8;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            this.e.h(2, 1);
        }
        int[] iArr = this.B;
        int[] iArr2 = this.A;
        agg aggVar = this.e;
        if (aggVar.e(0, i2, iArr, iArr2, i5)) {
            i6 = i2 - iArr[1];
            i7 = iArr2[1];
        } else {
            i6 = i2;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int iC = c();
        int overScrollMode = getOverScrollMode();
        boolean z2 = (overScrollMode == 0 || (overScrollMode == 1 && c() > 0)) && !z;
        boolean z3 = o(i6, 0, scrollY, iC) && !aggVar.g(i5);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent == null || scrollY2 == 0) {
            i8 = 0;
        } else {
            i8 = 0;
            v().b(motionEvent.getDeviceId(), motionEvent.getSource(), i3, scrollY2);
        }
        iArr[1] = i8;
        n(scrollY2, i6 - scrollY2, iArr2, i5, iArr);
        int i9 = i7 + iArr2[1];
        int i10 = i6 - iArr[1];
        int i11 = scrollY + i10;
        if (i11 < 0) {
            if (z2) {
                akv.b(this.b, (-i10) / getHeight(), i4 / getWidth());
                if (motionEvent != null) {
                    v().a(motionEvent.getDeviceId(), motionEvent.getSource(), i3, true);
                }
                if (!this.c.isFinished()) {
                    this.c.onRelease();
                }
            }
        } else if (i11 > iC && z2) {
            akv.b(this.c, i10 / getHeight(), 1.0f - (i4 / getWidth()));
            if (motionEvent != null) {
                v().a(motionEvent.getDeviceId(), motionEvent.getSource(), i3, i8);
            }
            if (!this.b.isFinished()) {
                this.b.onRelease();
            }
        }
        if (!this.b.isFinished() || !this.c.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z3 && i5 == 0 && (velocityTracker = this.t) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            aggVar.b(1);
            this.b.onRelease();
            this.c.onRelease();
        }
        return i9;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY <= iMax ? bottom : bottom + (scrollY - iMax);
    }

    @Override // defpackage.agh
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        this.e.e(i2, i3, iArr, null, i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || l(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.e.c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.e.d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.e.e(i2, i3, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.e.f(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.b.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.b.setSize(width, height);
            if (this.b.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.c.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(c(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.c.setSize(width2, height2);
        if (this.c.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // defpackage.agh
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        z(i5, i6, null);
    }

    @Override // defpackage.agi
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        z(i5, i6, iArr);
    }

    @Override // defpackage.agh
    public final void g(View view, View view2, int i2, int i3) {
        this.F.a(i2, i3);
        this.e.h(2, i3);
    }

    @Override // android.view.View
    protected final float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        agj agjVar = this.F;
        return agjVar.b | agjVar.a;
    }

    @Override // android.view.View
    protected final float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // defpackage.agh
    public final void h(View view, int i2) {
        this.F.b(i2);
        this.e.b(i2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.e.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.e.a;
    }

    public void j(int i2) {
        if (getChildCount() > 0) {
            this.a.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            C(true);
            if (Build.VERSION.SDK_INT >= 35) {
                aky.a(this, Math.abs(this.a.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            K(maxScrollAmount);
        } else {
            Rect rect = this.n;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            K(b(rect));
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !E(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final boolean l(KeyEvent keyEvent) {
        this.n.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? m(33) : k(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? m(130) : k(130);
                }
                if (keyCode == 62) {
                    p(true == keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return m(33);
                }
                if (keyCode == 93) {
                    return m(130);
                }
                if (keyCode == 122) {
                    p(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                p(130);
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(int i2) {
        int childCount;
        Rect rect = this.n;
        int height = getHeight();
        rect.top = 0;
        rect.bottom = height;
        if (i2 == 130 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            rect.top = rect.bottom - height;
        }
        return H(i2, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    protected final void measureChild(View view, int i2, int i3) {
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i2, int i3, int[] iArr, int i4, int[] iArr2) {
        this.e.f(0, i2, 0, i3, iArr, i4, iArr2);
    }

    final boolean o(int i2, int i3, int i4, int i5) {
        int i6;
        boolean z;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        boolean z2 = i3 > 0 || i3 < 0;
        int i7 = i4 + i2;
        if (i7 > i5) {
            i6 = i5;
        } else {
            if (i7 >= 0) {
                i6 = i7;
                z = false;
                if (z && !this.e.g(1)) {
                    this.a.springBack(0, i6, 0, 0, 0, c());
                }
                super.scrollTo(0, i6);
                return !z2 || z;
            }
            i6 = 0;
        }
        z = true;
        if (z) {
            this.a.springBack(0, i6, 0, 0, 0, c());
        }
        super.scrollTo(0, i6);
        if (z2) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.s) {
            if (agf.a(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i2 = 9;
                width = (int) motionEvent.getX();
            } else if (agf.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i2 = 26;
                axisValue = axisValue2;
            } else {
                i2 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                cG(-((int) (axisValue * cF())), i2, motionEvent, width, 1, agf.a(motionEvent, 8194));
                this.g.a(motionEvent, i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.p = false;
        View view = this.r;
        if (view != null && F(view, this)) {
            D(this.r);
        }
        this.r = null;
        if (!this.q) {
            if (this.E != null) {
                scrollTo(getScrollX(), this.E.a);
                this.E = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iU = u(scrollY, paddingTop, measuredHeight);
            if (iU != scrollY) {
                scrollTo(getScrollX(), iU);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.q = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.u && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        j((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.e.d(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        this.e.e(i2, i3, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        z(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onOverScrolled(int i2, int i3, boolean z, boolean z2) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.E = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        mpu mpuVar = this.h;
        if (mpuVar != null) {
            View childAt = getChildAt(0);
            CommandOuterClass$Command commandOuterClass$CommandA = mpuVar.b.a();
            acyb acybVar = acyb.a;
            acya acyaVar = new acya();
            float f = i2;
            if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyaVar.y();
            }
            float f2 = mpuVar.d;
            acyb acybVar2 = (acyb) acyaVar.b;
            acybVar2.b |= 1;
            acybVar2.c = f / f2;
            float f3 = i3;
            if ((acyaVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyaVar.y();
            }
            acyb acybVar3 = (acyb) acyaVar.b;
            acybVar3.b |= 2;
            acybVar3.d = f3 / f2;
            acyb acybVar4 = (acyb) acyaVar.v();
            acys acysVar = acys.a;
            acyr acyrVar = new acyr();
            float measuredHeight = childAt.getMeasuredHeight() / f2;
            if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar.y();
            }
            acys acysVar2 = (acys) acyrVar.b;
            acysVar2.b |= 2;
            acysVar2.d = measuredHeight;
            float measuredWidth = childAt.getMeasuredWidth() / f2;
            if ((acyrVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                acyrVar.y();
            }
            oal oalVar = mpuVar.c;
            oaa oaaVar = mpuVar.a;
            acys acysVar3 = (acys) acyrVar.b;
            acysVar3.b |= 1;
            acysVar3.c = measuredWidth;
            nyx nyxVar = (nyx) oalVar;
            mpy.c(this, oaaVar, commandOuterClass$CommandA, nyxVar.q, nyxVar.m, acybVar4, (acys) acyrVar.v(), f2);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.n;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iB = b(rect);
        if (iB != 0) {
            if (this.v) {
                q(0, iB, false);
            } else {
                scrollBy(0, iB);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return s(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i2) {
        int height = getHeight();
        if (i2 == 130) {
            Rect rect = this.n;
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            Rect rect2 = this.n;
            rect2.top = getScrollY() - height;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.n;
        rect3.bottom = rect3.top + height;
        H(i2, rect3.top, rect3.bottom);
    }

    public final void q(int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.m > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.a.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            C(z);
        } else {
            if (!this.a.isFinished()) {
                w();
            }
            scrollBy(i2, i3);
        }
        this.m = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void r(int i2, int i3, boolean z) {
        q(i2 - getScrollX(), i3 - getScrollY(), z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.p) {
            this.r = view2;
        } else {
            D(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iB = b(rect);
        boolean z2 = iB != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iB);
                return z2;
            }
            q(0, iB, false);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            B();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.p = true;
        super.requestLayout();
    }

    @Override // defpackage.agh
    public final boolean s(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iU = u(i2, width, width2);
            int iU2 = u(i3, height, height2);
            if (iU == getScrollX() && iU2 == getScrollY()) {
                return;
            }
            super.scrollTo(iU, iU2);
        }
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.e.a(z);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.e.h(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.e.b(0);
    }

    public final void t(int i2) {
        r(0, i2, true);
    }

    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new ala();
        public int a;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        public final String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.katniss.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n = new Rect();
        this.p = true;
        this.q = false;
        this.r = null;
        this.s = false;
        this.v = true;
        this.z = -1;
        this.A = new int[2];
        this.B = new int[2];
        akz akzVar = new akz(this);
        this.f = akzVar;
        this.g = new afw(getContext(), akzVar);
        this.b = akv.c(context, attributeSet);
        this.c = akv.c(context, attributeSet);
        this.l = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.w = viewConfiguration.getScaledTouchSlop();
        this.x = viewConfiguration.getScaledMinimumFlingVelocity();
        this.y = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k, i2, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        if (z != this.u) {
            this.u = z;
            requestLayout();
        }
        typedArrayObtainStyledAttributes.recycle();
        this.F = new agj();
        agg aggVar = new agg(this);
        this.e = aggVar;
        aggVar.a(true);
        ahj.n(this, j);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
