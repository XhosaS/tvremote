package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.tv.remote.service.R;
import defpackage.cmt;
import defpackage.mi;
import defpackage.mm;
import defpackage.mn;
import defpackage.mo;
import defpackage.mp;
import defpackage.mq;
import defpackage.mr;
import defpackage.ms;
import defpackage.mt;
import defpackage.mu;
import defpackage.mv;
import defpackage.pa;
import defpackage.pb;
import defpackage.pt;
import defpackage.pu;
import defpackage.pv;
import defpackage.pw;
import defpackage.qk;
import defpackage.qm;
import defpackage.qv;
import defpackage.sf;
import defpackage.td;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements pt, pu {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int h = 0;
    private static final pa x;
    public sf e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    private final List i;
    private final List j;
    private final int[] k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private ms s;
    private boolean t;
    private Drawable u;
    private pw v;
    private final pv w;
    private final cmt y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new mu(0);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        x = new pb();
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private final boolean A(mo moVar, View view, MotionEvent motionEvent, int i) {
        return i != 0 ? moVar.g(this, view, motionEvent) : moVar.e(this, view, motionEvent);
    }

    private final boolean B(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.j;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEventD = null;
        boolean zA = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            mr mrVar = (mr) view.getLayoutParams();
            mo moVar = mrVar.a;
            if (!zA || actionMasked == 0) {
                if (!zA && moVar != null && (zA = A(moVar, view, motionEvent, i))) {
                    this.q = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = (View) list.get(i4);
                            mo moVar2 = ((mr) view2.getLayoutParams()).a;
                            if (moVar2 != null) {
                                if (motionEventD == null) {
                                    motionEventD = D(motionEvent);
                                }
                                A(moVar2, view2, motionEventD, i);
                            }
                        }
                    }
                }
                if (mrVar.a == null) {
                    mrVar.m = false;
                }
                boolean z = mrVar.m;
            } else if (moVar != null) {
                if (motionEventD == null) {
                    motionEventD = D(motionEvent);
                }
                A(moVar, view, motionEventD, i);
            }
        }
        list.clear();
        if (motionEventD != null) {
            motionEventD.recycle();
        }
        return zA;
    }

    private static final void C(int i, Rect rect, Rect rect2, mr mrVar, int i2, int i3) {
        int i4 = mrVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(r(mrVar.d), i);
        int i7 = absoluteGravity2 & 7;
        int i8 = absoluteGravity2 & 112;
        int iWidth = i7 != 1 ? i7 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i8 != 16 ? i8 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i5 == 1) {
            iWidth -= i2 / 2;
        } else if (i5 != 5) {
            iWidth -= i2;
        }
        if (i6 == 16) {
            iHeight -= i3 / 2;
        } else if (i6 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    private static final MotionEvent D(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private static final void E(View view, int i) {
        mr mrVar = (mr) view.getLayoutParams();
        int i2 = mrVar.i;
        if (i2 != i) {
            int[] iArr = qv.a;
            view.offsetLeftAndRight(i - i2);
            mrVar.i = i;
        }
    }

    private static final void F(View view, int i) {
        mr mrVar = (mr) view.getLayoutParams();
        int i2 = mrVar.j;
        if (i2 != i) {
            int[] iArr = qv.a;
            view.offsetTopAndBottom(i - i2);
            mrVar.j = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final mr k(View view) {
        mr mrVar = (mr) view.getLayoutParams();
        if (!mrVar.b) {
            if (view instanceof mn) {
                mo moVarA = ((mn) view).a();
                if (moVarA == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                mrVar.b(moVarA);
                mrVar.b = true;
                return mrVar;
            }
            mp mpVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                mpVar = (mp) superclass.getAnnotation(mp.class);
                if (mpVar != null) {
                    break;
                }
            }
            if (mpVar != null) {
                try {
                    mrVar.b((mo) mpVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + mpVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            mrVar.b = true;
        }
        return mrVar;
    }

    private final int m() {
        return o() - getHeight();
    }

    private final int n() {
        return -o();
    }

    private final int o() {
        int height = 0;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            mr mrVar = (mr) childAt.getLayoutParams();
            height += childAt.getHeight() + mrVar.topMargin + mrVar.bottomMargin;
        }
        return height;
    }

    private final int p(int i) {
        int[] iArr = this.p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    private final int q() {
        return (int) (getHeight() * 0.2f);
    }

    private static int r(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & 112) == 0 ? i | 48 : i;
    }

    private static int s(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private static Rect u() {
        Rect rect = (Rect) x.a();
        return rect == null ? new Rect() : rect;
    }

    private final void v(mr mrVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + mrVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - mrVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + mrVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - mrVar.bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    private static void w(Rect rect) {
        rect.setEmpty();
        x.b(rect);
    }

    private final void x() {
        View view = this.q;
        if (view != null) {
            mo moVar = ((mr) view.getLayoutParams()).a;
            if (moVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                moVar.g(this, this.q, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.q = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((mr) getChildAt(i).getLayoutParams()).m = false;
        }
        this.n = false;
    }

    private final void y() {
        int[] iArr = qv.a;
        if (!getFitsSystemWindows()) {
            qm.i(this, null);
            return;
        }
        if (this.v == null) {
            this.v = new td(this, 1);
        }
        qm.i(this, this.v);
        setSystemUiVisibility(1280);
    }

    private final boolean z(int i) {
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
        t(this, view, 2, 1);
        int[] iArr = this.m;
        d(view, 0, i, iArr, 1);
        int i2 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i2, 0, i, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    public final List a(View view) {
        mi miVar = (mi) this.y.d;
        int i = miVar.f;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) miVar.f(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(miVar.c(i2));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    final void b(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            mv.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r23) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.c(int):void");
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof mr) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.pt
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        mo moVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                mr mrVar = (mr) childAt.getLayoutParams();
                if (mrVar.d(i3) && (moVar = mrVar.a) != null) {
                    int[] iArr2 = this.k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    moVar.m(childAt, view, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            c(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? z(-getHeight()) : z(-q());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? z(getHeight()) : z(q());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? z(n()) : z(m());
            }
            if (keyCode == 92) {
                return z(-getHeight());
            }
            if (keyCode == 93) {
                return z(getHeight());
            }
            if (keyCode == 122) {
                return z(n());
            }
            if (keyCode == 123) {
                return z(m());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        mo moVar = ((mr) view.getLayoutParams()).a;
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

    @Override // defpackage.pt
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, 0, this.l);
    }

    @Override // defpackage.pu
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mo moVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                mr mrVar = (mr) childAt.getLayoutParams();
                if (mrVar.d(i5) && (moVar = mrVar.a) != null) {
                    int[] iArr2 = this.k;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    moVar.n(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            c(1);
        }
    }

    @Override // defpackage.pt
    public final void g(View view, View view2, int i, int i2) {
        this.w.b(i, i2);
        this.r = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            mr mrVar = (mr) getChildAt(i3).getLayoutParams();
            if (mrVar.d(i2)) {
                mo moVar = mrVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new mr();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new mr(getContext(), attributeSet);
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

    @Override // defpackage.pt
    public final void h(View view, int i) {
        this.w.c(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            mr mrVar = (mr) childAt.getLayoutParams();
            if (mrVar.d(i)) {
                mo moVar = mrVar.a;
                if (moVar != null) {
                    moVar.s(childAt, view, i);
                }
                mrVar.c(i, false);
                mrVar.a();
            }
        }
        this.r = null;
    }

    public final void i(View view, int i) {
        Rect rectU;
        Rect rectU2;
        mr mrVar = (mr) view.getLayoutParams();
        View view2 = mrVar.k;
        if (view2 == null && mrVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            rectU = u();
            rectU2 = u();
            try {
                mv.a(this, view2, rectU);
                mr mrVar2 = (mr) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                C(i, rectU, rectU2, mrVar2, measuredWidth, measuredHeight);
                v(mrVar2, rectU2, measuredWidth, measuredHeight);
                view.layout(rectU2.left, rectU2.top, rectU2.right, rectU2.bottom);
                return;
            } finally {
                w(rectU);
                w(rectU2);
            }
        }
        int i2 = mrVar.e;
        if (i2 < 0) {
            mr mrVar3 = (mr) view.getLayoutParams();
            rectU = u();
            rectU.set(getPaddingLeft() + mrVar3.leftMargin, getPaddingTop() + mrVar3.topMargin, (getWidth() - getPaddingRight()) - mrVar3.rightMargin, (getHeight() - getPaddingBottom()) - mrVar3.bottomMargin);
            if (this.e != null) {
                int[] iArr = qv.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectU.left += this.e.b();
                    rectU.top += this.e.d();
                    rectU.right -= this.e.c();
                    rectU.bottom -= this.e.a();
                }
            }
            rectU2 = u();
            Gravity.apply(r(mrVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectU, rectU2, i);
            view.layout(rectU2.left, rectU2.top, rectU2.right, rectU2.bottom);
            return;
        }
        mr mrVar4 = (mr) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(s(mrVar4.c), i);
        int i3 = absoluteGravity & 7;
        int i4 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iP = p(i2) - measuredWidth2;
        if (i3 == 1) {
            iP += measuredWidth2 / 2;
        } else if (i3 == 5) {
            iP += measuredWidth2;
        }
        int i5 = i4 != 16 ? i4 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + mrVar4.leftMargin, Math.min(iP, ((width - getPaddingRight()) - measuredWidth2) - mrVar4.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + mrVar4.topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight2) - mrVar4.bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    public final boolean j(View view, int i, int i2) {
        Rect rectU = u();
        mv.a(this, view, rectU);
        try {
            return rectU.contains(i, i2);
        } finally {
            w(rectU);
        }
    }

    public final void l(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x();
        if (this.t) {
            if (this.s == null) {
                this.s = new ms(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.e == null) {
            int[] iArr = qv.a;
            if (getFitsSystemWindows()) {
                qk.j(this);
            }
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.u == null) {
            return;
        }
        sf sfVar = this.e;
        int iD = sfVar != null ? sfVar.d() : 0;
        if (iD > 0) {
            this.u.setBounds(0, 0, getWidth(), iD);
            this.u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x();
            actionMasked = 0;
        }
        boolean zB = B(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zB;
        }
        this.q = null;
        x();
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo moVar;
        int layoutDirection = getLayoutDirection();
        List list = this.i;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            if (view.getVisibility() != 8 && ((moVar = ((mr) view.getLayoutParams()).a) == null || !moVar.f(this, view, layoutDirection))) {
                i(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                mr mrVar = (mr) childAt.getLayoutParams();
                if (mrVar.n) {
                    mo moVar = mrVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        mo moVar;
        int childCount = getChildCount();
        boolean zL = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                mr mrVar = (mr) childAt.getLayoutParams();
                if (mrVar.n && (moVar = mrVar.a) != null) {
                    zL |= moVar.l(view);
                }
            }
        }
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        d(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        e(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        g(view, view2, i, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof mt)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        mt mtVar = (mt) parcelable;
        super.onRestoreInstanceState(mtVar.d);
        SparseArray sparseArray = mtVar.a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            mo moVar = k(childAt).a;
            if (id != -1 && moVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                moVar.p(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableQ;
        mt mtVar = new mt(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            mo moVar = ((mr) childAt.getLayoutParams()).a;
            if (id != -1 && moVar != null && (parcelableQ = moVar.q(childAt)) != null) {
                sparseArray.append(id, parcelableQ);
            }
        }
        mtVar.a = sparseArray;
        return mtVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return t(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zB;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.q;
        boolean z = false;
        if (view != null) {
            mo moVar = ((mr) view.getLayoutParams()).a;
            zB = moVar != null ? moVar.g(this, this.q, motionEvent) : false;
        } else {
            zB = B(motionEvent, 1);
            if (actionMasked != 0 && zB) {
                z = true;
            }
        }
        if (this.q == null || actionMasked == 3) {
            zB |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventD = D(motionEvent);
            super.onTouchEvent(motionEventD);
            motionEventD.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zB;
        }
        this.q = null;
        x();
        return zB;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        mo moVar = ((mr) view.getLayoutParams()).a;
        if (moVar != null) {
            moVar.o(this, view, rect);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.n) {
            return;
        }
        if (this.q == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                mo moVar = ((mr) childAt.getLayoutParams()).a;
                if (moVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    moVar.e(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        x();
        this.n = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.u;
        if (drawable != null) {
            boolean z = i == 0;
            if (drawable.isVisible() != z) {
                this.u.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.pt
    public final boolean t(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                mr mrVar = (mr) childAt.getLayoutParams();
                mo moVar = mrVar.a;
                if (moVar != null) {
                    boolean zR = moVar.r(childAt, i, i2);
                    z |= zR;
                    mrVar.c(i2, zR);
                } else {
                    mrVar.c(i2, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof mr ? new mr((mr) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new mr((ViewGroup.MarginLayoutParams) layoutParams) : new mr(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i);
        this.i = new ArrayList();
        this.y = new cmt((byte[]) null);
        this.j = new ArrayList();
        this.k = new int[2];
        this.l = new int[2];
        this.m = new int[2];
        this.w = new pv();
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mm.a, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mm.a, i, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i == 0) {
            coordinatorLayout = this;
            context2 = context;
            qv.k(coordinatorLayout, context2, mm.a, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            qv.k(coordinatorLayout, context2, mm.a, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.p.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.p[i2] = (int) (r12[i2] * f);
            }
        }
        coordinatorLayout.u = typedArray.getDrawable(1);
        typedArray.recycle();
        y();
        super.setOnHierarchyChangeListener(new mq(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
