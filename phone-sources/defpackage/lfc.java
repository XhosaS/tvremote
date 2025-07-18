package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfc implements lev {
    private final vvq a;
    private final Class b;

    public lfc(vvq vvqVar, Class cls) {
        this.a = vvqVar;
        this.b = cls;
    }

    @Override // defpackage.lev
    public final /* bridge */ /* synthetic */ Object a(InputStream inputStream, long j) throws IOException {
        mee meeVarS = kdw.s(inputStream, j);
        try {
            return this.a.j(meeVarS.b, meeVarS.c);
        } catch (Exception unused) {
            throw new IOException("Cannot create an instance of ".concat(String.valueOf(this.b.getName())));
        }
    }

    @Override // defpackage.lev
    public final /* bridge */ /* synthetic */ void b(Object obj, OutputStream outputStream) {
        ((vvj) obj).g(outputStream);
    }
}
