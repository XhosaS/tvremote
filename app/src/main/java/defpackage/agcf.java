package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agcf {
    public static final agcf b;
    protected final agdc c;
    public static final Logger a = Logger.getLogger(agcf.class.getName());
    private static final agdc d = agdc.b;

    static {
        agcf agcfVar;
        ClassLoader classLoader = agcf.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                agcfVar = new agcf(d);
            }
        }
        agcfVar = new agce(d);
        b = agcfVar;
    }

    public agcf(agdc agdcVar) {
        agdcVar.getClass();
        this.c = agdcVar;
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.a(sSLSocket);
    }

    public String b(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strA = a(sSLSocket);
            if (strA != null) {
                return strA;
            }
            throw new RuntimeException(a.p(list, "TLS ALPN negotiation failed with protocols: "));
        } finally {
            this.c.d(sSLSocket);
        }
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.c.b(sSLSocket, str, list);
    }
}
