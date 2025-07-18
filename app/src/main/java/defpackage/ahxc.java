package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ahxc implements ahxq {
    public final InputStream a;
    private final ahxs b;

    public ahxc(InputStream inputStream, ahxs ahxsVar) {
        this.a = inputStream;
        this.b = ahxsVar;
    }

    @Override // defpackage.ahxq
    public final long a(ahwx ahwxVar, long j) throws IOException {
        String message;
        try {
            this.b.b();
            ahxl ahxlVarM = ahwxVar.m(1);
            int i = this.a.read(ahxlVarM.a, ahxlVarM.c, (int) Math.min(j, 8192 - ahxlVarM.c));
            if (i != -1) {
                ahxlVarM.c += i;
                long j2 = i;
                ahwxVar.b += j2;
                return j2;
            }
            if (ahxlVarM.b != ahxlVarM.c) {
                return -1L;
            }
            ahwxVar.a = ahxlVarM.a();
            ahxm.b(ahxlVarM);
            return -1L;
        } catch (AssertionError e) {
            int i2 = ahxd.a;
            if (e.getCause() == null || (message = e.getMessage()) == null || !agyv.o(message, "getsockname failed")) {
                throw e;
            }
            throw new IOException(e);
        }
    }

    @Override // defpackage.ahxq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final String toString() {
        return "source(" + this.a + ")";
    }
}
