package defpackage;

import android.text.InputFilter;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes.dex */
class mnw implements InputFilter {
    public EditText a;
    private final mnu b;

    public mnw(mnu mnuVar) {
        this.b = mnuVar;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        EditText editText;
        Layout layout;
        int lineCount;
        mnu mnuVar = this.b;
        synchronized (mnuVar) {
            mnuVar.e = spanned.toString();
            mnuVar.c = i3;
            mnuVar.d = i4;
        }
        if ((i3 == 0 && i4 == 0) || TextUtils.isEmpty(charSequence) || (editText = this.a) == null || (layout = editText.getLayout()) == null || (lineCount = layout.getLineCount()) <= 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(i2 - 1);
        String str = mny.a;
        if (cCharAt != ' ' && cCharAt != 12288) {
            return null;
        }
        float lineWidth = layout.getLineWidth(lineCount - 1);
        float width = (this.a.getWidth() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        if (width <= 0.0f || lineWidth < width - 10.0f) {
            return null;
        }
        return "";
    }
}
