package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agbn implements afoj {
    final Executor a;
    final ScheduledExecutorService b;
    final agad c;
    final SSLSocketFactory d;
    final agcs e;
    private final afvo f;
    private final afvo g;
    private final boolean h = false;
    private final afne i = new afne();
    private final long j;
    private boolean k;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public agbn(afvo afvoVar, afvo afvoVar2, SSLSocketFactory sSLSocketFactory, agcs agcsVar, boolean z, long j, agad agadVar) {
        this.f = afvoVar;
        this.a = afvoVar.a();
        this.g = afvoVar2;
        this.b = (ScheduledExecutorService) afvoVar2.a();
        this.d = sSLSocketFactory;
        this.e = agcsVar;
        this.j = j;
        agadVar.getClass();
        this.c = agadVar;
    }

    @Override // defpackage.afoj
    public final afot a(SocketAddress socketAddress, afoi afoiVar, afeo afeoVar) {
        if (this.k) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        afne afneVar = this.i;
        agbm agbmVar = new agbm(new afnd(afneVar, afneVar.c.get()));
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        String str = afoiVar.a;
        String str2 = afoiVar.c;
        afeh afehVar = afoiVar.b;
        afgh afghVar = afoiVar.d;
        yrp yrpVar = afrq.o;
        Logger logger = agdr.a;
        return new agca(this, inetSocketAddress, str, str2, afehVar, yrpVar, afghVar, agbmVar);
    }

    @Override // defpackage.afoj
    public final Collection b() {
        int i = agbo.i;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.afoj
    public final ScheduledExecutorService c() {
        return this.b;
    }

    @Override // defpackage.afoj, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f.b(this.a);
        this.g.b(this.b);
    }
}
