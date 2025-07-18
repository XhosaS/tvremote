package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bay extends ReplacementSpan {
    final /* synthetic */ baz a;
    private final int b;
    private final int c;

    public bay(baz bazVar, int i, int i2) {
        this.a = bazVar;
        this.b = i;
        this.c = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iMeasureText = (int) paint.measureText(charSequence, i, i2);
        baz bazVar = this.a;
        int width = bazVar.e.getWidth();
        int i6 = width + width;
        int i7 = iMeasureText / i6;
        int i8 = (iMeasureText % i6) / 2;
        int i9 = this.b;
        Random random = bazVar.d;
        long j = i9;
        int layoutDirection = bazVar.getLayoutDirection();
        random.setSeed(j);
        int alpha = paint.getAlpha();
        for (int i10 = 0; i10 < i7; i10++) {
            if (this.c + i10 >= bazVar.g) {
                break;
            }
            float f2 = (i10 * i6) + i8 + (width / 2);
            float f3 = layoutDirection == 1 ? ((f + iMeasureText) - f2) - width : f + f2;
            paint.setAlpha((random.nextInt(4) + 1) * 63);
            if (random.nextBoolean()) {
                canvas.drawBitmap(bazVar.f, f3, i4 - r13.getHeight(), paint);
            } else {
                canvas.drawBitmap(bazVar.e, f3, i4 - r13.getHeight(), paint);
            }
        }
        paint.setAlpha(alpha);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) paint.measureText(charSequence, i, i2);
    }
}
