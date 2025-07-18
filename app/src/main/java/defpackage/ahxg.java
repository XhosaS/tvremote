package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxg implements ahxo {
    public final OutputStream a;
    private final ahxs b;

    public ahxg(OutputStream outputStream, ahxs ahxsVar) {
        this.a = outputStream;
        this.b = ahxsVar;
    }

    @Override // defpackage.ahxo, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.ahxo
    public final void fF(ahwx ahwxVar, long j) throws IOException {
        ahwt.a(ahwxVar.b, 0L, j);
        while (j > 0) {
            this.b.b();
            ahxl ahxlVar = ahwxVar.a;
            ahxlVar.getClass();
            int iMin = (int) Math.min(j, ahxlVar.c - ahxlVar.b);
            this.a.write(ahxlVar.a, ahxlVar.b, iMin);
            int i = ahxlVar.b + iMin;
            ahxlVar.b = i;
            long j2 = iMin;
            ahwxVar.b -= j2;
            j -= j2;
            if (i == ahxlVar.c) {
                ahwxVar.a = ahxlVar.a();
                ahxm.b(ahxlVar);
            }
        }
    }

    @Override // defpackage.ahxo, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    public final String toString() {
        return "sink(" + this.a + ")";
    }
}
