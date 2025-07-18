package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aaex extends aaep {
    public aaex(aabo aaboVar, int i, boolean z) {
        super(aaboVar, i, z);
    }

    @Override // defpackage.aafh
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) throws IOException {
        aabo aaboVar = this.a;
        if (!aachVar.f(aaboVar)) {
            appendable.append((char) 65533);
            return;
        }
        try {
            aafd.d(appendable, aachVar.b(aaboVar));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        try {
            aafd.d(appendable, this.a.a(aabkVar).a(j));
        } catch (RuntimeException unused) {
            appendable.append((char) 65533);
        }
    }
}
