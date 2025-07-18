package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtw implements xvp {
    private final ScheduledExecutorService a = (ScheduledExecutorService) ybq.a(xxc.o);
    private final Executor b;
    private final int c;
    private final xtx d;
    private final ybx e;

    public xtw(xtx xtxVar, Executor executor, int i, ybx ybxVar) {
        this.c = i;
        this.d = xtxVar;
        executor.getClass();
        this.b = executor;
        this.e = ybxVar;
    }

    @Override // defpackage.xvp
    public final xvv a(SocketAddress socketAddress, xvo xvoVar, xqa xqaVar) {
        String str = xvoVar.a;
        String str2 = xvoVar.c;
        xpv xpvVar = xvoVar.b;
        Executor executor = this.b;
        int i = this.c;
        return new xuf(this.d, (InetSocketAddress) socketAddress, str, str2, xpvVar, executor, i, this.e);
    }

    @Override // defpackage.xvp
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.xvp
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override // defpackage.xvp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        ybq.d(xxc.o, this.a);
    }
}
