package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaem {
    static {
        aadl aadlVar = aadl.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        aabh aabhVar = aabh.a;
        aabhVar.b(aaeu.a);
        aabhVar.a(aaeu.b);
        if (aaaf.a()) {
            return;
        }
        aabs aabsVar = aadp.a;
        aaae aaaeVar = aaae.ALGORITHM_NOT_FIPS;
        if (!aaaeVar.a()) {
            throw new GeneralSecurityException("Registering AES CTR HMAC Streaming AEAD is not supported in FIPS mode");
        }
        aabp aabpVar = aaex.a;
        aabk aabkVar = aabk.a;
        aabkVar.e(aaex.a);
        aabkVar.d(aaex.b);
        aabkVar.c(aaex.c);
        aabkVar.b(aaex.d);
        aabg aabgVar = aabg.a;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256_4KB", aael.a);
        map.put("AES128_CTR_HMAC_SHA256_1MB", aael.b);
        map.put("AES256_CTR_HMAC_SHA256_4KB", aael.c);
        map.put("AES256_CTR_HMAC_SHA256_1MB", aael.d);
        aabgVar.b(DesugarCollections.unmodifiableMap(map));
        aabe aabeVar = aabe.a;
        aabeVar.b(aadp.b, aads.class);
        aabhVar.a(aadp.a);
        aaap aaapVar = aaap.a;
        aaapVar.b(aadp.c);
        aabs aabsVar2 = aady.a;
        if (!aaaeVar.a()) {
            throw new GeneralSecurityException("Registering AES-GCM HKDF Streaming AEAD is not supported in FIPS mode");
        }
        aabkVar.e(aafa.a);
        aabkVar.d(aafa.b);
        aabkVar.c(aafa.c);
        aabkVar.b(aafa.d);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM_HKDF_4KB", aael.e);
        map2.put("AES128_GCM_HKDF_1MB", aael.f);
        map2.put("AES256_GCM_HKDF_4KB", aael.g);
        map2.put("AES256_GCM_HKDF_1MB", aael.h);
        aabgVar.b(DesugarCollections.unmodifiableMap(map2));
        aabf.a.a(aady.c, aaeb.class);
        aabeVar.b(aady.b, aaeb.class);
        aabhVar.a(aady.a);
        aaapVar.b(aady.d);
    }
}
