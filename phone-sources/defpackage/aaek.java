package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaek implements aafh, aaff {
    private final char a;

    public aaek(char c) {
        this.a = c;
    }

    @Override // defpackage.aaff
    public final int a() {
        return 1;
    }

    @Override // defpackage.aafh
    public final int b() {
        return 1;
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        char upperCase;
        char upperCase2;
        if (i >= charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : ~i;
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) throws IOException {
        appendable.append(this.a);
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        appendable.append(this.a);
    }
}
