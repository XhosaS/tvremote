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
/* loaded from: classes3.dex */
final class ycp implements xvp {
    final Executor a;
    final ScheduledExecutorService b;
    final SSLSocketFactory c;
    final ydp d;
    final upo e;
    private final xzo f;
    private final xzo g;
    private final boolean h;
    private final xuq i;
    private final long j;
    private boolean k;

    public ycp(xzo xzoVar, xzo xzoVar2, SSLSocketFactory sSLSocketFactory, ydp ydpVar, boolean z, long j, long j2, upo upoVar) {
        this.f = xzoVar;
        this.a = (Executor) xzoVar.a();
        this.g = xzoVar2;
        this.b = (ScheduledExecutorService) xzoVar2.a();
        this.c = sSLSocketFactory;
        this.d = ydpVar;
        this.h = z;
        this.i = new xuq(j);
        this.j = j2;
        upoVar.getClass();
        this.e = upoVar;
    }

    @Override // defpackage.xvp
    public final xvv a(SocketAddress socketAddress, xvo xvoVar, xqa xqaVar) {
        if (this.k) {
            throw new IllegalStateException("The transport factory is closed.");
        }
        xuq xuqVar = this.i;
        xup xupVar = new xup(xuqVar, xuqVar.c.get());
        xyp xypVar = new xyp(xupVar, 14);
        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddress;
        String str = xvoVar.a;
        String str2 = xvoVar.c;
        xpv xpvVar = xvoVar.b;
        xqy xqyVar = xvoVar.d;
        ttm ttmVar = xxc.p;
        Logger logger = yek.a;
        ycz yczVar = new ycz(this, inetSocketAddress, str, str2, xpvVar, ttmVar, xqyVar, xypVar);
        if (this.h) {
            long j = xupVar.a;
            long j2 = this.j;
            yczVar.D = true;
            yczVar.E = j;
            yczVar.F = j2;
        }
        return yczVar;
    }

    @Override // defpackage.xvp
    public final Collection b() {
        long j = ycq.b;
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.xvp
    public final ScheduledExecutorService c() {
        return this.b;
    }

    @Override // defpackage.xvp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.f.b(this.a);
        this.g.b(this.b);
    }
}
