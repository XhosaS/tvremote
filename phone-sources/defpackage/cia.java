package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cia implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1 || !chp.c(layout, lineForOffset)) {
            return;
        }
        float F = ccf.F(layout, lineForOffset, paint) + ccf.G(layout, lineForOffset, paint);
        if (F == 0.0f) {
            return;
        }
        canvas.getClass();
        canvas.translate(F, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
