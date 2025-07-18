package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ListView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;

/* compiled from: PG */
/* loaded from: classes.dex */
public class btl extends ViewGroup implements agi, agh {
    private static final String m = "btl";
    private static final int[] n = {R.attr.enabled};
    private boolean A;
    private int B;
    private final DecelerateInterpolator C;
    private int D;
    private Animation E;
    private Animation F;
    private Animation G;
    private Animation H;
    private int I;
    private final Animation.AnimationListener J;
    private final Animation K;
    private final Animation L;
    public boolean a;
    public final agg b;
    int c;
    final bsx d;
    protected int e;
    protected final int f;
    final int g;
    int h;
    public final btb i;
    boolean j;
    boolean k;
    public ejj l;
    private View o;
    private final int p;
    private float q;
    private float r;
    private final agj s;
    private final int[] t;
    private final int[] u;
    private final int[] v;
    private boolean w;
    private final int x;
    private float y;
    private float z;

    public btl(Context context) {
        super(context, null);
        this.a = false;
        this.q = -1.0f;
        this.t = new int[2];
        this.u = new int[2];
        this.v = new int[2];
        this.B = -1;
        this.D = -1;
        this.J = new btd(this);
        this.K = new bti(this);
        this.L = new btj(this);
        this.p = ViewConfiguration.get(context).getScaledTouchSlop();
        this.x = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.C = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        bsx bsxVar = new bsx(getContext());
        this.d = bsxVar;
        btb btbVar = new btb(getContext());
        this.i = btbVar;
        btbVar.d(1);
        bsxVar.setImageDrawable(btbVar);
        bsxVar.setVisibility(8);
        addView(bsxVar);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.g = i;
        this.q = i;
        this.s = new agj();
        agg aggVar = new agg(this);
        this.b = aggVar;
        aggVar.a(true);
        int i2 = -this.I;
        this.c = i2;
        this.f = i2;
        b(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, n);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final Animation n(int i, int i2) {
        btg btgVar = new btg(this, i, i2);
        btgVar.setDuration(300L);
        bsx bsxVar = this.d;
        bsxVar.a = null;
        bsxVar.clearAnimation();
        bsxVar.startAnimation(btgVar);
        return btgVar;
    }

    private final void o(float f) {
        if (f > this.q) {
            r(true, true);
            return;
        }
        this.a = false;
        btb btbVar = this.i;
        btbVar.f(0.0f);
        bth bthVar = new bth(this);
        this.e = this.c;
        Animation animation = this.L;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.C);
        bsx bsxVar = this.d;
        bsxVar.a = bthVar;
        bsxVar.clearAnimation();
        bsxVar.startAnimation(animation);
        btbVar.b(false);
    }

