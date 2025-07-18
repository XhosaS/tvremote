package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zgc implements HostnameVerifier {
    public static final zgc a = new zgc();

    private zgc() {
    }

    public static final List a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return yhb.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && yks.e(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return yhb.a;
        }
    }

    public static final boolean b(String str, X509Certificate x509Certificate) throws CertificateParsingException {
        int length;
        if (zcr.q(str)) {
            String strK = wbb.K(str);
            List listA = a(x509Certificate, 7);
            if (listA.isEmpty()) {
                return false;
            }
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                if (yks.e(strK, wbb.K((String) it.next()))) {
                    return true;
                }
            }
            return false;
        }
        String strD = d(str);
        List<String> listA2 = a(x509Certificate, 2);
        if (listA2.isEmpty()) {
            return false;
        }
        for (String strConcat : listA2) {
            if (strD.length() != 0 && !ylh.ac(strD, ".") && !ylh.R(strD, "..") && strConcat != null && strConcat.length() != 0 && !ylh.ac(strConcat, ".") && !ylh.R(strConcat, "..")) {
                String strConcat2 = !ylh.R(strD, ".") ? strD.concat(".") : strD;
                if (!ylh.R(strConcat, ".")) {
                    strConcat = strConcat.concat(".");
                }
                String strD2 = d(strConcat);
                if (!ylh.K(strD2, "*", false)) {
                    if (yks.e(strConcat2, strD2)) {
                        return true;
                    }
                } else if (ylh.ac(strD2, "*.") && ylh.T(strD2, '*', 1, 4) == -1 && strConcat2.length() >= strD2.length() && !yks.e("*.", strD2)) {
                    String strSubstring = strD2.substring(1);
                    strSubstring.getClass();
                    if (ylh.R(strConcat2, strSubstring) && ((length = strConcat2.length() - strSubstring.length()) <= 0 || ylh.V(strConcat2, '.', length - 1, 4) == -1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean c(String str) {
        long j;
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(a.cd(length, "endIndex < beginIndex: ", " < 0"));
        }
        if (length > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
        long j2 = 0;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    char cCharAt2 = i2 < length ? str.charAt(i2) : (char) 0;
                    if (cCharAt <= 56319 && cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
                i = i2;
            }
            j2++;
            i = i2;
        }
        return str.length() == ((int) j2);
    }

    private static final String d(String str) {
        if (!c(str)) {
            return str;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (!c(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            certificate.getClass();
            return b(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }
}
