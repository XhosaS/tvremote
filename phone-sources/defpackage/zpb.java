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
/* loaded from: classes3.dex */
abstract class zpb extends X509CRL {
    protected final zmk a;
    protected final String b;
    protected final byte[] c;
    protected final boolean d;
    protected final zyt e;

    public zpb(zyt zytVar, zmk zmkVar, String str, byte[] bArr, boolean z) {
        this.e = zytVar;
        this.a = zmkVar;
        this.b = str;
        this.c = bArr;
        this.d = z;
    }

    protected static zjd a(zmk zmkVar, String str) {
        zmo zmoVarB;
        zmp zmpVar = zmkVar.a.g;
        if (zmpVar == null || (zmoVarB = zmpVar.b(new zjb(str))) == null) {
            return null;
        }
        return zmoVarB.t;
    }

    private final Set b(boolean z) {
        zmp zmpVar;
        if (getVersion() != 2 || (zmpVar = this.a.a.g) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = zmpVar.a();
        while (enumerationA.hasMoreElements()) {
            zjb zjbVar = (zjb) enumerationA.nextElement();
            if (z == zmpVar.b(zjbVar).s) {
                hashSet.add(zjbVar.b());
            }
        }
        return hashSet;
    }

    private final void c(PublicKey publicKey, Signature signature, zih zihVar, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CRLException, InvalidAlgorithmParameterException {
        zmk zmkVar = this.a;
        if (!zpj.d(zmkVar.b, zmkVar.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TbsCertList.");
        }
        zpj.c(signature, zihVar);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new zos(signature), 512);
            zmkVar.a.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    private final void d(PublicKey publicKey, zox zoxVar) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        zmk zmkVar = this.a;
        if (!zmkVar.b.equals(zmkVar.a.b)) {
            throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
        }
        if ((publicKey instanceof zor) && zpj.e(zmkVar.b)) {
            throw null;
        }
        if (!zpj.e(zmkVar.b)) {
            Signature signatureA = zoxVar.a(this.b);
            byte[] bArr = this.c;
            if (bArr == null) {
                c(publicKey, signatureA, null, getSignature());
                return;
            }
            try {
                c(publicKey, signatureA, zjh.v(bArr), getSignature());
                return;
            } catch (IOException e) {
                throw new SignatureException("cannot decode signature parameters: ".concat(String.valueOf(e.getMessage())));
            }
        }
        zmk zmkVar2 = this.a;
        zjm zjmVarJ = zjm.j(zmkVar2.b.b);
        zjm zjmVarJ2 = zjm.j(zmkVar2.c.n());
        boolean z = false;
        for (int i = 0; i != zjmVarJ2.b(); i++) {
            zmd zmdVarA = zmd.a(zjmVarJ.h(i));
            try {
                c(publicKey, zoxVar.a(zpj.a(zmdVarA)), zmdVarA.b, zic.i(zjmVarJ2.h(i)).n());
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
        zjd zjdVarA = a(this.a, str);
        if (zjdVarA == null) {
            return null;
        }
        try {
            return zjdVarA.s();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.toString())));
        }
    }

    @Override // java.security.cert.X509CRL
    public final Principal getIssuerDN() {
        return new zpo(zlw.b(this.a.b().a));
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
        znc zncVar = this.a.a.e;
        if (zncVar == null) {
            return null;
        }
        return zncVar.b();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return b(false);
    }

    @Override // java.security.cert.X509CRL
    public final X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        zmo zmoVarB;
        Enumeration enumerationA = this.a.a();
        zlw zlwVarB = null;
        while (enumerationA.hasMoreElements()) {
            zmx zmxVar = (zmx) enumerationA.nextElement();
            if (zmxVar.a().q(bigInteger)) {
                return new zoy(zmxVar, this.d, zlwVarB);
            }
            if (this.d && zmxVar.d() && (zmoVarB = zmxVar.b().b(zmo.i)) != null) {
                zlwVarB = zlw.b(zmr.a(zmo.a(zmoVarB)).b()[0].a);
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public final Set getRevokedCertificates() {
        zmo zmoVarB;
        HashSet hashSet = new HashSet();
        Enumeration enumerationA = this.a.a();
        zlw zlwVarB = null;
        while (enumerationA.hasMoreElements()) {
            zmx zmxVar = (zmx) enumerationA.nextElement();
            boolean z = this.d;
            hashSet.add(new zoy(zmxVar, z, zlwVarB));
            if (z && zmxVar.d() && (zmoVarB = zmxVar.b().b(zmo.i)) != null) {
                zlwVarB = zlw.b(zmr.a(zmo.a(zmoVarB)).b()[0].a);
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
        return vxr.bd(this.c);
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
        ziu ziuVar = this.a.a.a;
        if (ziuVar == null) {
            return 1;
        }
        return ziuVar.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(zmo.h.b());
        criticalExtensionOIDs.remove(zmo.g.b());
        return !criticalExtensionOIDs.isEmpty();
    }

    @Override // java.security.cert.CRL
    public final boolean isRevoked(Certificate certificate) {
        zlw zlwVarA;
        zmo zmoVarB;
        if (!certificate.getType().equals("X.509")) {
            throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
        }
        zmk zmkVar = this.a;
        Enumeration enumerationA = zmkVar.a();
        zlw zlwVarB = zmkVar.b();
        if (enumerationA.hasMoreElements()) {
            X509Certificate x509Certificate = (X509Certificate) certificate;
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            while (enumerationA.hasMoreElements()) {
                zmx zmxVarC = zmx.c(enumerationA.nextElement());
                if (this.d && zmxVarC.d() && (zmoVarB = zmxVarC.b().b(zmo.i)) != null) {
                    zlwVarB = zlw.b(zmr.a(zmo.a(zmoVarB)).b()[0].a);
                }
                if (zmxVarC.a().q(serialNumber)) {
                    if (certificate instanceof X509Certificate) {
                        zlwVarA = zlw.b(x509Certificate.getIssuerX500Principal().getEncoded());
                    } else {
                        try {
                            zlwVarA = zmj.c(certificate.getEncoded()).a();
                        } catch (CertificateEncodingException e) {
                            throw new IllegalArgumentException("Cannot process certificate: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                    return zlwVarB.equals(zlwVarA);
                }
            }
        }
        return false;
    }

    @Override // java.security.cert.CRL
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = zxr.a;
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
        zpj.b(getSignature(), stringBuffer, str);
        zmp zmpVar = this.a.a.g;
        if (zmpVar != null) {
            Enumeration enumerationA = zmpVar.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("           Extensions: ");
                stringBuffer.append(str);
            }
            while (enumerationA.hasMoreElements()) {
                zjb zjbVar = (zjb) enumerationA.nextElement();
                zmo zmoVarB = zmpVar.b(zjbVar);
                zjd zjdVar = zmoVarB.t;
                if (zjdVar != null) {
                    zis zisVar = new zis(zjdVar.b);
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(zmoVarB.s);
                    stringBuffer.append(") ");
                    try {
                        if (zjbVar.w(zmo.e)) {
                            stringBuffer.append(new zmh(ziu.m(zisVar.f()).i()));
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zmo.g)) {
                            stringBuffer.append("Base CRL: " + new zmh(ziu.m(zisVar.f()).i()).toString());
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zmo.h)) {
                            stringBuffer.append(zms.a(zisVar.f()));
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zmo.k)) {
                            stringBuffer.append(zmg.a(zisVar.f()));
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zmo.p)) {
                            stringBuffer.append(zmg.a(zisVar.f()));
                            stringBuffer.append(str);
                        } else {
                            stringBuffer.append(zjbVar.b());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(wcq.am(zisVar.f()));
                            stringBuffer.append(str);
                        }
                    } catch (Exception unused) {
                        stringBuffer.append(zjbVar.b());
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
        d(publicKey, new zoz(this, 1));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        d(publicKey, new zoz(str, 0));
    }

    @Override // java.security.cert.X509CRL
    public final void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CRLException, InvalidAlgorithmParameterException {
        try {
            d(publicKey, new zpa(this, provider));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
