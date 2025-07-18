package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agbg implements agdi {
    private static final Logger d = Logger.getLogger(agca.class.getName());
    public final agbf a;
    public final agdi b;
    public final agcd c = new agcd(Level.FINE, agca.class);

    public agbg(agbf agbfVar, agdi agdiVar) {
        this.a = agbfVar;
        this.b = agdiVar;
    }

    @Override // defpackage.agdi
    public final void a(agdu agduVar) {
        throw null;
    }

    @Override // defpackage.agdi
    public final void b() {
        throw null;
    }

    @Override // defpackage.agdi
    public final void c(boolean z, int i, ahwx ahwxVar, int i2) {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.b.close();
        } catch (IOException e) {
            d.logp(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "io.grpc.okhttp.ExceptionHandlingFrameWriter", "close", "Failed closing connection", (Throwable) e);
        }
    }

    @Override // defpackage.agdi
    public final void d() {
        try {
            this.b.d();
        } catch (IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.agdi
    public final void e(boolean z, int i, int i2) {
        long j = i << 32;
        long j2 = i2 & 4294967295L;
        if (z) {
            agcd agcdVar = this.c;
            if (agcdVar.a()) {
                long j3 = j | j2;
                agcdVar.a.logp(agcdVar.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPingAck", agcb.a(2) + " PING: ack=true bytes=" + j3);
            }
        } else {
            this.c.d(2, j | j2);
        }
        try {
            agdi agdiVar = this.b;
            if (z) {
                ((agbc) agdiVar).a.h++;
            }
            ((agbh) agdiVar).b.e(z, i, i2);
        } catch (IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.agdi
    public final void f(int i, agdg agdgVar) {
        this.c.e(2, i, agdgVar);
        try {
            agdi agdiVar = this.b;
            ((agbc) agdiVar).a.h++;
            ((agbh) agdiVar).b.f(i, agdgVar);
        } catch (IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.agdi
    public final void g(agdu agduVar) {
        throw null;
    }

    @Override // defpackage.agdi
    public final void h(int i, long j) {
        this.c.g(2, i, j);
        try {
            ((agbh) this.b).b.h(i, j);
        } catch (IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.agdi
    public final void i(agdg agdgVar, byte[] bArr) {
        this.c.c(2, 0, agdgVar, ahxb.a.b(bArr));
        try {
            agdi agdiVar = this.b;
            ((agbh) agdiVar).b.i(agdgVar, bArr);
            agdiVar.d();
        } catch (IOException e) {
            this.a.e(e);
        }
    }

    @Override // defpackage.agdi
    public final void j(boolean z, int i, List list) {
        throw null;
    }
}
