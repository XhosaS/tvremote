package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afur extends afiw {
    final SocketAddress a;
    final String b;
    final Collection c;

    public afur(SocketAddress socketAddress, String str) {
        this.a = socketAddress;
        this.b = str;
        this.c = Collections.singleton(socketAddress.getClass());
    }

    @Override // defpackage.afiq
    public final afiv a(URI uri, afio afioVar) {
        return new afuq(this);
    }

    @Override // defpackage.afiq
    public final String b() {
        return "directaddress";
    }

    @Override // defpackage.afiw
    public final Collection c() {
        return this.c;
    }

    @Override // defpackage.afiw
    protected final void d() {
    }

    @Override // defpackage.afiw
    protected final void e() {
    }
}
