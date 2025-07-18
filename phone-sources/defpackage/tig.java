package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tig {
    public tif a = null;
    private final Context b;
    private KeyStore c;
    private final ulp d;

    static {
        "KeyStore_Password".toCharArray();
    }

    public tig(Context context) {
        this.b = context;
        this.d = new ulp(context, (char[]) null);
    }

    private static String e(Certificate certificate) {
        X500Principal subjectX500Principal;
        if (!(certificate instanceof X509Certificate) || (subjectX500Principal = ((X509Certificate) certificate).getSubjectX500Principal()) == null) {
            return null;
        }
        return subjectX500Principal.getName();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    private final boolean f() {
        return this.d.a.getInt("keystore-cache-version-key", -1) != 5;
    }

    private static void g(KeyStore keyStore) throws KeyStoreException {
        try {
            Enumeration<String> enumerationAliases = keyStore.aliases();
            while (enumerationAliases.hasMoreElements()) {
                keyStore.deleteEntry(enumerationAliases.nextElement());
            }
        } catch (KeyStoreException e) {
            Log.e("KeyStoreManager", "Clearing certificates failed", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void h(java.security.KeyStore r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 848
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tig.h(java.security.KeyStore):void");
    }

    private static boolean i(KeyStore keyStore) {
        try {
            return keyStore.containsAlias("atvremote-client");
        } catch (KeyStoreException e) {
            Log.e("KeyStoreManager", "Key store exception occurred", e);
            return false;
        }
    }

    private static final KeyStore j() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            e = e;
            Log.e("KeyStoreManager", "Unable open keystore file", e);
            return null;
        } catch (KeyStoreException e2) {
            throw new IllegalStateException("Unable to get default instance of KeyStore", e2);
        } catch (GeneralSecurityException e3) {
            e = e3;
            Log.e("KeyStoreManager", "Unable open keystore file", e);
            return null;
        }
    }

    public final KeyStore a() throws Throwable {
        KeyStore keyStoreJ = j();
        boolean zF = f();
        if (keyStoreJ != null) {
            if (!zF && i(keyStoreJ)) {
                return keyStoreJ;
            }
            try {
                g(keyStoreJ);
                h(keyStoreJ);
                return keyStoreJ;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException("Unable to clear KeyStore", e);
            }
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            try {
                keyStore.load(null);
                h(keyStore);
                return keyStore;
            } catch (IOException e2) {
                throw new GeneralSecurityException("Unable to create empty keyStore", e2);
            }
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException("Unable to create identity KeyStore", e3);
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void b(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        tif tifVar = this.a;
        if (tifVar == null) {
            this.a = new tif(keyStore);
        } else {
            tifVar.a(keyStore);
        }
        this.c = keyStore;
        if (f()) {
            this.d.a.edit().putInt("keystore-cache-version-key", 5).apply();
        }
    }

    public final KeyManager[] c() throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(this.c, new char[0]);
        return keyManagerFactory.getKeyManagers();
    }

    public final void d(Certificate certificate) throws NoSuchAlgorithmException, KeyStoreException {
        try {
            String str = String.format("atvremote-%s", Long.toString(Math.abs(certificate.hashCode()), 16));
            String strE = e(certificate);
            if (this.c.containsAlias(str)) {
                Log.w("KeyStoreManager", a.cr(str, "Deleting existing entry for "));
                this.c.deleteEntry(str);
            }
            if (strE != null) {
                Enumeration<String> enumerationAliases = this.c.aliases();
                while (enumerationAliases.hasMoreElements()) {
                    String strNextElement = enumerationAliases.nextElement();
                    String strE2 = e(this.c.getCertificate(strNextElement));
                    if (strE2 != null && strE2.equals(strE)) {
                        this.c.deleteEntry(strNextElement);
                    }
                }
            }
            this.c.setCertificateEntry(str, certificate);
            b(this.c);
        } catch (KeyStoreException e) {
            Log.e("KeyStoreManager", "Storing cert failed", e);
        }
    }
}
