package defpackage;

import android.content.res.Resources;
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
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdl extends Drawable {
    private final float a;
    private final int b;
    private final int c;
    private final Paint d;
    private final Paint e;
    private final Paint f;
    private final Path g = new Path();
    private final RectF h = new RectF();
    private final Path i;
    private final float j;
    private float k;
    private float l;
    private boolean m;

    public sdl(Resources resources, int i, float f, float f2, float f3) {
        new RectF();
        this.i = new Path();
        this.m = true;
        this.j = f;
        Paint paint = new Paint(5);
        this.d = paint;
        paint.setColor(i);
        this.a = f3;
        this.b = resources.getColor(R.color.replay__cardimageview__shadow_start_color);
        this.c = resources.getColor(R.color.replay__cardimageview___shadow_end_color);
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        if (this.l != f2) {
            this.l = f2;
            this.k = f2 * 1.5f;
            this.m = true;
            invalidateSelf();
        }
        Paint paint2 = new Paint(5);
        this.e = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setDither(true);
        this.f = new Paint(paint2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        int i;
        float f2;
        Paint paint;
        float f3;
        if (this.m) {
            Rect bounds = getBounds();
            RectF rectF = this.h;
            rectF.set(bounds);
            float f4 = this.a;
            rectF.inset(f4, f4);
            float f5 = this.j;
            float f6 = -f5;
            RectF rectF2 = new RectF(f6, f6, f5, f5);
            RectF rectF3 = new RectF(rectF2);
            float f7 = -this.k;
            rectF3.inset(f7, f7);
            Path path = this.g;
            path.reset();
            path.setFillType(Path.FillType.EVEN_ODD);
            path.moveTo(f6, 0.0f);
            path.rLineTo(-this.k, 0.0f);
            path.arcTo(rectF3, 180.0f, 90.0f, false);
            path.arcTo(rectF2, 270.0f, -90.0f, false);
            path.close();
            float f8 = f5 + this.k;
            if (f8 > 0.0f) {
                Paint paint2 = this.e;
                int i2 = this.b;
                z = true;
                paint2.setShader(new RadialGradient(0.0f, 0.0f, f8, new int[]{i2, i2, this.c}, new float[]{0.0f, f5 / f8, 1.0f}, Shader.TileMode.CLAMP));
            } else {
                z = true;
            }
            Paint paint3 = this.f;
            float f9 = this.k;
            float f10 = f6 + f9;
            float f11 = f6 - f9;
            int i3 = this.b;
            paint3.setShader(new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i3, i3, this.c}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
            Path path2 = this.i;
            path2.reset();
            path2.setFillType(Path.FillType.EVEN_ODD);
            path2.addRoundRect(rectF, f5, f5, Path.Direction.CW);
            this.m = false;
        } else {
            z = true;
        }
        float f12 = this.l;
        if (f12 > 0.0f) {
            canvas.translate(0.0f, f12 / 2.0f);
            float f13 = this.j;
            float f14 = -f13;
            float f15 = f14 - this.k;
            float f16 = this.l / 2.0f;
            RectF rectF4 = this.h;
            float f17 = f13 + f16;
            float f18 = f17 + f17;
            float fWidth = rectF4.width() - f18;
            float fHeight = rectF4.height() - f18;
            int iSave = canvas.save();
            canvas.translate(rectF4.left + f17, rectF4.top + f17);
            Path path3 = this.g;
            Paint paint4 = this.e;
            canvas.drawPath(path3, paint4);
            boolean z2 = fWidth > 0.0f ? z : false;
            if (z2) {
                f2 = 0.0f;
                paint = paint4;
                i = iSave;
                canvas.drawRect(0.0f, f15, rectF4.width() - f18, f14, this.f);
            } else {
                i = iSave;
                f2 = 0.0f;
                paint = paint4;
            }
            canvas.restoreToCount(i);
            int iSave2 = canvas.save();
            canvas.translate(rectF4.right - f17, rectF4.bottom - f17);
            canvas.rotate(180.0f);
            canvas.drawPath(path3, paint);
            if (z2) {
                canvas.drawRect(0.0f, f15, rectF4.width() - f18, f14 + this.k, this.f);
            }
            if (fHeight <= f2) {
                z = false;
            }
            canvas.restoreToCount(iSave2);
            int iSave3 = canvas.save();
            canvas.translate(rectF4.left + f17, rectF4.bottom - f17);
            canvas.rotate(270.0f);
            canvas.drawPath(path3, paint);
            if (z) {
                f3 = f14;
                canvas.drawRect(0.0f, f15, rectF4.height() - f18, f3, this.f);
            } else {
                f3 = f14;
            }
            canvas.restoreToCount(iSave3);
            int iSave4 = canvas.save();
            canvas.translate(rectF4.right - f17, rectF4.top + f17);
            canvas.rotate(90.0f);
            canvas.drawPath(path3, paint);
            if (z) {
                canvas.drawRect(0.0f, f15, rectF4.height() - f18, f3, this.f);
            }
            canvas.restoreToCount(iSave4);
            f = f2;
            canvas.translate(f, (-this.l) / 2.0f);
            canvas.drawRoundRect(rectF4, f13, f13, this.d);
        } else {
            f = 0.0f;
        }
        if (this.j > f) {
            canvas.clipPath(this.i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
    }
}
