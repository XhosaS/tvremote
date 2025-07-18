package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cht extends chs {
    private final CharSequence a;
    private final TextPaint b;

    public cht(CharSequence charSequence, TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    @Override // defpackage.chs
    public final int a(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    @Override // defpackage.chs
    public final int d(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }
}
