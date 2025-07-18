package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ycj implements yeb {
    private static final Logger d = Logger.getLogger(ycz.class.getName());
    public final yci a;
    public final yeb b;
    public final ulo c = new ulo(Level.FINE, ycz.class);

    public ycj(yci yciVar, yeb yebVar) {
        this.a = yciVar;
        this.b = yebVar;
    }

    @Override // defpackage.yeb
    public final void a() {
        throw null;
    }

    @Override // defpackage.yeb
    public final void b(boolean z, int i, zgk zgkVar, int i2) {
        throw null;
    }

    @Override // defpackage.yeb
    public final void c() {
        try {
            this.b.c();
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.yeb
    public final void d(boolean z, int i, int i2) {
        long j = i << 32;
        long j2 = i2 & 4294967295L;
        if (z) {
            ulo uloVar = this.c;
            if (uloVar.k()) {
                long j3 = j | j2;
                Object obj = uloVar.a;
                Logger logger = (Logger) obj;
                logger.logp((Level) uloVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", yfm.d(2) + " PING: ack=true bytes=" + j3);
            }
        } else {
            this.c.n(2, j | j2);
        }
        try {
            yeb yebVar = this.b;
            if (z) {
                ((yck) yebVar).b.h++;
            }
            ((yck) yebVar).a.d(z, i, i2);
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.yeb
    public final void e(int i, yea yeaVar) {
        this.c.o(2, i, yeaVar);
        try {
            yeb yebVar = this.b;
            ((yck) yebVar).b.h++;
            ((yck) yebVar).a.e(i, yeaVar);
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.yeb
    public final void f(int i, long j) {
        this.c.p(2, i, j);
        try {
            ((yck) this.b).a.f(i, j);
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.yeb
    public final void g(yea yeaVar, byte[] bArr) {
        this.c.m(2, 0, yeaVar, zgn.i(bArr));
        try {
            yeb yebVar = this.b;
            ((yck) yebVar).a.g(yeaVar, bArr);
            yebVar.c();
        } catch (IOException e) {
            this.a.d(e);
        }
    }

    @Override // defpackage.yeb
    public final void h(boolean z, int i, List list) {
        throw null;
    }

    @Override // defpackage.yeb
    public final void i(nue nueVar) {
        throw null;
    }

    @Override // defpackage.yeb
    public final void j(nue nueVar) {
        throw null;
    }
}
