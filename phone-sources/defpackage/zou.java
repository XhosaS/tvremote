package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zou extends CertificateFactorySpi {
    private static final upq h = new upq("CERTIFICATE");
    private static final upq i = new upq("CRL");
    private final zyt g = new zyt();
    private zjo a = null;
    private int b = 0;
    private InputStream c = null;
    private zjo d = null;
    private int e = 0;
    private InputStream f = null;

    static {
        new upq("PKCS7");
    }

    private final CRL b(InputStream inputStream, boolean z) throws IOException, CRLException {
        InputStream inputStream2 = this.f;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.f = inputStream;
            this.d = null;
            this.e = 0;
        }
        try {
            zjo zjoVar = this.d;
            if (zjoVar != null) {
                if (this.e != zjoVar.b()) {
                    return c();
                }
                this.d = null;
                this.e = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(vxr.aO(inputStream));
            }
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            inputStream.reset();
            return i2 != 48 ? d(i.o(inputStream, z)) : d(zjm.j(new zis(inputStream, wcq.ao(inputStream), true).f()));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    private final CRL c() {
        zjo zjoVar = this.d;
        if (zjoVar == null || this.e >= zjoVar.b()) {
            return null;
        }
        zjo zjoVar2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        return a(zmk.c(zjoVar2.f(i2)));
    }

    private final CRL d(zjm zjmVar) {
        if (zjmVar == null) {
            return null;
        }
        if (zjmVar.b() <= 1 || !(zjmVar.h(0) instanceof zjb) || !zjmVar.h(0).equals(zlp.s)) {
            return a(zmk.c(zjmVar));
        }
        this.d = zls.a(zjm.m((zjr) zjmVar.h(1), true)).J;
        return c();
    }

    private final Certificate e(InputStream inputStream, boolean z) throws IOException, zot {
        InputStream inputStream2 = this.c;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.c = inputStream;
            this.a = null;
            this.b = 0;
        }
        try {
            zjo zjoVar = this.a;
            if (zjoVar != null) {
                if (this.b != zjoVar.b()) {
                    return f();
                }
                this.a = null;
                this.b = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(vxr.aO(inputStream));
            }
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            inputStream.reset();
            return i2 != 48 ? g(h.o(inputStream, z)) : g(zjm.j(new zis(inputStream).f()));
        } catch (Exception e) {
            throw new zot("parsing issue: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private final Certificate f() {
        if (this.a == null) {
            return null;
        }
        while (this.b < this.a.b()) {
            zjo zjoVar = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            zih zihVarF = zjoVar.f(i2);
            if (zihVarF instanceof zjm) {
                return new zpi(this.g, zmj.c(zihVarF));
            }
        }
        return null;
    }

    private final Certificate g(zjm zjmVar) {
        if (zjmVar == null) {
            return null;
        }
        if (zjmVar.b() <= 1 || !(zjmVar.h(0) instanceof zjb) || !zjmVar.h(0).equals(zlp.s)) {
            return new zpi(this.g, zmj.c(zjmVar));
        }
        this.a = zls.a(zjm.m((zjr) zjmVar.h(1), true)).I;
        return f();
    }

    protected final CRL a(zmk zmkVar) {
        return new zpe(this.g, zmkVar);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CRL engineGenerateCRL(InputStream inputStream) {
        return b(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCRLs(InputStream inputStream) throws IOException, CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL crlB = b(bufferedInputStream, arrayList.isEmpty());
            if (crlB == null) {
                return arrayList;
            }
            arrayList.add(crlB);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream) {
        return new zow(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Certificate engineGenerateCertificate(InputStream inputStream) {
        return e(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCertificates(InputStream inputStream) throws IOException, zot {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate certificateE = e(bufferedInputStream, arrayList.isEmpty());
            if (certificateE == null) {
                return arrayList;
            }
            arrayList.add(certificateE);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Iterator engineGetCertPathEncodings() {
        return zow.a.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new zow(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n".concat(String.valueOf(obj.toString())));
            }
        }
        return new zow(list);
    }
}
