package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcs {
    public static final agcs a;
    private static final agcq[] f;
    final boolean b = true;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        agcq[] agcqVarArr = {agcq.TLS_AES_128_GCM_SHA256, agcq.TLS_AES_256_GCM_SHA384, agcq.TLS_CHACHA20_POLY1305_SHA256, agcq.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, agcq.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, agcq.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, agcq.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, agcq.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, agcq.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, agcq.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, agcq.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, agcq.TLS_RSA_WITH_AES_128_GCM_SHA256, agcq.TLS_RSA_WITH_AES_256_GCM_SHA384, agcq.TLS_RSA_WITH_AES_128_CBC_SHA, agcq.TLS_RSA_WITH_AES_256_CBC_SHA, agcq.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = agcqVarArr;
        agcr agcrVar = new agcr();
        agcrVar.a(agcqVarArr);
        agcrVar.b(agde.TLS_1_3, agde.TLS_1_2);
        agcrVar.c = true;
        agcs agcsVar = new agcs(agcrVar);
        a = agcsVar;
        agcr agcrVar2 = new agcr(agcsVar);
        agcrVar2.b(agde.TLS_1_3, agde.TLS_1_2, agde.TLS_1_1, agde.TLS_1_0);
        agcrVar2.c = true;
    }

    public agcs(agcr agcrVar) {
        this.c = agcrVar.a;
        this.d = agcrVar.b;
        this.e = agcrVar.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agcs)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        agcs agcsVar = (agcs) obj;
        boolean z = agcsVar.b;
        return Arrays.equals(this.c, agcsVar.c) && Arrays.equals(this.d, agcsVar.d) && this.e == agcsVar.e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final String toString() {
        List listA;
        agde agdeVar;
        String[] strArr = this.c;
        if (strArr == null) {
            listA = null;
        } else {
            agcq[] agcqVarArr = new agcq[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                agcq agcqVar = agcq.TLS_RSA_WITH_NULL_MD5;
                agcqVarArr[i] = str.startsWith("SSL_") ? agcq.a("TLS_".concat(String.valueOf(str.substring(4)))) : agcq.a(str);
            }
            listA = agdf.a(agcqVarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        String[] strArr2 = this.d;
        agde[] agdeVarArr = new agde[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            String str2 = strArr2[i2];
            agde agdeVar2 = agde.TLS_1_3;
            if ("TLSv1.3".equals(str2)) {
                agdeVar = agde.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                agdeVar = agde.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                agdeVar = agde.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                agdeVar = agde.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                agdeVar = agde.SSL_3_0;
            }
            agdeVarArr[i2] = agdeVar;
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + String.valueOf(agdf.a(agdeVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
    }
}
