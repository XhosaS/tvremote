package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tee extends Drawable {
    protected ColorStateList a;
    protected final Paint b;
    protected final float c;
    protected final float d;
    protected Rect e;
    private final int f;
    private final Rect g;
    private final RectF h;

    public tee(ColorStateList colorStateList, float f, float f2) {
        this.c = f;
        this.a = colorStateList;
        int defaultColor = colorStateList.getDefaultColor();
        this.f = defaultColor;
        Paint paint = new Paint(5);
        this.b = paint;
        paint.setColor(defaultColor);
        this.d = f2;
        this.h = new RectF();
        this.g = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.h;
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return Color.alpha(this.f) == 0 ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.g, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.a;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect rect2 = this.g;
        rect2.set(rect);
        int iCeil = (int) Math.ceil(this.d);
        if (this.e != null) {
            rect2.left += this.e.left == -1 ? iCeil : this.e.left;
            rect2.top += this.e.top == -1 ? iCeil : this.e.top;
            rect2.right -= this.e.right == -1 ? iCeil : this.e.right;
            int i = rect2.bottom;
            if (this.e.bottom != -1) {
                iCeil = this.e.bottom;
            }
            rect2.bottom = i - iCeil;
        } else {
            rect2.inset(iCeil, iCeil);
        }
        this.h.set(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.a;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return super.onStateChange(iArr);
        }
        this.b.setColor(this.a.getColorForState(iArr, this.f));
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
