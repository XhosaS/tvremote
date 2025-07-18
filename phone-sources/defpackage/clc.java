package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clc extends CharacterStyle implements UpdateAppearance {
    public final Object a;
    private final /* synthetic */ int b;

    public clc(brx brxVar, int i) {
        this.b = i;
        this.a = brxVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.b == 0) {
            throw null;
        }
        if (textPaint != null) {
            if (!yks.e(this.a, bps.a)) {
                throw new yfu();
            }
            textPaint.setStyle(Paint.Style.FILL);
        }
    }
}
