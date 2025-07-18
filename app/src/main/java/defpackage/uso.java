package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uso extends Drawable implements usd {
    private static final float[] j = {0.0f, 1.0f};
    private static final float[] k = {0.33f, 0.66f, 1.0f};
    private static final float[] l = {0.2f, 1.0f};
    private Shader A;
    private final Paint B;
    private final Paint C;
    private final Paint D;
    private final Path E;
    private final Path F;
    private final Path G;
    private final Path H;
    private final Path I;
    private final int J = 1;
    public final float a;
    public final int[] b;
    public final int[] c;
    public int[] d;
    public final utb e;
    public final utc f;
    public final ush g;
    public final Matrix h;
    public Shader i;
    private final Context m;
    private final float n;
    private final float o;
    private final float p;
    private final float q;
    private final float r;
    private final int s;
    private final int[] t;
    private final int[] u;
    private final int[] v;
    private final int w;
    private Shader x;
    private Shader y;
    private Shader z;

    public uso(Context context) throws Resources.NotFoundException {
        this.m = context;
        this.n = context.getResources().getDimension(R.dimen.gemini_pill_back_glow_corner_radius);
        this.o = context.getResources().getDimension(R.dimen.gemini_pill_back_glow_inset);
        this.p = context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_height);
        this.q = context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_vertical_offset);
        float dimension = context.getResources().getDimension(R.dimen.gemini_pill_minimum_width);
        this.r = dimension;
        float dimension2 = context.getResources().getDimension(R.dimen.gemini_pill_height);
        this.a = dimension2;
        int color = context.getColor(R.color.gemini_pill_back_white_glow_color);
        this.s = color;
        int[] intArray = context.getResources().getIntArray(R.array.gemini_pill_base_state_bottom_glow_color_list);
        intArray.getClass();
        this.b = intArray;
        int[] intArray2 = context.getResources().getIntArray(R.array.gemini_pill_listening_responding_states_bottom_glow_color_state_back_glow_gradient_color_list);
        intArray2.getClass();
        this.c = intArray2;
        int[] intArray3 = context.getResources().getIntArray(R.array.gemini_pill_color_back_glow_gradient_color_list);
        intArray3.getClass();
        this.t = intArray3;
        int[] intArray4 = context.getResources().getIntArray(R.array.gemini_pill_listening_state_back_glow_gradient_color_list);
        intArray4.getClass();
        this.u = intArray4;
        int[] intArray5 = context.getResources().getIntArray(R.array.gemini_pill_responding_state_back_glow_gradient_color_list);
        intArray5.getClass();
        this.v = intArray5;
        int color2 = context.getColor(R.color.gemini_pill_turbulence_noise_color);
        this.w = color2;
        this.d = intArray;
        this.e = new utb();
        this.f = new utc(context.getResources().getDisplayMetrics().density, color2, dimension, dimension2);
        this.g = new ush();
        this.h = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.gemini_pill_color_back_glow_stroke_width));
        usy.a(1);
        paint.setMaskFilter(new BlurMaskFilter(context.getResources().getDimension(R.dimen.gemini_pill_color_back_glow_blur_radius), BlurMaskFilter.Blur.NORMAL));
        paint.setAlpha(255);
        this.B = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(color);
        paint2.setStrokeWidth(context.getResources().getDimension(R.dimen.gemini_pill_white_back_glow_stroke_width));
        paint2.setMaskFilter(new BlurMaskFilter(context.getResources().getDimension(R.dimen.gemini_pill_white_back_glow_blur_radius), BlurMaskFilter.Blur.NORMAL));
        paint2.setAlpha(178);
        this.C = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_stroke_width));
        paint3.setMaskFilter(new BlurMaskFilter(context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_blur_radius), BlurMaskFilter.Blur.NORMAL));
        paint3.setAlpha(204);
        this.D = paint3;
        this.E = new Path();
        this.F = new Path();
        this.G = new Path();
        this.H = new Path();
        this.I = new Path();
    }

    private final LinearGradient f(float f) {
        int[] iArr = this.t;
        float[] fArr = k;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        float f2 = this.a;
        return new LinearGradient(0.0f, f2, f, f2, iArr, fArr, tileMode);
    }

    private final void g() {
        float fCenterY = getBounds().centerY();
        this.G.reset();
        float fWidth = getBounds().width();
        float f = fCenterY + this.q;
        this.G.addOval(new RectF(0.0f, f, fWidth, this.p + f), Path.Direction.CW);
        this.G.op(this.F, Path.Op.DIFFERENCE);
    }

    @Override // defpackage.usd
    public final ValueAnimator a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        final agwf agwfVar = new agwf();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: use
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                agwf agwfVar2 = agwfVar;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = agwfVar2.a;
                float f2 = animatedFraction < f ? (1.0f - f) + animatedFraction : animatedFraction - f;
                uso usoVar = this;
                agwfVar2.a = animatedFraction;
                usoVar.f.a(f2, usoVar.e);
                usoVar.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.getClass();
        valueAnimatorOfFloat.addListener(new usj(this));
        valueAnimatorOfFloat.addListener(new usi(this));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.usd
    public final ValueAnimator b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        final agwf agwfVar = new agwf();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: usg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                agwf agwfVar2 = agwfVar;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = agwfVar2.a;
                float f2 = animatedFraction < f ? (1.0f - f) + animatedFraction : animatedFraction - f;
                uso usoVar = this;
                agwfVar2.a = animatedFraction;
                usoVar.f.a(f2, usoVar.e);
                usoVar.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.getClass();
        valueAnimatorOfFloat.addListener(new usl(this));
        valueAnimatorOfFloat.addListener(new usk(this));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.usd
    public final ValueAnimator c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        final agwf agwfVar = new agwf();
        agwfVar.a = d();
        final agwf agwfVar2 = new agwf();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: usf
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                uso usoVar = this;
                agwf agwfVar3 = agwfVar;
                if (agwfVar3.a != usoVar.d()) {
                    agwfVar3.a = usoVar.d();
                    usoVar.e();
                }
                agwf agwfVar4 = agwfVar2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = agwfVar4.a;
                float f2 = animatedFraction < f ? (1.0f - f) + animatedFraction : animatedFraction - f;
                agwfVar4.a = animatedFraction;
                usoVar.f.a(f2, usoVar.e);
                Matrix matrix = usoVar.h;
                matrix.reset();
                Shader shader = usoVar.i;
                if (shader != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    matrix.postRotate(((Float) animatedValue).floatValue() * 360.0f, agwfVar3.a, usoVar.a);
                    shader.setLocalMatrix(matrix);
                }
                usoVar.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.getClass();
        valueAnimatorOfFloat.addListener(new usn(this));
        valueAnimatorOfFloat.addListener(new usm(this));
        return valueAnimatorOfFloat;
    }

    public final float d() {
        float fWidth = getBounds().width() / 2.0f;
        float f = this.r;
        return fWidth < f ? f : fWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        usy.a(this.J);
        canvas.drawPath(this.E, this.B);
        canvas.drawPath(this.F, this.C);
        canvas.drawPath(this.G, this.D);
    }

    public final void e() {
        int i = this.g.a;
        this.B.setShader(i == 3 ? this.z : i == 2 ? this.y : i == 4 ? this.A : this.x);
        Paint paint = this.D;
        Shader shader = paint.getShader();
        if ((shader instanceof RadialGradient ? (RadialGradient) shader : null) != null) {
            paint.setShader(new RadialGradient(getBounds().centerX(), this.a + getBounds().centerY(), getBounds().width(), this.d, j, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        usy.a(this.J);
        Path path = this.E;
        path.reset();
        RectF rectF = new RectF(getBounds());
        float f = this.o;
        rectF.inset(f, f);
        float f2 = this.n;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        Path path2 = this.F;
        path2.reset();
        path2.addRoundRect(new RectF(getBounds()), f2, f2, Path.Direction.CW);
        g();
        utc utcVar = this.f;
        float fD = d();
        float f3 = this.a;
        utcVar.b(fD, f3);
        this.x = f(fD);
        this.i = f(fD);
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float f4 = fD / 2.0f;
        int[] iArr = this.u;
        float[] fArr = l;
        RadialGradient radialGradient = new RadialGradient(fCenterX, fCenterY, f4, iArr, fArr, Shader.TileMode.CLAMP);
        RadialGradient radialGradient2 = new RadialGradient(getBounds().centerX(), getBounds().centerY(), f4, this.v, fArr, Shader.TileMode.CLAMP);
        Shader shader = this.i;
        shader.getClass();
        this.y = new ComposeShader(shader, this.f, PorterDuff.Mode.ADD);
        this.z = new ComposeShader(radialGradient, this.f, PorterDuff.Mode.ADD);
        this.A = new ComposeShader(radialGradient2, this.f, PorterDuff.Mode.ADD);
        this.D.setShader(new RadialGradient(getBounds().centerX(), getBounds().centerY() + f3, getBounds().width(), this.d, j, Shader.TileMode.CLAMP));
        e();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
