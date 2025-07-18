package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thu extends Drawable implements Animatable {
    protected final long d;
    protected boolean e;
    protected final Paint f;
    protected final long c = 800;
    protected final float a = Math.max(0.0f, 0.1f);
    protected final float b = Math.min(1.0f, 1.0f) - 0.1f;

    public thu(int i, long j) {
        this.d = j;
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float width = canvas.getWidth();
        float height = canvas.getHeight();
        canvas.saveLayerAlpha(0.0f, 0.0f, width, height, 255, 31);
        long jCurrentTimeMillis = System.currentTimeMillis() + this.d;
        long j = this.c;
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        canvas.drawCircle(f, f2, ((this.a + (((((float) Math.sin(((jCurrentTimeMillis % j) / j) * 6.283185307179586d)) * 0.5f) + 0.5f) * this.b)) * Math.min(r0, r8)) / 2.0f, this.f);
        canvas.restore();
        if (this.e) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.e) {
            return;
        }
        System.currentTimeMillis();
        this.e = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.e = false;
    }
}
