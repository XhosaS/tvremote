package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tyt implements tyz {
    public final tyy a(byte[] bArr) {
        return d(bArr, bArr.length);
    }

    @Override // defpackage.tyz
    public tyy b(CharSequence charSequence, Charset charset) {
        throw null;
    }

    public final tza c(int i) {
        sij.q(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return e();
    }

    public tyy d(byte[] bArr, int i) {
        sij.w(0, i, bArr.length);
        tza tzaVarC = c(i);
        tzaVarC.c(bArr, i);
        return tzaVarC.m();
    }
}
