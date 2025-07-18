package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v7.appcompat.R;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bxy;
import defpackage.cqt;
import defpackage.cqu;
import defpackage.cqv;
import defpackage.cqw;
import defpackage.cqx;
import defpackage.cqz;
import defpackage.cra;
import defpackage.cuj;
import defpackage.cul;
import defpackage.cvn;
import defpackage.cvo;
import defpackage.cvp;
import defpackage.cvq;
import defpackage.cwk;
import defpackage.cwm;
import defpackage.cww;
import defpackage.cyh;
import defpackage.czn;
import defpackage.dfb;
import defpackage.ko;
import defpackage.mlq;
import defpackage.phv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements cvn, cvo {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int h = 0;
    private static final cuj i;
    public cyh e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    private final List j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private final int[] n;
    private boolean o;
    private boolean p;
    private int[] q;
    private View r;
    private View s;
    private boolean t;
    private Drawable u;
    private cvq v;
    private final cvp w;
    private phv x;
    private final dfb y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new bxy(7);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        i = new cul(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static final void A(View view, int i2) {
        cqx cqxVar = (cqx) view.getLayoutParams();
        int i3 = cqxVar.i;
        if (i3 != i2) {
            int[] iArr = cww.a;
            view.offsetLeftAndRight(i2 - i3);
            cqxVar.i = i2;
        }
    }

    private static final void B(View view, int i2) {
        cqx cqxVar = (cqx) view.getLayoutParams();
        int i3 = cqxVar.j;
        if (i3 != i2) {
            int[] iArr = cww.a;
            view.offsetTopAndBottom(i2 - i3);
            cqxVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final cqx h(View view) {
        cqx cqxVar = (cqx) view.getLayoutParams();
        if (!cqxVar.b) {
            if (view instanceof cqu) {
                cqv cqvVarA = ((cqu) view).a();
                if (cqvVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                cqxVar.b(cqvVarA);
                cqxVar.b = true;
                return cqxVar;
            }
            cqw cqwVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                cqwVar = (cqw) superclass.getAnnotation(cqw.class);
                if (cqwVar != null) {
                    break;
                }
            }
            if (cqwVar != null) {
                try {
                    cqxVar.b((cqv) cqwVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cqwVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            cqxVar.b = true;
        }
        return cqxVar;
    }

    private final int j() {
        return l() - getHeight();
    }

    private final int k() {
        return -l();
    }

    private final int l() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            cqx cqxVar = (cqx) childAt.getLayoutParams();
            height += childAt.getHeight() + cqxVar.topMargin + cqxVar.bottomMargin;
        }
        return height;
    }

    private final int m(int i2) {
        int[] iArr = this.q;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int n() {
        return (int) (getHeight() * 0.2f);
    }

    private static int o(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0 ? i2 | 48 : i2;
    }

    private static int p(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect q() {
        Rect rect = (Rect) i.a();
        return rect == null ? new Rect() : rect;
    }

    private final void r(cqx cqxVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + cqxVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - cqxVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + cqxVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - cqxVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private static void s(Rect rect) {
        rect.setEmpty();
        i.b(rect);
    }

    private final void t() {
        View view = this.r;
        if (view != null) {
            cqv cqvVar = ((cqx) view.getLayoutParams()).a;
            if (cqvVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                cqvVar.i(this, this.r, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.r = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((cqx) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.o = false;
    }

    private final void u() {
        int[] iArr = cww.a;
        if (!getFitsSystemWindows()) {
            cwm.l(this, null);
            return;
        }
        if (this.v == null) {
            this.v = new czn(this, 1, null);
        }
        cwm.l(this, this.v);
        setSystemUiVisibility(1280);
    }

    private final boolean v(int i2) {
        View view;
        View focusedChild = this;
        while (true) {
            if (focusedChild == null) {
                view = null;
                break;
            }
            if (focusedChild.isFocused()) {
                view = focusedChild;
                break;
            }
            focusedChild = focusedChild instanceof ViewGroup ? ((ViewGroup) focusedChild).getFocusedChild() : null;
        }
        onStartNestedScroll(this, view, 2, 1);
        int[] iArr = this.n;
        onNestedPreScroll(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        onNestedScroll(view, 0, i3, 0, i2, 1, iArr);
        onStopNestedScroll(view, 1);
        return iArr[1] > 0;
    }

    private final boolean w(cqv cqvVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? cqvVar.i(this, view, motionEvent) : cqvVar.e(this, view, motionEvent);
    }

    private final boolean x(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.k;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventZ = null;
        boolean zW = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            cqx cqxVar = (cqx) view.getLayoutParams();
            cqv cqvVar = cqxVar.a;
            if (!zW || actionMasked == 0) {
                if (!zW && cqvVar != null && (zW = w(cqvVar, view, motionEvent, i2))) {
                    this.r = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            cqv cqvVar2 = ((cqx) view2.getLayoutParams()).a;
                            if (cqvVar2 != null) {
                                if (motionEventZ == null) {
                                    motionEventZ = z(motionEvent);
                                }
                                w(cqvVar2, view2, motionEventZ, i2);
                            }
                        }
                    }
                }
                if (cqxVar.a == null) {
                    cqxVar.m = false;
                }
                boolean z = cqxVar.m;
            } else if (cqvVar != null) {
                if (motionEventZ == null) {
                    motionEventZ = z(motionEvent);
                }
                w(cqvVar, view, motionEventZ, i2);
            }
        }
        list.clear();
        if (motionEventZ != null) {
            motionEventZ.recycle();
        }
        return zW;
    }

    private static final void y(int i2, Rect rect, Rect rect2, cqx cqxVar, int i3, int i4) {
        int i5 = cqxVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int iO = o(cqxVar.d);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(iO, i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i3 / 2;
        } else if (i6 != 5) {
            iWidth -= i3;
        }
        if (i7 == 16) {
            iHeight -= i4 / 2;
        } else if (i7 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    private static final MotionEvent z(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    public final List a(View view) {
        ko koVar = (ko) this.y.a;
        int i2 = koVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) koVar.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(koVar.d(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final List b(View view) {
        ArrayList arrayListA = this.y.a(view);
        ArrayList arrayList = arrayListA == null ? null : new ArrayList(arrayListA);
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void c(View view) {
        ArrayList arrayListA = this.y.a(view);
        if (arrayListA == null || arrayListA.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < arrayListA.size(); i2++) {
            View view2 = (View) arrayListA.get(i2);
            cqv cqvVar = ((cqx) view2.getLayoutParams()).a;
            if (cqvVar != null) {
                cqvVar.k(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof cqx) && super.checkLayoutParams(layoutParams);
    }

    final void d(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            cra.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? v(-getHeight()) : v(-n());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? v(getHeight()) : v(n());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? v(k()) : v(j());
            }
            if (keyCode == 92) {
                return v(-getHeight());
            }
            if (keyCode == 93) {
                return v(getHeight());
            }
            if (keyCode == 122) {
                return v(k());
            }
            if (keyCode == 123) {
                return v(j());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        cqv cqvVar = ((cqx) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(int r22) {
        /*
            Method dump skipped, instructions count: 687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.e(int):void");
    }

    public final void f(View view, int i2) {
        Rect rectQ;
        Rect rectQ2;
        cqx cqxVar = (cqx) view.getLayoutParams();
        View view2 = cqxVar.k;
        if (view2 == null && cqxVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectQ = q();
            rectQ2 = q();
            try {
                cra.a(this, view2, rectQ);
                cqx cqxVar2 = (cqx) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                y(i2, rectQ, rectQ2, cqxVar2, measuredWidth, measuredHeight);
                r(cqxVar2, rectQ2, measuredWidth, measuredHeight);
                view.layout(rectQ2.left, rectQ2.top, rectQ2.right, rectQ2.bottom);
                return;
            } finally {
                s(rectQ);
                s(rectQ2);
            }
        }
        int i3 = cqxVar.e;
        if (i3 < 0) {
            cqx cqxVar3 = (cqx) view.getLayoutParams();
            rectQ = q();
            rectQ.set(getPaddingLeft() + cqxVar3.leftMargin, getPaddingTop() + cqxVar3.topMargin, (getWidth() - getPaddingRight()) - cqxVar3.rightMargin, (getHeight() - getPaddingBottom()) - cqxVar3.bottomMargin);
            if (this.e != null) {
                int[] iArr = cww.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectQ.left += this.e.b();
                    rectQ.top += this.e.d();
                    rectQ.right -= this.e.c();
                    rectQ.bottom -= this.e.a();
                }
            }
            rectQ2 = q();
            Gravity.apply(o(cqxVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectQ, rectQ2, i2);
            view.layout(rectQ2.left, rectQ2.top, rectQ2.right, rectQ2.bottom);
            return;
        }
        cqx cqxVar4 = (cqx) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(p(cqxVar4.c), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int iM = m(i3) - measuredWidth2;
        if (i4 == 1) {
            iM += measuredWidth2 / 2;
        } else if (i4 == 5) {
            iM += measuredWidth2;
        }
        int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + cqxVar4.leftMargin, Math.min(iM, ((width - getPaddingRight()) - measuredWidth2) - cqxVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + cqxVar4.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight2) - cqxVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean g(View view, int i2, int i3) {
        Rect rectQ = q();
        cra.a(this, view, rectQ);
        try {
            return rectQ.contains(i2, i3);
        } finally {
            s(rectQ);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new cqx();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new cqx(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.w.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void i(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        if (this.t) {
            if (this.x == null) {
                this.x = new phv(this, 1);
            }
            getViewTreeObserver().addOnPreDrawListener(this.x);
        }
        if (this.e == null) {
            int[] iArr = cww.a;
            if (getFitsSystemWindows()) {
                cwk.e(this);
            }
        }
        this.p = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t();
        if (this.t && this.x != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.x);
        }
        View view = this.s;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.p = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.u == null) {
            return;
        }
        cyh cyhVar = this.e;
        int iD = cyhVar != null ? cyhVar.d() : 0;
        if (iD > 0) {
            this.u.setBounds(0, 0, getWidth(), iD);
            this.u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            t();
            actionMasked = 0;
        }
        boolean zX = x(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zX;
        }
        this.r = null;
        t();
        return zX;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        cqv cqvVar;
        int layoutDirection = getLayoutDirection();
        List list = this.j;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((cqvVar = ((cqx) view.getLayoutParams()).a) == null || !cqvVar.f(this, view, layoutDirection))) {
                f(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Type inference failed for: r11v9, types: [cuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [cuj, java.lang.Object] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                cqx cqxVar = (cqx) childAt.getLayoutParams();
                if (cqxVar.d(0)) {
                    cqv cqvVar = cqxVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        cqv cqvVar;
        int childCount = getChildCount();
        boolean zN = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                cqx cqxVar = (cqx) childAt.getLayoutParams();
                if (cqxVar.d(0) && (cqvVar = cqxVar.a) != null) {
                    zN |= cqvVar.n(view);
                }
            }
        }
        return zN;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        onNestedPreScroll(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        onNestedScroll(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        onNestedScrollAccepted(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof cqz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cqz cqzVar = (cqz) parcelable;
        super.onRestoreInstanceState(cqzVar.getSuperState());
        SparseArray sparseArray = cqzVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            cqv cqvVar = h(childAt).a;
            if (id != -1 && cqvVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                cqvVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableR;
        cqz cqzVar = new cqz(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            cqv cqvVar = ((cqx) childAt.getLayoutParams()).a;
            if (id != -1 && cqvVar != null && (parcelableR = cqvVar.r(childAt)) != null) {
                sparseArray.append(id, parcelableR);
            }
        }
        cqzVar.a = sparseArray;
        return cqzVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return onStartNestedScroll(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zX;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.r;
        boolean z = false;
        if (view != null) {
            cqv cqvVar = ((cqx) view.getLayoutParams()).a;
            zX = cqvVar != null ? cqvVar.i(this, this.r, motionEvent) : false;
        } else {
            zX = x(motionEvent, 1);
            if (actionMasked != 0 && zX) {
                z = true;
            }
        }
        if (this.r == null || actionMasked == 3) {
            zX |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventZ = z(motionEvent);
            super.onTouchEvent(motionEventZ);
            motionEventZ.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zX;
        }
        this.r = null;
        t();
        return zX;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        cqv cqvVar = ((cqx) view.getLayoutParams()).a;
        if (cqvVar == null || !cqvVar.g(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.o) {
            return;
        }
        if (this.r == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                cqv cqvVar = ((cqx) childAt.getLayoutParams()).a;
                if (cqvVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    cqvVar.e(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        t();
        this.o = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        u();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.u;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.u.setVisible(z, false);
            }
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof cqx ? new cqx((cqx) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new cqx((ViewGroup.MarginLayoutParams) layoutParams) : new cqx(layoutParams);
    }

    @Override // defpackage.cvn
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        cqv cqvVar;
        int childCount = getChildCount();
        boolean z = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                cqx cqxVar = (cqx) childAt.getLayoutParams();
                if (cqxVar.d(i4) && (cqvVar = cqxVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cqvVar.o(this, childAt, view, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            e(1);
        }
    }

    @Override // defpackage.cvn
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
        onNestedScroll(view, i2, i3, i4, i5, 0, this.m);
    }

    @Override // defpackage.cvn
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
        this.w.b(i2, i3);
        this.s = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            cqx cqxVar = (cqx) getChildAt(i4).getLayoutParams();
            if (cqxVar.d(i3)) {
                cqv cqvVar = cqxVar.a;
            }
        }
    }

    @Override // defpackage.cvn
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                cqx cqxVar = (cqx) childAt.getLayoutParams();
                cqv cqvVar = cqxVar.a;
                if (cqvVar != null) {
                    boolean zH = cqvVar.h(this, childAt, view, view2, i2, i3);
                    z |= zH;
                    cqxVar.c(i3, zH);
                } else {
                    cqxVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // defpackage.cvn
    public final void onStopNestedScroll(View view, int i2) {
        this.w.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            cqx cqxVar = (cqx) childAt.getLayoutParams();
            if (cqxVar.d(i2)) {
                cqv cqvVar = cqxVar.a;
                if (cqvVar != null) {
                    cqvVar.d(this, childAt, view, i2);
                }
                cqxVar.c(i2, false);
                cqxVar.a();
            }
        }
        this.s = null;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i2);
        this.j = new ArrayList();
        this.y = new dfb((byte[]) null);
        this.k = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.n = new int[2];
        this.w = new cvp();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqt.a, 0, com.google.android.videos.R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqt.a, i2, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            cww.o(coordinatorLayout, context2, cqt.a, attributeSet, typedArray, 0, com.google.android.videos.R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            cww.o(coordinatorLayout, context2, cqt.a, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.q.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.q[i3] = (int) (r12[i3] * f);
            }
        }
        coordinatorLayout.u = typedArray.getDrawable(1);
        typedArray.recycle();
        u();
        super.setOnHierarchyChangeListener(new mlq(this, 1));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.cvo
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        cqv cqvVar;
        int iMin;
        int iMin2;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                cqx cqxVar = (cqx) childAt.getLayoutParams();
                if (cqxVar.d(i6) && (cqvVar = cqxVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cqvVar.p(this, childAt, view, i3, i4, i5, iArr2);
                    if (i4 > 0) {
                        iMin = Math.max(i7, iArr2[0]);
                    } else {
                        iMin = Math.min(i7, iArr2[0]);
                    }
                    i7 = iMin;
                    if (i5 > 0) {
                        iMin2 = Math.max(i8, iArr2[1]);
                    } else {
                        iMin2 = Math.min(i8, iArr2[1]);
                    }
                    i8 = iMin2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            e(1);
        }
    }
}
