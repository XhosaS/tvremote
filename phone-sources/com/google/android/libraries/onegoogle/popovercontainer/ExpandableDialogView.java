package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.videos.R;
import defpackage.csq;
import defpackage.cvo;
import defpackage.cvp;
import defpackage.cwm;
import defpackage.cww;
import defpackage.duo;
import defpackage.dup;
import defpackage.nhl;
import defpackage.qxp;
import defpackage.rjg;
import defpackage.rji;
import defpackage.rle;
import defpackage.rlf;
import defpackage.rlg;
import defpackage.rlh;
import defpackage.rli;
import defpackage.rlj;
import defpackage.rlk;
import defpackage.rll;
import defpackage.rlm;
import defpackage.rmf;
import defpackage.rrx;
import defpackage.sil;
import defpackage.sip;
import defpackage.snt;
import defpackage.sss;
import defpackage.sst;
import defpackage.stq;
import defpackage.szk;
import defpackage.szp;
import defpackage.szq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandableDialogView extends ViewGroup implements cvo, rji {
    public static final /* synthetic */ int m = 0;
    private static final TimeInterpolator n = new duo();
    private static final Property o = new rlj(Integer.class);
    private static final Property p = new rlk(RectF.class);
    private static final Property q = new rll(Integer.class);
    private boolean A;
    private boolean B;
    private int C;
    private final Paint D;
    private final Paint E;
    private final Paint F;
    private final RectF G;
    private final ObjectAnimator H;
    private final ObjectAnimator I;
    private final int J;
    private final sst K;
    private final Paint L;
    private final int M;
    private final boolean N;
    private final boolean O;
    private OverScrollControlledNestedScrollView P;
    private View Q;
    private boolean R;
    private Configuration S;
    private boolean T;
    private boolean U;
    private boolean V;
    private int W;
    public final Rect a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final nhl af;
    public final float b;
    public final RectF c;
    public View d;
    public final szk e;
    public final float f;
    public float g;
    public View h;
    public int i;
    public Runnable j;
    public Window k;
    public int l;
    private final cvp r;
    private final Rect s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private float z;

    public ExpandableDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.r = new cvp();
        this.s = new Rect();
        this.a = new Rect();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        Paint paint3 = new Paint(1);
        this.F = paint3;
        this.G = new RectF();
        RectF rectF = new RectF();
        this.c = rectF;
        Paint paint4 = new Paint(1);
        this.L = paint4;
        this.t = getResources().getDimensionPixelSize(R.dimen.og_dialog_margin_horizontal);
        this.v = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_margin_bottom);
        this.w = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_width);
        this.x = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_max_height);
        this.y = getResources().getDimensionPixelSize(R.dimen.og_dialog_tablet_min_scroll);
        float fAs = rrx.as(getContext(), R.attr.ogDialogCornerRadius);
        this.b = fAs;
        this.f = rrx.as(getContext(), R.attr.ogDialogHeaderElevation);
        setWillNotDraw(false);
        paint4.setStyle(Paint.Style.FILL);
        int iD = sss.d(getContext());
        this.J = iD;
        int i = rrx.aw(context, R.attr.elevationOverlayEnabled).data;
        this.K = new sst(i != 0, sip.d(context, R.attr.elevationOverlayColor, 0), sip.d(context, R.attr.elevationOverlayAccentColor, 0), iD, context.getResources().getDisplayMetrics().density);
        int iAt = rrx.at(getContext(), R.attr.ogLightGrey);
        this.M = iAt;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, rmf.a, 0, 0);
        try {
            this.N = typedArrayObtainStyledAttributes.getBoolean(2, false);
            this.O = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelSize(R.dimen.og_dialog_default_margin_top));
            typedArrayObtainStyledAttributes.recycle();
            paint3.setColor(iD);
            if (Build.VERSION.SDK_INT >= 26) {
                paint.setColor(csq.g(iD, Math.round(204.0f)));
            } else {
                paint.setColor(context.getColor(R.color.google_scrim));
            }
            paint2.setColor(iAt);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, (Property<ExpandableDialogView, Integer>) o, 0);
            this.I = objectAnimatorOfInt;
            objectAnimatorOfInt.setDuration(150L);
            objectAnimatorOfInt.setInterpolator(new dup());
            objectAnimatorOfInt.addListener(new rlf(this));
            szk szkVarE = szk.E(getContext(), 0.0f, null);
            this.e = szkVarE;
            szkVarE.N(ColorStateList.valueOf(iD));
            szp szpVar = new szp();
            szpVar.f(fAs);
            szpVar.g(fAs);
            szkVarE.p(new szq(szpVar));
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this, (Property<ExpandableDialogView, V>) p, new stq(new RectF(), 1), rectF);
            this.H = objectAnimatorOfObject;
            objectAnimatorOfObject.setDuration(300L);
            objectAnimatorOfObject.setInterpolator(new dup());
            objectAnimatorOfObject.addListener(new rlg(this));
            setClipToOutline(true);
            setOutlineProvider(new rlh(this));
            setClipChildren(false);
            m(getResources().getConfiguration());
            nhl nhlVar = new nhl(getContext(), new rli(this));
            this.af = nhlVar;
            nhlVar.a(false);
            this.l = 1;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void k(int i) {
        int i2;
        Rect rect = this.a;
        int iHeight = rect.height();
        int iRound = Math.round(this.t * (1.0f - a()));
        if (this.T && i > (i2 = this.w)) {
            int i3 = this.C;
            Rect rect2 = this.s;
            rect.top = i3 + rect2.top;
            int i4 = this.l;
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == 0) {
                rect.left = ((((i - rect2.left) - rect2.right) - i2) / 2) + rect2.left;
            }
            rect.right = rect.left + i2;
            rect.bottom = rect.top + iHeight;
            this.G.set(rect);
            return;
        }
        Rect rect3 = this.s;
        rect.top = rect3.top + (i() ? 0 : this.C - this.i);
        rect.left = rect3.left + iRound;
        rect.right = (i - rect3.right) - iRound;
        if (this.A || q()) {
            rect.bottom = rect.top + iHeight;
        } else if (this.i <= 0) {
            rect.bottom = rect.top + this.d.getMeasuredHeight() + this.aa;
        } else {
            rect.bottom = rect3.top + this.C + this.d.getMeasuredHeight() + this.aa + Math.round((this.W - r1) * a());
        }
        if (i()) {
            this.G.set(0.0f, 0.0f, i, this.W);
        } else {
            this.G.set(rect.left, rect.top - (n.getInterpolation(Math.max(0.0f, (a() - 0.6f) / 0.39999998f)) * rect3.top), rect.right, rect.bottom);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(float f) {
        this.Q.setTranslationY(f);
    }

    private final void m(Configuration configuration) {
        this.T = configuration.smallestScreenWidthDp >= 600;
        this.U = configuration.orientation == 2;
        this.V = rrx.ad(getContext());
        requestLayout();
    }

    private final void n(float f) {
        this.z = f;
        o();
    }

    private final void o() {
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = this.P;
        if (overScrollControlledNestedScrollView != null) {
            boolean z = true;
            if (!i() && !this.T) {
                z = false;
            }
            overScrollControlledNestedScrollView.h = z;
        }
    }

    private final boolean p() {
        int i = this.i;
        return i < -290 || i <= this.ad;
    }

    private final boolean q() {
        return (this.U || this.V) && !this.T;
    }

    public final float a() {
        if (this.T) {
            return 0.0f;
        }
        if (q()) {
            return 1.0f;
        }
        return this.z;
    }

    @Override // defpackage.rji
    public final void b(rjg rjgVar) {
        rjgVar.b(findViewById(R.id.og_container_header), 93522);
        rjgVar.b(findViewById(R.id.og_header_close_button), 93521);
        View view = this.h;
        view.getClass();
        rjgVar.b(view, 90573);
    }

    public final int c(float f) {
        return this.K.b(this.J, f + sil.g(this));
    }

    public final void d(int i) {
        Runnable runnable;
        if (this.i == i) {
            return;
        }
        n(Math.max(0.0f, i / this.C));
        this.P.offsetTopAndBottom(this.i - i);
        this.i = i;
        this.H.cancel();
        k(getWidth());
        if (!this.A) {
            f(this.G);
        }
        this.c.set(this.G);
        g();
        invalidate();
        invalidateOutline();
        View view = this.d;
        Rect rect = this.a;
        view.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        this.d.layout(rect.left, rect.top, rect.right, rect.top + this.d.getMeasuredHeight());
        if (!this.N) {
            this.P.layout(rect.left, this.d.getBottom(), rect.right, rect.bottom);
        }
        if (i > this.ac || (runnable = this.j) == null) {
            return;
        }
        runnable.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Rect rect = this.a;
        int iSave = canvas.save();
        canvas.clipRect(rect.left, rect.top, rect.right, this.c.bottom);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.rji
    public final void e(rjg rjgVar) {
        rjgVar.e(findViewById(R.id.og_header_close_button));
        rjgVar.e(findViewById(R.id.og_container_header));
        View view = this.h;
        view.getClass();
        rjgVar.e(view);
    }

    public final void f(RectF rectF) {
        this.c.set(rectF);
        l((rectF.bottom - this.P.getTop()) - this.ab);
        g();
        invalidate();
        invalidateOutline();
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        this.s.set(rect);
        return true;
    }

    public final void g() {
        Window window;
        Rect rect = this.s;
        RectF rectF = this.c;
        boolean zH = h();
        rrx.ab(this, rectF.top < ((float) rect.top) / 2.0f, !zH);
        float f = rectF.bottom;
        int height = getHeight() - rect.bottom;
        Window window2 = this.k;
        boolean z = f >= ((float) height);
        if (window2 != null) {
            if (this.U || !z) {
                window2.setNavigationBarColor(0);
            } else {
                window2.setNavigationBarColor(this.ae);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (!this.U || this.T) {
                if (!z) {
                    setSystemUiVisibility(getSystemUiVisibility() & (-17));
                } else if (Build.VERSION.SDK_INT > 26 && Build.VERSION.SDK_INT < 29 && !zH) {
                    setSystemUiVisibility(getSystemUiVisibility() | 16);
                }
                if (Build.VERSION.SDK_INT < 28 || (window = this.k) == null) {
                    return;
                }
                window.setNavigationBarDividerColor(z ? this.M : 0);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.r.a();
    }

    public final boolean h() {
        Configuration configuration = this.S;
        return configuration != null && (configuration.uiMode & 48) == 32;
    }

    final boolean i() {
        return a() == 1.0f;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        this.s.set(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build.VERSION.SDK_INT >= 26) {
            post(new qxp(this, 15));
        }
        this.ae = (this.k == null || Build.VERSION.SDK_INT >= 29) ? 0 : this.k.getNavigationBarColor();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m(configuration);
        o();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float fA = 1.0f - a();
        float f = this.b;
        RectF rectF = this.c;
        float f2 = f * fA;
        canvas.drawRoundRect(rectF, f2, f2, this.F);
        szp szpVar = new szp();
        szpVar.f(f2);
        szpVar.g(f2);
        this.e.p(new szq(szpVar));
        if (i()) {
            View view = this.d;
            int[] iArr = cww.a;
            float fA2 = cwm.a(view);
            Paint paint = this.L;
            paint.setColor(c(fA2));
            Rect rect = this.s;
            canvas.drawRect(rect.left, -rect.top, rectF.right - rect.right, this.d.getTop(), paint);
        }
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        Paint paint;
        float fA = 1.0f - a();
        canvas.save();
        Rect rect = this.s;
        canvas.clipRect(0, getHeight() - rect.bottom, getWidth(), getHeight());
        RectF rectF = this.c;
        Paint paint2 = this.D;
        float f = this.b * fA;
        canvas.drawRoundRect(rectF, f, f, paint2);
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.drawRect(0.0f, getHeight() - rect.bottom, getWidth(), (getHeight() - rect.bottom) + 1, this.E);
        }
        canvas.restore();
        if (Build.VERSION.SDK_INT >= 26 && i()) {
            if (rect.left > 0) {
                canvas.drawRect(rect.left - 1, 0.0f, rect.left, getHeight(), this.E);
            }
            if (rect.right > 0) {
                canvas.drawRect(getWidth() - rect.right, 0.0f, (getWidth() - rect.right) + 1, getHeight(), this.E);
            }
        }
        if (Build.VERSION.SDK_INT >= 26 || !i()) {
            return;
        }
        if (rect.left > 0) {
            paint = paint2;
            canvas.drawRect(-rect.left, 0.0f, rect.left, getHeight(), paint);
        } else {
            paint = paint2;
        }
        if (rect.right > 0) {
            canvas.drawRect(getWidth() - rect.right, 0.0f, getWidth() + rect.right, getHeight(), paint);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(0);
        this.d = childAt;
        int[] iArr = cww.a;
        childAt.setBackground(this.e);
        this.d.setOutlineProvider(null);
        this.P = (OverScrollControlledNestedScrollView) findViewById(R.id.og_container_scroll_view);
        this.Q = findViewById(R.id.og_container_footer);
        this.h = findViewById(R.id.og_dialog_scrim_ve);
        findViewById(R.id.og_container_disable_content_view).setBackgroundColor(this.J);
        if (Build.VERSION.SDK_INT <= 26) {
            this.P.findViewById(R.id.og_container_scroll_root).setFocusableInTouchMode(true);
        }
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.a;
        this.d.layout(rect.left, rect.top, rect.right, rect.top + this.d.getMeasuredHeight());
        int i5 = (this.T || !this.N) ? rect.left : this.s.left;
        this.P.layout(i5, this.d.getBottom(), this.P.getMeasuredWidth() + i5, rect.bottom);
        if (this.i == 0) {
            this.P.setScrollY(0);
        }
        g();
        if (!getResources().getConfiguration().equals(this.S)) {
            this.S = getResources().getConfiguration();
            this.c.set(this.G);
            invalidateOutline();
            return;
        }
        RectF rectF = this.c;
        RectF rectF2 = this.G;
        if (rectF.equals(rectF2)) {
            return;
        }
        ObjectAnimator objectAnimator = this.H;
        objectAnimator.setObjectValues(rectF2);
        objectAnimator.start();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int iMin;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        k(size);
        Rect rect = this.s;
        int i3 = (size2 - rect.top) - rect.bottom;
        Rect rect2 = this.a;
        this.d.measure(View.MeasureSpec.makeMeasureSpec(rect2.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
        int measuredHeight = this.d.getMeasuredHeight();
        int iWidth = (this.T || !this.N) ? rect2.width() : (size - rect.left) - rect.right;
        int i4 = i3 - measuredHeight;
        boolean z = this.T;
        int i5 = z ? (i4 - this.u) - this.v : i4 - this.u;
        int i6 = z ? this.y : 0;
        this.W = size2 - rect.bottom;
        this.P.findViewById(R.id.og_container_scroll_root).setMinimumHeight(0);
        this.P.measure(View.MeasureSpec.makeMeasureSpec(iWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
        this.aa = this.P.getMeasuredHeight();
        boolean z2 = this.P.getMeasuredHeight() - i5 >= i6;
        this.A = z2;
        if (i() || (!this.T && z2 && this.P.getMeasuredHeight() < i4)) {
            this.P.findViewById(R.id.og_container_scroll_root).setMinimumHeight(i4);
            this.P.measure(View.MeasureSpec.makeMeasureSpec(iWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        }
        if (i() || this.A) {
            iMin = this.T ? Math.min(this.x - measuredHeight, i5) : i4;
        } else {
            iMin = this.P.getMeasuredHeight();
            n(0.0f);
        }
        if (!this.O || i() || this.T) {
            this.C = this.u;
        } else {
            this.C = Math.max(this.u, (i4 - iMin) / 2);
        }
        int i7 = -size2;
        this.ac = rect.top + i7 + this.C;
        this.ad = (i7 / 2) + rect.top + this.C;
        rect2.bottom = rect2.top + iMin + measuredHeight;
        this.G.bottom = i() ? this.W : rect2.bottom;
        this.ab = this.P.findViewById(R.id.og_container_scroll_root).getMeasuredHeight();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return this.i < this.C;
    }

    @Override // defpackage.cvn
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int i4;
        int i5;
        if (i2 <= 0 || (i4 = this.i) >= (i5 = this.C)) {
            return;
        }
        if (!this.A && !this.B) {
            i5 = 0;
        }
        int iMin = Math.min(i2, i5 - i4);
        iArr[1] = iMin;
        d(this.i + iMin);
    }

    @Override // defpackage.cvn
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.r.d(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        rlm rlmVar = (rlm) parcelable;
        super.onRestoreInstanceState(rlmVar.b);
        n(true != rlmVar.a ? 0.0f : 1.0f);
        this.i = Math.round(this.z * this.u);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        float f = this.z;
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState != null) {
            return new rle(f == 1.0f, parcelableOnSaveInstanceState);
        }
        throw new NullPointerException("Null parentState");
    }

    @Override // defpackage.cvn
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (p()) {
            return false;
        }
        this.I.cancel();
        if (this.T || q()) {
            return false;
        }
        if (i2 == 1) {
            this.R = true;
        }
        this.B = i();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.r.e();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.af.b(motionEvent);
    }

    @Override // defpackage.cvo
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i4 < 0) {
            if (i5 == 0 || this.i < this.C) {
                int iMax = Math.max(i4 + this.i, this.ad);
                iArr[1] = iMax - this.i;
                d(iMax);
            }
        }
    }

    @Override // defpackage.cvn
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.r.b(i, i2);
    }

    @Override // defpackage.cvn
    public final void onStopNestedScroll(View view, int i) {
        this.r.c(i);
        if (i == 1) {
            this.R = false;
        }
        if (this.R || i()) {
            return;
        }
        if (!p()) {
            if (this.i >= 145) {
                this.I.setIntValues(this.C);
            } else {
                this.I.setIntValues(0);
            }
            this.I.start();
            return;
        }
        ObjectAnimator objectAnimator = this.I;
        objectAnimator.setIntValues(this.ac);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(50L);
        animatorSet.setInterpolator(new AccelerateInterpolator());
        if (this.k != null) {
            int color = getContext().getColor(R.color.google_scrim);
            animatorSet.playTogether(objectAnimator, ObjectAnimator.ofObject(this.k.getDecorView(), (Property<View, V>) q, new snt(), Integer.valueOf(color), Integer.valueOf(csq.g(color, 0))));
        } else {
            animatorSet.playTogether(objectAnimator);
        }
        animatorSet.start();
    }
}
