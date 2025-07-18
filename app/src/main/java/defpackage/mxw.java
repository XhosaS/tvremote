package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes.dex */
class mxw extends SpannableStringBuilder {
    public mxw(CharSequence charSequence) {
        super(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (i == -1 || i2 == -1) {
            return;
        }
        super.setSpan(obj, i, i2, i3);
    }
}
