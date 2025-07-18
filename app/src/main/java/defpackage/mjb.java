package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mjb extends Drawable {
    private static final zdy i = zdy.h("com/google/android/libraries/elements/base/ElementsDrawable");
    protected final Matrix a = new Matrix();
    protected final Paint b = new Paint(3);
    public final RectF c = new RectF();
    protected final ImageView.ScaleType d;
    protected Bitmap e;
    public boolean f;
    public final oco g;
    public boolean h;
    private final RectF j;
    private boolean k;
    private boolean l;

    public mjb(Bitmap bitmap, ImageView.ScaleType scaleType, oco ocoVar, yqt yqtVar) {
        RectF rectF = new RectF();
        this.j = rectF;
        this.f = false;
        this.k = false;
        this.l = false;
        this.h = false;
        if (yqtVar.g() && ((ocm) yqtVar.c()).c()) {
            this.l = true;
            this.e = bitmap;
        } else if (bitmap.isMutable()) {
            this.e = bitmap.copy(bitmap.getConfig(), false);
        } else {
            this.e = bitmap;
        }
        rectF.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        this.d = scaleType;
        this.g = ocoVar;
    }

    private final boolean b() {
        boolean z = this.f && getLayoutDirection() == 1;
        if (this.k == z) {
            return false;
        }
        this.k = z;
        return true;
    }

    protected void a(Rect rect) {
        float f;
        float f2;
        float f3;
        float width = this.e.getWidth();
        float height = this.e.getHeight();
        float fWidth = rect.width();
        float fHeight = rect.height();
        Matrix matrix = this.a;
        matrix.reset();
        if (width <= 0.0f || height <= 0.0f || fWidth <= 0.0f || fHeight <= 0.0f) {
            return;
        }
        ImageView.ScaleType scaleType = this.d;
        if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            scaleType = (width > fWidth || height > fHeight) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER;
        }
        int i2 = mja.a[scaleType.ordinal()];
        if (i2 == 1) {
            float fCenterX = rect.centerX();
            RectF rectF = this.j;
            float fCenterX2 = fCenterX - rectF.centerX();
            float fCenterY = rect.centerY() - rectF.centerY();
            matrix.setTranslate(fCenterX2, fCenterY);
            RectF rectF2 = this.c;
            rectF2.set(rectF);
            rectF2.offset(fCenterX2, fCenterY);
            rectF2.intersect(rect.left, rect.top, rect.right, rect.bottom);
        } else if (i2 == 2) {
            if (width * fHeight > fWidth * height) {
                f3 = fHeight / height;
                f = rect.top;
                f2 = rect.left + ((fWidth - (width * f3)) * 0.5f);
            } else {
                float f4 = fWidth / width;
                f = rect.top + ((fHeight - (height * f4)) * 0.5f);
                f2 = rect.left;
                f3 = f4;
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate(Math.round(f2), Math.round(f));
            this.c.set(rect);
        } else if (i2 != 3) {
            RectF rectF3 = this.c;
            rectF3.set(rect);
            matrix.setRectToRect(this.j, rectF3, Matrix.ScaleToFit.FILL);
        } else {
            RectF rectF4 = this.c;
            rectF4.set(rect);
            RectF rectF5 = this.j;
            matrix.setRectToRect(rectF5, rectF4, Matrix.ScaleToFit.CENTER);
            matrix.mapRect(rectF4, rectF5);
        }
        if (this.k) {
            matrix.preTranslate(width, 0.0f);
            matrix.preScale(-1.0f, 1.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.l && ((bitmap = this.e) == null || bitmap.isRecycled())) {
            this.g.b(acsw.LOG_TYPE_INTERNAL_ERROR, oal.A, "ElementsDrawable.draw: bitmap is null or recycled. This error is part of b/307824081 and is not actionable for you. Contact @laijess for more details.", new Object[0]);
            return;
        }
        if (!canvas.isHardwareAccelerated() && this.e.getConfig() == Bitmap.Config.HARDWARE) {
            Bitmap bitmapCopy = this.e.copy(this.h ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565, false);
            if (bitmapCopy != null) {
                this.e = bitmapCopy;
            } else {
                ((zdv) ((zdv) i.d()).q("com/google/android/libraries/elements/base/ElementsDrawable", "maybeReplaceHardwareBitmap", 138, "ElementsDrawable.java")).u("draw: copy failed");
            }
        }
        BitmapShader bitmapShader = new BitmapShader(this.e, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        bitmapShader.setLocalMatrix(this.a);
        Paint paint = this.b;
        paint.setShader(bitmapShader);
        canvas.drawRect(this.c, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Paint paint = this.b;
        if (paint.getAlpha() == 255) {
            return -1;
        }
        return paint.getAlpha() == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        b();
        a(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i2) {
        if (!b()) {
            return false;
        }
        a(getBounds());
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        this.b.setAlpha(i2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        if (this.f != z) {
            this.f = z;
            if (b()) {
                a(getBounds());
                invalidateSelf();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
