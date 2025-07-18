package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tv {
    private static final Interpolator f = new ts(0);
    public int a;
    public int b;
    public View d;
    public Interpolator e;
    private float[] g;
    private float[] h;
    private float[] i;
    private float[] j;
    private int[] k;
    private int[] l;
    private int[] m;
    private int n;
    private VelocityTracker o;
    private final float p;
    private float q;
    private int r;
    private final OverScroller s;
    private final tu t;
    private boolean u;
    private final ViewGroup v;
    public int c = -1;
    private final Runnable w = new ki(this, 6, null);

    private tv(Context context, ViewGroup viewGroup, tu tuVar) {
        if (tuVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.v = viewGroup;
        this.t = tuVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.r = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.p = viewConfiguration.getScaledMaximumFlingVelocity();
        this.q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.e = f;
        this.s = new OverScroller(context, new tt(this));
    }

    public static tv b(ViewGroup viewGroup, tu tuVar) {
        return new tv(viewGroup.getContext(), viewGroup, tuVar);
    }

    private final int m(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth() / 2;
        float fSin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            float f2 = width;
            iAbs = Math.round(Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(iAbs, 600);
    }

    private final void n(int i) {
        float[] fArr = this.g;
        if (fArr == null || !h(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.h[i] = 0.0f;
        this.i[i] = 0.0f;
        this.j[i] = 0.0f;
        this.k[i] = 0;
        this.l[i] = 0;
        this.m[i] = 0;
        this.n = (~(1 << i)) & this.n;
    }

    private final void o(float f2, float f3) {
        this.u = true;
        this.t.d(this.d, f2, f3);
        this.u = false;
        if (this.a == 1) {
            f(0);
        }
    }

    private final void p() {
        float f2 = this.p;
        this.o.computeCurrentVelocity(1000, f2);
        o(v(this.o.getXVelocity(this.c), this.q, f2), v(this.o.getYVelocity(this.c), this.q, f2));
    }

    private final void q(float f2, float f3, int i) {
        x(f2, f3, i);
        x(f3, f2, i);
        x(f2, f3, i);
        x(f3, f2, i);
    }

    private final void r(float f2, float f3, int i) {
        float[] fArr = this.g;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.h;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.i;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.j;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.k;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.l;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.m;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.g = fArr2;
            this.h = fArr3;
            this.i = fArr4;
            this.j = fArr5;
            this.k = iArr;
            this.l = iArr2;
            this.m = iArr3;
        }
        float[] fArr9 = this.g;
        this.i[i] = f2;
        fArr9[i] = f2;
        float[] fArr10 = this.h;
        this.j[i] = f3;
        fArr10[i] = f3;
        int[] iArr7 = this.k;
        int i3 = (int) f2;
        int i4 = (int) f3;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.r ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.r) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.r) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.r) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.n |= 1 << i;
    }

    private final void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (u(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.i[pointerId] = x;
                this.j[pointerId] = y;
            }
        }
    }

    private final boolean t(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        tu tuVar = this.t;
        boolean z = tuVar.a(view) > 0;
        boolean z2 = tuVar.h() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.b) : z2 && Math.abs(f3) > ((float) this.b);
        }
        int i = this.b;
        return (f2 * f2) + (f3 * f3) > ((float) (i * i));
    }

    private final boolean u(int i) {
        return h(i);
    }

    private static final float v(float f2, float f3, float f4) {
        float fAbs = Math.abs(f2);
        if (fAbs < f3) {
            return 0.0f;
        }
        return fAbs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private static final int w(int i, int i2, int i3) {
        int iAbs = Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        return iAbs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private final void x(float f2, float f3, int i) {
        Math.abs(f2);
        Math.abs(f3);
        int i2 = this.k[i];
    }

    public final View a(int i, int i2) {
        ViewGroup viewGroup = this.v;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void c() {
        this.c = -1;
        float[] fArr = this.g;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0.0f);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            Arrays.fill(this.m, 0);
            this.n = 0;
        }
        VelocityTracker velocityTracker = this.o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.o = null;
        }
    }

    public final void d(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException(b.b(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")"));
        }
        this.d = view;
        this.c = i;
        this.t.b(view, i);
        f(1);
    }

    public final void e(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        if (this.o == null) {
            this.o = VelocityTracker.obtain();
        }
        this.o.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewA = a((int) x, (int) y);
            r(x, y, pointerId);
            k(viewA, pointerId);
            int i2 = this.k[pointerId];
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                p();
            }
            c();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    o(0.0f, 0.0f);
                }
                c();
                return;
            }
            if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                int i3 = (int) x2;
                float y2 = motionEvent.getY(actionIndex);
                int i4 = (int) y2;
                r(x2, y2, pointerId2);
                if (this.a == 0) {
                    k(a(i3, i4), pointerId2);
                    int i5 = this.k[pointerId2];
                    return;
                }
                View view = this.d;
                if (view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom()) {
                    k(this.d, pointerId2);
                    return;
                }
                return;
            }
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.a == 1 && pointerId3 == this.c) {
                int pointerCount = motionEvent.getPointerCount();
                while (true) {
                    if (i >= pointerCount) {
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(i);
                    if (pointerId4 != this.c) {
                        View viewA2 = a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                        View view2 = this.d;
                        if (viewA2 == view2 && k(view2, pointerId4)) {
                            if (this.c == -1) {
                                break;
                            }
                        }
                    }
                    i++;
                }
                p();
            }
            n(pointerId3);
            return;
        }
        if (this.a == 1) {
            int i6 = this.c;
            if (!u(i6) || (iFindPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.i;
            int i7 = this.c;
            float f2 = x3 - fArr[i7];
            float f3 = y3 - this.j[i7];
            int i8 = (int) f2;
            int left = this.d.getLeft() + i8;
            int i9 = (int) f3;
            int top = this.d.getTop() + i9;
            int left2 = this.d.getLeft();
            int top2 = this.d.getTop();
            if (i8 != 0) {
                left = this.t.f(this.d, left);
                int[] iArr = qv.a;
                this.d.offsetLeftAndRight(left - left2);
            }
            if (i9 != 0) {
                top = this.t.g(this.d, top);
                int[] iArr2 = qv.a;
                this.d.offsetTopAndBottom(top - top2);
            }
            if (i8 != 0 || i9 != 0) {
                this.t.i(this.d, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i);
                if (u(pointerId5)) {
                    float x4 = motionEvent.getX(i);
                    float y4 = motionEvent.getY(i);
                    float f4 = x4 - this.g[pointerId5];
                    float f5 = y4 - this.h[pointerId5];
                    q(f4, f5, pointerId5);
                    if (this.a == 1) {
                        break;
                    }
                    View viewA3 = a((int) x4, (int) y4);
                    if (t(viewA3, f4, f5) && k(viewA3, pointerId5)) {
                        break;
                    }
                }
                i++;
            }
        }
        s(motionEvent);
    }

    public final void f(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.t.c(i);
            if (this.a == 0) {
                this.d = null;
            }
        }
    }

    public final boolean g(int i, int i2, int i3, int i4) {
        float f2;
        float f3;
        float f4;
        int left = this.d.getLeft();
        int top = this.d.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.s.abortAnimation();
                f(0);
                return false;
            }
        }
        int i7 = i5;
        View view = this.d;
        int i8 = (int) this.q;
        int i9 = (int) this.p;
        int iW = w(i3, i8, i9);
        int iW2 = w(i4, (int) this.q, i9);
        int iAbs = Math.abs(i7);
        int iAbs2 = Math.abs(i6);
        int iAbs3 = Math.abs(iW);
        int iAbs4 = Math.abs(iW2);
        int i10 = iAbs3 + iAbs4;
        int i11 = iAbs + iAbs2;
        if (iW != 0) {
            f2 = iAbs3 / i10;
        } else {
            f2 = iAbs / i11;
        }
        if (iW2 != 0) {
            f3 = i10;
            f4 = iAbs4;
        } else {
            f3 = i11;
            f4 = iAbs2;
        }
        float f5 = f4 / f3;
        float fM = m(i7, iW, r13.a(view)) * f2;
        float fM2 = m(i6, iW2, this.t.h());
        this.e = f;
        this.s.startScroll(left, top, i7, i6, (int) (fM + (fM2 * f5)));
        f(2);
        return true;
    }

    public final boolean h(int i) {
        return ((1 << i) & this.n) != 0;
    }

    public final boolean i(int i, int i2) {
        if (this.u) {
            return g(i, i2, (int) this.o.getXVelocity(this.c), (int) this.o.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tv.j(android.view.MotionEvent):boolean");
    }

    final boolean k(View view, int i) {
        if (view == this.d && this.c == i) {
            return true;
        }
        if (view == null || !this.t.e(view, i)) {
            return false;
        }
        this.c = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.a == 2) {
            OverScroller overScroller = this.s;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.d.getLeft();
            int top = currY - this.d.getTop();
            if (left != 0) {
                View view = this.d;
                int[] iArr = qv.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.d;
                int[] iArr2 = qv.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.t.i(this.d, currX, currY);
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            } else if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                this.v.post(this.w);
            }
        }
        return this.a == 2;
    }
}
