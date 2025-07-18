package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enr extends Drawable {
    public final ValueAnimator.AnimatorUpdateListener a = new enq(this);
    public final Paint b;
    public ValueAnimator c;
    public enp d;
    private final Rect e;
    private final Matrix f;

    public enr() {
        Paint paint = new Paint();
        this.b = paint;
        this.e = new Rect();
        this.f = new Matrix();
        paint.setAntiAlias(true);
    }

    public final void a() {
        enp enpVar;
        ValueAnimator valueAnimator = this.c;
        if (valueAnimator == null || valueAnimator.isStarted() || (enpVar = this.d) == null || !enpVar.o || getCallback() == null) {
            return;
        }
        this.c.start();
    }

    public final void b() {
        enp enpVar;
        Shader radialGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (enpVar = this.d) == null) {
            return;
        }
        int iRound = enpVar.g;
        if (iRound <= 0) {
            iRound = Math.round(enpVar.i * iWidth);
        }
        enp enpVar2 = this.d;
        int iRound2 = enpVar2.h;
        if (iRound2 <= 0) {
            iRound2 = Math.round(enpVar2.j * iHeight);
        }
        enp enpVar3 = this.d;
        if (enpVar3.f != 1) {
            int i = enpVar3.c;
            boolean z = i == 1 || i == 3;
            if (true == z) {
                iRound = 0;
            }
            if (true != z) {
                iRound2 = 0;
            }
            radialGradient = new LinearGradient(0.0f, 0.0f, iRound, iRound2, enpVar3.b, enpVar3.a, Shader.TileMode.CLAMP);
        } else {
            float f = iRound2;
            double dMax = Math.max(iRound, iRound2) / Math.sqrt(2.0d);
            enp enpVar4 = this.d;
            radialGradient = new RadialGradient(iRound / 2.0f, f / 2.0f, (float) dMax, enpVar4.b, enpVar4.a, Shader.TileMode.CLAMP);
        }
        this.b.setShader(radialGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        if (this.d != null) {
            Paint paint = this.b;
            if (paint.getShader() == null) {
                return;
            }
            float fTan = (float) Math.tan(Math.toRadians(this.d.m));
            Rect rect = this.e;
            float fHeight = rect.height();
            float fWidth = rect.width();
            float fWidth2 = rect.width();
            float fHeight2 = rect.height();
            ValueAnimator valueAnimator = this.c;
            float f2 = 0.0f;
            float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
            float f3 = fWidth2 + (fHeight2 * fTan);
            float f4 = fHeight + (fTan * fWidth);
            int i = this.d.c;
            if (i == 1) {
                float f5 = -f4;
                f = f5 + ((f4 - f5) * animatedFraction);
            } else if (i == 2) {
                f = 0.0f;
                f2 = f3 + (((-f3) - f3) * animatedFraction);
            } else if (i != 3) {
                float f6 = -f3;
                f2 = f6 + ((f3 - f6) * animatedFraction);
                f = 0.0f;
            } else {
                f = f4 + (((-f4) - f4) * animatedFraction);
            }
            Matrix matrix = this.f;
            matrix.reset();
            matrix.setRotate(this.d.m, rect.width() / 2.0f, rect.height() / 2.0f);
            matrix.postTranslate(f2, f);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawRect(rect, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        enp enpVar = this.d;
        if (enpVar != null) {
            return (enpVar.n || enpVar.p) ? -3 : -1;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e.set(0, 0, rect.width(), rect.height());
        b();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
