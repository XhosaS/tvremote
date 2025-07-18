package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class uvr extends ImageSpan {
    public int a;

    public uvr(Drawable drawable, String str) {
        super(drawable, str, 0);
        this.a = 0;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        float fHeight;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        float fMin = Math.min(i5 - i3, fontMetricsInt.bottom - fontMetricsInt.top);
        if (getVerticalAlignment() == 1) {
            fHeight = i4 - drawable.getBounds().bottom;
        } else {
            float f2 = i3;
            fHeight = (getVerticalAlignment() == 2 ? (f2 + (fMin / 2.0f)) - (drawable.getBounds().height() / 2.0f) : (f2 + fMin) - drawable.getBounds().bottom) + 0.0f;
        }
        canvas.translate(f, fHeight);
        drawable.setAlpha(Math.min(paint.getAlpha(), 255));
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        if (this.a == 0 && fontMetricsInt != null) {
            fontMetricsInt.ascent = -bounds.bottom;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}
