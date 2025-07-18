package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class usx extends Drawable implements usd {
    private static final float[] h = {0.0f, 1.0f};
    private static final float[] i = {0.33f, 0.66f, 1.0f};
    private static final float[] j = {0.2f, 1.0f};
    private final Path A;
    private final Path B;
    private final Path C;
    private final Path D;
    private final Path E;
    private final int F = 1;
    public final float a;
    public final int[] b;
    public final int[] c;
    public int[] d;
    public final usq e;
    public final Matrix f;
    public LinearGradient g;
    private final Context k;
    private final float l;
    private final float m;
    private final float n;
    private final float o;
    private final float p;
    private final int q;
    private final int[] r;
    private final int[] s;
    private final int[] t;
    private LinearGradient u;
    private RadialGradient v;
    private RadialGradient w;
    private final Paint x;
    private final Paint y;
    private final Paint z;

    public usx(Context context) throws Resources.NotFoundException {
        this.k = context;
        this.l = context.getResources().getDimension(R.dimen.gemini_pill_back_glow_corner_radius);
        this.m = context.getResources().getDimension(R.dimen.gemini_pill_back_glow_inset);
        this.n = context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_height);
        this.o = context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_vertical_offset);
        this.p = context.getResources().getDimension(R.dimen.gemini_pill_minimum_width);
        this.a = context.getResources().getDimension(R.dimen.gemini_pill_height);
        int color = context.getColor(R.color.gemini_pill_back_white_glow_color);
        this.q = color;
        int[] intArray = context.getResources().getIntArray(R.array.gemini_pill_base_state_bottom_glow_color_list);
        intArray.getClass();
        this.b = intArray;
        int[] intArray2 = context.getResources().getIntArray(R.array.gemini_pill_listening_responding_states_bottom_glow_color_state_back_glow_gradient_color_list);
        intArray2.getClass();
        this.c = intArray2;
        int[] intArray3 = context.getResources().getIntArray(R.array.gemini_pill_color_back_glow_gradient_color_list);
        intArray3.getClass();
        this.r = intArray3;
        int[] intArray4 = context.getResources().getIntArray(R.array.gemini_pill_listening_state_back_glow_gradient_color_list);
        intArray4.getClass();
        this.s = intArray4;
        int[] intArray5 = context.getResources().getIntArray(R.array.gemini_pill_responding_state_back_glow_gradient_color_list);
        intArray5.getClass();
        this.t = intArray5;
        this.d = intArray;
        this.e = new usq();
        this.f = new Matrix();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.gemini_pill_color_back_glow_stroke_width));
        usy.a(1);
        paint.setMaskFilter(new BlurMaskFilter(context.getResources().getDimension(R.dimen.gemini_pill_color_back_glow_blur_radius), BlurMaskFilter.Blur.NORMAL));
        paint.setAlpha(255);
        this.x = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(color);
        paint2.setStrokeWidth(context.getResources().getDimension(R.dimen.gemini_pill_white_back_glow_stroke_width));
        paint2.setMaskFilter(new BlurMaskFilter(context.getResources().getDimension(R.dimen.gemini_pill_white_back_glow_blur_radius), BlurMaskFilter.Blur.NORMAL));
        paint2.setAlpha(178);
        this.y = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setStrokeWidth(context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_stroke_width));
        paint3.setMaskFilter(new BlurMaskFilter(context.getResources().getDimension(R.dimen.gemini_pill_bottom_glow_blur_radius), BlurMaskFilter.Blur.NORMAL));
        paint3.setAlpha(204);
        this.z = paint3;
        this.A = new Path();
        this.B = new Path();
        this.C = new Path();
        this.D = new Path();
        this.E = new Path();
    }

    private final float e() {
        float fWidth = getBounds().width() / 2.0f;
        float f = this.p;
        return fWidth < f ? f : fWidth;
    }

    private final LinearGradient f(float f) {
        int[] iArr = this.r;
        float[] fArr = i;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        float f2 = this.a;
        return new LinearGradient(0.0f, f2, f, f2, iArr, fArr, tileMode);
    }

    private final void g() {
        float fCenterY = getBounds().centerY();
        this.E.reset();
        float fWidth = getBounds().width();
        float f = fCenterY + this.o;
        this.E.addOval(new RectF(0.0f, f, fWidth, this.n + f), Path.Direction.CW);
        this.E.op(this.B, Path.Op.DIFFERENCE);
    }

    @Override // defpackage.usd
    public final ValueAnimator a() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.getClass();
        valueAnimatorOfFloat.addListener(new uss(this));
        valueAnimatorOfFloat.addListener(new usr(this));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.usd
    public final ValueAnimator b() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.getClass();
        valueAnimatorOfFloat.addListener(new usu(this));
        valueAnimatorOfFloat.addListener(new ust(this));
        return valueAnimatorOfFloat;
    }

    @Override // defpackage.usd
    public final ValueAnimator c() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1500L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        final float fE = e();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: usp
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                usx usxVar = this.a;
                Matrix matrix = usxVar.f;
                matrix.reset();
                LinearGradient linearGradient = usxVar.g;
                if (linearGradient != null) {
                    float f = fE;
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    matrix.postRotate(((Float) animatedValue).floatValue() * 360.0f, f, usxVar.a);
                    linearGradient.setLocalMatrix(matrix);
                }
                usxVar.invalidateSelf();
            }
        });
        valueAnimatorOfFloat.getClass();
        valueAnimatorOfFloat.addListener(new usw(this));
        valueAnimatorOfFloat.addListener(new usv(this));
        return valueAnimatorOfFloat;
    }

    public final void d() {
        int i2 = this.e.a;
        this.x.setShader(i2 == 3 ? this.v : i2 == 2 ? this.g : i2 == 4 ? this.w : this.u);
        Paint paint = this.z;
        Shader shader = paint.getShader();
        if ((shader instanceof RadialGradient ? (RadialGradient) shader : null) != null) {
            paint.setShader(new RadialGradient(getBounds().centerX(), this.a + getBounds().centerY(), getBounds().width(), this.d, h, Shader.TileMode.CLAMP));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        usy.a(this.F);
        canvas.drawPath(this.A, this.x);
        canvas.drawPath(this.B, this.y);
        canvas.drawPath(this.E, this.z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        rect.getClass();
        super.onBoundsChange(rect);
        usy.a(this.F);
        Path path = this.A;
        path.reset();
        RectF rectF = new RectF(getBounds());
        float f = this.m;
        rectF.inset(f, f);
        float f2 = this.l;
        path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        Path path2 = this.B;
        path2.reset();
        path2.addRoundRect(new RectF(getBounds()), f2, f2, Path.Direction.CW);
        g();
        float fE = e();
        this.u = f(fE);
        this.g = f(fE);
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        float f3 = fE / 2.0f;
        int[] iArr = this.s;
        float[] fArr = j;
        this.v = new RadialGradient(fCenterX, fCenterY, f3, iArr, fArr, Shader.TileMode.CLAMP);
        this.w = new RadialGradient(getBounds().centerX(), getBounds().centerY(), f3, this.t, fArr, Shader.TileMode.CLAMP);
        this.z.setShader(new RadialGradient(getBounds().centerX(), getBounds().centerY() + this.a, getBounds().width(), this.d, h, Shader.TileMode.CLAMP));
        d();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
