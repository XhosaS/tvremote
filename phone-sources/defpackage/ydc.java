package defpackage;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
class ydc {
    public static final ydc b;
    protected final ydw c;
    public static final Logger a = Logger.getLogger(ydc.class.getName());
    private static final ydw d = ydw.b;

    static {
        ydc ydcVar;
        ClassLoader classLoader = ydc.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e2);
                ydcVar = new ydc(d);
            }
        }
        ydcVar = new ydb(d);
        b = ydcVar;
    }

    public ydc(ydw ydwVar) {
        ydwVar.getClass();
        this.c = ydwVar;
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
            throw new RuntimeException(a.ct(list, "TLS ALPN negotiation failed with protocols: "));
        } finally {
            this.c.d(sSLSocket);
        }
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.c.b(sSLSocket, str, list);
    }
}
