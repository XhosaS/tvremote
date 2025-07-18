package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class dfs extends X509CRL {
    protected final ddd a;
    protected final String b;
    protected final byte[] c;
    protected final boolean d;
    protected final asv e;

    public dfs(asv asvVar, ddd dddVar, String str, byte[] bArr, boolean z) {
        this.e = asvVar;
        this.a = dddVar;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }

    protected static czx a(ddd dddVar, String str) {
        ddh ddhVarB;
        ddi ddiVar = dddVar.a.g;
        if (ddiVar == null || (ddhVarB = ddiVar.b(new czv(str))) == null) {
            return null;
        }
        return ddhVarB.t;
    }

    private final Set b(boolean z) {
        ddi ddiVar;
        if (getVersion() != 2 || (ddiVar = this.a.a.g) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = ddiVar.a();
        while (enumerationA.hasMoreElements()) {
            czv czvVar = (czv) enumerationA.nextElement();
            if (z == ddiVar.b(czvVar).s) {
                hashSet.add(czvVar.b());
            }
        }
        return hashSet;
    }

    private final void c(PublicKey publicKey, Signature signature, czb czbVar, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CRLException, InvalidAlgorithmParameterException {
        ddd dddVar = this.a;
        if (!dga.d(dddVar.b, dddVar.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TbsCertList.");
        }
        dga.c(signature, czbVar);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new dfj(signature), 512);
            dddVar.a.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private final void d(PublicKey publicKey, dfo dfoVar) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        ddd dddVar = this.a;
        if (!dddVar.b.equals(dddVar.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        if ((publicKey instanceof dfi) && dga.e(dddVar.b)) {
            throw null;
        }
        if (!dga.e(dddVar.b)) {
            Signature signatureA = dfoVar.a(this.b);
            byte[] bArr = this.c;
            if (bArr == null) {
                c(publicKey, signatureA, null, getSignature());
                return;
            }
            try {
                c(publicKey, signatureA, dab.v(bArr), getSignature());
                return;
            } catch (IOException e) {
                throw new SignatureException("cannot decode signature parameters: ".concat(String.valueOf(e.getMessage())));
            }
        }
        ddd dddVar2 = this.a;
        dag dagVarJ = dag.j(dddVar2.b.b);
        dag dagVarJ2 = dag.j(dddVar2.c.n());
        boolean z = false;
        for (int i = 0; i != dagVarJ2.b(); i++) {
            dcw dcwVarA = dcw.a(dagVarJ.h(i));
            try {
                c(publicKey, dfoVar.a(dga.a(dcwVarA)), dcwVarA.b, cyw.i(dagVarJ2.h(i)).n());
                z = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            } catch (SignatureException e2) {
                e = e2;
            }
            e = null;
            if (e != null) {
                throw e;
            }
        }
        if (!z) {
            throw new InvalidKeyException("no matching key found");
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return b(true);
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        czx czxVarA = a(this.a, str);
        if (czxVarA == null) {
            return null;
        }
        try {
            return czxVarA.s();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        return new dgf(dcp.b(this.a.b().a));
    }

    @Override // java.security.cert.X509CRL
    public final X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.b().s());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getNextUpdate() {
        ddv ddvVar = this.a.a.e;
        if (ddvVar == null) {
            return null;
        }
        return ddvVar.b();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return b(false);
    }

    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        ddh ddhVarB;
        Enumeration enumerationA = this.a.a();
        dcp dcpVarB = null;
        while (enumerationA.hasMoreElements()) {
            ddq ddqVar = (ddq) enumerationA.nextElement();
            if (ddqVar.a().q(bigInteger)) {
                return new dfp(ddqVar, this.d, dcpVarB);
            }
            if (this.d && ddqVar.d() && (ddhVarB = ddqVar.b().b(ddh.i)) != null) {
                dcpVarB = dcp.b(ddk.a(ddh.a(ddhVarB)).b()[0].a);
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        ddh ddhVarB;
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = this.a.a();
        dcp dcpVarB = null;
        while (enumerationA.hasMoreElements()) {
            ddq ddqVar = (ddq) enumerationA.nextElement();
            boolean z = this.d;
            hashSet.add(new dfp(ddqVar, z, dcpVarB));
            if (z && ddqVar.d() && (ddhVarB = ddqVar.b().b(ddh.i)) != null) {
                dcpVarB = dcp.b(ddk.a(ddh.a(ddhVarB)).b()[0].a);
            }
        }
        if (hashSet.isEmpty()) {
            return null;
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgName() {
        return this.b;
    }

    @Override // java.security.cert.X509CRL
    public final String getSigAlgOID() {
        return this.a.b.a.b();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSigAlgParams() {
        return dos.p(this.c);
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getSignature() {
        return this.a.c.n();
    }

    @Override // java.security.cert.X509CRL
    public final byte[] getTBSCertList() throws CRLException {
        try {
            return this.a.a.u();
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509CRL
    public final Date getThisUpdate() {
        return this.a.a.d.b();
    }

    @Override // java.security.cert.X509CRL
    public final int getVersion() {
        czo czoVar = this.a.a.a;
        if (czoVar == null) {
            return 1;
        }
        return czoVar.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(ddh.h.b());
        criticalExtensionOIDs.remove(ddh.g.b());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public final boolean isRevoked(Certificate certificate) {
        dcp dcpVarA;
        ddh ddhVarB;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        ddd dddVar = this.a;
        Enumeration enumerationA = dddVar.a();
        dcp dcpVarB = dddVar.b();
        if (enumerationA.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (enumerationA.hasMoreElements()) {
                ddq ddqVarC = ddq.c(enumerationA.nextElement());
                if (this.d && ddqVarC.d() && (ddhVarB = ddqVarC.b().b(ddh.i)) != null) {
                    dcpVarB = dcp.b(ddk.a(ddh.a(ddhVarB)).b()[0].a);
                }
                if (ddqVarC.a().q(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        dcpVarA = dcp.b(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            dcpVarA = ddc.c(certificate.getEncoded()).a();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                    return dcpVarB.equals(dcpVarA);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = doj.a;
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(str);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.b);
        stringBuffer.append(str);
        dga.b(getSignature(), stringBuffer, str);
        ddi ddiVar = this.a.a.g;
        if (ddiVar != null) {
            Enumeration enumerationA = ddiVar.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("           Extensions: ");
                stringBuffer.append(str);
            }
            while (enumerationA.hasMoreElements()) {
                czv czvVar = (czv) enumerationA.nextElement();
                ddh ddhVarB = ddiVar.b(czvVar);
                czx czxVar = ddhVarB.t;
                if (czxVar != null) {
                    czm czmVar = new czm(czxVar.b);
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(ddhVarB.s);
                    stringBuffer.append(") ");
                    try {
                        if (czvVar.w(ddh.e)) {
                            stringBuffer.append(new dda(czo.m(czmVar.f()).i()));
                            stringBuffer.append(str);
                        } else if (czvVar.w(ddh.g)) {
                            stringBuffer.append("Base CRL: " + new dda(czo.m(czmVar.f()).i()).toString());
                            stringBuffer.append(str);
                        } else if (czvVar.w(ddh.h)) {
                            stringBuffer.append(ddl.a(czmVar.f()));
                            stringBuffer.append(str);
                        } else if (czvVar.w(ddh.k)) {
                            stringBuffer.append(dcz.a(czmVar.f()));
                            stringBuffer.append(str);
                        } else if (czvVar.w(ddh.p)) {
                            stringBuffer.append(dcz.a(czmVar.f()));
                            stringBuffer.append(str);
                        } else {
                            stringBuffer.append(czvVar.b());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(dnx.ai(czmVar.f()));
                            stringBuffer.append(str);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(czvVar.b());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                        stringBuffer.append(str);
                    }
                } else {
                    stringBuffer.append(str);
                }
            }
        }
        Set revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            Iterator it = revokedCertificates.iterator();
            while (it.hasNext()) {
                stringBuffer.append(it.next());
                stringBuffer.append(str);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        d(publicKey, new dfq(this, 1));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        d(publicKey, new dfq(str, 0));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        try {
            d(publicKey, new dfr(this, provider));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
