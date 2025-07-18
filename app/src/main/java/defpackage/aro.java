package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aro extends ard {
    public aro(aqz aqzVar) {
        super(aqzVar);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        aqy.b();
        aqz aqzVar = this.a;
        arn arnVar = aqzVar.b;
        Typeface typeface = arnVar.d;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        int i6 = aqzVar.a;
        canvas.drawText(arnVar.b, i6 + i6, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
