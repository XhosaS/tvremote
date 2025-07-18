package defpackage;

import android.text.Spannable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class osa extends Spannable.Factory {
    @Override // android.text.Spannable.Factory
    public final Spannable newSpannable(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : super.newSpannable(charSequence);
    }
}
