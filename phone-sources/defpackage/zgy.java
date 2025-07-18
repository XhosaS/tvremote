package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zgy implements zho {
    private final InputStream a;
    private final zhq b;

    public zgy(InputStream inputStream, zhq zhqVar) {
        this.a = inputStream;
        this.b = zhqVar;
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) throws IOException {
        try {
            this.b.l();
            zhj zhjVarW = zgkVar.w(1);
            int i = this.a.read(zhjVarW.a, zhjVarW.c, (int) Math.min(j, 8192 - zhjVarW.c));
            if (i != -1) {
                zhjVarW.c += i;
                long j2 = i;
                zgkVar.b += j2;
                return j2;
            }
            if (zhjVarW.b != zhjVarW.c) {
                return -1L;
            }
            zgkVar.a = zhjVarW.a();
            zhk.b(zhjVarW);
            return -1L;
        } catch (AssertionError e) {
            if (zhb.e(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.b;
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
