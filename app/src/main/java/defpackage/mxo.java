package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxo implements LineHeightSpan {
    private final float a;

    public mxo(float f) {
        this.a = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        float f = this.a;
        if (f > 0.0f) {
            double d = (f - (fontMetricsInt.bottom - fontMetricsInt.top)) / 2.0f;
            fontMetricsInt.top = (int) (fontMetricsInt.top - Math.floor(d));
            fontMetricsInt.bottom = (int) (fontMetricsInt.bottom + Math.ceil(d));
            fontMetricsInt.ascent = fontMetricsInt.top;
            fontMetricsInt.descent = fontMetricsInt.bottom;
        }
    }
}
