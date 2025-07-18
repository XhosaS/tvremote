package defpackage;

import android.text.InputFilter;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
class mnt implements InputFilter {
    @Override // android.text.InputFilter
    public final /* bridge */ /* synthetic */ CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            int i5 = i + 1;
            if (Character.getType(charSequence.charAt(i)) == 19 && charSequence.length() > 1) {
                return String.valueOf(charSequence.subSequence(0, i).toString()).concat(String.valueOf(charSequence.subSequence(i5, i2 - 1).toString()));
            }
            i = i5;
        }
        return null;
    }
}
