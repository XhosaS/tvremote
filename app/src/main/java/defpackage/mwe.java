package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwe extends Drawable {
    private static final int[] g = {R.attr.state_pressed};
    private static final int[] h = {R.attr.state_activated};
    public int a;
    public int b;
    public int c;
    public float d;
    public nmj e;
    public boolean f;
    private final Paint i;
    private final RectF j;
    private Path k;

    public mwe() {
        Paint paint = new Paint(1);
        this.i = paint;
        this.j = new RectF();
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0.0f;
        this.k = null;
        this.f = false;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
    }

    private final boolean a() {
        nmj nmjVar = this.e;
        if (nmjVar == null) {
            return true;
        }
        if (!nmjVar.o() && !this.e.r() && !this.e.s() && !this.e.v() && !this.e.q() && !this.e.p() && !this.e.u() && !this.e.t()) {
            return true;
        }
        if (this.e.l() && this.e.m() && this.e.i() && this.e.h()) {
            return true;
        }
        return this.e.n() && this.e.k() && this.e.j() && this.e.g();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d <= 0.5f) {
            canvas.drawRect(this.j, this.i);
            return;
        }
        if (a()) {
            RectF rectF = this.j;
            float f = this.d;
            canvas.drawRoundRect(rectF, f, f, this.i);
        } else {
            Path path = this.k;
            path.getClass();
            canvas.drawPath(path, this.i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.i.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.i.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int alpha = this.i.getAlpha();
        return alpha == 255 ? this.d < 0.5f ? -1 : -3 : alpha == 0 ? -2 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return (this.a == 0 && this.b == 0) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Path path;
        RectF rectF = this.j;
        rectF.set(rect);
        if (!a()) {
            nmj nmjVar = this.e;
            if (nmjVar == null) {
                path = new Path();
            } else {
                float[] fArr = new float[8];
                if (nmjVar.l() || ((!this.f && this.e.n()) || (this.f && this.e.k()))) {
                    float f = this.d;
                    fArr[0] = f;
                    fArr[1] = f;
                }
                if (this.e.m() || ((!this.f && this.e.k()) || (this.f && this.e.n()))) {
                    float f2 = this.d;
                    fArr[2] = f2;
                    fArr[3] = f2;
                }
                if (this.e.i() || ((!this.f && this.e.g()) || (this.f && this.e.j()))) {
                    float f3 = this.d;
                    fArr[4] = f3;
                    fArr[5] = f3;
                }
                if (this.e.h() || ((!this.f && this.e.j()) || (this.f && this.e.g()))) {
                    float f4 = this.d;
                    fArr[6] = f4;
                    fArr[7] = f4;
                }
                path = new Path();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            this.k = path;
        }
        int i = this.c;
        if (i == 0 || isStateful()) {
            return;
        }
        this.i.setColor(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        Paint paint = this.i;
        int color = paint.getColor();
        if (StateSet.stateSetMatches(g, iArr)) {
            int i = this.a;
            if (color != i) {
                paint.setColor(i);
                invalidateSelf();
                return true;
            }
        } else if (StateSet.stateSetMatches(h, iArr)) {
            int i2 = this.b;
            if (color != i2) {
                paint.setColor(i2);
                invalidateSelf();
                return true;
            }
        } else {
            int i3 = this.c;
            if (i3 == 0) {
                if (color == 0) {
                    return super.onStateChange(iArr);
                }
                paint.setColor(0);
                invalidateSelf();
                return true;
            }
            if (color != i3) {
                paint.setColor(i3);
                invalidateSelf();
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.i.setColorFilter(colorFilter);
    }
}
