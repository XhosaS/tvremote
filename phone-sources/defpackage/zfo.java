package defpackage;

import com.google.android.exoplayer2.ext.widevine.WVMediaCrypto;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zfo {
    private static final Logger a;
    public static volatile zfo b;

    static {
        zfo zfnVar;
        if (wcq.aM()) {
            CopyOnWriteArraySet copyOnWriteArraySet = zfr.a;
            for (Map.Entry entry : zfr.b.entrySet()) {
                String str = (String) entry.getKey();
                Logger logger = Logger.getLogger(str);
                if (zfr.a.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Level.WARNING);
                    logger.addHandler(zfs.a);
                }
            }
            zfnVar = zfi.a ? new zfi() : null;
            if (zfnVar == null) {
                zfmVar = zfk.a ? new zfk() : null;
                zfmVar.getClass();
            }
        } else {
            zfnVar = zfn.a ? new zfn() : null;
            if (zfnVar == null) {
                int i = zfm.a;
                String property = System.getProperty("java.specification.version", "unknown");
                try {
                    property.getClass();
                } catch (NumberFormatException unused) {
                }
                if (Integer.parseInt(property) < 9) {
                    try {
                        Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                        Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                        Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                        Method method = cls.getMethod("put", SSLSocket.class, cls2);
                        Method method2 = cls.getMethod("get", SSLSocket.class);
                        Method method3 = cls.getMethod("remove", SSLSocket.class);
                        method.getClass();
                        method2.getClass();
                        method3.getClass();
                        cls3.getClass();
                        cls4.getClass();
                        zfmVar = new zfm(method, method2, method3, cls3, cls4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    }
                }
                zfnVar = zfmVar == null ? new zfo() : zfmVar;
            }
        }
        b = zfnVar;
        a = Logger.getLogger(zch.class.getName());
    }

    public static /* synthetic */ void l(zfo zfoVar, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        zfoVar.k(str, i, null);
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public zgb b(X509TrustManager x509TrustManager) {
        return new zfz(e(x509TrustManager));
    }

    public boolean d(String str) {
        return true;
    }

    public zgd e(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new zga((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void f(String str, Object obj) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        k(str, 5, (Throwable) obj);
    }

    public Object g() {
        if (a.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress) {
        socket.getClass();
        socket.connect(inetSocketAddress, WVMediaCrypto.TYPE);
    }

    public final SSLSocketFactory j(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.getClass();
            sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            socketFactory.getClass();
            return socketFactory;
        } catch (GeneralSecurityException e) {
            e.toString();
            throw new AssertionError("No System TLS: ".concat(e.toString()), e);
        }
    }

    public final void k(String str, int i, Throwable th) {
        a.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public final String toString() {
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        return simpleName;
    }

    public void i(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
