package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mwx extends ImageSpan {
    public mwx(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        canvas.translate(f, (i4 + ((fontMetricsInt.descent - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2)) - ((drawable.getBounds().bottom - drawable.getBounds().top) / 2));
        drawable.draw(canvas);
        canvas.restore();
    }
}
