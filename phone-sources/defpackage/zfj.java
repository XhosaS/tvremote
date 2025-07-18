package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfj implements zgd {
    private final X509TrustManager a;
    private final Method b;

    public zfj(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.b = method;
    }

    @Override // defpackage.zgd
    public final X509Certificate a(X509Certificate x509Certificate) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = this.b.invoke(this.a, x509Certificate);
            objInvoke.getClass();
            return ((TrustAnchor) objInvoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfj)) {
            return false;
        }
        zfj zfjVar = (zfj) obj;
        return yks.e(this.a, zfjVar.a) && yks.e(this.b, zfjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ")";
    }
}