    private final void p(float f) {
        btb btbVar = this.i;
        btbVar.b(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.q));
        float fMax = (float) Math.max(fMin - 0.4d, 0.0d);
        float fAbs = Math.abs(f) - this.q;
        int i = this.h;
        if (i <= 0) {
            i = this.g;
        }
        float f2 = i;
        double dMax = Math.max(0.0f, Math.min(fAbs, f2 + f2) / f2) / 4.0f;
        double dPow = dMax - Math.pow(dMax, 2.0d);
        int i2 = this.f;
        float f3 = fMin * f2;
        bsx bsxVar = this.d;
        if (bsxVar.getVisibility() != 0) {
            bsxVar.setVisibility(0);
        }
        bsxVar.setScaleX(1.0f);
        bsxVar.setScaleY(1.0f);
        if (f < this.q) {
            bta btaVar = btbVar.a;
            if (btaVar.t > 76 && !u(this.G)) {
                this.G = n(btaVar.t, 76);
            }
        } else {
            bta btaVar2 = btbVar.a;
            if (btaVar2.t < 255 && !u(this.H)) {
                this.H = n(btaVar2.t, 255);
            }
        }
        float f4 = (float) dPow;
        float f5 = f4 + f4;
        float f6 = f2 * f5;
        float f7 = (fMax * 5.0f) / 3.0f;
        btbVar.f(Math.min(0.8f, f7 * 0.8f));
        btbVar.c(Math.min(1.0f, f7));
        btbVar.a.g = (((f7 * 0.4f) - 0.25f) + f5 + f5) * 0.5f;
        btbVar.invalidateSelf();
        k((i2 + ((int) (f3 + (f6 + f6)))) - this.c);
    }

    private final void q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.B) {
            this.B = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void r(boolean z, boolean z2) {
        if (this.a != z) {
            this.j = z2;
            cH();
            this.a = z;
            if (!z) {
                l(this.J);
                return;
            }
            int i = this.c;
            Animation.AnimationListener animationListener = this.J;
            this.e = i;
            Animation animation = this.K;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.C);
            if (animationListener != null) {
                this.d.a = animationListener;
            }
            bsx bsxVar = this.d;
            bsxVar.clearAnimation();
            bsxVar.startAnimation(animation);
        }
    }

    private final void t(float f) {
        float f2 = this.z;
        float f3 = f - f2;
        float f4 = this.p;
        if (f3 <= f4 || this.A) {
            return;
        }
        this.y = f2 + f4;
        this.A = true;
        this.i.setAlpha(76);
    }

    private final boolean u(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    final void b(float f) {
        int i = this.f;
        k((this.e + ((int) ((i - r1) * f))) - this.d.getTop());
    }

    final void c() {
        bsx bsxVar = this.d;
        bsxVar.clearAnimation();
        btb btbVar = this.i;
        btbVar.stop();
        bsxVar.setVisibility(8);
        bsxVar.getBackground().setAlpha(255);
        btbVar.setAlpha(255);
        k(this.f - this.c);
        this.c = bsxVar.getTop();
    }

    public final void cH() {
        if (this.o == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.d)) {
                    this.o = childAt;
                    return;
                }
            }
        }
    }

    final void cI(float f) {
        bsx bsxVar = this.d;
        bsxVar.setScaleX(f);
        bsxVar.setScaleY(f);
    }

    @Override // defpackage.agh
    public final void d(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        j(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.b.c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.b.d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.b.e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.b.f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.agh
    public final void e(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.v);
    }

    @Override // defpackage.agi
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        int[] iArr2 = this.u;
        this.b.f(i, i2, i3, i4, iArr2, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = i4 + iArr2[1];
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || m()) {
            return;
        }
        float fAbs = this.r + Math.abs(i8);
        this.r = fAbs;
        p(fAbs);
        iArr[1] = iArr[1] + i6;
    }

    @Override // defpackage.agh
    public final void g(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.D;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        agj agjVar = this.s;
        return agjVar.b | agjVar.a;
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.g;
    }

    public int getProgressViewStartOffset() {
        return this.f;
    }

    @Override // defpackage.agh
    public final void h(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.b.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.a;
    }

    public final void j(boolean z, boolean z2) {
        if (z) {
            if (!this.a) {
                this.a = true;
                k((this.g + this.f) - this.c);
                this.j = z2;
                Animation.AnimationListener animationListener = this.J;
                bsx bsxVar = this.d;
                bsxVar.setVisibility(0);
                this.i.setAlpha(255);
                bte bteVar = new bte(this);
                this.E = bteVar;
                bteVar.setDuration(this.x);
                if (animationListener != null) {
                    bsxVar.a = animationListener;
                }
                bsxVar.clearAnimation();
                bsxVar.startAnimation(this.E);
                return;
            }
            z = true;
        }
        r(z, false);
    }

    final void k(int i) {
        bsx bsxVar = this.d;
        bsxVar.bringToFront();
        int[] iArr = ahj.a;
        bsxVar.offsetTopAndBottom(i);
        this.c = bsxVar.getTop();
    }

    final void l(Animation.AnimationListener animationListener) {
        btf btfVar = new btf(this);
        this.F = btfVar;
        btfVar.setDuration(150L);
        bsx bsxVar = this.d;
        bsxVar.a = animationListener;
        bsxVar.clearAnimation();
        bsxVar.startAnimation(this.F);
    }

    public final boolean m() {
        View view = this.o;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.cH()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.isEnabled()
            r2 = 0
            if (r1 == 0) goto L73
            boolean r1 = r4.m()
            if (r1 != 0) goto L73
            boolean r1 = r4.a
            if (r1 != 0) goto L73
            boolean r1 = r4.w
            if (r1 == 0) goto L1d
            goto L73
        L1d:
            if (r0 == 0) goto L50
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L4b
            r1 = 2
            if (r0 == r1) goto L31
            r1 = 3
            if (r0 == r1) goto L4b
            r1 = 6
            if (r0 == r1) goto L2d
            goto L70
        L2d:
            r4.q(r5)
            goto L70
        L31:
            int r0 = r4.B
            if (r0 != r3) goto L3d
            java.lang.String r5 = defpackage.btl.m
            java.lang.String r0 = "Got ACTION_MOVE event but don't have an active pointer id."
            android.util.Log.e(r5, r0)
            return r2
        L3d:
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L73
            float r5 = r5.getY(r0)
            r4.t(r5)
            goto L70
        L4b:
            r4.A = r2
            r4.B = r3
            goto L70
        L50:
            int r0 = r4.f
            bsx r1 = r4.d
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.k(r0)
            int r0 = r5.getPointerId(r2)
            r4.B = r0
            r4.A = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 < 0) goto L73
            float r5 = r5.getY(r0)
            r4.z = r5
        L70:
            boolean r5 = r4.A
            return r5
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btl.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.o == null) {
            cH();
        }
        View view = this.o;
        if (view != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            bsx bsxVar = this.d;
            int i5 = measuredWidth / 2;
            int measuredWidth2 = bsxVar.getMeasuredWidth() / 2;
            int measuredHeight2 = bsxVar.getMeasuredHeight();
            int i6 = this.c;
            int i7 = i5 + measuredWidth2;
            bsxVar.layout(i5 - measuredWidth2, i6, i7, measuredHeight2 + i6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.o == null) {
            cH();
        }
        View view = this.o;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        bsx bsxVar = this.d;
        bsxVar.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        this.D = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == bsxVar) {
                this.D = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return this.b.c(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.b.d(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.r;
            float f2 = 0.0f;
            if (f > 0.0f) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.r = 0.0f;
                } else {
                    f2 = f - f3;
                    this.r = f2;
                    iArr[1] = i2;
                }
                p(f2);
            }
        }
        int[] iArr2 = this.t;
        if (this.b.e(i - iArr[0], i2 - iArr[1], iArr2, null, 0)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.v);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.s.a(i, 0);
        this.b.h(i & 2, 0);
        this.r = 0.0f;
        this.w = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        SwipeRefreshLayout$SavedState swipeRefreshLayout$SavedState = (SwipeRefreshLayout$SavedState) parcelable;
        super.onRestoreInstanceState(swipeRefreshLayout$SavedState.getSuperState());
        j(swipeRefreshLayout$SavedState.a, false);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        return new SwipeRefreshLayout$SavedState(super.onSaveInstanceState(), this.a);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.a || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.s.b(0);
        this.w = false;
        float f = this.r;
        if (f > 0.0f) {
            o(f);
            this.r = 0.0f;
        } else {
            post(new Runnable() { // from class: btc
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.c();
                }
            });
        }
        this.b.b(0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || m() || this.a || this.w) {
            return false;
        }
        if (actionMasked == 0) {
            this.B = motionEvent.getPointerId(0);
            this.A = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.B);
                if (iFindPointerIndex < 0) {
                    Log.e(m, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.A) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.y) * 0.5f;
                    this.A = false;
                    o(y);
                }
                this.B = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.B);
                if (iFindPointerIndex2 < 0) {
                    Log.e(m, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                t(y2);
                if (this.A) {
                    float f = (y2 - this.y) * 0.5f;
                    if (f <= 0.0f) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    p(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(m, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.B = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // defpackage.agh
    public final boolean s(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public void setDistanceToTriggerSync(int i) {
        this.q = i;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        c();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.b.a(z);
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.d.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(getContext().getColor(i));
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 40.0f);
            }
            bsx bsxVar = this.d;
            bsxVar.setImageDrawable(null);
            btb btbVar = this.i;
            btbVar.d(i);
            bsxVar.setImageDrawable(btbVar);
        }
    }

    public void setSlingshotDistance(int i) {
        this.h = i;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.b.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.b.b(0);
    }
}
