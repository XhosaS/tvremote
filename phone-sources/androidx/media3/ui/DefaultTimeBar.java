package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.edt;
import defpackage.foe;
import defpackage.fsz;
import defpackage.ftn;
import defpackage.ftp;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DefaultTimeBar extends View {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    private final StringBuilder F;
    private final Formatter G;
    private final Runnable H;
    private final CopyOnWriteArraySet I;
    private final Point J;
    private int K;
    private long L;
    private int M;
    private Rect N;
    private long O;
    public final Rect a;
    public final Rect b;
    public final float c;
    public ValueAnimator d;
    public float e;
    public boolean f;
    public boolean g;
    public long h;
    public long i;
    public long j;
    public int k;
    public long[] l;
    public boolean[] m;
    private final Rect n;
    private final Rect o;
    private final Paint p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private final Paint u;
    private final Drawable v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private static int f(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private final long g() {
        long j = this.L;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.h;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.K;
    }

    private final long h() {
        if (this.b.width() <= 0 || this.h == -9223372036854775807L) {
            return 0L;
        }
        return (this.o.width() * this.h) / r0.width();
    }

    private final void i(float f) {
        Rect rect = this.b;
        this.o.right = edt.d((int) f, rect.left, rect.right);
    }

    private final void j(long j) {
        this.O = j;
        this.g = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((ftp) it.next()).G(this, j);
        }
    }

    private final void k() {
        Drawable drawable = this.v;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private final void l(long j) {
        if (this.O == j) {
            return;
        }
        this.O = j;
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((ftp) it.next()).H(j);
        }
    }

    private final boolean m(long j) {
        long j2 = this.h;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.g ? this.O : this.i;
        long jT = edt.t(j3 + j, 0L, j2);
        if (jT == j3) {
            return false;
        }
        if (this.g) {
            l(jT);
        } else {
            j(jT);
        }
        e();
        return true;
    }

    private static boolean n(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    public final String a() {
        return edt.X(this.F, this.G, this.i);
    }

    public final void b(ftp ftpVar) {
        ftpVar.getClass();
        this.I.add(ftpVar);
    }

    public final void c(boolean z) {
        if (this.d.isStarted()) {
            this.d.cancel();
        }
        this.f = z;
        this.e = 0.0f;
        invalidate(this.a);
    }

    public final void d(boolean z) {
        removeCallbacks(this.H);
        this.g = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((ftp) it.next()).I(this.O, z);
        }
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        k();
    }

    public final void e() {
        Rect rect = this.n;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.o;
        rect3.set(rect2);
        long j = this.g ? this.O : this.i;
        if (this.h > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.j) / this.h)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.h)), rect2.right);
        } else {
            rect.right = rect2.left;
            rect3.right = rect2.left;
        }
        invalidate(this.a);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.v;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.b;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = 0;
        if (this.h <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, this.r);
        } else {
            Rect rect2 = this.n;
            int i2 = rect2.left;
            int i3 = rect2.right;
            int iMax = Math.max(rect.left, i3);
            Rect rect3 = this.o;
            int iMax2 = Math.max(iMax, rect3.right);
            if (iMax2 < rect.right) {
                canvas.drawRect(iMax2, iCenterY, rect.right, i, this.r);
            }
            int iMax3 = Math.max(i2, rect3.right);
            if (i3 > iMax3) {
                canvas.drawRect(iMax3, iCenterY, i3, i, this.q);
            }
            if (rect3.width() > 0) {
                canvas.drawRect(rect3.left, iCenterY, rect3.right, i, this.p);
            }
            if (this.k != 0) {
                long[] jArr = this.l;
                jArr.getClass();
                boolean[] zArr = this.m;
                zArr.getClass();
                int i4 = this.z;
                int i5 = i4 / 2;
                int i6 = 0;
                while (i6 < this.k) {
                    float f = i;
                    float f2 = iCenterY;
                    long j2 = j;
                    int i7 = i6;
                    canvas.drawRect(rect.left + Math.min(rect.width() - i4, Math.max(0, ((int) ((rect.width() * edt.t(jArr[i6], 0L, this.h)) / this.h)) - i5)), f2, r2 + i4, f, zArr[i7] ? this.t : this.s);
                    i6 = i7 + 1;
                    j = j2;
                }
            }
            canvas2 = canvas;
        }
        if (this.h > j) {
            Rect rect4 = this.o;
            int iD = edt.d(rect4.right, rect4.left, rect.right);
            Drawable drawable = this.v;
            int iCenterY2 = rect4.centerY();
            if (drawable == null) {
                canvas2.drawCircle(iD, iCenterY2, (int) ((((this.g || isFocused()) ? this.C : isEnabled() ? this.A : this.B) * this.e) / 2.0f), this.u);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.e)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.e)) / 2;
                drawable.setBounds(iD - intrinsicWidth, iCenterY2 - intrinsicHeight, iD + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.g || z) {
            return;
        }
        d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(a());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(a());
        if (this.h <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.g()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m(r0)
            if (r0 == 0) goto L2e
            java.lang.Runnable r5 = r4.H
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.g
            if (r0 == 0) goto L2e
            r5 = 0
            r4.d(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int iMax;
        Rect rect;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        int i7 = this.f ? 0 : this.D;
        int i8 = i4 - i2;
        if (this.y == 1) {
            int paddingBottom = i8 - getPaddingBottom();
            int i9 = this.x;
            int paddingBottom2 = i8 - getPaddingBottom();
            int i10 = this.w;
            iMax = (paddingBottom2 - i10) - Math.max(i7 - (i10 / 2), 0);
            i5 = paddingBottom - i9;
        } else {
            i5 = (i8 - this.x) / 2;
            iMax = (i8 - this.w) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, i5, paddingRight, this.x + i5);
        this.b.set(rect2.left + i7, iMax, rect2.right - i7, this.w + iMax);
        if (Build.VERSION.SDK_INT >= 29 && ((rect = this.N) == null || rect.width() != i6 || this.N.height() != i8)) {
            Rect rect3 = new Rect(0, 0, i6, i8);
            this.N = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.x;
        } else if (mode != 1073741824) {
            size = Math.min(this.x, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        k();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.v;
        if (drawable == null || !n(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L86
            long r2 = r7.h
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L86
        L11:
            android.graphics.Point r0 = r7.J
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L69
            r5 = 3
            if (r3 == r4) goto L5a
            r6 = 2
            if (r3 == r6) goto L34
            if (r3 == r5) goto L5a
            goto L86
        L34:
            boolean r8 = r7.g
            if (r8 == 0) goto L86
            int r8 = r7.E
            if (r0 >= r8) goto L46
            int r8 = r7.M
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.i(r8)
            goto L4c
        L46:
            float r8 = (float) r2
            r7.M = r2
            r7.i(r8)
        L4c:
            long r0 = r7.h()
            r7.l(r0)
            r7.e()
            r7.invalidate()
            return r4
        L5a:
            boolean r0 = r7.g
            if (r0 == 0) goto L86
            int r8 = r8.getAction()
            if (r8 != r5) goto L65
            r1 = r4
        L65:
            r7.d(r1)
            return r4
        L69:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.a
            int r3 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L86
            r7.i(r8)
            long r0 = r7.h()
            r7.j(r0)
            r7.e()
            r7.invalidate()
            return r4
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.h <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m(-g())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m(g())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.g || z) {
            return;
        }
        d(true);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        ?? r2;
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        Paint paint = new Paint();
        this.p = paint;
        Paint paint2 = new Paint();
        this.q = paint2;
        Paint paint3 = new Paint();
        this.r = paint3;
        Paint paint4 = new Paint();
        this.s = paint4;
        Paint paint5 = new Paint();
        this.t = paint5;
        Paint paint6 = new Paint();
        this.u = paint6;
        paint6.setAntiAlias(true);
        this.I = new CopyOnWriteArraySet();
        this.J = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.c = f;
        this.E = f(f, -50);
        int iF = f(f, 4);
        int iF2 = f(f, 26);
        int iF3 = f(f, 4);
        int iF4 = f(f, 12);
        int iF5 = f(f, 0);
        int iF6 = f(f, 16);
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, ftn.b, i, i2);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.v = drawable;
                if (drawable != null) {
                    n(drawable, getLayoutDirection());
                    iF2 = Math.max(drawable.getMinimumHeight(), iF2);
                }
                this.w = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iF);
                this.x = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iF2);
                this.y = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iF3);
                this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iF4);
                this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iF5);
                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iF6);
                int i3 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i4 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i5 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i6 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i7 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i8 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        } else {
            this.w = iF;
            this.x = iF2;
            this.y = 0;
            this.z = iF3;
            this.A = iF4;
            this.B = iF5;
            this.C = iF6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.v = null;
        }
        StringBuilder sb = new StringBuilder();
        this.F = sb;
        this.G = new Formatter(sb, Locale.getDefault());
        this.H = new foe(this, 3);
        Drawable drawable2 = this.v;
        if (drawable2 != null) {
            r2 = 1;
            this.D = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            r2 = 1;
            this.D = (Math.max(this.B, Math.max(this.A, this.C)) + 1) / 2;
        }
        this.e = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.d = valueAnimator;
        valueAnimator.addUpdateListener(new fsz(this, (int) r2));
        this.h = -9223372036854775807L;
        this.L = -9223372036854775807L;
        this.K = 20;
        setFocusable((boolean) r2);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(r2);
        }
    }
}
