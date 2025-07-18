package defpackage;

import android.support.v7.widget.ActivityChooserView;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zew implements zho {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final zgm f;

    public zew(zgm zgmVar) {
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
                this.e = 0;
                if ((this.b & 4) == 0) {
                    i = this.c;
                    int iG = zcr.g(zgmVar);
                    this.d = iG;
                    this.a = iG;
                    int iX = zcr.x(zgmVar.d());
                    this.b = zcr.x(zgmVar.d());
                    Logger logger = zex.a;
                    if (logger.isLoggable(Level.FINE)) {
                        zgn zgnVar = zee.a;
                        logger.fine(zee.b(true, this.c, this.a, iX, this.b));
                    }
                    iF = zgmVar.f() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    this.c = iF;
                    if (iX != 9) {
                        throw new IOException(iX + " != TYPE_CONTINUATION");
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
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.f.b();
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
