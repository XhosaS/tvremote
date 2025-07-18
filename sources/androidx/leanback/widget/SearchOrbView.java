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
import com.google.android.tv.remote.service.R;
import defpackage.bxh;
import defpackage.qm;
import defpackage.qv;
import defpackage.rb;
import defpackage.ux;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SearchOrbView extends FrameLayout implements View.OnClickListener {
    public View.OnClickListener a;
    public final View b;
    private final View c;
    private final ImageView d;
    private Drawable e;
    private final float f;
    private final int g;
    private final int h;
    private final float i;
    private final float j;
    private ValueAnimator k;
    private boolean l;
    private boolean m;
    private final ArgbEvaluator n;
    private final ValueAnimator.AnimatorUpdateListener o;
    private ValueAnimator p;
    private final ValueAnimator.AnimatorUpdateListener q;
    private bxh r;

    public SearchOrbView(Context context) {
        this(context, null);
    }

    private final void h() {
        ValueAnimator valueAnimator = this.k;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.k = null;
        }
        if (this.l && this.m) {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(this.n, Integer.valueOf(this.r.b), Integer.valueOf(this.r.a), Integer.valueOf(this.r.b));
            this.k = valueAnimatorOfObject;
            valueAnimatorOfObject.setRepeatCount(-1);
            ValueAnimator valueAnimator2 = this.k;
            int i = this.g;
            valueAnimator2.setDuration(i + i);
            this.k.addUpdateListener(this.o);
            this.k.start();
        }
    }

    public int a() {
        return R.layout.lb_search_orb;
    }

    final void b(boolean z) {
        float f = z ? this.f : 1.0f;
        ViewPropertyAnimator viewPropertyAnimatorScaleY = this.c.animate().scaleX(f).scaleY(f);
        long j = this.h;
        viewPropertyAnimatorScaleY.setDuration(j).start();
        if (this.p == null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.p = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(this.q);
        }
        if (z) {
            this.p.start();
        } else {
            this.p.reverse();
        }
        this.p.setDuration(j);
        c(z);
    }

    public final void c(boolean z) {
        this.l = z;
        h();
    }

    public final void d(Drawable drawable) {
        this.e = drawable;
        this.d.setImageDrawable(drawable);
    }

    public final void e(int i) {
        View view = this.b;
        if (view.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) view.getBackground()).setColor(i);
        }
    }

    public final void f(float f) {
        int[] iArr = qv.a;
        View view = this.b;
        float f2 = this.j;
        float f3 = this.i;
        qm.j(view, f3 + (f * (f2 - f3)));
    }

    public final void g(bxh bxhVar) {
        this.r = bxhVar;
        this.d.setColorFilter(bxhVar.c);
        if (this.k == null) {
            e(this.r.b);
        } else {
            c(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = true;
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
        this.m = false;
        h();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        b(z);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchOrbViewStyle);
    }

    public SearchOrbView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = new ArgbEvaluator();
        this.o = new rb(this, 2);
        this.q = new rb(this, 3);
        Resources resources = context.getResources();
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(a(), (ViewGroup) this, true);
        this.c = viewInflate;
        this.b = viewInflate.findViewById(R.id.search_orb);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.icon);
        this.d = imageView;
        this.f = context.getResources().getFraction(R.fraction.lb_search_orb_focused_zoom, 1, 1);
        this.g = context.getResources().getInteger(R.integer.lb_search_orb_pulse_duration_ms);
        this.h = context.getResources().getInteger(R.integer.lb_search_orb_scale_duration_ms);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_focused_z);
        this.j = dimensionPixelSize;
        this.i = context.getResources().getDimensionPixelSize(R.dimen.lb_search_orb_unfocused_z);
        int[] iArr = ux.f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        qv.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(2);
        d(drawable == null ? resources.getDrawable(R.drawable.lb_ic_in_app_search) : drawable);
        int color = typedArrayObtainStyledAttributes.getColor(1, resources.getColor(R.color.lb_default_search_color));
        g(new bxh(color, typedArrayObtainStyledAttributes.getColor(0, color), typedArrayObtainStyledAttributes.getColor(3, 0), null));
        typedArrayObtainStyledAttributes.recycle();
        setFocusable(true);
        setClipChildren(false);
        setOnClickListener(this);
        setSoundEffectsEnabled(false);
        f(0.0f);
        qm.j(imageView, dimensionPixelSize);
    }
}
