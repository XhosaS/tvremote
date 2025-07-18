package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xyv extends xsy {
    final SocketAddress a;
    final String b;
    final Collection c;

    public xyv(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.xsu
    public final xsx a(URI uri, xss xssVar) {
        return new xyu(this);
    }

    @Override // defpackage.xsu
    public final String b() {
        return "directaddress";
    }

    @Override // defpackage.xsy
    public final Collection c() {
        return this.c;
    }

    @Override // defpackage.xsy
    protected final void d() {
    }

    @Override // defpackage.xsy
    protected final void e() {
    }
}
