package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydp {
    public static final ydp a;
    private static final ydn[] f;
    final boolean b = true;
    public final String[] c;
    public final String[] d;
    public final boolean e;

    static {
        ydn[] ydnVarArr = {ydn.TLS_AES_128_GCM_SHA256, ydn.TLS_AES_256_GCM_SHA384, ydn.TLS_CHACHA20_POLY1305_SHA256, ydn.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, ydn.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, ydn.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, ydn.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, ydn.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, ydn.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, ydn.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, ydn.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, ydn.TLS_RSA_WITH_AES_128_GCM_SHA256, ydn.TLS_RSA_WITH_AES_256_GCM_SHA384, ydn.TLS_RSA_WITH_AES_128_CBC_SHA, ydn.TLS_RSA_WITH_AES_256_CBC_SHA, ydn.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f = ydnVarArr;
        ydo ydoVar = new ydo();
        ydoVar.a(ydnVarArr);
        ydoVar.c(ydy.TLS_1_3, ydy.TLS_1_2);
        ydoVar.b();
        ydp ydpVar = new ydp(ydoVar);
        a = ydpVar;
        ydo ydoVar2 = new ydo(ydpVar);
        ydoVar2.c(ydy.TLS_1_3, ydy.TLS_1_2, ydy.TLS_1_1, ydy.TLS_1_0);
        ydoVar2.b();
    }

    public ydp(ydo ydoVar) {
        this.c = (String[]) ydoVar.b;
        this.d = (String[]) ydoVar.c;
        this.e = ydoVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ydp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ydp ydpVar = (ydp) obj;
        boolean z = ydpVar.b;
        return Arrays.equals(this.c, ydpVar.c) && Arrays.equals(this.d, ydpVar.d) && this.e == ydpVar.e;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.c) + 527) * 31) + Arrays.hashCode(this.d)) * 31) + (!this.e ? 1 : 0);
    }

    public final String toString() {
        List listA;
        ydy ydyVar;
        String[] strArr = this.c;
        if (strArr == null) {
            listA = null;
        } else {
            ydn[] ydnVarArr = new ydn[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                ydn ydnVar = ydn.TLS_RSA_WITH_NULL_MD5;
                ydnVarArr[i] = str.startsWith("SSL_") ? ydn.a("TLS_".concat(String.valueOf(str.substring(4)))) : ydn.a(str);
            }
            listA = ydz.a(ydnVarArr);
        }
        String string = listA == null ? "[use default]" : listA.toString();
        String[] strArr2 = this.d;
        ydy[] ydyVarArr = new ydy[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            String str2 = strArr2[i2];
            ydy ydyVar2 = ydy.TLS_1_3;
            if ("TLSv1.3".equals(str2)) {
                ydyVar = ydy.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                ydyVar = ydy.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                ydyVar = ydy.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                ydyVar = ydy.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException("Unexpected TLS version: ".concat(String.valueOf(str2)));
                }
                ydyVar = ydy.SSL_3_0;
            }
            ydyVarArr[i2] = ydyVar;
        }
        return "ConnectionSpec(cipherSuites=" + string + ", tlsVersions=" + String.valueOf(ydz.a(ydyVarArr)) + ", supportsTlsExtensions=" + this.e + ")";
    }
}
