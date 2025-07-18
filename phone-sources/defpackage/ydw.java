package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ydw {
    public final Provider c;
    public static final Logger a = Logger.getLogger(ydw.class.getName());
    private static final String[] d = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    public static final ydw b = f();

    public ydw(Provider provider) {
        this.c = provider;
    }

    public static byte[] e(List list) {
        zgk zgkVar = new zgk();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ydx ydxVar = (ydx) list.get(i);
            if (ydxVar != ydx.HTTP_1_0) {
                String str = ydxVar.e;
                zgkVar.M(str.length());
                zgkVar.V(str);
            }
        }
        return zgkVar.E();
    }

    private static ydw f() throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, ClassNotFoundException, SecurityException, KeyManagementException, IllegalArgumentException, InvocationTargetException {
        Provider provider;
        int i;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i2 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                provider = null;
                break;
            }
            Provider provider2 = providers[i2];
            String[] strArr = d;
            int length2 = strArr.length;
            for (int i3 = 0; i3 < 5; i3++) {
                String str = strArr[i3];
                if (str.equals(provider2.getClass().getName())) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider2;
                    break loop0;
                }
            }
            i2++;
        }
        int i4 = 2;
        if (provider != null) {
            aafi aafiVar = new aafi((Object) null, "setUseSessionTickets", new Class[]{Boolean.TYPE}, (byte[]) null);
            aafi aafiVar2 = new aafi((Object) null, "setHostname", new Class[]{String.class}, (byte[]) null);
            aafi aafiVar3 = new aafi(byte[].class, "getAlpnSelectedProtocol", new Class[0], (byte[]) null);
            aafi aafiVar4 = new aafi((Object) null, "setAlpnProtocols", new Class[]{byte[].class}, (byte[]) null);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                cls.getMethod("tagSocket", Socket.class);
                cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
            }
            if (provider.getName().equals("GmsCore_OpenSSL") || provider.getName().equals("Conscrypt") || provider.getName().equals("Ssl_Guard")) {
                i = 1;
            } else {
                try {
                    ydw.class.getClassLoader().loadClass("android.net.Network");
                    i = 1;
                } catch (ClassNotFoundException e) {
                    a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e);
                    try {
                        ydw.class.getClassLoader().loadClass("android.app.ActivityOptions");
                    } catch (ClassNotFoundException e2) {
                        a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e2);
                        i4 = 3;
                    }
                    i = i4;
                }
            }
            return new yds(aafiVar, aafiVar2, aafiVar3, aafiVar4, provider, i);
        }
        try {
            Provider provider3 = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider3);
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new ydt(provider3, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return new ydw(provider3);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused3) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                return new ydu(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider3);
            }
        } catch (NoSuchAlgorithmException e3) {
            throw new RuntimeException(e3);
        }
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public int c() {
        return 3;
    }

    public void d(SSLSocket sSLSocket) {
    }

    public void b(SSLSocket sSLSocket, String str, List list) {
    }
}
