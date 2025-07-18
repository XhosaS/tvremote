package defpackage;

import java.net.SocketAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afsp {
    public List a;
    public int b;
    public int c;

    public afsp(List list) {
        this.a = list;
    }

    public final afeh a() {
        return ((affy) this.a.get(this.b)).c;
    }

    public final SocketAddress b() {
        return (SocketAddress) ((affy) this.a.get(this.b)).b.get(this.c);
    }

    public final void c() {
        this.b = 0;
        this.c = 0;
    }
}
