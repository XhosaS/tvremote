package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agdn implements ahxq {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final ahwz f;

    public agdn(ahwz ahwzVar) {
        this.f = ahwzVar;
    }

    @Override // defpackage.ahxq
    public final long a(ahwx ahwxVar, long j) throws IOException {
        int i;
        int iE;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                ahwz ahwzVar = this.f;
                ahwzVar.o(this.e);
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iB = agdr.b(ahwzVar);
                    this.d = iB;
                    this.a = iB;
                    int iC = ahwzVar.c() & 255;
                    this.b = (byte) (ahwzVar.c() & 255);
                    Logger logger = agdr.a;
                    byte b = (byte) iC;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", agdo.a(true, this.c, this.a, b, this.b));
                    }
                    iE = ahwzVar.e() & Integer.MAX_VALUE;
                    this.c = iE;
                    if (b != 9) {
                        throw agdr.c("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    }
                }
            } else {
                long jA = this.f.a(ahwxVar, Math.min(8192L, i2));
                if (jA != -1) {
                    this.d -= (int) jA;
                    return jA;
                }
            }
            return -1L;
        } while (iE == i);
        throw agdr.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.ahxq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
