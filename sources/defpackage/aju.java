package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import j$.util.DesugarArrays;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.function.IntFunction;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aju {
    private static Context a;
    private static Boolean b;

    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }

    public static synchronized boolean b(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (c()) {
            b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = true;
            } catch (ClassNotFoundException unused) {
                b = false;
            }
        }
        a = applicationContext;
        return b.booleanValue();
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static int d(int i) {
        if (i == -1) {
            return -1;
        }
        return i / 1000;
    }

    public static SSLServerSocketFactory e(KeyManager[] keyManagerArr, TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        if (trustManager == null) {
            trustManager = new bmc();
        }
        sSLContext.init(keyManagerArr, new TrustManager[]{trustManager}, null);
        return sSLContext.getServerSocketFactory();
    }

    public static void f(SSLServerSocket sSLServerSocket) {
        final int i = 0;
        sSLServerSocket.setEnabledProtocols((String[]) DesugarArrays.stream(sSLServerSocket.getEnabledProtocols()).filter(Predicate$CC.isEqual("TLSv1").or(Predicate$CC.isEqual("TLSv1.1")).negate()).toArray(new IntFunction() { // from class: bmb
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return i != 0 ? new String[i2] : new String[i2];
            }
        }));
        Stream streamFilter = DesugarArrays.stream(sSLServerSocket.getEnabledCipherSuites()).filter(new bma(i));
        final int i2 = 1;
        sSLServerSocket.setEnabledCipherSuites((String[]) streamFilter.toArray(new IntFunction() { // from class: bmb
            @Override // java.util.function.IntFunction
            public final Object apply(int i22) {
                return i2 != 0 ? new String[i22] : new String[i22];
            }
        }));
        sSLServerSocket.setNeedClientAuth(true);
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 2:
                return "PAIRING_REQUEST";
            case 3:
                return "PAIRING_REQUEST_ACK";
            case 4:
                return "OPTIONS";
            case 5:
                return "CONFIGURATION";
            case 6:
                return "CONFIGURATION_ACK";
            case 7:
                return "SECRET";
            default:
                return "SECRET_ACK";
        }
    }

    public static /* synthetic */ String h(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DISPLAY_DEVICE" : "INPUT_DEVICE" : "UNKNOWN";
    }

    public static /* synthetic */ String i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ENCODING_QRCODE" : "ENCODING_HEXADECIMAL" : "ENCODING_NUMERIC" : "ENCODING_ALPHANUMERIC" : "ENCODING_UNKNOWN";
    }
}
