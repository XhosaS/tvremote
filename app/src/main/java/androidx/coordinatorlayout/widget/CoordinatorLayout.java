package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
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
import androidx.customview.view.AbsSavedState;
import com.google.android.katniss.R;
import defpackage.aaj;
import defpackage.aak;
import defpackage.aal;
import defpackage.aam;
import defpackage.aan;
import defpackage.aao;
import defpackage.aap;
import defpackage.aaq;
import defpackage.aar;
import defpackage.aas;
import defpackage.aat;
import defpackage.aau;
import defpackage.afh;
import defpackage.afj;
import defpackage.agh;
import defpackage.agi;
import defpackage.agj;
import defpackage.agk;
import defpackage.aha;
import defpackage.ahc;
import defpackage.ahj;
import defpackage.ajc;
import defpackage.wx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements agh, agi {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int h = 0;
    private static final afh i;
    public ajc e;
    public boolean f;
    public ViewGroup.OnHierarchyChangeListener g;
    private final List j;
    private final aat k;
    private final List l;
    private final int[] m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private boolean q;
    private int[] r;
    private View s;
    private View t;
    private aaq u;
    private boolean v;
    private Drawable w;
    private agk x;
    private final agj y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new aas();
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        i = new afj(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private final void A(View view, int i2) {
        aap aapVar = (aap) view.getLayoutParams();
        int i3 = aapVar.i;
        if (i3 != i2) {
            int[] iArr = ahj.a;
            view.offsetLeftAndRight(i2 - i3);
            aapVar.i = i2;
        }
    }

    private final void B(View view, int i2) {
        aap aapVar = (aap) view.getLayoutParams();
        int i3 = aapVar.j;
        if (i3 != i2) {
            int[] iArr = ahj.a;
            view.offsetTopAndBottom(i2 - i3);
            aapVar.j = i2;
        }
    }

    private final void C() {
        int[] iArr = ahj.a;
        if (!getFitsSystemWindows()) {
            ahc.k(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new aak(this);
        }
        ahc.k(this, this.x);
        setSystemUiVisibility(1280);
    }

    private final boolean D(View view, int i2) {
        s(this, view, 2, 1);
        int[] iArr = this.o;
        d(view, 0, i2, iArr, 1);
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        f(view, 0, i3, 0, i2, 1, iArr);
        h(view, 1);
        return iArr[1] > 0;
    }

    private final boolean E(aam aamVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? aamVar.e(this, view, motionEvent) : aamVar.c(this, view, motionEvent);
    }

    private final boolean F(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
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
        MotionEvent motionEventU = null;
        boolean zE = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            aap aapVar = (aap) view.getLayoutParams();
            aam aamVar = aapVar.a;
            if (!zE || actionMasked == 0) {
                if (!zE && aamVar != null && (zE = E(aamVar, view, motionEvent, i2))) {
                    this.s = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            aam aamVar2 = ((aap) view2.getLayoutParams()).a;
                            if (aamVar2 != null) {
                                if (motionEventU == null) {
                                    motionEventU = u(motionEvent);
                                }
                                E(aamVar2, view2, motionEventU, i2);
                            }
                        }
                    }
                }
                if (aapVar.a == null) {
                    aapVar.m = false;
                }
                boolean z = aapVar.m;
            } else if (aamVar != null) {
                if (motionEventU == null) {
                    motionEventU = u(motionEvent);
                }
                E(aamVar, view, motionEventU, i2);
            }
        }
        list.clear();
        if (motionEventU != null) {
            motionEventU.recycle();
        }
        return zE;
    }

    private final int n() {
        int height = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            aap aapVar = (aap) childAt.getLayoutParams();
            height += childAt.getHeight() + aapVar.topMargin + aapVar.bottomMargin;
        }
        return height;
    }

    private final int o(int i2) {
        int[] iArr = this.r;
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

    private final int p() {
        return (int) (getHeight() * 0.2f);
    }

    private static int q(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int r(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect t() {
        Rect rect = (Rect) i.a();
        return rect == null ? new Rect() : rect;
    }

    private final MotionEvent u(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        return motionEventObtain;
    }

    private final View v(View view) {
        while (view != null) {
            if (view.isFocused()) {
                return view;
            }
            view = view instanceof ViewGroup ? ((ViewGroup) view).getFocusedChild() : null;
        }
        return null;
    }

    private final void w(aap aapVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + aapVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - aapVar.rightMargin));
        int iMax2 = Math.max(getPaddingTop() + aapVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - aapVar.bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private final void x(int i2, Rect rect, Rect rect2, aap aapVar, int i3, int i4) {
        int i5 = aapVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(q(aapVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
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

    private static void y(Rect rect) {
        rect.setEmpty();
        i.b(rect);
    }

    private final void z() {
        View view = this.s;
        if (view != null) {
            aam aamVar = ((aap) view.getLayoutParams()).a;
            if (aamVar != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                aamVar.e(this, this.s, motionEventObtain);
                motionEventObtain.recycle();
            }
            this.s = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((aap) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final aap a(View view) {
        aap aapVar = (aap) view.getLayoutParams();
        if (!aapVar.b) {
            if (view instanceof aal) {
                aam behavior = ((aal) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                aapVar.a(behavior);
                aapVar.b = true;
                return aapVar;
            }
            aan aanVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                aanVar = (aan) superclass.getAnnotation(aan.class);
                if (aanVar != null) {
                    break;
                }
            }
            if (aanVar != null) {
                try {
                    aapVar.a((aam) aanVar.a().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + aanVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            aapVar.b = true;
        }
        return aapVar;
    }

    public final List b(View view) {
        wx wxVar = this.k.b;
        int i2 = wxVar.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) wxVar.h(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(wxVar.e(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            aau.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof aap) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.agh
    public final void d(View view, int i2, int i3, int[] iArr, int i4) {
        aam aamVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                aap aapVar = (aap) childAt.getLayoutParams();
                if (aapVar.c(i4) && (aamVar = aapVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aamVar.l(childAt, view, i3, iArr2, i4);
                    iMax = i2 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i3 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!zDispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (keyEvent.isAltPressed()) {
                    return D(v(this), -getHeight());
                }
                return D(v(this), -p());
            }
            if (keyCode == 20) {
                if (keyEvent.isAltPressed()) {
                    return D(v(this), getHeight());
                }
                return D(v(this), p());
            }
            if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    return D(v(this), -n());
                }
                return D(v(this), n() - getHeight());
            }
            if (keyCode == 92) {
                return D(v(this), -getHeight());
            }
            if (keyCode == 93) {
                return D(v(this), getHeight());
            }
            if (keyCode == 122) {
                return D(v(this), -n());
            }
            if (keyCode == 123) {
                return D(v(this), n() - getHeight());
            }
        }
        return zDispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        aam aamVar = ((aap) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.agh
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.n);
    }

    @Override // defpackage.agi
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        aam aamVar;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z = false;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                aap aapVar = (aap) childAt.getLayoutParams();
                if (aapVar.c(i6) && (aamVar = aapVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    aamVar.m(this, childAt, i3, i4, i5, iArr2);
                    iMax = i4 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i5 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z) {
            i(1);
        }
    }

    @Override // defpackage.agh
    public final void g(View view, View view2, int i2, int i3) {
        this.y.a(i2, i3);
        this.t = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            aap aapVar = (aap) getChildAt(i4).getLayoutParams();
            if (aapVar.c(i3)) {
                aam aamVar = aapVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aap();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aap(getContext(), attributeSet);
    }

    public final ajc getLastWindowInsets() {
        return this.e;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        agj agjVar = this.y;
        return agjVar.b | agjVar.a;
    }

    public Drawable getStatusBarBackground() {
        return this.w;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.agh
    public final void h(View view, int i2) {
        this.y.b(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            aap aapVar = (aap) childAt.getLayoutParams();
            if (aapVar.c(i2)) {
                aam aamVar = aapVar.a;
                if (aamVar != null) {
                    aamVar.r(childAt, view, i2);
                }
                aapVar.b(i2, false);
                aapVar.o = false;
            }
        }
        this.t = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r23) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.i(int):void");
    }

    public final void j(View view, int i2) throws Throwable {
        aap aapVar = (aap) view.getLayoutParams();
        View view2 = aapVar.k;
        if (view2 == null && aapVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 == null) {
            int i3 = aapVar.e;
            if (i3 < 0) {
                aap aapVar2 = (aap) view.getLayoutParams();
                Rect rectT = t();
                rectT.set(getPaddingLeft() + aapVar2.leftMargin, getPaddingTop() + aapVar2.topMargin, (getWidth() - getPaddingRight()) - aapVar2.rightMargin, (getHeight() - getPaddingBottom()) - aapVar2.bottomMargin);
                if (this.e != null) {
                    int[] iArr = ahj.a;
                    if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                        rectT.left += this.e.b();
                        rectT.top += this.e.d();
                        rectT.right -= this.e.c();
                        rectT.bottom -= this.e.a();
                    }
                }
                Rect rectT2 = t();
                Gravity.apply(q(aapVar2.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectT, rectT2, i2);
                view.layout(rectT2.left, rectT2.top, rectT2.right, rectT2.bottom);
                y(rectT);
                y(rectT2);
                return;
            }
            aap aapVar3 = (aap) view.getLayoutParams();
            int absoluteGravity = Gravity.getAbsoluteGravity(r(aapVar3.c), i2);
            int i4 = absoluteGravity & 7;
            int i5 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i2 == 1) {
                i3 = width - i3;
            }
            int iO = o(i3) - measuredWidth;
            if (i4 == 1) {
                iO += measuredWidth / 2;
            } else if (i4 == 5) {
                iO += measuredWidth;
            }
            int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight : measuredHeight / 2;
            int iMax = Math.max(getPaddingLeft() + aapVar3.leftMargin, Math.min(iO, ((width - getPaddingRight()) - measuredWidth) - aapVar3.rightMargin));
            int iMax2 = Math.max(getPaddingTop() + aapVar3.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - aapVar3.bottomMargin));
            view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
            return;
        }
        Rect rectT3 = t();
        Rect rectT4 = t();
        try {
            aau.a(this, view2, rectT3);
            aap aapVar4 = (aap) view.getLayoutParams();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            try {
                x(i2, rectT3, rectT4, aapVar4, measuredWidth2, measuredHeight2);
                w(aapVar4, rectT4, measuredWidth2, measuredHeight2);
                view.layout(rectT4.left, rectT4.top, rectT4.right, rectT4.bottom);
                y(rectT3);
                y(rectT4);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                y(rectT3);
                y(rectT4);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void k(Drawable drawable) {
        Drawable drawable2 = this.w;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.w = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.w.setState(getDrawableState());
                }
                this.w.setLayoutDirection(getLayoutDirection());
                this.w.setVisible(getVisibility() == 0, false);
                this.w.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public final boolean l(View view, int i2, int i3) {
        Rect rectT = t();
        aau.a(this, view, rectT);
        try {
            return rectT.contains(i2, i3);
        } finally {
            y(rectT);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z();
        if (this.v) {
            if (this.u == null) {
                this.u = new aaq(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        if (this.e == null) {
            int[] iArr = ahj.a;
            if (getFitsSystemWindows()) {
                aha.c(this);
            }
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
        if (this.v && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        View view = this.t;
        if (view != null) {
            h(view, 0);
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f || this.w == null) {
            return;
        }
        ajc ajcVar = this.e;
        int iD = ajcVar != null ? ajcVar.d() : 0;
        if (iD > 0) {
            this.w.setBounds(0, 0, getWidth(), iD);
            this.w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z();
            actionMasked = 0;
        }
        boolean zF = F(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zF;
        }
        this.s = null;
        z();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) throws Throwable {
        aam aamVar;
        int layoutDirection = getLayoutDirection();
        List list = this.j;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) list.get(i6);
            if (view.getVisibility() != 8 && ((aamVar = ((aap) view.getLayoutParams()).a) == null || !aamVar.d(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 872
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
                aap aapVar = (aap) childAt.getLayoutParams();
                if (aapVar.n) {
                    aam aamVar = aapVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        aam aamVar;
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                aap aapVar = (aap) childAt.getLayoutParams();
                if (aapVar.n && (aamVar = aapVar.a) != null) {
                    zJ |= aamVar.j(view);
                }
            }
        }
        return zJ;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        d(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        g(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        SparseArray sparseArray = savedState.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            aam aamVar = a(childAt).a;
            if (id != -1 && aamVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                aamVar.o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableP;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            aam aamVar = ((aap) childAt.getLayoutParams()).a;
            if (id != -1 && aamVar != null && (parcelableP = aamVar.p(childAt)) != null) {
                sparseArray.append(id, parcelableP);
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return s(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zF;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.s;
        boolean z = false;
        if (view != null) {
            aam aamVar = ((aap) view.getLayoutParams()).a;
            zF = aamVar != null ? aamVar.e(this, this.s, motionEvent) : false;
        } else {
            zF = F(motionEvent, 1);
            if (actionMasked != 0 && zF) {
                z = true;
            }
        }
        if (this.s == null || actionMasked == 3) {
            zF |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent motionEventU = u(motionEvent);
            super.onTouchEvent(motionEventU);
            motionEventU.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return zF;
        }
        this.s = null;
        z();
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        aam aamVar = ((aap) view.getLayoutParams()).a;
        if (aamVar != null) {
            aamVar.n(this, view, rect);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.p) {
            return;
        }
        if (this.s == null) {
            int childCount = getChildCount();
            MotionEvent motionEventObtain = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                aam aamVar = ((aap) childAt.getLayoutParams()).a;
                if (aamVar != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    aamVar.c(this, childAt, motionEventObtain);
                }
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
        }
        z();
        this.p = true;
    }

    @Override // defpackage.agh
    public final boolean s(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                aap aapVar = (aap) childAt.getLayoutParams();
                aam aamVar = aapVar.a;
                if (aamVar != null) {
                    boolean zQ = aamVar.q(childAt, i2, i3);
                    z |= zQ;
                    aapVar.b(i3, zQ);
                } else {
                    aapVar.b(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        C();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g = onHierarchyChangeListener;
    }

    public void setStatusBarBackgroundColor(int i2) {
        k(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        k(i2 != 0 ? getContext().getDrawable(i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.w;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.w.setVisible(z, false);
            }
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aap ? new aap((aap) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new aap((ViewGroup.MarginLayoutParams) layoutParams) : new aap(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayObtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        super(context, attributeSet, i2);
        this.j = new ArrayList();
        this.k = new aat();
        this.l = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.y = new agj();
        if (i2 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aaj.a, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aaj.a, i2, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            ahj.m(coordinatorLayout, context2, aaj.a, attributeSet, typedArray, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            context2 = context;
            coordinatorLayout = this;
            ahj.m(coordinatorLayout, context2, aaj.a, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.r[i3] = (int) (r12[i3] * f);
            }
        }
        coordinatorLayout.w = typedArray.getDrawable(1);
        typedArray.recycle();
        C();
        super.setOnHierarchyChangeListener(new aao(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* compiled from: PG */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new aar();
        SparseArray a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            SparseArray sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
