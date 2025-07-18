package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqw {
    public static final double a = Math.cos(Math.toRadians(45.0d));
    public static final Drawable b;
    public final MaterialCardView c;
    public final szk e;
    public final szk f;
    public int g;
    public int h;
    public int i;
    public int j;
    public Drawable k;
    public Drawable l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public boolean s;
    private szq u;
    private szk v;
    private ValueAnimator w;
    private final TimeInterpolator x;
    private final int y;
    private final int z;
    public final Rect d = new Rect();
    public boolean r = false;
    public float t = 0.0f;

    static {
        b = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public sqw(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.c = materialCardView;
        szk szkVar = new szk(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.e = szkVar;
        szkVar.J(materialCardView.getContext());
        szkVar.Y();
        szp szpVar = new szp(szkVar.F());
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ih.a, i, R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            szpVar.e(typedArrayObtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.f = new szk();
        h(new szq(szpVar));
        this.x = sim.k(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, sns.a);
        this.y = sim.b(materialCardView.getContext(), R.attr.motionDurationShort2, kwx.JSON3);
        this.z = sim.b(materialCardView.getContext(), R.attr.motionDurationShort1, kwx.JSON3);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static final float p(sin sinVar, float f) {
        if (sinVar instanceof szo) {
            return (float) ((1.0d - a) * f);
        }
        if (sinVar instanceof szf) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        sin sinVar = this.u.j;
        szk szkVar = this.e;
        float fMax = Math.max(p(sinVar, szkVar.w()), p(this.u.k, szkVar.x()));
        sin sinVar2 = this.u.l;
        float[] fArr = szkVar.A;
        float fP = p(sinVar2, fArr != null ? fArr[1] : szkVar.s.a.d.a(szkVar.D()));
        sin sinVar3 = this.u.m;
        float[] fArr2 = szkVar.A;
        return Math.max(fMax, Math.max(fP, p(sinVar3, fArr2 != null ? fArr2[2] : szkVar.s.a.e.a(szkVar.D()))));
    }

    public final float b() {
        return this.c.a() + (n() ? a() : 0.0f);
    }

    public final float c() {
        return (this.c.a() * 1.5f) + (n() ? a() : 0.0f);
    }

    public final Drawable d() {
        if (this.p == null) {
            this.v = new szk(this.u);
            this.p = new RippleDrawable(this.m, null, this.v);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.f, this.l});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    public final Drawable e(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.c.a) {
            iCeil2 = (int) Math.ceil(c());
            iCeil = (int) Math.ceil(b());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new sqv(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public final void f(ColorStateList colorStateList) {
        this.e.N(colorStateList);
    }

    public final void g(boolean z, boolean z2) {
        Drawable drawable = this.l;
        if (drawable != null) {
            float f = true != z ? 0.0f : 1.0f;
            if (!z2) {
                drawable.setAlpha(true == z ? 255 : 0);
                this.t = f;
                return;
            }
            float f2 = z ? 1.0f - this.t : this.t;
            ValueAnimator valueAnimator = this.w;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.w = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.t, f);
            this.w = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new fsz(this, 8));
            this.w.setInterpolator(this.x);
            this.w.setDuration((long) ((z ? this.y : this.z) * f2));
            this.w.start();
        }
    }

    public final void h(szq szqVar) {
        this.u = szqVar;
        szk szkVar = this.e;
        szkVar.p(szqVar);
        szkVar.z = !szkVar.X();
        this.f.p(szqVar);
        szk szkVar2 = this.v;
        if (szkVar2 != null) {
            szkVar2.p(szqVar);
        }
    }

    public final void i() {
        Drawable drawable = this.k;
        Drawable drawableD = o() ? d() : this.f;
        this.k = drawableD;
        if (drawable != drawableD) {
            MaterialCardView materialCardView = this.c;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableD);
            } else {
                materialCardView.setForeground(e(drawableD));
            }
        }
    }

    public final void j() {
        this.f.T(this.j, this.o);
    }

    public final boolean k() {
        return this.e.X();
    }

    public final boolean l() {
        return (this.i & 80) == 80;
    }

    public final boolean m() {
        return (this.i & 8388613) == 8388613;
    }

    public final boolean n() {
        MaterialCardView materialCardView = this.c;
        return materialCardView.b && k() && materialCardView.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View] */
    public final boolean o() {
        MaterialCardView materialCardView = this.c;
        boolean zIsClickable = materialCardView.isClickable();
        MaterialCardView materialCardView2 = materialCardView;
        if (zIsClickable) {
            return true;
        }
        while (materialCardView2.isDuplicateParentStateEnabled() && (materialCardView2.getParent() instanceof View)) {
            materialCardView2 = (View) materialCardView2.getParent();
        }
        return materialCardView2.isClickable();
    }
}
