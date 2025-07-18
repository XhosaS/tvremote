package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaer implements aafh, aaff {
    private final String a;

    public aaer(String str) {
        this.a = str;
    }

    @Override // defpackage.aaff
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.aafh
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.aaff
    public final int c(aafb aafbVar, CharSequence charSequence, int i) {
        String str = this.a;
        return aaey.d(charSequence, i, str) ? i + str.length() : ~i;
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
