package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.videos.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sts {
    static final TimeInterpolator a = sns.c;
    public static final int b = R.attr.motionDurationLong2;
    public static final int c = R.attr.motionEasingEmphasizedInterpolator;
    public static final int d = R.attr.motionDurationMedium1;
    public static final int e = R.attr.motionEasingEmphasizedAccelerateInterpolator;
    static final int[] f = {android.R.attr.state_pressed, android.R.attr.state_enabled};
    static final int[] g = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] h = {android.R.attr.state_focused, android.R.attr.state_enabled};
    static final int[] i = {android.R.attr.state_hovered, android.R.attr.state_enabled};
    static final int[] j = {android.R.attr.state_enabled};
    static final int[] k = new int[0];
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public final FloatingActionButton E;
    final zft F;
    private StateListAnimator G;
    public szq l;
    public szk m;
    public Drawable n;
    public ssx o;
    public Drawable p;
    public boolean q;
    public float r;
    public float s;
    public float t;
    public int u;
    public Animator v;
    public snw w;
    public snw x;
    public int z;
    public float y = 1.0f;
    public int A = 0;
    private final Rect H = new Rect();
    private final RectF I = new RectF();
    private final RectF J = new RectF();
    private final Matrix K = new Matrix();

    public sts(FloatingActionButton floatingActionButton, zft zftVar) {
        this.E = floatingActionButton;
        this.F = zftVar;
    }

    private final Animator r(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.E;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", fArr).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    private static final void s(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new stq(0));
    }

    public final int a() {
        if (this.q) {
            return Math.max((this.u - this.E.b()) / 2, 0);
        }
        return 0;
    }

    public final AnimatorSet b(snw snwVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f2};
        FloatingActionButton floatingActionButton = this.E;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        snwVar.d("opacity").b(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        snwVar.d("scale").b(objectAnimatorOfFloat2);
        s(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        snwVar.d("scale").b(objectAnimatorOfFloat3);
        s(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.K;
        d(f4, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new snu(), new stp(this), new Matrix(matrix));
        snwVar.d("iconScale").b(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        sin.b(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(final float f2, final float f3, final float f4, int i2, int i3) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.E;
        final float alpha = floatingActionButton.getAlpha();
        final float scaleX = floatingActionButton.getScaleX();
        final float scaleY = floatingActionButton.getScaleY();
        final float f5 = this.y;
        final Matrix matrix = new Matrix(this.K);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: stm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fA = sns.a(alpha, f2, 0.0f, 0.2f, fFloatValue);
                sts stsVar = this.a;
                FloatingActionButton floatingActionButton2 = stsVar.E;
                floatingActionButton2.setAlpha(fA);
                float f6 = f3;
                float f7 = scaleX;
                floatingActionButton2.setScaleX(f7 + ((f6 - f7) * fFloatValue));
                float f8 = scaleY;
                floatingActionButton2.setScaleY(f8 + ((f6 - f8) * fFloatValue));
                float f9 = f4;
                float f10 = f5;
                float f11 = f10 + (fFloatValue * (f9 - f10));
                stsVar.y = f11;
                Matrix matrix2 = matrix;
                stsVar.d(f11, matrix2);
                floatingActionButton2.setImageMatrix(matrix2);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        sin.b(animatorSet, arrayList);
        animatorSet.setDuration(sim.b(floatingActionButton.getContext(), i2, floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(sim.k(floatingActionButton.getContext(), i3, sns.b));
        return animatorSet;
    }

    public final void d(float f2, Matrix matrix) {
        matrix.reset();
        if (this.E.getDrawable() == null || this.z == 0) {
            return;
        }
        RectF rectF = this.I;
        RectF rectF2 = this.J;
        rectF.set(0.0f, 0.0f, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        float f3 = this.z;
        rectF2.set(0.0f, 0.0f, f3, f3);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f4 = this.z / 2.0f;
        matrix.postScale(f2, f2, f4, f4);
    }

    public final void e(float f2, float f3, float f4) {
        FloatingActionButton floatingActionButton = this.E;
        if (floatingActionButton.getStateListAnimator() == this.G) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, r(f2, f4));
            stateListAnimator.addState(g, r(f2, f3));
            stateListAnimator.addState(h, r(f2, f3));
            stateListAnimator.addState(i, r(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f2).setDuration(0L));
            if (Build.VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, r(0.0f, 0.0f));
            this.G = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (p()) {
            l();
        }
    }

    public final void f() {
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                stl stlVar = (stl) arrayList.get(i2);
                zft zftVar = stlVar.b;
                FloatingActionButton floatingActionButton = stlVar.a;
                BottomAppBar bottomAppBar = (BottomAppBar) zftVar.a;
                szk szkVar = bottomAppBar.a;
                float scaleY = 0.0f;
                if (floatingActionButton.getVisibility() == 0 && bottomAppBar.f == 1) {
                    scaleY = floatingActionButton.getScaleY();
                }
                szkVar.O(scaleY);
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                stl stlVar = (stl) arrayList.get(i2);
                zft zftVar = stlVar.b;
                FloatingActionButton floatingActionButton = stlVar.a;
                BottomAppBar bottomAppBar = (BottomAppBar) zftVar.a;
                if (bottomAppBar.f == 1) {
                    float translationX = floatingActionButton.getTranslationX();
                    if (bottomAppBar.k().e != translationX) {
                        bottomAppBar.k().e = translationX;
                        bottomAppBar.a.invalidateSelf();
                    }
                    float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
                    if (bottomAppBar.k().d != fMax) {
                        bottomAppBar.k().b(fMax);
                        bottomAppBar.a.invalidateSelf();
                    }
                    bottomAppBar.a.O(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
                }
            }
        }
    }

    public final void h(float f2) {
        if (this.r != f2) {
            this.r = f2;
            e(f2, this.s, this.t);
        }
    }

    public final void i(float f2) {
        this.y = f2;
        Matrix matrix = this.K;
        d(f2, matrix);
        this.E.setImageMatrix(matrix);
    }

    public final void j(szq szqVar) {
        this.l = szqVar;
        szk szkVar = this.m;
        if (szkVar != null) {
            szkVar.p(szqVar);
        }
        ssx ssxVar = this.o;
        if (ssxVar != null) {
            ssxVar.h = szqVar;
            ssxVar.invalidateSelf();
        }
    }

    public final void k() {
        i(this.y);
    }

    public final void l() {
        Rect rect = this.H;
        zft zftVar = this.F;
        if (zftVar.n()) {
            int iA = a();
            int iMax = Math.max(iA, (int) Math.ceil(this.E.getElevation() + this.t));
            int iMax2 = Math.max(iA, (int) Math.ceil(r3 * 1.5f));
            rect.set(iMax, iMax2, iMax, iMax2);
        } else if (m()) {
            int iB = (this.u - this.E.b()) / 2;
            rect.set(iB, iB, iB, iB);
        } else {
            rect.set(0, 0, 0, 0);
        }
        crl.k(this.p, "Didn't initialize content background");
        if (p()) {
            zftVar.m(new InsetDrawable(this.p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            zftVar.m(this.p);
        }
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        FloatingActionButton floatingActionButton = (FloatingActionButton) zftVar.a;
        floatingActionButton.c.set(i2, i3, i4, i5);
        int i6 = floatingActionButton.a;
        floatingActionButton.setPadding(i2 + i6, i3 + i6, i4 + i6, i5 + i6);
    }

    final boolean m() {
        return this.q && this.E.b() < this.u;
    }

    public final boolean n() {
        return this.E.getVisibility() == 0 ? this.A == 1 : this.A != 2;
    }

    public final boolean o() {
        return this.E.getVisibility() != 0 ? this.A == 2 : this.A != 1;
    }

    final boolean p() {
        return this.F.n() || m();
    }

    public final boolean q() {
        FloatingActionButton floatingActionButton = this.E;
        return floatingActionButton.isLaidOut() && !floatingActionButton.isInEditMode();
    }
}
