package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class efe extends Drawable {
    public int a;
    public int b;
    public float c;
    public float d;
    private final Paint j;
    private final Paint o;
    private final Paint p;
    private final Path k = new Path();
    private final Path l = new Path();
    private final Path m = new Path();
    private final Path n = new Path();
    public float e = -1.0f;
    public float f = -1.0f;
    public float g = -1.0f;
    public float h = -1.0f;
    public boolean i = true;

    public efe() {
        Paint paint = new Paint(5);
        this.o = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(5);
        this.p = paint2;
        paint2.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint(paint);
        this.j = paint3;
        paint3.setAntiAlias(false);
    }

    public static int a(float f, float f2) {
        return (int) Math.ceil(e(f) + f2);
    }

    public static int b(float f, float f2) {
        return (int) Math.ceil(e(f) - f2);
    }

    public static int c(float f, float f2) {
        return (int) Math.ceil(e(f) + f2);
    }

    public static int d(float f, float f2) {
        return (int) Math.ceil(e(f) - f2);
    }

    public static int e(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    private static float f(float f) {
        return e(f) * 0.5f;
    }

    private static void g(Path path, int i, int i2, float f) {
        float f2 = i;
        float f3 = i2;
        float f4 = f + f;
        RectF rectF = new RectF(f2, f3, f2 + f4, f3 + f4);
        RectF rectF2 = new RectF(0.0f, 0.0f, f4, f4);
        path.reset();
        path.setFillType(Path.FillType.EVEN_ODD);
        float f5 = f2 + f;
        path.moveTo(f5, f3);
        path.arcTo(rectF, 270.0f, -90.0f, true);
        path.rLineTo(-i, 0.0f);
        path.lineTo(0.0f, f);
        path.arcTo(rectF2, 180.0f, 90.0f, true);
        path.lineTo(f5, 0.0f);
        path.rLineTo(0.0f, f3);
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.i) {
            float f = this.e;
            if (f == -1.0f) {
                f = this.d;
            }
            float f2 = this.f;
            if (f2 == -1.0f) {
                f2 = this.d;
            }
            float f3 = this.c;
            float f4 = f + f3;
            float f5 = f3 + f2;
            if (f4 > 0.0f) {
                Paint paint = this.o;
                int i2 = this.a;
                paint.setShader(new RadialGradient(f4, f4, f4, new int[]{i2, i2, this.b}, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
            }
            if (f5 > 0.0f) {
                Paint paint2 = this.p;
                int i3 = this.a;
                i = 3;
                paint2.setShader(new RadialGradient(f5, f5, f5, new int[]{i3, i3, this.b}, new float[]{0.0f, 0.2f, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                i = 3;
            }
            float f6 = this.g;
            if (f6 == -1.0f) {
                f6 = 0.0f;
            }
            float f7 = this.h;
            if (f7 == -1.0f) {
                f7 = f(this.d);
            }
            int iB = b(f, f6);
            int iC = c(f2, f6);
            int iD = d(this.d, f7);
            int iA = a(this.d, f7);
            g(this.k, iB, iD, this.c);
            g(this.m, iC, iD, this.c);
            g(this.l, iB, iA, this.c);
            g(this.n, iC, iA, this.c);
            Paint paint3 = this.j;
            int i4 = this.a;
            float[] fArr = new float[i];
            // fill-array-data instruction
            fArr[0] = 0.0f;
            fArr[1] = 0.2f;
            fArr[2] = 1.0f;
            paint3.setShader(new LinearGradient(0.0f, f4, 0.0f, 0.0f, new int[]{i4, i4, this.b}, fArr, Shader.TileMode.CLAMP));
            paint3.setAntiAlias(false);
            this.i = false;
        }
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        Path path = this.k;
        Paint paint4 = this.o;
        canvas.drawPath(path, paint4);
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        canvas.translate(bounds.right, bounds.top);
        canvas.scale(-1.0f, 1.0f);
        canvas.drawPath(this.m, paint4);
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        canvas.translate(bounds.right, bounds.bottom);
        canvas.scale(-1.0f, -1.0f);
        Path path2 = this.n;
        Paint paint5 = this.p;
        canvas.drawPath(path2, paint5);
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        canvas.translate(bounds.left, bounds.bottom);
        canvas.scale(1.0f, -1.0f);
        canvas.drawPath(this.l, paint5);
        canvas.restoreToCount(iSave4);
        float f8 = this.g;
        float f9 = f8 != -1.0f ? f8 : 0.0f;
        float f10 = this.h;
        if (f10 == -1.0f) {
            f10 = f(this.d);
        }
        float f11 = this.e;
        if (f11 == -1.0f) {
            f11 = this.d;
        }
        float f12 = this.f;
        if (f12 == -1.0f) {
            f12 = this.d;
        }
        int iB2 = b(f11, f9);
        int iC2 = c(f12, f9);
        int iD2 = d(this.d, f10);
        int iA2 = a(this.d, f10);
        int iSave5 = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        float f13 = iB2;
        float f14 = this.c + f13;
        float fWidth = bounds.width() - this.c;
        float f15 = iC2;
        float f16 = iD2;
        Paint paint6 = this.j;
        canvas.drawRect(f14, 0.0f, fWidth - f15, f16, paint6);
        canvas.restoreToCount(iSave5);
        int iSave6 = canvas.save();
        canvas.translate(bounds.right, bounds.bottom);
        canvas.rotate(180.0f);
        float f17 = iA2;
        canvas.drawRect(this.c + f15, 0.0f, (bounds.width() - this.c) - f13, f17, paint6);
        canvas.restoreToCount(iSave6);
        int iSave7 = canvas.save();
        canvas.translate(bounds.left, bounds.bottom);
        canvas.rotate(270.0f);
        canvas.drawRect(this.c + f17, 0.0f, bounds.height() - (this.c + f16), f13, paint6);
        canvas.restoreToCount(iSave7);
        int iSave8 = canvas.save();
        canvas.translate(bounds.right, bounds.top);
        canvas.rotate(90.0f);
        canvas.drawRect(this.c + f16, 0.0f, bounds.height() - (this.c + f17), f15, paint6);
        canvas.restoreToCount(iSave8);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.o.setAlpha(i);
        this.p.setAlpha(i);
        this.j.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
        this.p.setColorFilter(colorFilter);
        this.j.setColorFilter(colorFilter);
    }
}
