package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xuz implements xvp {
    private final xvp a;

    public xuz(xvp xvpVar, Executor executor) {
        this.a = xvpVar;
        executor.getClass();
    }

    @Override // defpackage.xvp
    public final xvv a(SocketAddress socketAddress, xvo xvoVar, xqa xqaVar) {
        return new xuy(this.a.a(socketAddress, xvoVar, xqaVar), xvoVar.a);
    }

    @Override // defpackage.xvp
    public final Collection b() {
        return this.a.b();
    }

    @Override // defpackage.xvp
    public final ScheduledExecutorService c() {
        return this.a.c();
    }

    @Override // defpackage.xvp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
