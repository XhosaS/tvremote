package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udo {
    public static final String a = "udo";
    public static final Object b = new Object();
    public static final String c = udv.class.getName();
    public static final String d = udu.class.getName();
    public static udt e;
    public uds f;

    private udo() {
    }

    public final void a() throws NoSuchAlgorithmException, KeyManagementException {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{new udw()}, null);
            SSLContext.setDefault(sSLContext);
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (KeyManagementException | NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public udo(uds udsVar) {
        this.f = udsVar;
    }
}
