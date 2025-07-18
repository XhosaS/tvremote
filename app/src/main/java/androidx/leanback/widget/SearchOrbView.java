package androidx.leanback.widget;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.katniss.R;
import defpackage.ahc;
import defpackage.ahj;
import defpackage.atk;
import defpackage.bal;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {
    public View.OnClickListener a;
    public final float b;
    public boolean c;
    private final View d;
    private final View e;
    private final ImageView f;
    private Drawable g;
    private bal h;
    private final int i;
    private final int j;
    private final float k;
    private final float l;
    private ValueAnimator m;
    private boolean n;
    private final ArgbEvaluator o;
    private final ValueAnimator.AnimatorUpdateListener p;
    private ValueAnimator q;
    private final ValueAnimator.AnimatorUpdateListener r;

    public SearchOrbView(Context context) {
        this(context, null);
    }

    public int a() {
        return R.layout.lb_search_orb;
    }

    final void b(boolean z) {
        float f = z ? this.b : 1.0f;
        ViewPropertyAnimator viewPropertyAnimatorScaleY = this.d.animate().scaleX(f).scaleY(f);
        long j = this.j;
        viewPropertyAnimatorScaleY.setDuration(j).start();
        if (this.q == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.q = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.r);
        }
        if (z) {
            this.q.start();
        } else {
            this.q.reverse();
        }
        this.q.setDuration(j);
        this.c = z;
        h();
    }

    final void c(float f) {
        View view = this.e;
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public final void d(bal balVar) {
        this.h = balVar;
        this.f.setColorFilter(balVar.c);
        if (this.m == null) {
            f(this.h.a);
        } else {
            this.c = true;
            h();
        }
    }

    public final void e(Drawable drawable) {
        this.g = drawable;
        this.f.setImageDrawable(drawable);
    }

    public final void f(int i) {
        View view = this.e;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i);
        }
    }

    public final void g(float f) {
        int[] iArr = ahj.a;
        View view = this.e;
        float f2 = this.l;
        float f3 = this.k;
        ahc.m(view, f3 + (f * (f2 - f3)));
    }

    public int getOrbColor() {
        return this.h.a;
    }

    public bal getOrbColors() {
        return this.h;
    }

    public Drawable getOrbIcon() {
        return this.g;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.m;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.m = null;
        }
        if (this.c && this.n) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.o, Integer.valueOf(this.h.a), Integer.valueOf(this.h.b), Integer.valueOf(this.h.a));
            this.m = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.m;
            int i = this.i;
            valueAnimator2.setDuration(i + i);
            this.m.addUpdateListener(this.p);
            this.m.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.n = true;
        h();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.n = false;
        h();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        b(z);
    }

    public void setOrbColor(int i) {
        d(new bal(i, i, 0));
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new ArgbEvaluator();
        this.p = new ValueAnimator.AnimatorUpdateListener() { // from class: baj
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.f(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        };
        this.r = new ValueAnimator.AnimatorUpdateListener() { // from class: bak
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.g(valueAnimator.getAnimatedFraction());
            }
        };
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a(), (ViewGroup) this, true);
        this.d = viewInflate;
        this.e = viewInflate.findViewById(R.id.search_orb);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        this.f = imageView;
        this.b = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.i = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.j = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.l = dimensionPixelSize;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        int[] iArr = atk.i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ahj.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        e(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        d(new bal(color, typedArrayObtainStyledAttributes.getColor(0, color), typedArrayObtainStyledAttributes.getColor(3, 0)));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        g(0.0f);
        ahc.m(imageView, dimensionPixelSize);
    }
}
