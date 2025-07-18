package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.material.featurehighlight.TextContentView;
import com.google.android.videos.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pqw extends ViewGroup {
    public static final /* synthetic */ int J = 0;
    private static final int[] K = {R.attr.materialButtonOutlinedStyle};
    public boolean A;
    public pqu B;
    public Paint C;
    public int D;
    public final AccessibilityManager E;
    public final pql F;
    public Rect G;
    public final TextContentView H;
    public ocv I;
    private final int[] L;
    private final Rect M;
    private final Rect N;
    private boolean O;
    private Map P;
    private final View.OnAttachStateChangeListener Q;
    private final ViewTreeObserver.OnGlobalLayoutListener R;
    private final nhl S;
    private final nhl T;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final pra e;
    public final pqy f;
    public View g;
    public int h;
    public int i;
    public View j;
    public Drawable k;
    public float l;
    public boolean m;
    public boolean n;
    public ImageView o;
    public Animator p;
    public final pqz q;
    public boolean r;
    public float s;
    public float t;
    public boolean u;
    public Interpolator v;
    public Interpolator w;
    public boolean x;
    public boolean y;
    public boolean z;

    public pqw(Context context, pql pqlVar) {
        int i;
        super(context);
        this.L = new int[2];
        this.a = new Rect();
        this.M = new Rect();
        this.N = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.l = 1.0f;
        this.r = false;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = false;
        this.y = true;
        this.z = true;
        this.A = false;
        this.Q = new bne(this, 9);
        this.R = new iyo(this, 6);
        setId(R.id.featurehighlight_view);
        setWillNotDraw(false);
        pqy pqyVar = new pqy(context);
        this.f = pqyVar;
        pqyVar.setCallback(this);
        pra praVar = new pra(context);
        this.e = praVar;
        praVar.setCallback(this);
        this.q = new pqz(this);
        this.E = (AccessibilityManager) getContext().getSystemService("accessibility");
        nhl nhlVar = new nhl(context, new pqp(this));
        this.S = nhlVar;
        nhlVar.a(false);
        nhl nhlVar2 = new nhl(getContext(), new pqq(this));
        this.T = nhlVar2;
        nhlVar2.a(false);
        this.F = pqlVar;
        if (pqlVar == pql.Legacy) {
            i = R.layout.text_content;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(K);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(0);
            typedArrayObtainStyledAttributes.recycle();
            i = R.layout.gm_text_content;
            if (!zHasValue) {
                context = new hc(context, R.style.ThemeOverlay_GoogleMaterial_FeatureHighlight_Content);
            }
        }
        TextContentView textContentView = (TextContentView) LayoutInflater.from(context).inflate(i, (ViewGroup) this, false);
        View view = this.H;
        if (view != null) {
            removeView(view);
        }
        textContentView.getClass();
        this.H = textContentView;
        addView(textContentView, 0);
        s(new pqv(this));
        setVisibility(8);
    }

    private final void t(Rect rect, View view) {
        int[] iArr = this.L;
        u(iArr, view);
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, iArr[1] + view.getMeasuredHeight());
    }

    private final void u(int[] iArr, View view) {
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    private final void v(boolean z) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            if (z) {
                this.P = new HashMap();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this) {
                        this.P.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        int[] iArr = cww.a;
                        childAt.setImportantForAccessibility(4);
                    }
                }
                return;
            }
            Map map = this.P;
            if (map != null) {
                for (View view : map.keySet()) {
                    int iIntValue = ((Integer) this.P.get(view)).intValue();
                    int[] iArr2 = cww.a;
                    view.setImportantForAccessibility(iIntValue);
                }
                this.P = null;
            }
        }
    }

    private final boolean w() {
        return this.l != 1.0f;
    }

    public final Animator a() {
        Animator duration;
        Context context = getContext();
        pqy pqyVar = this.f;
        int iOrdinal = pqyVar.g.ordinal();
        if (iOrdinal == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(pqyVar, "scale", 1.0f, 1.1f).setDuration(500L);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(pqyVar, "scale", 1.1f, 1.0f).setDuration(500L);
            ObjectAnimator duration4 = ObjectAnimator.ofPropertyValuesHolder(pqyVar, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
            animatorSet.play(duration2).with(ObjectAnimator.ofFloat(pqyVar, "pulseAlpha", 0.0f).setDuration(500L));
            animatorSet.play(duration3).with(duration4).after(duration2);
            duration = animatorSet;
        } else {
            if (iOrdinal != 1) {
                throw new IllegalStateException("No implementation for animation type.");
            }
            duration = ObjectAnimator.ofPropertyValuesHolder(pqyVar, PropertyValuesHolder.ofFloat("scale", 0.0f, 2.0f), PropertyValuesHolder.ofInt("alpha", 255, 0)).setDuration(1000L);
        }
        duration.setInterpolator(pod.c);
        duration.setStartDelay(500L);
        duration.addListener(new pny(duration));
        duration.addListener(new pqx(context));
        return duration;
    }

    public final Interpolator b(final Interpolator interpolator, final float f) {
        pra praVar = this.e;
        final float fA = praVar.a(this.N);
        final float f2 = praVar.g;
        return new Interpolator() { // from class: pqm
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f3) {
                int i = pqw.J;
                float interpolation = interpolator.getInterpolation(f3);
                float f4 = ((1.0f - interpolation) * f) + interpolation;
                float f5 = f2;
                float f6 = fA;
                return ocv.bD(((f4 * f5) - f6) / (f5 - f6));
            }
        };
    }

    public final Interpolator c(Interpolator interpolator) {
        pra praVar = this.e;
        return new pqn(interpolator, praVar.g, praVar.a(this.N));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final void d(int i) {
        if (this.r) {
            return;
        }
        this.I.bE(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        pqu pquVar = this.B;
        if (pquVar == null || !pquVar.m(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final void e() {
        if (!this.r) {
            this.I.bF();
        }
        View view = this.g;
        if (view != null) {
            view.performClick();
        }
    }

    public final void f(Runnable runnable) {
        if (this.r) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.H, "alpha", 0.0f).setDuration(200L);
        Interpolator interpolator = pod.b;
        duration.setInterpolator(c(interpolator));
        pra praVar = this.e;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(praVar, PropertyValuesHolder.ofFloat("scale", praVar.getScale(), 1.125f), PropertyValuesHolder.ofInt("alpha", praVar.getAlpha(), 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(interpolator);
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L).setDuration(200L);
        Animator duration3 = this.f.a().setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderWith = animatorSet.play(duration).with(duration2).with(duration3);
        if (q()) {
            builderWith.with(ObjectAnimator.ofFloat(this.o, "elevation", 0.0f).setDuration(200L));
        }
        animatorSet.addListener(new pqo(this, runnable));
        n(animatorSet);
    }

    public final void g(Runnable runnable) {
        if (this.r) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.H, "alpha", 0.0f).setDuration(200L);
        Interpolator interpolator = pod.b;
        duration.setInterpolator(c(interpolator));
        Rect rect = this.a;
        pra praVar = this.e;
        float fExactCenterX = rect.exactCenterX() - praVar.h;
        float fExactCenterY = rect.exactCenterY() - praVar.i;
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(praVar, PropertyValuesHolder.ofFloat("scale", praVar.getScale(), 0.0f), PropertyValuesHolder.ofFloat("translationX", praVar.getTranslationX(), fExactCenterX), PropertyValuesHolder.ofFloat("translationY", praVar.getTranslationY(), fExactCenterY), PropertyValuesHolder.ofInt("alpha", praVar.getAlpha(), 0));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(interpolator);
        Animator duration2 = objectAnimatorOfPropertyValuesHolder.setDuration(200L).setDuration(200L);
        Animator duration3 = this.f.a().setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder builderWith = animatorSet.play(duration).with(duration2).with(duration3);
        if (q()) {
            builderWith.with(ObjectAnimator.ofFloat(this.o, "elevation", 0.0f).setDuration(200L));
        }
        animatorSet.addListener(new pqo(this, runnable));
        n(animatorSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h() {
        View view = this.g;
        if (view == null) {
            return;
        }
        view.removeOnAttachStateChangeListener(this.Q);
        this.g.getViewTreeObserver().removeOnGlobalLayoutListener(this.R);
    }

    public final void i() {
        ImageView imageView = this.o;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(this.D));
        }
    }

    public final void j(int i, int i2) {
        pqy pqyVar = this.f;
        pqyVar.c(i);
        pqyVar.d(i2);
    }

    public final void k(View view) {
        int[] iArr = cww.a;
        sji.a(isAttachedToWindow(), "Must be attached to window before showing");
        this.g = view;
        pqu pquVar = new pqu(this, view);
        this.B = pquVar;
        cww.p(this, pquVar);
        if (p()) {
            TextView textView = (TextView) view;
            this.i = textView.getCurrentTextColor();
            textView.setTextColor(this.h);
        }
        if (q()) {
            l();
        }
        if (getVisibility() == 8) {
            setVisibility(4);
        }
        view.addOnAttachStateChangeListener(this.Q);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.R);
    }

    public final void l() {
        View view = this.g;
        if (view == null) {
            return;
        }
        this.n = view.isDrawingCacheEnabled();
        this.g.setDrawingCacheEnabled(true);
        ImageView imageView = new ImageView(getContext());
        this.o = imageView;
        imageView.setElevation(this.g.getElevation());
        this.o.setOutlineProvider(new pqr(this));
        if (this.C != null) {
            i();
        }
        addView(this.o);
    }

    public final void m() {
        sji.a(getParent() != null, "View must be attached to view hierarchy");
        setVisibility(0);
        this.r = false;
    }

    public final void n(Animator animator) {
        Animator animator2 = this.p;
        if (animator2 != null) {
            animator2.cancel();
        }
        if (animator != null) {
            this.p = animator;
            animator.start();
        }
    }

    public final boolean o(float f, float f2) {
        return this.M.contains(Math.round(f), Math.round(f2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        h();
        Animator animator = this.p;
        if (animator != null) {
            animator.removeAllListeners();
            this.p.cancel();
            this.p = null;
        }
        this.A = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.j != null) {
            canvas.clipRect(this.M);
        }
        this.e.draw(canvas);
        if (!this.x) {
            this.f.draw(canvas);
        }
        if (this.k != null) {
            Rect rect = this.a;
            canvas.translate(rect.exactCenterX() - (this.k.getBounds().width() / 2.0f), rect.exactCenterY() - (this.k.getBounds().height() / 2.0f));
            this.k.draw(canvas);
        } else {
            View view = this.g;
            if (view == null) {
                throw new IllegalStateException("Neither target view nor drawable was set");
            }
            if (q()) {
                view.invalidate();
                this.o.setImageBitmap(this.g.getDrawingCache());
            } else {
                sji.a(true, "Target view must be set before draw");
                Rect rect2 = this.a;
                canvas.translate(rect2.left, rect2.top);
                if (w()) {
                    canvas.save();
                    float f = this.l;
                    canvas.scale(f, f);
                }
                Paint paint = this.C;
                if (paint != null) {
                    int iSaveLayer = canvas.saveLayer(null, paint, 31);
                    this.g.draw(canvas);
                    canvas.restoreToCount(iSaveLayer);
                } else {
                    this.g.draw(canvas);
                }
                if (w()) {
                    canvas.restore();
                }
            }
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int iF;
        sji.a(this.g != null, "Target view must be set before layout");
        this.A = true;
        View view = this.g;
        int[] iArr = this.L;
        u(iArr, view);
        int i6 = iArr[0];
        int i7 = iArr[1];
        int width = this.g.getWidth() + i6;
        int height = iArr[1] + this.g.getHeight();
        Rect rect = this.a;
        rect.set(i6, i7, width, height);
        Drawable drawable = this.k;
        if (drawable != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_min_tap_target_size) / 2;
            int iMax = Math.max(drawable.getBounds().height() / 2, dimensionPixelSize);
            int iMax2 = Math.max(drawable.getBounds().width() / 2, dimensionPixelSize);
            int iCenterX = rect.centerX();
            int iCenterY = rect.centerY();
            rect.set(iCenterX - iMax2, iCenterY - iMax, iCenterX + iMax2, iCenterY + iMax);
        }
        float f = this.l;
        float fWidth = rect.width();
        float f2 = f - 1.0f;
        float fHeight = rect.height();
        float f3 = (fWidth * f2) / 2.0f;
        rect.left = (int) (rect.left - f3);
        rect.right = (int) (rect.right + f3);
        float f4 = (fHeight * f2) / 2.0f;
        rect.top = (int) (rect.top - f4);
        rect.bottom = (int) (rect.bottom + f4);
        if (this.k == null && q()) {
            sji.a(this.o != null, "Target view mock must be created before layout");
            this.o.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        View view2 = this.j;
        if (view2 != null) {
            t(this.M, view2);
        } else {
            this.M.set(i, i2, i3, i4);
        }
        pra praVar = this.e;
        Rect rect2 = this.M;
        praVar.setBounds(rect2);
        if (!this.x) {
            this.f.setBounds(rect2);
        }
        pqz pqzVar = this.q;
        pqw pqwVar = pqzVar.d;
        TextContentView textContentView = pqwVar.H;
        if (rect.isEmpty() || rect2.isEmpty()) {
            textContentView.layout(0, 0, 0, 0);
        } else {
            int iCenterY2 = rect.centerY();
            int iCenterX2 = rect.centerX();
            if (!pqzVar.e) {
                pqy pqyVar = pqwVar.f;
                pqyVar.e = rect.exactCenterX();
                pqyVar.f = rect.exactCenterY();
                pqyVar.d = Math.max(pqyVar.a, (Math.max(rect.width(), rect.height()) / 2.0f) + pqyVar.b);
                pqyVar.invalidateSelf();
                Rect rect3 = pqzVar.b;
                float f5 = pqyVar.d + pqyVar.c;
                rect3.set(Math.round(pqyVar.e - f5), Math.round(pqyVar.f - f5), Math.round(pqyVar.e + f5), Math.round(pqyVar.f + f5));
            }
            int i8 = pqzVar.f;
            if (i8 != 48 && (i8 == 80 || iCenterY2 < rect2.centerY())) {
                int i9 = rect2.bottom;
                Rect rect4 = pqzVar.b;
                pqzVar.b(textContentView, rect2.width(), i9 - rect4.bottom);
                int iA = pqzVar.a(textContentView, rect2.left, rect2.right, textContentView.getMeasuredWidth(), iCenterX2);
                int i10 = pqzVar.e ? rect.bottom + pqzVar.c : rect4.bottom;
                textContentView.layout(iA, i10, textContentView.getMeasuredWidth() + iA, textContentView.getMeasuredHeight() + i10);
            } else {
                pqzVar.b(textContentView, rect2.width(), (pqzVar.e ? rect.top : pqzVar.b.top) - rect2.top);
                int iA2 = pqzVar.a(textContentView, rect2.left, rect2.right, textContentView.getMeasuredWidth(), iCenterX2);
                int i11 = pqzVar.e ? rect.top - pqzVar.c : pqzVar.b.top;
                textContentView.layout(iA2, i11 - textContentView.getMeasuredHeight(), textContentView.getMeasuredWidth() + iA2, i11);
            }
        }
        Rect rect5 = pqzVar.a;
        rect5.set(textContentView.getLeft(), textContentView.getTop(), textContentView.getRight(), textContentView.getBottom());
        pra praVar2 = pqwVar.e;
        boolean z2 = pqzVar.e;
        praVar2.b.set(rect);
        praVar2.c.set(rect5);
        float fExactCenterX = rect.exactCenterX();
        float fExactCenterY = rect.exactCenterY();
        if (z2) {
            int iCenterY3 = rect.centerY();
            int iCenterY4 = rect2.centerY();
            int i12 = praVar2.d;
            int i13 = i12 + i12;
            praVar2.h = fExactCenterX / 2.0f;
            if (iCenterY3 < iCenterY4) {
                i5 = rect5.bottom;
                iF = pra.f(i5, fExactCenterX, i13);
                praVar2.i = -iF;
            } else {
                int iHeight = rect2.height() - rect5.top;
                int iF2 = pra.f(iHeight, fExactCenterX, i13);
                praVar2.i = rect2.height() + iF2;
                i5 = iHeight;
                iF = iF2;
            }
            praVar2.g = i5 + iF + i13;
        } else {
            Rect bounds = praVar2.getBounds();
            if (Math.min(fExactCenterY - bounds.top, bounds.bottom - fExactCenterY) < praVar2.a) {
                praVar2.h = fExactCenterX;
                praVar2.i = fExactCenterY;
            } else {
                praVar2.h = fExactCenterX <= bounds.exactCenterX() ? rect5.exactCenterX() + praVar2.e : rect5.exactCenterX() - praVar2.e;
                fExactCenterY = fExactCenterY <= bounds.exactCenterY() ? rect5.exactCenterY() + praVar2.f : rect5.exactCenterY() - praVar2.f;
                praVar2.i = fExactCenterY;
            }
            praVar2.g = praVar2.d + Math.max(pra.g(praVar2.h, fExactCenterY, rect), pra.g(praVar2.h, praVar2.i, rect5));
        }
        praVar2.invalidateSelf();
        Rect rect6 = this.N;
        TextContentView textContentView2 = this.H;
        t(rect6, textContentView2);
        t(this.b, textContentView2.a);
        t(this.c, textContentView2.b);
        t(this.d, textContentView2.c);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(View.MeasureSpec.getSize(i), i), resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.O = this.a.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (!this.O || this.g == null) {
            this.S.b(motionEvent);
            if (actionMasked == 1 && this.u) {
                this.u = false;
                this.w = null;
                this.v = null;
                if (this.s > getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_to_dismiss_threshold)) {
                    d(2);
                } else {
                    Animator animator = this.p;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this.H, "alpha", 1.0f).setDuration(150L);
                    duration.setInterpolator(b(pod.a, 1.0f - this.t));
                    Rect rect = this.a;
                    pra praVar = this.e;
                    Animator duration2 = praVar.b(rect.exactCenterX() - praVar.h, rect.exactCenterY() - praVar.i, 1.0f - this.t).setDuration(150L);
                    Animator duration3 = this.f.b(1.0f - this.t).setDuration(150L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet.Builder builderWith = animatorSet.play(duration).with(duration2).with(duration3);
                    if (q()) {
                        builderWith.with(ObjectAnimator.ofFloat(this.o, "elevation", this.g.getElevation()).setDuration(150L));
                    }
                    animatorSet.addListener(new pqt(this));
                    n(animatorSet);
                }
                if (!this.r) {
                    this.I.bG();
                }
            }
        } else {
            nhl nhlVar = this.T;
            if (nhlVar != null) {
                nhlVar.b(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            this.g.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean p() {
        return this.h != 0 && (this.g instanceof TextView);
    }

    public final boolean q() {
        return this.m;
    }

    public final void s(ocv ocvVar) {
        this.H.d = ocvVar;
        this.I = ocvVar;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i == getVisibility()) {
            super.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i != 8 && i != 4) {
            if (i == 0) {
                sendAccessibilityEvent(32);
                v(true);
                return;
            }
            return;
        }
        v(false);
        int[] iArr = cww.a;
        Object parentForAccessibility = getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            ((View) parentForAccessibility).sendAccessibilityEvent(32);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.f || drawable == this.k;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
