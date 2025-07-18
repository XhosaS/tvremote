package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afme implements afoj {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final int c;
    private final afmf d;
    private final agae e;
    private final boolean f;

    public afme(afmf afmfVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, agae agaeVar) {
        boolean z = scheduledExecutorService == null;
        this.f = z;
        this.a = z ? (ScheduledExecutorService) afzu.a.a(afrq.n) : scheduledExecutorService;
        this.c = i;
        this.d = afmfVar;
        executor.getClass();
        this.b = executor;
        this.e = agaeVar;
    }

    @Override // defpackage.afoj
    public final afot a(SocketAddress socketAddress, afoi afoiVar, afeo afeoVar) {
        String str = afoiVar.a;
        String str2 = afoiVar.c;
        afeh afehVar = afoiVar.b;
        Executor executor = this.b;
        int i = this.c;
        return new afmp(this.d, (InetSocketAddress) socketAddress, str, str2, afehVar, executor, i, this.e);
    }

    @Override // defpackage.afoj
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.afoj
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override // defpackage.afoj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            ScheduledExecutorService scheduledExecutorService = this.a;
            afzu.a.b(afrq.n, scheduledExecutorService);
        }
    }
}
