package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zpr extends Provider {
    public static final Map b;
    public static final Class c;
    public static final String[] d;
    public static final String[] e;
    public static final znk[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public final Map l;
    public static final Logger a = Logger.getLogger(zpr.class.getName());
    private static final String m = "BouncyCastle Security Provider v1.78.1";

    static {
        int i2 = zps.a;
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        b = new HashMap();
        c = wef.Y(zpr.class, "java.security.cert.PKIXRevocationChecker");
        d = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        e = new String[]{"SipHash", "SipHash128", "Poly1305"};
        f = new znk[]{new zob("AES", 2), new zob("ARC4", 2), new zob("ARIA", 2), new zob("Blowfish", 2), new zob("Camellia", 2), new zob("CAST5", 2), new zob("CAST6", 2), new zob("ChaCha", 2), new zob("DES", 2), new zob("DESede", 2), new zob("GOST28147", 2), new zob("Grainv1", 2), new zob("Grain128", 2), new zob("HC128", 2), new zob("HC256", 2), new zob("IDEA", 2), new zob("Noekeon", 2), new zob("RC2", 2), new zob("RC5", 2), new zob("RC6", 2), new zob("Rijndael", 2), new zob("Salsa20", 2), new zob("SEED", 2), new zob("Serpent", 2), new zob("Shacal2", 2), new zob("Skipjack", 2), new zob("SM4", 2), new zob("TEA", 2), new zob("Twofish", 2), new zob("Threefish", 2), new zob("VMPC", 2), new zob("VMPCKSA3", 2), new zob("XTEA", 2), new zob("XSalsa20", 2), new zob("OpenSSLPBKDF", 2), new zob("DSTU7624", 2), new zob("GOST3412_2015", 2), new zob("Zuc", 2)};
        g = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures"};
        h = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        i = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        j = new String[]{"BC", "BCFKS", "PKCS12"};
        k = new String[]{"DRBG"};
    }

    public zpr() {
        super("BC", 1.7801d, m);
        this.l = new ConcurrentHashMap();
        AccessController.doPrivileged(new zpp(this));
    }

    public static final void d(zjb zjbVar, zpm zpmVar) {
        Map map = b;
        synchronized (map) {
            map.put(zjbVar, zpmVar);
        }
    }

    public static final void e(String str, String str2) {
        Class clsY = wef.Y(zpr.class, str + str2 + "$Mappings");
        if (clsY != null) {
            try {
                ((zpl) clsY.newInstance()).a();
            } catch (Exception e2) {
                throw new InternalError("cannot create instance of " + str + str2 + "$Mappings : " + e2.toString());
            }
        }
    }

    public static final void f(String str, String[] strArr) {
        for (int i2 = 0; i2 != strArr.length; i2++) {
            e(str, strArr[i2]);
        }
    }

    @Override // java.security.Provider
    public final Provider.Service getService(String str, String str2) {
        Provider.Service service;
        String strCq = a.cq(zxr.c(str2), str, ".");
        Provider.Service service2 = (Provider.Service) this.l.get(strCq);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            Map map = this.l;
            service = !map.containsKey(strCq) ? (Provider.Service) AccessController.doPrivileged(new zpq(this, str, str2, strCq)) : (Provider.Service) map.get(strCq);
        }
        return service;
    }
}
