package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afnq implements afoj {
    public final Executor a;
    private final afoj b;

    public afnq(afoj afojVar, Executor executor) {
        this.b = afojVar;
        executor.getClass();
        this.a = executor;
    }

    @Override // defpackage.afoj
    public final afot a(SocketAddress socketAddress, afoi afoiVar, afeo afeoVar) {
        return new afnp(this, this.b.a(socketAddress, afoiVar, afeoVar), afoiVar.a);
    }

    @Override // defpackage.afoj
    public final Collection b() {
        return this.b.b();
    }

    @Override // defpackage.afoj
    public final ScheduledExecutorService c() {
        return this.b.c();
    }

    @Override // defpackage.afoj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
