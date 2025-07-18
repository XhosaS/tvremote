package defpackage;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btx implements X509TrustManager {
    private X509TrustManager a;

    public btx(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        a(keyStore);
    }

    final void a(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        cbt cbtVar = bty.a;
        cch cchVarE = cbtVar.e();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager$DynamicTrustManager", "reloadTrustManager", 459, "KeyStoreManager.java")).p("Reloading keystore");
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    this.a = (X509TrustManager) trustManager;
                    ((cbs) ((cbs) cbtVar.c().g(cckVar)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager$DynamicTrustManager", "reloadTrustManager", 470, "KeyStoreManager.java")).t("Picked manager: %s", this.a);
                    return;
                }
            }
            ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager$DynamicTrustManager", "reloadTrustManager", 474, "KeyStoreManager.java")).p("No trust manager found");
            throw new IllegalStateException("No trust manager found");
        } catch (KeyStoreException e) {
            ((cbs) ((cbs) bty.a.f().i(e)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager$DynamicTrustManager", "reloadTrustManager", 479, "KeyStoreManager.java")).p("KeyStoreException");
        } catch (NoSuchAlgorithmException e2) {
            ((cbs) ((cbs) bty.a.f().i(e2)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager$DynamicTrustManager", "reloadTrustManager", 477, "KeyStoreManager.java")).p("NoSuchAlgorithmException");
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((cbs) ((cbs) bty.a.c().g(btt.a)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager$DynamicTrustManager", "checkClientTrusted", 442, "KeyStoreManager.java")).t("checkClientTrusted %s", this.a);
        this.a.checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        ((cbs) ((cbs) bty.a.c().g(btt.a)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager$DynamicTrustManager", "checkServerTrusted", 449, "KeyStoreManager.java")).t("checkServerTrusted %s", this.a);
        this.a.checkServerTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public final X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
