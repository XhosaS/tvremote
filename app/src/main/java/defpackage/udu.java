package defpackage;

import android.util.Log;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udu extends SSLServerSocketFactory {
    public static uds a;
    private static final String b = "udv";

    private final SSLServerSocketFactory a() {
        udp udpVar = udp.a;
        int i = udpVar.c;
        a.a(udpVar);
        SSLServerSocketFactory sSLServerSocketFactoryB = b();
        if (!(sSLServerSocketFactoryB instanceof udu)) {
            return sSLServerSocketFactoryB;
        }
        String strConcat = "[";
        for (Provider provider : Security.getProviders()) {
            strConcat = strConcat.concat(String.valueOf(provider.toString())).concat(provider.stringPropertyNames().contains("SSLContext.Default") ? "(true), " : "(false), ");
        }
        Log.e(b, strConcat.concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    private final SSLServerSocketFactory b() {
        try {
            return SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i) {
        return a().createServerSocket(i);
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getDefaultCipherSuites() {
        try {
            return a().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ssl.SSLServerSocketFactory
    public final String[] getSupportedCipherSuites() {
        try {
            return a().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2) {
        return a().createServerSocket(i, i2);
    }

    @Override // javax.net.ServerSocketFactory
    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return a().createServerSocket(i, i2, inetAddress);
    }
}
