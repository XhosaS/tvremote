package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afgh extends afjf {
    private static final long serialVersionUID = 0;
    public final SocketAddress a;
    public final InetSocketAddress b;
    public final String c;
    public final String d;

    public afgh(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        yqw.R(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        this.a = socketAddress;
        this.b = inetSocketAddress;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afgh)) {
            return false;
        }
        afgh afghVar = (afgh) obj;
        return yqs.a(this.a, afghVar.a) && yqs.a(this.b, afghVar.b) && yqs.a(this.c, afghVar.c) && yqs.a(this.d, afghVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        yqq yqqVarB = yqr.b(this);
        yqqVarB.b("proxyAddr", this.a);
        yqqVarB.b("targetAddr", this.b);
        yqqVarB.b("username", this.c);
        yqqVarB.c("hasPassword", String.valueOf(this.d != null));
        return yqqVarB.toString();
    }
}
