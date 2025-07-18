package defpackage;

import j$.util.DesugarCollections;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zow extends CertPath {
    static final List a;
    private List b;
    private final zyt c;

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        a = DesugarCollections.unmodifiableList(arrayList);
    }

    public zow(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        zyt zytVar = new zyt();
        this.c = zytVar;
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7") && !str.equalsIgnoreCase("PEM")) {
                    throw new CertificateException(a.cr(str, "unsupported encoding: "));
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.b = new ArrayList();
                CertificateFactory certificateFactoryD = zytVar.d();
                while (true) {
                    Certificate certificateGenerateCertificate = certificateFactoryD.generateCertificate(bufferedInputStream);
                    if (certificateGenerateCertificate == null) {
                        break;
                    } else {
                        this.b.add(certificateGenerateCertificate);
                    }
                }
            } else {
                zjh zjhVarF = new zis(inputStream).f();
                if (!(zjhVarF instanceof zjm)) {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
                Enumeration enumerationF = ((zjm) zjhVarF).f();
                this.b = new ArrayList();
                CertificateFactory certificateFactoryD2 = zytVar.d();
                while (enumerationF.hasMoreElements()) {
                    this.b.add(0, certificateFactoryD2.generateCertificate(new ByteArrayInputStream(((zih) enumerationF.nextElement()).p().u())));
                }
            }
            this.b = a(this.b);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n".concat(String.valueOf(e.toString())));
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n".concat(String.valueOf(e2.toString())));
        }
    }

    private static final List a(List list) {
        if (list.size() >= 2) {
            X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
            for (int i = 1; i != list.size(); i++) {
                if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                    ArrayList arrayList = new ArrayList(list.size());
                    ArrayList arrayList2 = new ArrayList(list);
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        X509Certificate x509Certificate = (X509Certificate) list.get(i2);
                        X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
                        int i3 = 0;
                        while (true) {
                            if (i3 == list.size()) {
                                arrayList.add(x509Certificate);
                                list.remove(i2);
                                break;
                            }
                            if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                                break;
                            }
                            i3++;
                        }
                    }
                    if (arrayList.size() <= 1) {
                        for (int i4 = 0; i4 != arrayList.size(); i4++) {
                            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
                            int i5 = 0;
                            while (true) {
                                if (i5 < list.size()) {
                                    X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                                    if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                                        arrayList.add(x509Certificate2);
                                        list.remove(i5);
                                        break;
                                    }
                                    i5++;
                                }
                            }
                        }
                        if (list.size() <= 0) {
                            return arrayList;
                        }
                    }
                    return arrayList2;
                }
                issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            }
        }
        return list;
    }

    private static final zjh b(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new zis(x509Certificate.getEncoded()).f();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: ".concat(String.valueOf(e.toString())));
        }
    }

    private static final byte[] c(zih zihVar) throws CertificateEncodingException {
        try {
            return zihVar.p().u();
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: ".concat(e.toString()));
        }
    }

    @Override // java.security.cert.CertPath
    public final List getCertificates() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.b));
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded() {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public final Iterator getEncodings() {
        return a.iterator();
    }

    @Override // java.security.cert.CertPath
    public final byte[] getEncoded(String str) throws Throwable {
        char[] cArr;
        int i;
        zow zowVar = this;
        if (str.equalsIgnoreCase("PkiPath")) {
            zii ziiVar = new zii();
            List list = zowVar.b;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                ziiVar.b(b((X509Certificate) listIterator.previous()));
            }
            return c(new zkq(ziiVar));
        }
        Throwable th = null;
        if (str.equalsIgnoreCase("PKCS7")) {
            zlo zloVar = new zlo(zlp.r, null);
            zii ziiVar2 = new zii();
            for (int i2 = 0; i2 != zowVar.b.size(); i2++) {
                ziiVar2.b(b((X509Certificate) zowVar.b.get(i2)));
            }
            return c(new zlo(zlp.s, new zls(new ziu(1L), new zkr(), zloVar, new zkr(ziiVar2), new zkr())));
        }
        if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zyc zycVar = new zyc(new OutputStreamWriter(byteArrayOutputStream));
            int i3 = 0;
            while (i3 != zowVar.b.size()) {
                try {
                    List list2 = zyb.a;
                    byte[] encoded = ((X509Certificate) zowVar.b.get(i3)).getEncoded();
                    List listUnmodifiableList = DesugarCollections.unmodifiableList(zyb.a);
                    zycVar.write(a.cg("CERTIFICATE", "-----BEGIN ", "-----"));
                    zycVar.newLine();
                    if (!listUnmodifiableList.isEmpty()) {
                        Iterator it = listUnmodifiableList.iterator();
                        if (!it.hasNext()) {
                            zycVar.newLine();
                        } else {
                            throw th;
                        }
                    }
                    zxv zxvVar = zxs.a;
                    int length = encoded.length;
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(((length + 2) / 3) * 4);
                    try {
                        zxv zxvVar2 = zxs.a;
                        byte[] bArr = new byte[72];
                        int i4 = 0;
                        while (length > 0) {
                            int iMin = Math.min(54, length);
                            int i5 = i4 + iMin;
                            int i6 = i4;
                            int i7 = 0;
                            while (i6 < i5 - 2) {
                                byte b = encoded[i6];
                                int i8 = i6 + 2;
                                int i9 = encoded[i6 + 1] & 255;
                                i6 += 3;
                                ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
                                byte b2 = encoded[i8];
                                int i10 = b2 & 255;
                                byte[] bArr2 = ((zxt) zxvVar2).a;
                                bArr[i7] = bArr2[(b >>> 2) & 63];
                                bArr[i7 + 1] = bArr2[((b << 4) | (i9 >>> 4)) & 63];
                                int i11 = i7 + 3;
                                bArr[i7 + 2] = bArr2[((i10 >>> 6) | (i9 << 2)) & 63];
                                i7 += 4;
                                bArr[i11] = bArr2[b2 & 63];
                                byteArrayOutputStream = byteArrayOutputStream3;
                            }
                            ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
                            int i12 = iMin - (i6 - i4);
                            if (i12 == 1) {
                                int i13 = encoded[i6] & 255;
                                byte[] bArr3 = ((zxt) zxvVar2).a;
                                bArr[i7] = bArr3[i13 >>> 2];
                                bArr[i7 + 1] = bArr3[(i13 << 4) & 63];
                                int i14 = i7 + 3;
                                byte b3 = ((zxt) zxvVar2).b;
                                bArr[i7 + 2] = b3;
                                i7 += 4;
                                bArr[i14] = b3;
                            } else if (i12 == 2) {
                                int i15 = encoded[i6] & 255;
                                int i16 = encoded[i6 + 1] & 255;
                                byte[] bArr4 = ((zxt) zxvVar2).a;
                                bArr[i7] = bArr4[i15 >>> 2];
                                bArr[i7 + 1] = bArr4[((i15 << 4) | (i16 >>> 4)) & 63];
                                int i17 = i7 + 3;
                                bArr[i7 + 2] = bArr4[(i16 << 2) & 63];
                                i7 += 4;
                                bArr[i17] = ((zxt) zxvVar2).b;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i7);
                            length -= iMin;
                            byteArrayOutputStream = byteArrayOutputStream4;
                            i4 = i5;
                        }
                        ByteArrayOutputStream byteArrayOutputStream5 = byteArrayOutputStream;
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        for (int i18 = 0; i18 < byteArray.length; i18 += 64) {
                            int i19 = 0;
                            while (true) {
                                cArr = zycVar.a;
                                int length2 = cArr.length;
                                if (i19 != 64 && (i = i18 + i19) < byteArray.length) {
                                    cArr[i19] = (char) byteArray[i];
                                    i19++;
                                }
                            }
                            zycVar.write(cArr, 0, i19);
                            zycVar.newLine();
                        }
                        zycVar.write(a.cg("CERTIFICATE", "-----END ", "-----"));
                        zycVar.newLine();
                        i3++;
                        zowVar = this;
                        byteArrayOutputStream = byteArrayOutputStream5;
                        th = null;
                    } catch (Exception e) {
                        throw new zxw("exception encoding base64 string: ".concat(String.valueOf(e.getMessage())), e);
                    }
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            ByteArrayOutputStream byteArrayOutputStream6 = byteArrayOutputStream;
            zycVar.close();
            return byteArrayOutputStream6.toByteArray();
        }
        throw new CertificateEncodingException("unsupported encoding: ".concat(String.valueOf(str)));
    }

    public zow(List list) {
        super("X.509");
        this.c = new zyt();
        this.b = a(new ArrayList(list));
    }
}
