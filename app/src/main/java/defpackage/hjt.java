package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextPaint;
import android.text.style.TextAppearanceSpan;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjt extends TransitionDrawable {
    private final ValueAnimator a;
    private final CharSequence b;
    private final TextPaint c;
    private final adeq d;

    public hjt(Drawable[] drawableArr, CharSequence charSequence, Context context, adeq adeqVar) {
        super(drawableArr);
        this.b = charSequence;
        this.d = adeqVar;
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        Typeface typefaceCreate = (adeqVar.b & 64) != 0 ? Typeface.create(adeqVar.i, 0) : Typeface.create(new TextAppearanceSpan(context, R.style.s3G200p60TextAppearance).getFamily(), 0);
        textPaint.setTypeface((adeqVar.b & 32) != 0 ? Typeface.create(typefaceCreate, adeqVar.h, false) : typefaceCreate);
        textPaint.setTextSize(adeqVar.g);
        textPaint.setAntiAlias(true);
        this.a = ValueAnimator.ofArgb(adeqVar.c, adeqVar.d);
    }

    @Override // android.graphics.drawable.TransitionDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        int iIntValue = ((Integer) this.a.getAnimatedValue()).intValue();
        TextPaint textPaint = this.c;
        textPaint.setColor(iIntValue);
        CharSequence charSequence = this.b;
        int length = charSequence.length();
        adeq adeqVar = this.d;
        canvas.drawText(charSequence, 0, length, adeqVar.e, bounds.centerY() + adeqVar.f + (textPaint.getTextSize() / 2.0f), textPaint);
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public final void reverseTransition(int i) {
        super.reverseTransition(i);
        ValueAnimator valueAnimator = this.a;
        valueAnimator.setDuration(i);
        valueAnimator.reverse();
    }

    @Override // android.graphics.drawable.TransitionDrawable
    public final void startTransition(int i) {
        super.startTransition(i);
        ValueAnimator valueAnimator = this.a;
        valueAnimator.setDuration(i);
        valueAnimator.start();
    }
}
