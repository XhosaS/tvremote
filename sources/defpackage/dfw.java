package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class dfw extends X509Certificate {
    protected final ddc a;
    protected final dcy b;
    protected final boolean[] c;
    protected final String d;
    protected final byte[] e;
    protected final asv f;

    public dfw(asv asvVar, ddc ddcVar, dcy dcyVar, boolean[] zArr, String str, byte[] bArr) {
        this.f = asvVar;
        this.a = ddcVar;
        this.b = dcyVar;
        this.c = zArr;
        this.d = str;
        this.e = bArr;
    }

    protected static czx a(ddc ddcVar, String str) {
        ddh ddhVarB;
        ddi ddiVar = ddcVar.b.l;
        if (ddiVar == null || (ddhVarB = ddiVar.b(new czv(str))) == null) {
            return null;
        }
        return ddhVarB.t;
    }

    protected static byte[] b(ddc ddcVar, String str) {
        czx czxVarA = a(ddcVar, str);
        if (czxVarA != null) {
            return czxVarA.b;
        }
        return null;
    }

    private static Collection c(ddc ddcVar, String str) throws CertificateParsingException, IOException {
        byte[] bArrB = b(ddcVar, str);
        if (bArrB == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationF = dag.j(bArrB).f();
            while (enumerationF.hasMoreElements()) {
                ddj ddjVarA = ddj.a(enumerationF.nextElement());
                ArrayList arrayList2 = new ArrayList();
                int i = ddjVarA.b;
                arrayList2.add(Integer.valueOf(i));
                switch (i) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(ddjVarA.s());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((daj) ddjVarA.a).b());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 4:
                        dcr dcrVar = dcu.R;
                        czb czbVar = ddjVarA.a;
                        int i2 = dcp.b;
                        arrayList2.add((czbVar instanceof dcp ? new dcp(dcrVar, (dcp) czbVar) : czbVar != null ? new dcp(dcrVar, dag.j(czbVar)) : null).toString());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(dbh.f(ddjVarA.a).b).getHostAddress());
                            arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                    case 8:
                        arrayList2.add(czv.h(ddjVarA.a).b());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    default:
                        throw new IOException(b.e(i, "Bad tag number: "));
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return DesugarCollections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    private final void d(PublicKey publicKey, Signature signature, czb czbVar, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        ddc ddcVar = this.a;
        if (!dga.d(ddcVar.c, ddcVar.b.d)) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        dga.c(signature, czbVar);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new dfj(signature), 512);
            ddcVar.b.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    private final void e(PublicKey publicKey, dfo dfoVar) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        boolean z = publicKey instanceof dfi;
        if (z && dga.e(this.a.c)) {
            throw null;
        }
        ddc ddcVar = this.a;
        if (!dga.e(ddcVar.c)) {
            Signature signatureA = dfoVar.a(this.d);
            if (!z) {
                d(publicKey, signatureA, ddcVar.c.b, getSignature());
                return;
            } else {
                czv czvVar = dfd.a;
                throw null;
            }
        }
        dag dagVarJ = dag.j(ddcVar.c.b);
        dag dagVarJ2 = dag.j(ddcVar.d.n());
        boolean z2 = false;
        for (int i = 0; i != dagVarJ2.b(); i++) {
            dcw dcwVarA = dcw.a(dagVarJ.h(i));
            try {
                d(publicKey, dfoVar.a(dga.a(dcwVarA)), dcwVarA.b, cyw.i(dagVarJ2.h(i)).n());
                z2 = true;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            } catch (SignatureException e) {
                e = e;
            }
            e = null;
            if (e != null) {
                throw e;
            }
        }
        if (!z2) {
            throw new InvalidKeyException("no matching key found");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final void checkValidity() throws CertificateNotYetValidException, CertificateExpiredException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public final int getBasicConstraints() {
        dcy dcyVar = this.b;
        if (dcyVar == null || !dcyVar.b()) {
            return -1;
        }
        czo czoVar = dcyVar.b;
        if (czoVar == null) {
            return Integer.MAX_VALUE;
        }
        byte[] bArr = czoVar.a;
        int length = bArr.length;
        int i = czoVar.b;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return czo.b(bArr, i, 255);
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ddi ddiVar = this.a.b.l;
        if (ddiVar == null) {
            return null;
        }
        Enumeration enumerationA = ddiVar.a();
        while (enumerationA.hasMoreElements()) {
            czv czvVar = (czv) enumerationA.nextElement();
            if (ddiVar.b(czvVar).s) {
                hashSet.add(czvVar.b());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public final List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] bArrB = b(this.a, "2.5.29.37");
        if (bArrB == null) {
            return null;
        }
        try {
            dag dagVarJ = dag.j(dab.v(bArrB));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != dagVarJ.b(); i++) {
                arrayList.add(((czv) dagVarJ.h(i)).b());
            }
            return DesugarCollections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
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
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return c(this.a, ddh.c.b());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return new dgf(this.a.a());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        cyw cywVar = this.a.b.j;
        if (cywVar == null) {
            return null;
        }
        byte[] bArrM = cywVar.m();
        int length = (bArrM.length * 8) - cywVar.f();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrM[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.a.a().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getKeyUsage() {
        boolean[] zArr = this.c;
        if (zArr == null) {
            return null;
        }
        return (boolean[]) zArr.clone();
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        ddi ddiVar = this.a.b.l;
        if (ddiVar == null) {
            return null;
        }
        Enumeration enumerationA = ddiVar.a();
        while (enumerationA.hasMoreElements()) {
            czv czvVar = (czv) enumerationA.nextElement();
            if (!ddiVar.b(czvVar).s) {
                hashSet.add(czvVar.b());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotAfter() {
        return this.a.d().b();
    }

    @Override // java.security.cert.X509Certificate
    public final Date getNotBefore() {
        return this.a.e().b();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        dgd dgdVar;
        try {
            ddp ddpVar = this.a.b.i;
            Logger logger = dgi.a;
            if (ddpVar.a.a.n(dcd.am)) {
                new dmo(6, (float[]) null);
                return new dnh(ddpVar);
            }
            czv czvVar = ddpVar.a.a;
            Map map = dgi.b;
            synchronized (map) {
                dgdVar = (dgd) map.get(czvVar);
            }
            if (dgdVar == null) {
                return null;
            }
            return dgdVar.b(ddpVar);
        } catch (IOException e) {
            throw new IllegalStateException("failed to recover public key: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final BigInteger getSerialNumber() {
        return this.a.b.c.j();
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgName() {
        return this.d;
    }

    @Override // java.security.cert.X509Certificate
    public final String getSigAlgOID() {
        return this.a.c.a.b();
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSigAlgParams() {
        return dos.p(this.e);
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.a.d.n();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return c(this.a, ddh.b.b());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return new dgf(this.a.b());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        cyw cywVar = this.a.b.k;
        if (cywVar == null) {
            return null;
        }
        byte[] bArrM = cywVar.m();
        int length = (bArrM.length * 8) - cywVar.f();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (bArrM[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Certificate
    public X500Principal getSubjectX500Principal() {
        try {
            return new X500Principal(this.a.b().u());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode subject DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.a.b.u();
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public final int getVersion() {
        return this.a.b.b.f() + 1;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        ddi ddiVar;
        if (getVersion() != 3 || (ddiVar = this.a.b.l) == null) {
            return false;
        }
        Enumeration enumerationA = ddiVar.a();
        while (enumerationA.hasMoreElements()) {
            czv czvVar = (czv) enumerationA.nextElement();
            if (!czvVar.w(ddh.a) && !czvVar.w(ddh.l) && !czvVar.w(ddh.m) && !czvVar.w(ddh.q) && !czvVar.w(ddh.k) && !czvVar.w(ddh.h) && !czvVar.w(ddh.g) && !czvVar.w(ddh.n) && !czvVar.w(ddh.d) && !czvVar.w(ddh.b) && !czvVar.w(ddh.j) && ddiVar.b(czvVar).s) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = doj.a;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(this.d);
        stringBuffer.append(str);
        dga.b(getSignature(), stringBuffer, str);
        ddi ddiVar = this.a.b.l;
        if (ddiVar != null) {
            Enumeration enumerationA = ddiVar.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
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
                        if (czvVar.w(ddh.d)) {
                            stringBuffer.append(dcy.a(czmVar.f()));
                            stringBuffer.append(str);
                        } else if (czvVar.w(ddh.a)) {
                            dab dabVarF = czmVar.f();
                            stringBuffer.append(dabVarF != null ? new ddn(cyw.i(dabVarF)) : null);
                            stringBuffer.append(str);
                        } else if (czvVar.w(dfd.b)) {
                            stringBuffer.append(new dfe(cyw.i(czmVar.f())));
                            stringBuffer.append(str);
                        } else if (czvVar.w(dfd.c)) {
                            stringBuffer.append(new dff(czl.f(czmVar.f())));
                            stringBuffer.append(str);
                        } else if (czvVar.w(dfd.e)) {
                            stringBuffer.append(new dfg(czl.f(czmVar.f())));
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        e(publicKey, new dfq(this, 2));
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateNotYetValidException, CertificateExpiredException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on ".concat(this.a.d().a()));
        }
        if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till ".concat(this.a.e().a()));
        }
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        e(publicKey, new dfq(str, 3));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        try {
            e(publicKey, new dfq(provider, 4));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
