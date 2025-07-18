package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxj extends ImageSpan {
    private final Paint.FontMetricsInt a;
    private final int b;

    public mxj(Drawable drawable, int i) {
        super(drawable);
        this.a = new Paint.FontMetricsInt();
        this.b = i;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint.FontMetricsInt fontMetricsInt = this.a;
        Drawable drawable = getDrawable();
        paint.getFontMetricsInt(fontMetricsInt);
        Rect bounds = drawable.getBounds();
        int i6 = fontMetricsInt.bottom - fontMetricsInt.top;
        int i7 = i4 + fontMetricsInt.bottom;
        int iHeight = i7 - bounds.bottom;
        int i8 = this.b;
        if (i8 == 3) {
            iHeight -= fontMetricsInt.descent;
        } else if (i8 == 4) {
            iHeight = i7 - ((i6 + bounds.height()) / 2);
        }
        canvas.save();
        canvas.translate(f, iHeight);
        drawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.b != 4) {
            return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
        }
        Rect bounds = getDrawable().getBounds();
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        int i3 = fontMetricsInt2.ascent - fontMetricsInt2.top;
        int i4 = fontMetricsInt2.bottom - fontMetricsInt2.descent;
        int i5 = fontMetricsInt2.bottom - ((fontMetricsInt2.bottom - fontMetricsInt2.top) / 2);
        int iHeight = bounds.height() / 2;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = i5 - iHeight;
            fontMetricsInt.descent = i5 + iHeight;
            fontMetricsInt.top = fontMetricsInt.ascent - i3;
            fontMetricsInt.bottom = fontMetricsInt.descent + i4;
        }
        return bounds.right;
    }
}
