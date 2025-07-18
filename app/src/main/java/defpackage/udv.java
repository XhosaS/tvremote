package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udv extends SSLSocketFactory {
    public static uds a = null;
    private static final String b = "udv";
    private final KeyManager[] c;
    private final TrustManager[] d;
    private final SecureRandom e;

    public udv(KeyManager[] keyManagerArr, TrustManager[] trustManagerArr, SecureRandom secureRandom) {
        this.c = keyManagerArr;
        this.d = trustManagerArr;
        this.e = secureRandom;
    }

    private final SSLSocketFactory a() throws NoSuchAlgorithmException, KeyManagementException {
        udp udpVar = udp.a;
        int i = udpVar.c;
        a.a(udpVar);
        SSLSocketFactory sSLSocketFactoryB = b();
        if (!(sSLSocketFactoryB instanceof udv)) {
            return sSLSocketFactoryB;
        }
        String strConcat = "[";
        for (Provider provider : Security.getProviders()) {
            strConcat = strConcat.concat(String.valueOf(provider.toString())).concat(provider.stringPropertyNames().contains("SSLContext.Default") ? "(true), " : "(false), ");
        }
        Log.e(b, strConcat.concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    private final SSLSocketFactory b() throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            TrustManager[] trustManagerArr = this.d;
            if (trustManagerArr == null || trustManagerArr.length <= 0 || !(trustManagerArr[0] instanceof udw)) {
                sSLContext.init(this.c, trustManagerArr, this.e);
            } else {
                sSLContext.init(null, null, null);
            }
            return sSLContext.getSocketFactory();
        } catch (KeyManagementException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return a().createSocket();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return a().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return a().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return a().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return a().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return a().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return a().createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return a().createSocket(socket, str, i, z);
    }
}
