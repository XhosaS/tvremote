package defpackage;

import android.util.Log;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tif implements X509TrustManager {
    private X509TrustManager a;

    public tif(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        a(keyStore);
    }

    final void a(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.a = (X509TrustManager) trustManager;
                    return;
                }
            }
            throw new IllegalStateException("No trust manager found");
        } catch (KeyStoreException e) {
            Log.e("KeyStoreManager", "KeyStoreException", e);
        } catch (NoSuchAlgorithmException e2) {
            Log.e("KeyStoreManager", "NoSuchAlgorithmException", e2);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        this.a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
