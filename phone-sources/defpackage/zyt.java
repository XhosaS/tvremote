package defpackage;

import j$.util.DesugarCollections;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.cert.CertificateFactory;
import java.util.Map;
import java.util.StringTokenizer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zyt {
    private static volatile Provider b;
    public final Object a;

    public zyt(Map map) {
        this.a = map;
    }

    public static int[] b(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(a.cg(str, "Unable to parse HTTP flags version string: `", "`"), e);
        }
    }

    private static synchronized Provider e() {
        Provider provider = Security.getProvider("BC");
        if (provider instanceof zpr) {
            return provider;
        }
        if (b != null) {
            return b;
        }
        b = new zpr();
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final Map a() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    public final Signature c(String str) {
        return Signature.getInstance(str, (Provider) this.a);
    }

    public final CertificateFactory d() {
        return CertificateFactory.getInstance("X.509", (Provider) this.a);
    }

    public zyt() {
        this.a = e();
    }

    public zyt(zvc zvcVar, byte[][] bArr) {
        if (!vxr.bx(bArr)) {
            if (bArr.length == zvcVar.b) {
                for (byte[] bArr2 : bArr) {
                    if (bArr2.length != zvcVar.a) {
                        throw new IllegalArgumentException("wrong publicKey format");
                    }
                }
                this.a = vxr.bD(bArr);
                return;
            }
            throw new IllegalArgumentException("wrong publicKey size");
        }
        throw new NullPointerException("publicKey byte array == null");
    }
}
