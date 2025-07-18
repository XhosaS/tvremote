package defpackage;

import android.content.res.Resources;
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
import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cte extends Drawable {
    final Bitmap a;
    public float b;
    private int d;
    private final BitmapShader g;
    private final int k;
    private final int l;
    private final int e = R.styleable.AppCompatTheme_windowActionModeOverlay;
    private final Paint f = new Paint(3);
    private final Matrix h = new Matrix();
    final Rect c = new Rect();
    private final RectF i = new RectF();
    private boolean j = true;

    public cte(Resources resources, Bitmap bitmap) {
        BitmapShader bitmapShader;
        this.d = 160;
        if (resources != null) {
            this.d = resources.getDisplayMetrics().densityDpi;
        }
        this.a = bitmap;
        if (bitmap != null) {
            this.k = bitmap.getScaledWidth(this.d);
            this.l = bitmap.getScaledHeight(this.d);
            bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        } else {
            this.l = -1;
            this.k = -1;
            bitmapShader = null;
        }
        this.g = bitmapShader;
    }

    private static boolean d(float f) {
        return f > 0.05f;
    }

    public void a(int i, int i2, int i3, Rect rect, Rect rect2) {
        throw null;
    }

    public final void b(float f) {
        if (this.b == f) {
            return;
        }
        if (d(f)) {
            this.f.setShader(this.g);
        } else {
            this.f.setShader(null);
        }
        this.b = f;
        invalidateSelf();
    }

    final void c() {
        if (this.j) {
            int i = this.e;
            int i2 = this.k;
            int i3 = this.l;
            Rect bounds = getBounds();
            Rect rect = this.c;
            a(i, i2, i3, bounds, rect);
            RectF rectF = this.i;
            rectF.set(rect);
            BitmapShader bitmapShader = this.g;
            if (bitmapShader != null) {
                Matrix matrix = this.h;
                matrix.setTranslate(rectF.left, rectF.top);
                Bitmap bitmap = this.a;
                matrix.preScale(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.f.setShader(bitmapShader);
            }
            this.j = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return;
        }
        c();
        Paint paint = this.f;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.c, paint);
            return;
        }
        RectF rectF = this.i;
        float f = this.b;
        canvas.drawRoundRect(rectF, f, f, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        return (this.e != 119 || (bitmap = this.a) == null || bitmap.hasAlpha() || this.f.getAlpha() < 255 || d(this.b)) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.j = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f.setFilterBitmap(z);
        invalidateSelf();
    }
}
