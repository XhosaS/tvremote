package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xqy extends xtd {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public xqy(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        sij.z(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xqy)) {
            return false;
        }
        xqy xqyVar = (xqy) obj;
        return a.Q(this.a, xqyVar.a) && a.Q(this.b, xqyVar.b) && a.Q(this.c, xqyVar.c) && a.Q(this.d, xqyVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("proxyAddr", this.a);
        tssVarH.b("targetAddr", this.b);
        tssVarH.b("username", this.c);
        tssVarH.f("hasPassword", this.d != null);
        return tssVarH.toString();
    }
}
