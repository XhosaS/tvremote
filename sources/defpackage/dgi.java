package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.AccessController;
import java.security.Provider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgi extends Provider {
    public static final Map b;
    public static final Class c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final asv[] l;
    public final Map k;
    public static final Logger a = Logger.getLogger(dgi.class.getName());
    private static final String m = "BouncyCastle Security Provider v1.78.1";

    static {
        int i2 = dgj.a;
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
        b = new HashMap();
        c = dnx.W(dgi.class, "java.security.cert.PKIXRevocationChecker");
        d = new String[]{"PBEPBKDF1", "PBEPBKDF2", "PBEPKCS12", "TLSKDF", "SCRYPT"};
        e = new String[]{"SipHash", "SipHash128", "Poly1305"};
        l = new asv[]{new asv((Object) "AES", (byte[]) null), new asv((Object) "ARC4", (byte[]) null), new asv((Object) "ARIA", (byte[]) null), new asv((Object) "Blowfish", (byte[]) null), new asv((Object) "Camellia", (byte[]) null), new asv((Object) "CAST5", (byte[]) null), new asv((Object) "CAST6", (byte[]) null), new asv((Object) "ChaCha", (byte[]) null), new asv((Object) "DES", (byte[]) null), new asv((Object) "DESede", (byte[]) null), new asv((Object) "GOST28147", (byte[]) null), new asv((Object) "Grainv1", (byte[]) null), new asv((Object) "Grain128", (byte[]) null), new asv((Object) "HC128", (byte[]) null), new asv((Object) "HC256", (byte[]) null), new asv((Object) "IDEA", (byte[]) null), new asv((Object) "Noekeon", (byte[]) null), new asv((Object) "RC2", (byte[]) null), new asv((Object) "RC5", (byte[]) null), new asv((Object) "RC6", (byte[]) null), new asv((Object) "Rijndael", (byte[]) null), new asv((Object) "Salsa20", (byte[]) null), new asv((Object) "SEED", (byte[]) null), new asv((Object) "Serpent", (byte[]) null), new asv((Object) "Shacal2", (byte[]) null), new asv((Object) "Skipjack", (byte[]) null), new asv((Object) "SM4", (byte[]) null), new asv((Object) "TEA", (byte[]) null), new asv((Object) "Twofish", (byte[]) null), new asv((Object) "Threefish", (byte[]) null), new asv((Object) "VMPC", (byte[]) null), new asv((Object) "VMPCKSA3", (byte[]) null), new asv((Object) "XTEA", (byte[]) null), new asv((Object) "XSalsa20", (byte[]) null), new asv((Object) "OpenSSLPBKDF", (byte[]) null), new asv((Object) "DSTU7624", (byte[]) null), new asv((Object) "GOST3412_2015", (byte[]) null), new asv((Object) "Zuc", (byte[]) null)};
        f = new String[]{"X509", "IES", "COMPOSITE", "EXTERNAL", "CompositeSignatures"};
        g = new String[]{"DSA", "DH", "EC", "RSA", "GOST", "ECGOST", "ElGamal", "DSTU4145", "GM", "EdEC", "LMS", "SPHINCSPlus", "Dilithium", "Falcon", "NTRU"};
        h = new String[]{"GOST3411", "Keccak", "MD2", "MD4", "MD5", "SHA1", "RIPEMD128", "RIPEMD160", "RIPEMD256", "RIPEMD320", "SHA224", "SHA256", "SHA384", "SHA512", "SHA3", "Skein", "SM3", "Tiger", "Whirlpool", "Blake2b", "Blake2s", "DSTU7564", "Haraka", "Blake3"};
        i = new String[]{"BC", "BCFKS", "PKCS12"};
        j = new String[]{"DRBG"};
    }

    public dgi() {
        super("BC", 1.7801d, m);
        this.k = new ConcurrentHashMap();
        AccessController.doPrivileged(new dgg(this));
    }

    public static final void d(czv czvVar, dgd dgdVar) {
        Map map = b;
        synchronized (map) {
            map.put(czvVar, dgdVar);
        }
    }

    public static final void e(String str, String str2) {
        Class clsW = dnx.W(dgi.class, str + str2 + "$Mappings");
        if (clsW != null) {
            try {
                ((dgc) clsW.newInstance()).a();
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
        String str3 = str + "." + doj.c(str2);
        Provider.Service service2 = (Provider.Service) this.k.get(str3);
        if (service2 != null) {
            return service2;
        }
        synchronized (this) {
            Map map = this.k;
            service = !map.containsKey(str3) ? (Provider.Service) AccessController.doPrivileged(new dgh(this, str, str2, str3)) : (Provider.Service) map.get(str3);
        }
        return service;
    }
}
