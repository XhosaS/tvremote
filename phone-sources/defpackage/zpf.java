package defpackage;

import android.support.v7.widget.ActivityChooserView;
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
/* loaded from: classes3.dex */
abstract class zpf extends X509Certificate {
    protected final zmj a;
    protected final zmf b;
    protected final boolean[] c;
    protected final String d;
    protected final byte[] e;
    protected final zyt f;

    public zpf(zyt zytVar, zmj zmjVar, zmf zmfVar, boolean[] zArr, String str, byte[] bArr) {
        this.f = zytVar;
        this.a = zmjVar;
        this.b = zmfVar;
        this.c = zArr;
        this.d = str;
        this.e = bArr;
    }

    protected static zjd a(zmj zmjVar, String str) {
        zmo zmoVarB;
        zmp zmpVar = zmjVar.b.l;
        if (zmpVar == null || (zmoVarB = zmpVar.b(new zjb(str))) == null) {
            return null;
        }
        return zmoVarB.t;
    }

    protected static byte[] b(zmj zmjVar, String str) {
        zjd zjdVarA = a(zmjVar, str);
        if (zjdVarA != null) {
            return zjdVarA.b;
        }
        return null;
    }

    private static Collection c(zmj zmjVar, String str) throws CertificateParsingException, IOException {
        byte[] bArrB = b(zmjVar, str);
        if (bArrB == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration enumerationF = zjm.j(bArrB).f();
            while (enumerationF.hasMoreElements()) {
                zmq zmqVarA = zmq.a(enumerationF.nextElement());
                ArrayList arrayList2 = new ArrayList();
                int i = zmqVarA.b;
                arrayList2.add(Integer.valueOf(i));
                switch (i) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(zmqVarA.s());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 1:
                    case 2:
                    case 6:
                        arrayList2.add(((zjp) zmqVarA.a).b());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 4:
                        zly zlyVar = zmb.R;
                        zih zihVar = zmqVarA.a;
                        int i2 = zlw.b;
                        arrayList2.add((zihVar instanceof zlw ? new zlw(zlyVar, (zlw) zihVar) : zihVar != null ? new zlw(zlyVar, zjm.j(zihVar)) : null).toString());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    case 7:
                        try {
                            arrayList2.add(InetAddress.getByAddress(zkn.f(zmqVarA.a).b).getHostAddress());
                            arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                        } catch (UnknownHostException unused) {
                        }
                    case 8:
                        arrayList2.add(zjb.h(zmqVarA.a).b());
                        arrayList.add(DesugarCollections.unmodifiableList(arrayList2));
                    default:
                        throw new IOException(a.cf(i, "Bad tag number: "));
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

    private final void d(PublicKey publicKey, Signature signature, zih zihVar, byte[] bArr) throws NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, CertificateException, InvalidAlgorithmParameterException {
        zmj zmjVar = this.a;
        if (!zpj.d(zmjVar.c, zmjVar.b.d)) {
            throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
        }
        zpj.c(signature, zihVar);
        signature.initVerify(publicKey);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new zos(signature), 512);
            zmjVar.b.t(bufferedOutputStream);
            bufferedOutputStream.close();
            if (!signature.verify(bArr)) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    private final void e(PublicKey publicKey, zox zoxVar) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        boolean z = publicKey instanceof zor;
        if (z && zpj.e(this.a.c)) {
            throw null;
        }
        zmj zmjVar = this.a;
        if (!zpj.e(zmjVar.c)) {
            Signature signatureA = zoxVar.a(this.d);
            if (!z) {
                d(publicKey, signatureA, zmjVar.c.b, getSignature());
                return;
            } else {
                zjb zjbVar = zom.a;
                throw null;
            }
        }
        zjm zjmVarJ = zjm.j(zmjVar.c.b);
        zjm zjmVarJ2 = zjm.j(zmjVar.d.n());
        boolean z2 = false;
        for (int i = 0; i != zjmVarJ2.b(); i++) {
            zmd zmdVarA = zmd.a(zjmVarJ.h(i));
            try {
                d(publicKey, zoxVar.a(zpj.a(zmdVarA)), zmdVarA.b, zic.i(zjmVarJ2.h(i)).n());
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
        zmf zmfVar = this.b;
        if (zmfVar == null || !zmfVar.b()) {
            return -1;
        }
        ziu ziuVar = zmfVar.b;
        if (ziuVar == null) {
            return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
        byte[] bArr = ziuVar.a;
        int length = bArr.length;
        int i = ziuVar.b;
        int i2 = length - i;
        if (i2 > 4 || (i2 == 4 && (bArr[i] & 128) != 0)) {
            throw new ArithmeticException("ASN.1 Integer out of positive int range");
        }
        return ziu.b(bArr, i, 255);
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        zmp zmpVar = this.a.b.l;
        if (zmpVar == null) {
            return null;
        }
        Enumeration enumerationA = zmpVar.a();
        while (enumerationA.hasMoreElements()) {
            zjb zjbVar = (zjb) enumerationA.nextElement();
            if (zmpVar.b(zjbVar).s) {
                hashSet.add(zjbVar.b());
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
            zjm zjmVarJ = zjm.j(zjh.v(bArrB));
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != zjmVarJ.b(); i++) {
                arrayList.add(((zjb) zjmVarJ.h(i)).b());
            }
            return DesugarCollections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
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
            throw new IllegalStateException("error parsing ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getIssuerAlternativeNames() {
        return c(this.a, zmo.c.b());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getIssuerDN() {
        return new zpo(this.a.a());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getIssuerUniqueID() {
        zic zicVar = this.a.b.j;
        if (zicVar == null) {
            return null;
        }
        byte[] bArrM = zicVar.m();
        int length = (bArrM.length * 8) - zicVar.f();
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
        zmp zmpVar = this.a.b.l;
        if (zmpVar == null) {
            return null;
        }
        Enumeration enumerationA = zmpVar.a();
        while (enumerationA.hasMoreElements()) {
            zjb zjbVar = (zjb) enumerationA.nextElement();
            if (!zmpVar.b(zjbVar).s) {
                hashSet.add(zjbVar.b());
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
        zpm zpmVar;
        try {
            zmw zmwVar = this.a.b.i;
            Logger logger = zpr.a;
            if (zmwVar.a.a.n(zlk.am)) {
                new zvx(6, (float[]) null);
                return new zwq(zmwVar);
            }
            zjb zjbVar = zmwVar.a.a;
            Map map = zpr.b;
            synchronized (map) {
                zpmVar = (zpm) map.get(zjbVar);
            }
            if (zpmVar == null) {
                return null;
            }
            return zpmVar.b(zmwVar);
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
        return vxr.bd(this.e);
    }

    @Override // java.security.cert.X509Certificate
    public final byte[] getSignature() {
        return this.a.d.n();
    }

    @Override // java.security.cert.X509Certificate
    public final Collection getSubjectAlternativeNames() {
        return c(this.a, zmo.b.b());
    }

    @Override // java.security.cert.X509Certificate
    public final Principal getSubjectDN() {
        return new zpo(this.a.b());
    }

    @Override // java.security.cert.X509Certificate
    public final boolean[] getSubjectUniqueID() {
        zic zicVar = this.a.b.k;
        if (zicVar == null) {
            return null;
        }
        byte[] bArrM = zicVar.m();
        int length = (bArrM.length * 8) - zicVar.f();
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
        zmp zmpVar;
        if (getVersion() != 3 || (zmpVar = this.a.b.l) == null) {
            return false;
        }
        Enumeration enumerationA = zmpVar.a();
        while (enumerationA.hasMoreElements()) {
            zjb zjbVar = (zjb) enumerationA.nextElement();
            if (!zjbVar.w(zmo.a) && !zjbVar.w(zmo.l) && !zjbVar.w(zmo.m) && !zjbVar.w(zmo.q) && !zjbVar.w(zmo.k) && !zjbVar.w(zmo.h) && !zjbVar.w(zmo.g) && !zjbVar.w(zmo.n) && !zjbVar.w(zmo.d) && !zjbVar.w(zmo.b) && !zjbVar.w(zmo.j) && zmpVar.b(zjbVar).s) {
                return true;
            }
        }
        return false;
    }

    @Override // java.security.cert.Certificate
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = zxr.a;
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
        zpj.b(getSignature(), stringBuffer, str);
        zmp zmpVar = this.a.b.l;
        if (zmpVar != null) {
            Enumeration enumerationA = zmpVar.a();
            if (enumerationA.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
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
                        if (zjbVar.w(zmo.d)) {
                            stringBuffer.append(zmf.a(zisVar.f()));
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zmo.a)) {
                            zjh zjhVarF = zisVar.f();
                            stringBuffer.append(zjhVarF != null ? new zmu(zic.i(zjhVarF)) : null);
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zom.b)) {
                            stringBuffer.append(new zon(zic.i(zisVar.f())));
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zom.c)) {
                            stringBuffer.append(new zoo(zir.f(zisVar.f())));
                            stringBuffer.append(str);
                        } else if (zjbVar.w(zom.e)) {
                            stringBuffer.append(new zop(zir.f(zisVar.f())));
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
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        e(publicKey, new zoz(this, 2));
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
        e(publicKey, new zoz(str, 3));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException, IOException, CertificateException, InvalidAlgorithmParameterException {
        try {
            e(publicKey, new zoz(provider, 4));
        } catch (NoSuchProviderException e) {
            throw new NoSuchAlgorithmException("provider issue: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
