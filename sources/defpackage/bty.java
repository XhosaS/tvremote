package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bty {
    public static final cbt a = cbt.k("com/google/android/tv/remote/service/pairing/KeyStoreManager");
    public btx b;
    private final Date c;
    private final Context d;
    private KeyStore e;
    private final adx f;

    public bty(Context context) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(10, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.c = calendar.getTime();
        this.d = context;
        this.f = new adx(context, null, null);
        this.b = null;
    }

    private static String d(Certificate certificate) {
        X500Principal subjectX500Principal;
        if (!(certificate instanceof X509Certificate) || (subjectX500Principal = ((X509Certificate) certificate).getSubjectX500Principal()) == null) {
            return null;
        }
        return subjectX500Principal.getName();
    }

    private static void e(KeyStore keyStore) throws KeyStoreException {
        cbt cbtVar = a;
        cch cchVarB = cbtVar.b();
        cck cckVar = btt.a;
        ((cbs) ((cbs) cchVarB.g(cckVar)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "clear", 399, "KeyStoreManager.java")).p("Clearing AtvRemote Certificates");
        Enumeration<String> enumerationAliases = keyStore.aliases();
        while (enumerationAliases.hasMoreElements()) {
            String strNextElement = enumerationAliases.nextElement();
            ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "clear", 402, "KeyStoreManager.java")).t("Deleting alias: %s", strNextElement);
            keyStore.deleteEntry(strNextElement);
        }
    }

    private final void f(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        btx btxVar = this.b;
        if (btxVar == null) {
            this.b = new btx(keyStore);
        } else {
            btxVar.a(keyStore);
        }
        this.e = keyStore;
    }

    private static final X500Principal g(String str) {
        return new X500Principal(String.format("CN=atvremote/%s, DNQUALIFIER=\"%s/%s/%s\"", str, Build.PRODUCT, Build.DEVICE, Build.MODEL));
    }

    private static final String h() {
        String strD = dka.d();
        if (!"unknown".equals(strD)) {
            return strD;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            String address = defaultAdapter.getAddress();
            if (!TextUtils.isEmpty(address) && !address.equals("02:00:00:00:00:00")) {
                return address;
            }
        }
        return UUID.randomUUID().toString();
    }

    private static boolean i(bsi bsiVar, KeyStore keyStore, boolean z) throws CertificateNotYetValidException, CertificateExpiredException {
        X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate("atvremote-server");
        try {
            x509Certificate.checkValidity();
            return true;
        } catch (CertificateExpiredException unused) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "isCertValid", 250, "KeyStoreManager.java")).t("Server certificate expired on %s", x509Certificate.getNotAfter());
            bsiVar.a(true != z ? 1008 : 1010, TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - x509Certificate.getNotAfter().getTime()));
            return false;
        } catch (CertificateNotYetValidException unused2) {
            ((cbs) a.g().j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "isCertValid", 256, "KeyStoreManager.java")).t("Server certificate is not valid until %s", x509Certificate.getNotBefore());
            bsiVar.a(true != z ? 1007 : 1009, TimeUnit.MILLISECONDS.toDays(x509Certificate.getNotBefore().getTime() - System.currentTimeMillis()));
            return false;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:192|26|(7:215|28|29|(3:35|36|37)|54|74|(5:77|84|202|85|(22:87|209|88|193|89|90|187|91|92|196|93|(1:95)(1:96)|97|98|(1:100)(2:101|(1:103)(1:104))|105|198|106|107|(2:109|(1:115))|116|(2:159|160)(10:132|(1:134)|135|(1:137)(1:138)|139|(1:141)|142|186|143|(6:145|205|146|(1:148)|149|150)(2:154|155)))(2:175|176)))(1:38)|39|200|40|(1:44)(2:45|(2:184|47))|(5:52|53|54|74|(0))(2:56|57)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: Exception -> 0x0135, TRY_LEAVE, TryCatch #4 {Exception -> 0x0135, blocks: (B:14:0x0043, B:16:0x0049), top: B:190:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x058f A[Catch: all -> 0x0597, TryCatch #12 {all -> 0x0597, blocks: (B:85:0x029e, B:87:0x02d0, B:88:0x02d9, B:89:0x02e8, B:90:0x02fd, B:91:0x0311, B:92:0x0324, B:93:0x0328, B:95:0x0338, B:97:0x0345, B:98:0x0347, B:100:0x0353, B:105:0x0379, B:106:0x03b4, B:107:0x03c8, B:109:0x0406, B:111:0x041b, B:113:0x0423, B:115:0x0427, B:116:0x042a, B:118:0x0430, B:120:0x0434, B:122:0x0438, B:124:0x043c, B:126:0x0440, B:128:0x0444, B:130:0x0448, B:132:0x044c, B:134:0x0461, B:135:0x0464, B:137:0x0486, B:139:0x0492, B:141:0x049b, B:142:0x04a5, B:143:0x04ae, B:145:0x04b4, B:146:0x04ca, B:152:0x0528, B:153:0x052f, B:154:0x0530, B:155:0x0537, B:157:0x0539, B:158:0x0540, B:138:0x048a, B:159:0x0541, B:160:0x0548, B:162:0x054a, B:163:0x0551, B:101:0x0359, B:103:0x0365, B:104:0x0372, B:96:0x033f, B:164:0x0552, B:165:0x0557, B:167:0x0559, B:168:0x056c, B:170:0x056e, B:171:0x057d, B:173:0x057f, B:174:0x058e, B:175:0x058f, B:176:0x0596), top: B:202:0x029e, inners: #1, #2, #6, #8, #10, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: Exception -> 0x0133, TryCatch #7 {Exception -> 0x0133, blocks: (B:18:0x004d, B:20:0x0066, B:21:0x006b, B:22:0x006c, B:23:0x0071, B:24:0x0072, B:25:0x007a), top: B:195:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0200 A[Catch: ProviderException -> 0x020b, TRY_LEAVE, TryCatch #18 {ProviderException -> 0x020b, blocks: (B:73:0x0140, B:74:0x015d, B:77:0x0200), top: B:213:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d0 A[Catch: all -> 0x0597, TRY_LEAVE, TryCatch #12 {all -> 0x0597, blocks: (B:85:0x029e, B:87:0x02d0, B:88:0x02d9, B:89:0x02e8, B:90:0x02fd, B:91:0x0311, B:92:0x0324, B:93:0x0328, B:95:0x0338, B:97:0x0345, B:98:0x0347, B:100:0x0353, B:105:0x0379, B:106:0x03b4, B:107:0x03c8, B:109:0x0406, B:111:0x041b, B:113:0x0423, B:115:0x0427, B:116:0x042a, B:118:0x0430, B:120:0x0434, B:122:0x0438, B:124:0x043c, B:126:0x0440, B:128:0x0444, B:130:0x0448, B:132:0x044c, B:134:0x0461, B:135:0x0464, B:137:0x0486, B:139:0x0492, B:141:0x049b, B:142:0x04a5, B:143:0x04ae, B:145:0x04b4, B:146:0x04ca, B:152:0x0528, B:153:0x052f, B:154:0x0530, B:155:0x0537, B:157:0x0539, B:158:0x0540, B:138:0x048a, B:159:0x0541, B:160:0x0548, B:162:0x054a, B:163:0x0551, B:101:0x0359, B:103:0x0365, B:104:0x0372, B:96:0x033f, B:164:0x0552, B:165:0x0557, B:167:0x0559, B:168:0x056c, B:170:0x056e, B:171:0x057d, B:173:0x057f, B:174:0x058e, B:175:0x058f, B:176:0x0596), top: B:202:0x029e, inners: #1, #2, #6, #8, #10, #14, #16 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.security.KeyStore j(defpackage.bsi r24, boolean r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bty.j(bsi, boolean):java.security.KeyStore");
    }

    public final KeyManager[] a() throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(this.e, new char[0]);
        return keyManagerFactory.getKeyManagers();
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean b(bsi bsiVar) {
        int i = 1;
        try {
            ?? r8 = this.f.a;
            boolean z = r8.getInt("keystore-cache-version-key", -1) != 3;
            f(j(bsiVar, z));
            if (z) {
                ((cbs) ((cbs) a.b().g(btt.a)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "initialize", 113, "KeyStoreManager.java")).r("Update key store cache to version %d", 3);
                r8.edit().putInt("keystore-cache-version-key", 3).apply();
            }
            return true;
        } catch (ProviderException e) {
            ((cbs) ((cbs) a.g().i(e)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "initialize", 121, "KeyStoreManager.java")).p("Failed to initialize KeyStore");
            i = 2;
            bsiVar.a(1006, i);
            return false;
        } catch (RuntimeException e2) {
            ((cbs) ((cbs) a.g().i(e2)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "initialize", 124, "KeyStoreManager.java")).p("Failed to initialize KeyStore");
            i = 3;
            bsiVar.a(1006, i);
            return false;
        } catch (GeneralSecurityException e3) {
            ((cbs) ((cbs) a.g().i(e3)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "initialize", 118, "KeyStoreManager.java")).p("Failed to initialize KeyStore");
            bsiVar.a(1006, i);
            return false;
        }
    }

    public final void c(Certificate certificate) {
        try {
            String str = String.format("atvremote-%s", Long.toString(Math.abs(certificate.hashCode()), 16));
            String strD = d(certificate);
            if (this.e.containsAlias(str)) {
                ((cbs) ((cbs) a.g().g(btt.a)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "storeCertificate", 340, "KeyStoreManager.java")).t("Deleting existing entry for %s", str);
                this.e.deleteEntry(str);
            }
            if (strD != null) {
                Enumeration<String> enumerationAliases = this.e.aliases();
                while (enumerationAliases.hasMoreElements()) {
                    String strNextElement = enumerationAliases.nextElement();
                    String strD2 = d(this.e.getCertificate(strNextElement));
                    if (strD2 != null && strD2.equals(strD)) {
                        ((cbs) a.b().j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "storeCertificate", 350, "KeyStoreManager.java")).z("Deleting entry for %s + (%s)", strNextElement, strD2);
                        this.e.deleteEntry(strNextElement);
                    }
                }
            }
            cbt cbtVar = a;
            cch cchVarE = cbtVar.e();
            cck cckVar = btt.a;
            ((cbs) ((cbs) cchVarE.g(cckVar)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "storeCertificate", 355, "KeyStoreManager.java")).t("Adding cert %s to keystore", str);
            this.e.setCertificateEntry(str, certificate);
            f(this.e);
            ((cbs) ((cbs) cbtVar.e().g(cckVar)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "storeCertificate", 358, "KeyStoreManager.java")).t("Cert %s added to keystore", str);
        } catch (KeyStoreException e) {
            ((cbs) ((cbs) a.f().i(e)).j("com/google/android/tv/remote/service/pairing/KeyStoreManager", "storeCertificate", 361, "KeyStoreManager.java")).p("Storing cert failed");
        }
    }
}
