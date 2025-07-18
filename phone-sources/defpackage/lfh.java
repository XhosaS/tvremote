package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfh implements lev {
    private final lev a;

    public lfh(lev levVar) {
        this.a = levVar;
    }

    @Override // defpackage.lev
    public final /* bridge */ /* synthetic */ void b(Object obj, OutputStream outputStream) throws IOException {
        lfe lfeVar = (lfe) obj;
        long j = lfeVar.b;
        kdw.t(outputStream, (int) (j >>> 32));
        kdw.t(outputStream, (int) j);
        this.a.b(lfeVar.a, outputStream);
    }

    @Override // defpackage.lev
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final lfe a(InputStream inputStream, long j) {
        return new lfe(this.a.a(inputStream, j - 8), (kdw.r(inputStream) << 32) | (kdw.r(inputStream) & 4294967295L));
    }
}
