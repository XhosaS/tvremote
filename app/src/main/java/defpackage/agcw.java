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
/* loaded from: classes2.dex */
public final class agcw implements HostnameVerifier {
    public static final agcw a = new agcw();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private agcw() {
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

    private final boolean b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String strC = ypx.c(str2);
            if (!strC.contains("*")) {
                return str.equals(strC);
            }
            if (!strC.startsWith("*.") || strC.indexOf(42, 1) != -1 || str.length() < strC.length() || "*.".equals(strC)) {
                return false;
            }
            String strSubstring = strC.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x021d, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        r12 = r4.d;
        r9 = new java.lang.String(r10, r12, r4.e - r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.net.ssl.HostnameVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean verify(java.lang.String r20, javax.net.ssl.SSLSession r21) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 768
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agcw.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
