package com.google.android.apps.play.movies.mobile.usecase.watch;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import defpackage.a;
import defpackage.jwq;
import defpackage.kqb;
import defpackage.ksi;
import defpackage.mrx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TimeBar extends View implements Runnable {
    private static final int[] h = {R.attr.state_enabled};
    private static final int[] i = {-16842910};
    private static final int[] j = {R.attr.state_pressed};
    private final int A;
    private final int B;
    private final int C;
    private final List D;
    private TextView E;
    private TextView F;
    private boolean G;
    private int H;
    private float I;
    private float J;
    private int K;
    private long L;
    private ImmutableList M;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    private final Rect k;
    private final Rect l;
    private final Rect m;
    private final Rect n;
    private final Paint o;
    private final Paint p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final Rect t;
    private final StateListDrawable u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public TimeBar(Context context) {
        this(context, null, 0);
    }

    private final TextView g(int i2) {
        View rootView;
        if (i2 == -1 || (rootView = getRootView()) == null) {
            return null;
        }
        View viewFindViewById = rootView.findViewById(i2);
        if (viewFindViewById instanceof TextView) {
            return (TextView) viewFindViewById;
        }
        return null;
    }

    private final String h(int i2) {
        return ksi.d(i2, ((long) this.e) >= 3600000);
    }

    private final void i() {
        if (jwq.X(getContext())) {
            this.E.setContentDescription(jwq.H(getContext(), this.a));
        }
    }

    private final void j(int i2) {
        if (!this.b || this.e <= 0) {
            return;
        }
        int iWidth = i2 - (this.k.left + ((int) ((r0.width() * this.f) / this.e)));
        float f = iWidth;
        int iAbs = Math.abs(iWidth);
        float fSignum = Math.signum(f);
        boolean z = fSignum == Math.signum((float) (i2 - this.H)) && fSignum != this.I;
        if (iAbs > this.A || z || !this.G) {
            this.a = (int) (this.e * Math.max(0.0f, Math.min(1.0f, (i2 - r0.left) / r0.width())));
            if (iAbs > this.v) {
                this.G = true;
            } else if (z) {
                this.G = false;
                this.I = 0.0f;
            }
        } else {
            if (this.a != this.f) {
                this.I = Math.signum(r0 - r1);
                this.a = this.f;
                performHapticFeedback(3, 2);
            }
        }
        f(1);
        this.H = i2;
        i();
    }

    private final boolean k() {
        return isEnabled() && this.e > 0;
    }

    public final void a(mrx mrxVar) {
        this.D.add(mrxVar);
    }

    public final void b(int i2) {
        int i3;
        if (this.b) {
            this.K = 2;
            this.L = SystemClock.uptimeMillis();
            invalidate();
            this.b = false;
            this.a = i2;
            if (this.f != i2) {
                this.f = i2;
                i3 = 35;
            } else {
                i3 = 33;
            }
            f(i3);
            i();
        }
    }

    public final void c(mrx mrxVar) {
        a.ab(this.D.remove(mrxVar));
    }

    public final void d(int i2) {
        if (this.b) {
            this.a = i2;
            f(1);
            i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[PHI: r1
  0x008e: PHI (r1v11 float) = (r1v10 float), (r1v12 float) binds: [B:27:0x008c, B:24:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.watch.TimeBar.draw(android.graphics.Canvas):void");
    }

    public final void e() {
        if (this.b) {
            return;
        }
        this.K = 1;
        this.L = SystemClock.uptimeMillis();
        invalidate();
        this.b = true;
        f(1);
    }

    public final void f(int i2) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (i2 == 0) {
            return;
        }
        if ((i2 & 1) != 0) {
            this.u.setState(this.b ? j : k() ? h : i);
        }
        if ((i2 & 32) != 0 && (textView3 = this.E) != null) {
            textView3.setText(h(this.a));
        }
        if ((i2 & 8) != 0 && (textView2 = this.F) != null) {
            textView2.setText(h(this.e));
        }
        if ((i2 & 40) != 0 && (textView = this.E) != null) {
            Context context = getContext();
            textView.setContentDescription(context.getString(com.google.android.videos.R.string.accessibility_progress_duration, jwq.H(context, this.a), jwq.H(context, this.e)));
        }
        if ((i2 & 10) != 0) {
            Rect rect = this.l;
            Rect rect2 = this.k;
            rect.set(rect2);
            int i3 = this.e;
            if (i3 > 0) {
                rect.right = rect2.left + ((int) (rect2.width() * (this.f / i3)));
            }
        }
        if ((i2 & 4) != 0) {
            Rect rect3 = this.m;
            Rect rect4 = this.k;
            rect3.set(rect4);
            int i4 = this.e;
            if (i4 > 0) {
                rect3.right = rect4.left + ((int) (rect4.width() * (this.g / i4)));
            }
        }
        if ((i2 & 16) != 0) {
            boolean z = this.e > 0;
            TextView textView4 = this.E;
            if (textView4 != null) {
                textView4.setEnabled(z);
            }
            TextView textView5 = this.F;
            if (textView5 != null) {
                textView5.setEnabled(z);
            }
        }
        invalidate();
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = g(this.B);
        this.F = g(this.C);
        f(57);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int defaultSize = getDefaultSize(0, i2);
        int defaultSize2 = getDefaultSize(0, i3);
        setMeasuredDimension(defaultSize, defaultSize2);
        int paddingTop = getPaddingTop() + (((defaultSize2 - getPaddingTop()) - getPaddingBottom()) / 2);
        int paddingLeft = getPaddingLeft();
        int i4 = this.z;
        int i5 = paddingLeft + i4;
        int paddingRight = defaultSize - getPaddingRight();
        Rect rect = this.k;
        int i6 = this.w / 2;
        int i7 = paddingRight - i4;
        rect.set(i5, paddingTop - i6, i7, paddingTop + i6);
        this.t.set(i5 - i4, paddingTop - i4, i7 + i4, paddingTop + i4);
        f(6);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.k()
            r1 = 0
            if (r0 == 0) goto Lb6
            float r0 = r10.getX()
            int r0 = (int) r0
            float r2 = r10.getY()
            int r2 = (int) r2
            int r10 = r10.getAction()
            r3 = 1
            if (r10 == 0) goto L79
            if (r10 == r3) goto L4f
            r2 = 2
            if (r10 == r2) goto L22
            r0 = 3
            if (r10 == r0) goto L4f
            goto Lb6
        L22:
            boolean r10 = r9.b
            if (r10 == 0) goto Lb6
            r9.j(r0)
            java.util.List r10 = r9.D
            java.util.Iterator r10 = r10.iterator()
        L2f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r10.next()
            mrx r1 = (defpackage.mrx) r1
            android.graphics.Rect r2 = r9.k
            int r4 = r2.left
            int r2 = r2.right
            int r2 = java.lang.Math.min(r2, r0)
            java.lang.Math.max(r4, r2)
            int r2 = r9.a
            r1.E(r2)
            goto L2f
        L4e:
            return r3
        L4f:
            boolean r10 = r9.b
            if (r10 == 0) goto Lb6
            int r10 = r9.a
            int r0 = r9.f
            r9.b(r10)
            java.util.List r1 = r9.D
            java.util.Iterator r1 = r1.iterator()
        L60:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            mrx r2 = (defpackage.mrx) r2
            if (r10 == r0) goto L74
            int r4 = r9.a
            r2.x(r4)
            goto L60
        L74:
            r2.w()
            goto L60
        L78:
            return r3
        L79:
            float r10 = (float) r0
            float r2 = (float) r2
            int r4 = r9.A
            android.graphics.Rect r5 = r9.t
            int r10 = (int) r10
            android.graphics.Rect r6 = new android.graphics.Rect
            int r7 = r10 - r4
            int r2 = (int) r2
            int r8 = r2 - r4
            int r10 = r10 + r4
            int r2 = r2 + r4
            r6.<init>(r7, r8, r10, r2)
            boolean r10 = android.graphics.Rect.intersects(r5, r6)
            if (r10 == 0) goto Lb6
            r9.G = r1
            r9.H = r0
            r10 = 0
            r9.I = r10
            r9.e()
            r9.j(r0)
            java.util.List r10 = r9.D
            java.util.Iterator r10 = r10.iterator()
        La5:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lb5
            java.lang.Object r0 = r10.next()
            mrx r0 = (defpackage.mrx) r0
            r0.y()
            goto La5
        Lb5:
            return r3
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.play.movies.mobile.usecase.watch.TimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        i();
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        if (isEnabled() == z) {
            return;
        }
        super.setEnabled(z);
        if (this.b) {
            b(this.a);
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                ((mrx) it.next()).x(this.a);
            }
        }
    }

    public TimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimeBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Paint paint = new Paint();
        this.o = paint;
        Paint paint2 = new Paint();
        this.p = paint2;
        Paint paint3 = new Paint();
        this.q = paint3;
        Paint paint4 = new Paint();
        this.r = paint4;
        Paint paint5 = new Paint();
        this.s = paint5;
        this.D = new ArrayList();
        this.a = 0;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.M = ImmutableList.of();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kqb.c);
        this.B = typedArrayObtainStyledAttributes.getResourceId(8, -1);
        this.C = typedArrayObtainStyledAttributes.getResourceId(4, -1);
        this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, (int) ((displayMetrics.density * 5.0f) + 0.5d));
        this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, (int) ((displayMetrics.density * 5.0f) + 0.5d));
        this.y = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, (int) ((displayMetrics.density * 12.0f) + 0.5d));
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) ((displayMetrics.density * 24.0f) + 0.5d));
        paint.setColor(typedArrayObtainStyledAttributes.getColor(7, -8355712));
        paint3.setColor(typedArrayObtainStyledAttributes.getColor(3, -1));
        paint2.setColor(typedArrayObtainStyledAttributes.getColor(5, -49088));
        paint4.setColor(typedArrayObtainStyledAttributes.getColor(0, -1));
        paint5.setColor(typedArrayObtainStyledAttributes.getColor(1, -1));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(11, com.google.android.videos.R.drawable.scrubber);
        typedArrayObtainStyledAttributes.recycle();
        this.k = new Rect();
        this.m = new Rect();
        this.l = new Rect();
        this.t = new Rect();
        this.n = new Rect();
        StateListDrawable stateListDrawable = (StateListDrawable) context.getDrawable(resourceId);
        this.u = stateListDrawable;
        stateListDrawable.setState(i);
        this.A = (int) (displayMetrics.density * 6.0f);
        this.v = (int) (displayMetrics.density * 14.0f);
    }
}
