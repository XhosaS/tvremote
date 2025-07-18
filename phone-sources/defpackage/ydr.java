package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ydr implements HostnameVerifier {
    public static final ydr a = new ydr();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private ydr() {
    }

    private static List a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static final boolean b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String strJ = sij.J(str2);
            if (!strJ.contains("*")) {
                return str.equals(strJ);
            }
            if (!strJ.startsWith("*.") || strJ.indexOf(42, 1) != -1 || str.length() < strJ.length() || "*.".equals(strJ)) {
                return false;
            }
            String strSubstring = strJ.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x021a, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0152, code lost:
    
        r7 = r3.d;
        r8 = new java.lang.String(r9, r7, r3.e - r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.net.ssl.HostnameVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean verify(java.lang.String r19, javax.net.ssl.SSLSession r20) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ydr.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
