package defpackage;

import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
class aaeq extends aaep {
    protected final int d;

    protected aaeq(aabo aaboVar, int i, boolean z, int i2) {
        super(aaboVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.aafh
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aafh
    public final void d(Appendable appendable, aach aachVar, Locale locale) throws IOException {
        aabo aaboVar = this.a;
        if (!aachVar.f(aaboVar)) {
            aaey.b(appendable, this.d);
            return;
        }
        try {
            aafd.b(appendable, aachVar.b(aaboVar), this.d);
        } catch (RuntimeException unused) {
            aaey.b(appendable, this.d);
        }
    }

    @Override // defpackage.aafh
    public final void e(Appendable appendable, long j, aabk aabkVar, int i, aabs aabsVar, Locale locale) throws IOException {
        try {
            aafd.b(appendable, this.a.a(aabkVar).a(j), this.d);
        } catch (RuntimeException unused) {
            aaey.b(appendable, this.d);
        }
    }
}
