package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zco {
    public final zbi a;
    public final Proxy b;
    public final InetSocketAddress c;

    public zco(zbi zbiVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        proxy.getClass();
        inetSocketAddress.getClass();
        this.a = zbiVar;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final boolean a() {
        return this.a.c != null && this.b.type() == Proxy.Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zco)) {
            return false;
        }
        zco zcoVar = (zco) obj;
        return yks.e(zcoVar.a, this.a) && yks.e(zcoVar.b, this.b) && yks.e(zcoVar.c, this.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Route{" + this.c + "}";
    }
}
