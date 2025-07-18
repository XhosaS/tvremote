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
/* loaded from: classes.dex */
public final class dfl extends CertificateFactorySpi {
    private static final asv h = new asv("CERTIFICATE", (byte[]) null);
    private static final asv i = new asv("CRL", (byte[]) null);
    private final asv g = new asv((char[]) null);
    private dai a = null;
    private int b = 0;
    private InputStream c = null;
    private dai d = null;
    private int e = 0;
    private InputStream f = null;

    static {
        new asv("PKCS7", (byte[]) null);
    }

    private final CRL b(InputStream inputStream, boolean z) throws IOException, CRLException {
        InputStream inputStream2 = this.f;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.f = inputStream;
            this.d = null;
            this.e = 0;
        }
        try {
            dai daiVar = this.d;
            if (daiVar != null) {
                if (this.e != daiVar.b()) {
                    return c();
                }
                this.d = null;
                this.e = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(dos.a(inputStream));
            }
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            inputStream.reset();
            return i2 != 48 ? d(i.j(inputStream, z)) : d(dag.j(new czm(inputStream, dnx.ak(inputStream), true).f()));
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    private final CRL c() {
        dai daiVar = this.d;
        if (daiVar == null || this.e >= daiVar.b()) {
            return null;
        }
        dai daiVar2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        return a(ddd.c(daiVar2.f(i2)));
    }

    private final CRL d(dag dagVar) {
        if (dagVar == null) {
            return null;
        }
        if (dagVar.b() <= 1 || !(dagVar.h(0) instanceof czv) || !dagVar.h(0).equals(dci.s)) {
            return a(ddd.c(dagVar));
        }
        this.d = dcl.a(dag.m((dal) dagVar.h(1), true)).J;
        return c();
    }

    private final Certificate e(InputStream inputStream, boolean z) throws dfk, IOException {
        InputStream inputStream2 = this.c;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.c = inputStream;
            this.a = null;
            this.b = 0;
        }
        try {
            dai daiVar = this.a;
            if (daiVar != null) {
                if (this.b != daiVar.b()) {
                    return f();
                }
                this.a = null;
                this.b = 0;
                return null;
            }
            if (!inputStream.markSupported()) {
                inputStream = new ByteArrayInputStream(dos.a(inputStream));
            }
            inputStream.mark(1);
            int i2 = inputStream.read();
            if (i2 == -1) {
                return null;
            }
            inputStream.reset();
            return i2 != 48 ? g(h.j(inputStream, z)) : g(dag.j(new czm(inputStream).f()));
        } catch (Exception e) {
            throw new dfk("parsing issue: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    private final Certificate f() {
        if (this.a == null) {
            return null;
        }
        while (this.b < this.a.b()) {
            dai daiVar = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            czb czbVarF = daiVar.f(i2);
            if (czbVarF instanceof dag) {
                return new dfz(this.g, ddc.c(czbVarF));
            }
        }
        return null;
    }

    private final Certificate g(dag dagVar) {
        if (dagVar == null) {
            return null;
        }
        if (dagVar.b() <= 1 || !(dagVar.h(0) instanceof czv) || !dagVar.h(0).equals(dci.s)) {
            return new dfz(this.g, ddc.c(dagVar));
        }
        this.a = dcl.a(dag.m((dal) dagVar.h(1), true)).I;
        return f();
    }

    protected final CRL a(ddd dddVar) {
        return new dfv(this.g, dddVar);
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
        return new dfn(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Certificate engineGenerateCertificate(InputStream inputStream) {
        return e(inputStream, true);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final Collection engineGenerateCertificates(InputStream inputStream) throws dfk, IOException {
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
        return dfn.a.iterator();
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(InputStream inputStream, String str) {
        return new dfn(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public final CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (obj != null && !(obj instanceof X509Certificate)) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n".concat(String.valueOf(obj.toString())));
            }
        }
        return new dfn(list);
    }
}
