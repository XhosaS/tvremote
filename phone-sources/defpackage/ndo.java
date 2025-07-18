package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndo {
    public final RectF a = new RectF();
    protected final Matrix b = new Matrix();
    public final Path c = new Path();
    public final Path d = new Path();
    public float e;
    public float f;
    public Paint.Cap g;

    public static float c(float f, float f2) {
        return f * ((f2 * 3.725f) + 1.0f);
    }

    public static float d(float f) {
        if (f < 0.66f) {
            return 0.0f;
        }
        return (f - 0.66f) / 0.33999997f;
    }

    public static void e(RectF rectF, float f, float f2) {
        float f3 = f2 * f;
        rectF.set(-f3, -f, f3, f);
    }

    public static float g(float f, float f2) {
        if (f < 1.0f) {
            return f + f;
        }
        float f3 = (f2 * 0.15999997f) + 1.0f;
        return f3 + f3;
    }

    public final void a() {
        this.c.reset();
        this.d.reset();
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = Paint.Cap.ROUND;
    }

    public final void b(float f, float f2, float f3) {
        Matrix matrix = this.b;
        matrix.reset();
        matrix.preScale(f3, f3);
        matrix.preTranslate(f, f2);
        this.c.transform(matrix);
        this.d.transform(matrix);
        this.e *= f3;
        this.f *= f3;
    }

    public final void f(float f, float f2) {
        float fC = c(f2, f);
        this.e = g(fC, f);
        RectF rectF = this.a;
        e(rectF, fC, 1.0f);
        Path.Direction direction = Path.Direction.CW;
        Path path = this.c;
        path.addOval(rectF, direction);
        e(rectF, fC, 0.95f);
        path.addOval(rectF, Path.Direction.CW);
    }

    public final void h(Path path, ndn ndnVar, float f, float f2, float f3) {
        path.reset();
        float fMin = Math.min(f3, 1.0f) * f;
        if (f2 > 0.0f) {
            float f4 = (-0.5f) + f3;
            fMin += Math.max(f2 - (((f4 * f4) * f2) * 5.0f), 0.0f);
        }
        float f5 = ndnVar.e;
        float f6 = f5 + 18.849556f;
        float f7 = ((ndnVar.f + f6) - f) * f3;
        if (f7 < f5) {
            float fMin2 = Math.min(f7 + fMin, f5);
            path.moveTo(0.0f, f7);
            path.lineTo(0.0f, fMin2);
            fMin -= fMin2 - f7;
        }
        if (f7 < f6 && fMin > 0.0f) {
            float fMax = Math.max(0.0f, f7 - f5);
            float fMin3 = Math.min(18.849556f, fMax + fMin);
            float f8 = (fMax * 180.0f) / 18.849556f;
            float f9 = (fMin3 * 180.0f) / 18.849556f;
            boolean z = ndnVar.g;
            if (!z) {
                f8 = 180.0f - f8;
                f9 = 180.0f - f9;
            }
            RectF rectF = this.a;
            rectF.set(-6.0f, -6.0f, 6.0f, 6.0f);
            rectF.offset(true != z ? 6.0f : -6.0f, f5);
            path.addArc(rectF, f8, f9 - f8);
            fMin -= fMin3 - fMax;
        }
        if (fMin > 0.0f) {
            float f10 = true != ndnVar.g ? 12.0f : -12.0f;
            path.moveTo(f10, f5);
            path.lineTo(f10, f5 - fMin);
        }
    }
}
