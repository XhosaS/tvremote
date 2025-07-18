package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yeg implements zho {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final zgm f;

    public yeg(zgm zgmVar) {
        this.f = zgmVar;
    }

    @Override // defpackage.zho
    public final long a(zgk zgkVar, long j) throws IOException {
        int i;
        int iF;
        do {
            int i2 = this.d;
            if (i2 == 0) {
                zgm zgmVar = this.f;
                zgmVar.B(this.e);
                this.e = (short) 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iB = yek.b(zgmVar);
                    this.d = iB;
                    this.a = iB;
                    int iD = zgmVar.d() & 255;
                    this.b = (byte) (zgmVar.d() & 255);
                    Logger logger = yek.a;
                    byte b = (byte) iD;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.logp(Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", yeh.a(true, this.c, this.a, b, this.b));
                    }
                    iF = zgmVar.f() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    this.c = iF;
                    if (b != 9) {
                        throw yek.c("%s != TYPE_CONTINUATION", Byte.valueOf(b));
                    }
                }
            } else {
                long jA = this.f.a(zgkVar, Math.min(8192L, i2));
                if (jA != -1) {
                    this.d -= (int) jA;
                    return jA;
                }
            }
            return -1L;
        } while (iF == i);
        throw yek.c("TYPE_CONTINUATION streamId changed", new Object[0]);
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.f.b();
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
