package defpackage;

import android.support.v7.appcompat.R;
import java.io.IOException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wbb {
    private static volatile xsq a;

    public wbb() {
    }

    public static /* synthetic */ Object A(Object obj) {
        zah zahVar = zah.a;
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        vtp vtpVar = vtp.a;
        vvs vvsVar = vvs.a;
        vuc vucVarP = vuc.p(zahVar, bArr, 0, length, vtp.a);
        vuc.B(vucVarP);
        return (zah) vucVarP;
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "PROTOCOL_ERROR";
            case 3:
                return "INTERNAL_ERROR";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "SETTINGS_TIMEOUT";
            case 6:
                return "STREAM_CLOSED";
            case 7:
                return "FRAME_SIZE_ERROR";
            case 8:
                return "REFUSED_STREAM";
            case 9:
                return "CANCEL";
            case 10:
                return "COMPRESSION_ERROR";
            case 11:
                return "CONNECT_ERROR";
            case 12:
                return "ENHANCE_YOUR_CALM";
            case 13:
                return "INADEQUATE_SECURITY";
            default:
                return "HTTP_1_1_REQUIRED";
        }
    }

    public static int[] C() {
        return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    }

    public static int D(int i) {
        int[] iArrC = C();
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = iArrC[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 0;
    }

    public static zds E(String str) throws ProtocolException, NumberFormatException {
        zci zciVar;
        int i;
        String strSubstring;
        if (ylh.ac(str, "HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                zciVar = zci.a;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                zciVar = zci.b;
            }
        } else {
            if (!ylh.ac(str, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            zciVar = zci.a;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i, i2);
            strSubstring2.getClass();
            int i3 = Integer.parseInt(strSubstring2);
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
                strSubstring.getClass();
            }
            return new zds(zciVar, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static String F(zce zceVar) {
        String strB = zceVar.b();
        String strC = zceVar.c();
        return strC != null ? a.cq(strC, strB, "?") : strB;
    }

    public static boolean G(String str) {
        return (yks.e(str, "GET") || yks.e(str, "HEAD")) ? false : true;
    }

    public static String H(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        return str2;
    }

    public static void I(zcs zcsVar, zcu zcuVar, String str) {
        Logger logger = zcv.b;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        logger.fine(zcuVar.b + " " + str2 + ": " + zcsVar.a);
    }

    public static zcl J(zcl zclVar) {
        if ((zclVar != null ? zclVar.g : null) == null) {
            return zclVar;
        }
        zck zckVar = new zck(zclVar);
        zckVar.e = null;
        return zckVar.a();
    }

    public static String K(String str) {
        int i;
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!ylh.K(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i < length; i + 1) {
                        char cCharAt = lowerCase.charAt(i);
                        i = (yks.a(cCharAt, 31) > 0 && yks.a(cCharAt, 127) < 0 && ylh.T(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i + 1 : 0;
                        return null;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            return null;
        }
        InetAddress inetAddressF = (ylh.ac(str, "[") && ylh.R(str, "]")) ? f(str, 1, str.length() - 1) : f(str, 0, str.length());
        if (inetAddressF == null) {
            return null;
        }
        byte[] address = inetAddressF.getAddress();
        int length2 = address.length;
        if (length2 != 16) {
            if (length2 == 4) {
                return inetAddressF.getHostAddress();
            }
            throw new AssertionError(a.cg(str, "Invalid IPv6 address: '", "'"));
        }
        address.getClass();
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        zgk zgkVar = new zgk();
        while (i3 < address.length) {
            if (i3 == i2) {
                zgkVar.M(58);
                i3 += i5;
                if (i3 == 16) {
                    zgkVar.M(58);
                }
            } else {
                if (i3 > 0) {
                    zgkVar.M(58);
                }
                zgkVar.U((zcr.x(address[i3]) << 8) | zcr.x(address[i3 + 1]));
                i3 += 2;
            }
        }
        return zgkVar.n();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static zcp L(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return zcp.c;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return zcp.b;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return zcp.a;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return zcp.d;
            }
        } else if (str.equals("SSLv3")) {
            return zcp.e;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static zcg M(String str) {
        try {
            Matcher matcher = zcg.a.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(a.cg(str, "No subtype found for: \"", "\""));
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            strGroup.toLowerCase(locale).getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            Locale locale2 = Locale.US;
            locale2.getClass();
            strGroup2.toLowerCase(locale2).getClass();
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = zcg.b.matcher(str);
            int iEnd = matcher.end();
            while (iEnd < str.length()) {
                matcher2.region(iEnd, str.length());
                if (!matcher2.lookingAt()) {
                    String strSubstring = str.substring(iEnd);
                    strSubstring.getClass();
                    throw new IllegalArgumentException(a.ci(str, strSubstring, "Parameter is not formatted correctly: \"", "\" for: \"", "\""));
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (ylh.ac(strGroup4, "'") && ylh.R(strGroup4, "'") && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        strGroup4.getClass();
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            return new zcg(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static int N(String str) {
        if (yks.e(str, "http")) {
            return 80;
        }
        return !yks.e(str, "https") ? -1 : 443;
    }

    public static /* synthetic */ String O(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        boolean z3 = z & ((i3 & 4) == 0);
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%') {
                z2 = z3;
            } else if (cCharAt != '+' || !z3) {
                iCharCount++;
            }
            zgk zgkVar = new zgk();
            zgkVar.R(str, i, iCharCount);
            while (iCharCount < i2) {
                int iCodePointAt = str.codePointAt(iCharCount);
                if (iCodePointAt == 37) {
                    int i4 = iCharCount + 2;
                    if (i4 < i2) {
                        int iF = zcr.f(str.charAt(iCharCount + 1));
                        int iF2 = zcr.f(str.charAt(i4));
                        if (iF == -1 || iF2 == -1) {
                            iCodePointAt = 37;
                            zgkVar.S(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            zgkVar.M((iF << 4) + iF2);
                            iCharCount = Character.charCount(37) + i4;
                        }
                    } else {
                        iCodePointAt = 37;
                    }
                }
                if (iCodePointAt == 43 && z2) {
                    zgkVar.M(32);
                    iCharCount++;
                } else {
                    zgkVar.S(iCodePointAt);
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return zgkVar.n();
        }
        String strSubstring = str.substring(i, i2);
        strSubstring.getClass();
        return strSubstring;
    }

    public static List P(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iT = ylh.T(str, '&', i, 4);
            if (iT == -1) {
                iT = str.length();
            }
            int iT2 = ylh.T(str, '=', i, 4);
            if (iT2 == -1 || iT2 > iT) {
                String strSubstring = str.substring(i, iT);
                strSubstring.getClass();
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iT2);
                strSubstring2.getClass();
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iT2 + 1, iT);
                strSubstring3.getClass();
                arrayList.add(strSubstring3);
            }
            i = iT + 1;
        }
        return arrayList;
    }

    public static void Q(List list, StringBuilder sb) {
        ymb ymbVarQ = ykn.q(ykn.r(0, list.size()), 2);
        int i = ymbVarQ.a;
        int i2 = ymbVarQ.b;
        int i3 = ymbVarQ.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.String R(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbb.R(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    public static void S(String str) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '!' || cCharAt >= 127) {
                throw new IllegalArgumentException(zcr.j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
            }
        }
    }

    public static void T(String str, String str2) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && (cCharAt < ' ' || cCharAt >= 127)) {
                throw new IllegalArgumentException(zcr.j("Unexpected char %#04x at %d in %s value", Integer.valueOf(cCharAt), Integer.valueOf(i), str2).concat(zcr.u(str2) ? "" : ": ".concat(String.valueOf(str))));
            }
        }
    }

    public static zcb U(SSLSession sSLSession) throws IOException {
        Object objH;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (yks.e(cipherSuite, "TLS_NULL_WITH_NULL_NULL") || yks.e(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        zbr zbrVarW = zbr.t.W(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if (yks.e("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        zcp zcpVar = zcp.a;
        zcp zcpVarL = L(protocol);
        try {
            objH = h(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objH = yhb.a;
        }
        return new zcb(zcpVarL, zbrVarW, h(sSLSession.getLocalCertificates()), new ovo(objH, 7));
    }

    public static int V(String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ') {
                z2 = cCharAt < 127 || (cCharAt >= '0' && cCharAt < ':') || ((cCharAt >= 'a' && cCharAt < '{') || ((cCharAt >= 'A' && cCharAt < '[') || cCharAt == ':'));
            } else {
                if (cCharAt == '\t') {
                    cCharAt = '\t';
                    if (cCharAt < 127) {
                    }
                }
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static zbr X(String str) {
        zbr zbrVar = new zbr(str);
        zbr.b.put(str, zbrVar);
        return zbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zbm Y(defpackage.zcc r24) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbb.Y(zcc):zbm");
    }

    private static int Z(String str, String str2, int i) {
        int length = str.length();
        while (i < length) {
            if (ylh.N(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ba, code lost:
    
        if (r4 == 16) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        if (r5 == (-1)) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
    
        r13 = r4 - r5;
        java.lang.System.arraycopy(r1, r5, r1, 16 - r13, r13);
        java.util.Arrays.fill(r1, r5, (16 - r4) + r5, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d1, code lost:
    
        return java.net.InetAddress.getByAddress(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.net.InetAddress f(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbb.f(java.lang.String, int, int):java.net.InetAddress");
    }

    private static boolean g(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && zcr.f(str.charAt(i + 1)) != -1 && zcr.f(str.charAt(i3)) != -1;
    }

    private static List h(Certificate[] certificateArr) {
        return certificateArr != null ? zcr.m(Arrays.copyOf(certificateArr, certificateArr.length)) : yhb.a;
    }

    public static xsq i() {
        xsq xsqVarA;
        xsq xsqVar = a;
        if (xsqVar != null) {
            return xsqVar;
        }
        synchronized (wbb.class) {
            xsqVarA = a;
            if (xsqVarA == null) {
                xsn xsnVarA = xsq.a();
                xsnVarA.d = xsp.UNARY;
                xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.pagination.PaginationService", "FetchByToken");
                xsnVarA.b();
                vbx vbxVar = vbx.a;
                vtp vtpVar = yer.a;
                xsnVarA.b = new yep(vbxVar);
                xsnVarA.c = new yep(vby.a);
                xsqVarA = xsnVarA.a();
                a = xsqVarA;
            }
        }
        return xsqVarA;
    }

    public static int j(int i) {
        if (i == 5) {
            return 6;
        }
        if (i != 6) {
            return i != 8 ? 0 : 9;
        }
        return 7;
    }

    public static double k(double d, double d2) {
        if (d >= 0.0d && d <= 100.0d) {
            double dE = wga.e(d);
            double d3 = ((5.0d + dE) / d2) - 5.0d;
            if (d3 >= 0.0d && d3 <= 100.0d) {
                double dN = n(dE, d3);
                double dAbs = Math.abs(dN - d2);
                if (dN < d2 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double d4 = wga.d(d3) - 0.4d;
                if (d4 >= 0.0d && d4 <= 100.0d) {
                    return d4;
                }
            }
        }
        return -1.0d;
    }

    public static double l(double d, double d2) {
        if (d >= 0.0d && d <= 100.0d) {
            double dE = wga.e(d);
            double d3 = ((5.0d + dE) * d2) - 5.0d;
            if (d3 >= 0.0d && d3 <= 100.0d) {
                double dN = n(d3, dE);
                double dAbs = Math.abs(dN - d2);
                if (dN < d2 && dAbs > 0.04d) {
                    return -1.0d;
                }
                double d4 = wga.d(d3) + 0.4d;
                if (d4 >= 0.0d && d4 <= 100.0d) {
                    return d4;
                }
            }
        }
        return -1.0d;
    }

    public static double m(double d, double d2) {
        return n(wga.e(d), wga.e(d2));
    }

    public static double n(double d, double d2) {
        double dMax = Math.max(d, d2);
        double d3 = dMax + 5.0d;
        if (dMax != d2) {
            d = d2;
        }
        return d3 / (d + 5.0d);
    }

    public static int o(int i) {
        if (i == 80) {
            return 81;
        }
        if (i == 81) {
            return 82;
        }
        if (i == 300) {
            return 301;
        }
        if (i == 301) {
            return 302;
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            default:
                switch (i) {
                    case 100:
                        return 101;
                    case 101:
                        return R.styleable.AppCompatTheme_textAppearanceLargePopupMenu;
                    case R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /* 102 */:
                        return R.styleable.AppCompatTheme_textAppearanceListItem;
                    case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                        return R.styleable.AppCompatTheme_textAppearanceListItemSecondary;
                    case R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                        return R.styleable.AppCompatTheme_textAppearanceListItemSmall;
                    case R.styleable.AppCompatTheme_textAppearanceListItemSmall /* 105 */:
                        return R.styleable.AppCompatTheme_textAppearancePopupMenuHeader;
                    case R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /* 106 */:
                        return R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle;
                    case R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /* 107 */:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return R.styleable.AppCompatTheme_textColorAlertDialogListItem;
                    case R.styleable.AppCompatTheme_textColorAlertDialogListItem /* 110 */:
                        return R.styleable.AppCompatTheme_textColorSearchUrl;
                    case R.styleable.AppCompatTheme_textColorSearchUrl /* 111 */:
                        return R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
                    case R.styleable.AppCompatTheme_toolbarNavigationButtonStyle /* 112 */:
                        return R.styleable.AppCompatTheme_toolbarStyle;
                    case R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                        return R.styleable.AppCompatTheme_tooltipForegroundColor;
                    case R.styleable.AppCompatTheme_tooltipForegroundColor /* 114 */:
                        return R.styleable.AppCompatTheme_tooltipFrameBackground;
                    case R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                        return R.styleable.AppCompatTheme_viewInflaterClass;
                    case R.styleable.AppCompatTheme_viewInflaterClass /* 116 */:
                        return R.styleable.AppCompatTheme_windowActionBar;
                    case R.styleable.AppCompatTheme_windowActionBar /* 117 */:
                        return R.styleable.AppCompatTheme_windowActionBarOverlay;
                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                        return R.styleable.AppCompatTheme_windowActionModeOverlay;
                    case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                        return R.styleable.AppCompatTheme_windowFixedHeightMajor;
                    case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                        return R.styleable.AppCompatTheme_windowFixedHeightMinor;
                    case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                        return R.styleable.AppCompatTheme_windowFixedWidthMajor;
                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        return R.styleable.AppCompatTheme_windowFixedWidthMinor;
                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                        return R.styleable.AppCompatTheme_windowMinWidthMajor;
                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                        return R.styleable.AppCompatTheme_windowMinWidthMinor;
                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                        return R.styleable.AppCompatTheme_windowNoTitle;
                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                        return 127;
                    case 127:
                        return 128;
                    case 128:
                        return 129;
                    case 129:
                        return 130;
                    case 130:
                        return 131;
                    case 131:
                        return 132;
                    case 132:
                        return 133;
                    case 133:
                        return 134;
                    case 134:
                        return 135;
                    case 135:
                        return 136;
                    case 136:
                        return 137;
                    case 137:
                        return 138;
                    case 138:
                        return 139;
                    case 139:
                        return 140;
                    case 140:
                        return 141;
                    case 141:
                        return 142;
                    case 142:
                        return 143;
                    case 143:
                        return 144;
                    case 144:
                        return 145;
                    case 145:
                        return 146;
                    case 146:
                        return 147;
                    case 147:
                        return 148;
                    case 148:
                        return 149;
                    case 149:
                        return 150;
                    case 150:
                        return 151;
                    case 151:
                        return 152;
                    case 152:
                        return 153;
                    case 153:
                        return 154;
                    case 154:
                        return 155;
                    case 155:
                        return 156;
                    case 156:
                        return 157;
                    case 157:
                        return 158;
                    case 158:
                        return 159;
                    case 159:
                        return 160;
                    case 160:
                        return 161;
                    case 161:
                        return 162;
                    case 162:
                        return 163;
                    case 163:
                        return 164;
                    case 164:
                        return 165;
                    case 165:
                        return 166;
                    case 166:
                        return 167;
                    case 167:
                        return 168;
                    case 168:
                        return 169;
                    case 169:
                        return 170;
                    case 170:
                        return 171;
                    case 171:
                        return 172;
                    case 172:
                        return 173;
                    case 173:
                        return 174;
                    case 174:
                        return 175;
                    case 175:
                        return 176;
                    case 176:
                        return 177;
                    case 177:
                        return 178;
                    case 178:
                        return 179;
                    case 179:
                        return 180;
                    case 180:
                        return 181;
                    case 181:
                        return 182;
                    case 182:
                        return 183;
                    case 183:
                        return 184;
                    case 184:
                        return 185;
                    case 185:
                        return 186;
                    case 186:
                        return 187;
                    case 187:
                        return 188;
                    case 188:
                        return 189;
                    case 189:
                        return 190;
                    case 190:
                        return 191;
                    case 191:
                        return 192;
                    case 192:
                        return 193;
                    case 193:
                        return 194;
                    case 194:
                        return 195;
                    case 195:
                        return 196;
                    case 196:
                        return 197;
                    case 197:
                        return 198;
                    case 198:
                        return 199;
                    case 199:
                        return 200;
                    case 200:
                        return 201;
                    case 201:
                        return 202;
                    case 202:
                        return 203;
                    case 203:
                        return 204;
                    case 204:
                        return 205;
                    case 205:
                        return 206;
                    case 206:
                        return 207;
                    case 207:
                        return 208;
                    case 208:
                        return 209;
                    case 209:
                        return 210;
                    case 210:
                        return 211;
                    case 211:
                        return 212;
                    case 212:
                        return 213;
                    case 213:
                        return 214;
                    case 214:
                        return 215;
                    case 215:
                        return 216;
                    case 216:
                        return 217;
                    case 217:
                        return 218;
                    case 218:
                        return 219;
                    case 219:
                        return 220;
                    case 220:
                        return 221;
                    case 221:
                        return 222;
                    case 222:
                        return 223;
                    case 223:
                        return 224;
                    default:
                        switch (i) {
                            case 400:
                                return 401;
                            case 401:
                                return 402;
                            case 402:
                                return 403;
                            case 403:
                                return 404;
                            case 404:
                                return 405;
                            case 405:
                                return 406;
                            case 406:
                                return 407;
                            case 407:
                                return 408;
                            case 408:
                                return 409;
                            case 409:
                                return 410;
                            case 410:
                                return 411;
                            case 411:
                                return 412;
                            case 412:
                                return 413;
                            case 413:
                                return 414;
                            case 414:
                                return 415;
                            case 415:
                                return 416;
                            default:
                                switch (i) {
                                    case 501:
                                        return 502;
                                    case 502:
                                        return 503;
                                    case 503:
                                        return 504;
                                    case 504:
                                        return 505;
                                    case 505:
                                        return 506;
                                    case 506:
                                        return 507;
                                    case 507:
                                        return 508;
                                    case 508:
                                        return 509;
                                    case 509:
                                        return 510;
                                    case 510:
                                        return 511;
                                    case 511:
                                        return 512;
                                    case 512:
                                        return 513;
                                    case 513:
                                        return 514;
                                    case 514:
                                        return 515;
                                    case 515:
                                        return 516;
                                    case 516:
                                        return 517;
                                    case 517:
                                        return 518;
                                    case 518:
                                        return 519;
                                    case 519:
                                        return 520;
                                    case 520:
                                        return 521;
                                    case 521:
                                        return 522;
                                    case 522:
                                        return 523;
                                    case 523:
                                        return 524;
                                    case 524:
                                        return 525;
                                    case 525:
                                        return 526;
                                    case 526:
                                        return 527;
                                    case 527:
                                        return 528;
                                    case 528:
                                        return 529;
                                    case 529:
                                        return 530;
                                    case 530:
                                        return 531;
                                    case 531:
                                        return 532;
                                    case 532:
                                        return 533;
                                    default:
                                        switch (i) {
                                            case 534:
                                                return 535;
                                            case 535:
                                                return 536;
                                            case 536:
                                                return 537;
                                            case 537:
                                                return 538;
                                            case 538:
                                                return 539;
                                            case 539:
                                                return 540;
                                            case 540:
                                                return 541;
                                            case 541:
                                                return 542;
                                            case 542:
                                                return 543;
                                            case 543:
                                                return 544;
                                            case 544:
                                                return 545;
                                            case 545:
                                                return 546;
                                            case 546:
                                                return 547;
                                            case 547:
                                                return 548;
                                            case 548:
                                                return 549;
                                            case 549:
                                                return 550;
                                            case 550:
                                                return 551;
                                            case 551:
                                                return 552;
                                            case 552:
                                                return 553;
                                            case 553:
                                                return 554;
                                            case 554:
                                                return 555;
                                            case 555:
                                                return 556;
                                            case 556:
                                                return 557;
                                            case 557:
                                                return 558;
                                            case 558:
                                                return 559;
                                            case 559:
                                                return 560;
                                            case 560:
                                                return 561;
                                            case 561:
                                                return 562;
                                            case 562:
                                                return 563;
                                            case 563:
                                                return 564;
                                            case 564:
                                                return 565;
                                            case 565:
                                                return 566;
                                            case 566:
                                                return 567;
                                            case 567:
                                                return 568;
                                            case 568:
                                                return 569;
                                            case 569:
                                                return 570;
                                            case 570:
                                                return 571;
                                            case 571:
                                                return 572;
                                            case 572:
                                                return 573;
                                            case 573:
                                                return 574;
                                            case 574:
                                                return 575;
                                            case 575:
                                                return 576;
                                            case 576:
                                                return 577;
                                            case 577:
                                                return 578;
                                            case 578:
                                                return 579;
                                            case 579:
                                                return 580;
                                            case 580:
                                                return 581;
                                            case 581:
                                                return 582;
                                            case 582:
                                                return 583;
                                            case 583:
                                                return 584;
                                            case 584:
                                                return 585;
                                            case 585:
                                                return 586;
                                            case 586:
                                                return 587;
                                            case 587:
                                                return 588;
                                            case 588:
                                                return 589;
                                            case 589:
                                                return 590;
                                            case 590:
                                                return 591;
                                            case 591:
                                                return 592;
                                            case 592:
                                                return 593;
                                            case 593:
                                                return 594;
                                            case 594:
                                                return 595;
                                            case 595:
                                                return 596;
                                            case 596:
                                                return 597;
                                            case 597:
                                                return 598;
                                            case 598:
                                                return 599;
                                            case 599:
                                                return 600;
                                            case 600:
                                                return 601;
                                            case 601:
                                                return 602;
                                            case 602:
                                                return 603;
                                            case 603:
                                                return 604;
                                            case 604:
                                                return 605;
                                            case 605:
                                                return 606;
                                            case 606:
                                                return 607;
                                            case 607:
                                                return 608;
                                            case 608:
                                                return 609;
                                            case 609:
                                                return 610;
                                            case 610:
                                                return 611;
                                            case 611:
                                                return 612;
                                            case 612:
                                                return 613;
                                            case 613:
                                                return 614;
                                            case 614:
                                                return 615;
                                            case 615:
                                                return 616;
                                            case 616:
                                                return 617;
                                            case 617:
                                                return 618;
                                            case 618:
                                                return 619;
                                            case 619:
                                                return 620;
                                            case 620:
                                                return 621;
                                            case 621:
                                                return 622;
                                            case 622:
                                                return 623;
                                            case 623:
                                                return 624;
                                            case 624:
                                                return 625;
                                            case 625:
                                                return 626;
                                            case 626:
                                                return 627;
                                            case 627:
                                                return 628;
                                            case 628:
                                                return 629;
                                            case 629:
                                                return 630;
                                            case 630:
                                                return 631;
                                            case 631:
                                                return 632;
                                            case 632:
                                                return 633;
                                            case 633:
                                                return 634;
                                            case 634:
                                                return 635;
                                            case 635:
                                                return 636;
                                            case 636:
                                                return 637;
                                            case 637:
                                                return 638;
                                            case 638:
                                                return 639;
                                            case 639:
                                                return 640;
                                            case 640:
                                                return 641;
                                            case 641:
                                                return 642;
                                            case 642:
                                                return 643;
                                            case 643:
                                                return 644;
                                            case 644:
                                                return 645;
                                            case 645:
                                                return 646;
                                            case 646:
                                                return 647;
                                            case 647:
                                                return 648;
                                            case 648:
                                                return 649;
                                            case 649:
                                                return 650;
                                            case 650:
                                                return 651;
                                            case 651:
                                                return 652;
                                            case 652:
                                                return 653;
                                            case 653:
                                                return 654;
                                            case 654:
                                                return 655;
                                            case 655:
                                                return 656;
                                            case 656:
                                                return 657;
                                            case 657:
                                                return 658;
                                            case 658:
                                                return 659;
                                            case 659:
                                                return 660;
                                            case 660:
                                                return 661;
                                            case 661:
                                                return 662;
                                            case 662:
                                                return 663;
                                            case 663:
                                                return 664;
                                            case 664:
                                                return 665;
                                            case 665:
                                                return 666;
                                            case 666:
                                                return 667;
                                            case 667:
                                                return 668;
                                            case 668:
                                                return 669;
                                            case 669:
                                                return 670;
                                            case 670:
                                                return 671;
                                            case 671:
                                                return 672;
                                            case 672:
                                                return 673;
                                            case 673:
                                                return 674;
                                            case 674:
                                                return 675;
                                            case 675:
                                                return 676;
                                            case 676:
                                                return 677;
                                            case 677:
                                                return 678;
                                            case 678:
                                                return 679;
                                            case 679:
                                                return 680;
                                            case 680:
                                                return 681;
                                            case 681:
                                                return 682;
                                            case 682:
                                                return 683;
                                            case 683:
                                                return 684;
                                            case 684:
                                                return 685;
                                            case 685:
                                                return 686;
                                            case 686:
                                                return 687;
                                            case 687:
                                                return 688;
                                            case 688:
                                                return 689;
                                            case 689:
                                                return 690;
                                            case 690:
                                                return 691;
                                            case 691:
                                                return 692;
                                            case 692:
                                                return 693;
                                            case 693:
                                                return 694;
                                            case 694:
                                                return 695;
                                            case 695:
                                                return 696;
                                            case 696:
                                                return 697;
                                            case 697:
                                                return 698;
                                            case 698:
                                                return 699;
                                            case 699:
                                                return 700;
                                            case 700:
                                                return 701;
                                            case 701:
                                                return 702;
                                            case 702:
                                                return 703;
                                            case 703:
                                                return 704;
                                            case 704:
                                                return 705;
                                            case 705:
                                                return 706;
                                            case 706:
                                                return 707;
                                            case 707:
                                                return 708;
                                            case 708:
                                                return 709;
                                            case 709:
                                                return 710;
                                            case 710:
                                                return 711;
                                            case 711:
                                                return 712;
                                            case 712:
                                                return 713;
                                            case 713:
                                                return 714;
                                            case 714:
                                                return 715;
                                            case 715:
                                                return 716;
                                            case 716:
                                                return 717;
                                            case 717:
                                                return 718;
                                            case 718:
                                                return 719;
                                            case 719:
                                                return 720;
                                            case 720:
                                                return 721;
                                            case 721:
                                                return 722;
                                            case 722:
                                                return 723;
                                            case 723:
                                                return 724;
                                            case 724:
                                                return 725;
                                            case 725:
                                                return 726;
                                            case 726:
                                                return 727;
                                            case 727:
                                                return 728;
                                            case 728:
                                                return 729;
                                            case 729:
                                                return 730;
                                            case 730:
                                                return 731;
                                            case 731:
                                                return 732;
                                            case 732:
                                                return 733;
                                            case 733:
                                                return 734;
                                            case 734:
                                                return 735;
                                            case 735:
                                                return 736;
                                            case 736:
                                                return 737;
                                            case 737:
                                                return 738;
                                            case 738:
                                                return 739;
                                            case 739:
                                                return 740;
                                            case 740:
                                                return 741;
                                            case 741:
                                                return 742;
                                            case 742:
                                                return 743;
                                            case 743:
                                                return 744;
                                            case 744:
                                                return 745;
                                            case 745:
                                                return 746;
                                            case 746:
                                                return 747;
                                            case 747:
                                                return 748;
                                            case 748:
                                                return 749;
                                            case 749:
                                                return 750;
                                            case 750:
                                                return 751;
                                            case 751:
                                                return 752;
                                            case 752:
                                                return 753;
                                            case 753:
                                                return 754;
                                            case 754:
                                                return 755;
                                            case 755:
                                                return 756;
                                            case 756:
                                                return 757;
                                            case 757:
                                                return 758;
                                            case 758:
                                                return 759;
                                            case 759:
                                                return 760;
                                            case 760:
                                                return 761;
                                            case 761:
                                                return 762;
                                            case 762:
                                                return 763;
                                            case 763:
                                                return 764;
                                            case 764:
                                                return 765;
                                            case 765:
                                                return 766;
                                            case 766:
                                                return 767;
                                            case 767:
                                                return 768;
                                            case 768:
                                                return 769;
                                            case 769:
                                                return 770;
                                            case 770:
                                                return 771;
                                            case 771:
                                            case 772:
                                            case 773:
                                            case 774:
                                            case 775:
                                            case 776:
                                            case 777:
                                            case 778:
                                            case 779:
                                            case 780:
                                            case 781:
                                            case 782:
                                            case 783:
                                            case 784:
                                            case 785:
                                            case 786:
                                            case 787:
                                            case 788:
                                            case 789:
                                            case 790:
                                            case 791:
                                            case 792:
                                            case 793:
                                            case 794:
                                            case 795:
                                            case 796:
                                            case 797:
                                            case 798:
                                            case 799:
                                            case 800:
                                            case 801:
                                            case 802:
                                            case 803:
                                            case 804:
                                            case 805:
                                            case 806:
                                            case 807:
                                            case 808:
                                            case 809:
                                            case 810:
                                            case 811:
                                            case 812:
                                            case 813:
                                            case 814:
                                            case 815:
                                            case 816:
                                            case 817:
                                            case 818:
                                            case 819:
                                            case 820:
                                            case 821:
                                            case 822:
                                            case 823:
                                            case 824:
                                            case 825:
                                            case 826:
                                            case 827:
                                            case 828:
                                            case 829:
                                            case 830:
                                            case 831:
                                            case 832:
                                            case 833:
                                            case 834:
                                            case 835:
                                            case 836:
                                            case 837:
                                            case 838:
                                            case 839:
                                            case 840:
                                            case 841:
                                            case 842:
                                            case 843:
                                            case 844:
                                            case 845:
                                            case 846:
                                            case 847:
                                            case 848:
                                            case 849:
                                            case 850:
                                            case 851:
                                            case 852:
                                            case 853:
                                            case 854:
                                            case 855:
                                            case 856:
                                            case 857:
                                            case 858:
                                            case 859:
                                            case 860:
                                            case 861:
                                            case 862:
                                            case 863:
                                            case 864:
                                            case 865:
                                            case 866:
                                            case 867:
                                            case 868:
                                            case 869:
                                            case 870:
                                            case 871:
                                            case 872:
                                            case 873:
                                            case 874:
                                            case 875:
                                            case 876:
                                            case 877:
                                            case 878:
                                            case 879:
                                            case 880:
                                            case 881:
                                            case 882:
                                            case 883:
                                            case 884:
                                            case 885:
                                            case 886:
                                            case 887:
                                            case 888:
                                            case 889:
                                            case 890:
                                            case 891:
                                            case 999:
                                            case 1023:
                                            default:
                                                switch (i) {
                                                    case 772:
                                                        return 773;
                                                    case 773:
                                                        return 774;
                                                    case 774:
                                                        return 775;
                                                    case 775:
                                                        return 776;
                                                    case 776:
                                                        return 777;
                                                    case 777:
                                                        return 778;
                                                    case 778:
                                                        return 779;
                                                    case 779:
                                                        return 780;
                                                    case 780:
                                                        return 781;
                                                    case 781:
                                                        return 782;
                                                    case 782:
                                                        return 783;
                                                    case 783:
                                                        return 784;
                                                    case 784:
                                                        return 785;
                                                    case 785:
                                                        return 786;
                                                    case 786:
                                                        return 787;
                                                    default:
                                                        switch (i) {
                                                            case 788:
                                                                return 789;
                                                            case 789:
                                                                return 790;
                                                            case 790:
                                                                return 791;
                                                            case 791:
                                                                return 792;
                                                            case 792:
                                                                return 793;
                                                            case 793:
                                                                return 794;
                                                            case 794:
                                                                return 795;
                                                            case 795:
                                                                return 796;
                                                            case 796:
                                                                return 797;
                                                            case 797:
                                                                return 798;
                                                            case 798:
                                                                return 799;
                                                            case 799:
                                                                return 800;
                                                            case 800:
                                                                return 801;
                                                            case 801:
                                                                return 802;
                                                            case 802:
                                                                return 803;
                                                            case 803:
                                                                return 804;
                                                            case 804:
                                                                return 805;
                                                            case 805:
                                                                return 806;
                                                            case 806:
                                                                return 807;
                                                            case 807:
                                                                return 808;
                                                            case 808:
                                                                return 809;
                                                            case 809:
                                                                return 810;
                                                            case 810:
                                                                return 811;
                                                            case 811:
                                                                return 812;
                                                            case 812:
                                                                return 813;
                                                            case 813:
                                                                return 814;
                                                            case 814:
                                                                return 815;
                                                            case 815:
                                                                return 816;
                                                            case 816:
                                                                return 817;
                                                            case 817:
                                                                return 818;
                                                            case 818:
                                                                return 819;
                                                            case 819:
                                                                return 820;
                                                            case 820:
                                                                return 821;
                                                            case 821:
                                                                return 822;
                                                            case 822:
                                                                return 823;
                                                            case 823:
                                                                return 824;
                                                            case 824:
                                                                return 825;
                                                            case 825:
                                                                return 826;
                                                            case 826:
                                                                return 827;
                                                            case 827:
                                                                return 828;
                                                            case 828:
                                                                return 829;
                                                            case 829:
                                                                return 830;
                                                            case 830:
                                                                return 831;
                                                            case 831:
                                                                return 832;
                                                            case 832:
                                                                return 833;
                                                            case 833:
                                                                return 834;
                                                            case 834:
                                                                return 835;
                                                            case 835:
                                                                return 836;
                                                            case 836:
                                                                return 837;
                                                            case 837:
                                                                return 838;
                                                            case 838:
                                                                return 839;
                                                            case 839:
                                                                return 840;
                                                            case 840:
                                                                return 841;
                                                            case 841:
                                                                return 842;
                                                            case 842:
                                                                return 843;
                                                            case 843:
                                                                return 844;
                                                            case 844:
                                                                return 845;
                                                            case 845:
                                                                return 846;
                                                            case 846:
                                                                return 847;
                                                            case 847:
                                                                return 848;
                                                            case 848:
                                                                return 849;
                                                            case 849:
                                                                return 850;
                                                            case 850:
                                                                return 851;
                                                            case 851:
                                                                return 852;
                                                            case 852:
                                                                return 853;
                                                            case 853:
                                                                return 854;
                                                            case 854:
                                                                return 855;
                                                            case 855:
                                                                return 856;
                                                            case 856:
                                                                return 857;
                                                            case 857:
                                                                return 858;
                                                            case 858:
                                                                return 859;
                                                            case 859:
                                                                return 860;
                                                            case 860:
                                                                return 861;
                                                            default:
                                                                switch (i) {
                                                                    case 862:
                                                                        return 863;
                                                                    case 863:
                                                                        return 864;
                                                                    case 864:
                                                                        return 865;
                                                                    case 865:
                                                                        return 866;
                                                                    case 866:
                                                                        return 867;
                                                                    case 867:
                                                                        return 868;
                                                                    case 868:
                                                                        return 869;
                                                                    case 869:
                                                                        return 870;
                                                                    case 870:
                                                                        return 871;
                                                                    case 871:
                                                                        return 872;
                                                                    case 872:
                                                                        return 873;
                                                                    case 873:
                                                                        return 874;
                                                                    case 874:
                                                                        return 875;
                                                                    case 875:
                                                                        return 876;
                                                                    case 876:
                                                                        return 877;
                                                                    case 877:
                                                                        return 878;
                                                                    case 878:
                                                                        return 879;
                                                                    case 879:
                                                                        return 880;
                                                                    case 880:
                                                                        return 881;
                                                                    case 881:
                                                                        return 882;
                                                                    case 882:
                                                                        return 883;
                                                                    case 883:
                                                                        return 884;
                                                                    case 884:
                                                                        return 885;
                                                                    case 885:
                                                                        return 886;
                                                                    case 886:
                                                                        return 887;
                                                                    case 887:
                                                                        return 888;
                                                                    case 888:
                                                                        return 889;
                                                                    case 889:
                                                                        return 890;
                                                                    case 890:
                                                                        return 891;
                                                                    default:
                                                                        return 0;
                                                                }
                                                        }
                                                }
                                            case 892:
                                                return 893;
                                            case 893:
                                                return 894;
                                            case 894:
                                                return 895;
                                            case 895:
                                                return 896;
                                            case 896:
                                                return 897;
                                            case 897:
                                                return 898;
                                            case 898:
                                                return 899;
                                            case 899:
                                                return 900;
                                            case 900:
                                                return 901;
                                            case 901:
                                                return 902;
                                            case 902:
                                                return 903;
                                            case 903:
                                                return 904;
                                            case 904:
                                                return 905;
                                            case 905:
                                                return 906;
                                            case 906:
                                                return 907;
                                            case 907:
                                                return 908;
                                            case 908:
                                                return 909;
                                            case 909:
                                                return 910;
                                            case 910:
                                                return 911;
                                            case 911:
                                                return 912;
                                            case 912:
                                                return 913;
                                            case 913:
                                                return 914;
                                            case 914:
                                                return 915;
                                            case 915:
                                                return 916;
                                            case 916:
                                                return 917;
                                            case 917:
                                                return 918;
                                            case 918:
                                                return 919;
                                            case 919:
                                                return 920;
                                            case 920:
                                                return 921;
                                            case 921:
                                                return 922;
                                            case 922:
                                                return 923;
                                            case 923:
                                                return 924;
                                            case 924:
                                                return 925;
                                            case 925:
                                                return 926;
                                            case 926:
                                                return 927;
                                            case 927:
                                                return 928;
                                            case 928:
                                                return 929;
                                            case 929:
                                                return 930;
                                            case 930:
                                                return 931;
                                            case 931:
                                                return 932;
                                            case 932:
                                                return 933;
                                            case 933:
                                                return 934;
                                            case 934:
                                                return 935;
                                            case 935:
                                                return 936;
                                            case 936:
                                                return 937;
                                            case 937:
                                                return 938;
                                            case 938:
                                                return 939;
                                            case 939:
                                                return 940;
                                            case 940:
                                                return 941;
                                            case 941:
                                                return 942;
                                            case 942:
                                                return 943;
                                            case 943:
                                                return 944;
                                            case 944:
                                                return 945;
                                            case 945:
                                                return 946;
                                            case 946:
                                                return 947;
                                            case 947:
                                                return 948;
                                            case 948:
                                                return 949;
                                            case 949:
                                                return 950;
                                            case 950:
                                                return 951;
                                            case 951:
                                                return 952;
                                            case 952:
                                                return 953;
                                            case 953:
                                                return 954;
                                            case 954:
                                                return 955;
                                            case 955:
                                                return 956;
                                            case 956:
                                                return 957;
                                            case 957:
                                                return 958;
                                            case 958:
                                                return 959;
                                            case 959:
                                                return 960;
                                            case 960:
                                                return 961;
                                            case 961:
                                                return 962;
                                            case 962:
                                                return 963;
                                            case 963:
                                                return 964;
                                            case 964:
                                                return 965;
                                            case 965:
                                                return 966;
                                            case 966:
                                                return 967;
                                            case 967:
                                                return 968;
                                            case 968:
                                                return 969;
                                            case 969:
                                                return 970;
                                            case 970:
                                                return 971;
                                            case 971:
                                                return 972;
                                            case 972:
                                                return 973;
                                            case 973:
                                                return 974;
                                            case 974:
                                                return 975;
                                            case 975:
                                                return 976;
                                            case 976:
                                                return 977;
                                            case 977:
                                                return 978;
                                            case 978:
                                                return 979;
                                            case 979:
                                                return 980;
                                            case 980:
                                                return 981;
                                            case 981:
                                                return 982;
                                            case 982:
                                                return 983;
                                            case 983:
                                                return 984;
                                            case 984:
                                                return 985;
                                            case 985:
                                                return 986;
                                            case 986:
                                                return 987;
                                            case 987:
                                                return 988;
                                            case 988:
                                                return 989;
                                            case 989:
                                                return 990;
                                            case 990:
                                                return 991;
                                            case 991:
                                                return 992;
                                            case 992:
                                                return 993;
                                            case 993:
                                                return 994;
                                            case 994:
                                                return 995;
                                            case 995:
                                                return 996;
                                            case 996:
                                                return 997;
                                            case 997:
                                                return 998;
                                            case 998:
                                                return 999;
                                            case 1000:
                                                return 1001;
                                            case 1001:
                                                return 1002;
                                            case 1002:
                                                return 1003;
                                            case 1003:
                                                return 1004;
                                            case 1004:
                                                return 1005;
                                            case 1005:
                                                return 1006;
                                            case 1006:
                                                return 1007;
                                            case 1007:
                                                return 1008;
                                            case 1008:
                                                return 1009;
                                            case 1009:
                                                return 1010;
                                            case 1010:
                                                return 1011;
                                            case 1011:
                                                return 1012;
                                            case 1012:
                                                return 1013;
                                            case 1013:
                                                return 1014;
                                            case 1014:
                                                return 1015;
                                            case 1015:
                                                return 1016;
                                            case 1016:
                                                return 1017;
                                            case 1017:
                                                return 1018;
                                            case 1018:
                                                return 1019;
                                            case 1019:
                                                return 1020;
                                            case 1020:
                                                return 1021;
                                            case 1021:
                                                return 1022;
                                            case 1022:
                                                return 1023;
                                            case 1024:
                                                return 1025;
                                            case 1025:
                                                return 1026;
                                            case 1026:
                                                return 1027;
                                            case 1027:
                                                return 1028;
                                            case 1028:
                                                return 1029;
                                            case 1029:
                                                return 1030;
                                            case 1030:
                                                return 1031;
                                            case 1031:
                                                return 1032;
                                            case 1032:
                                                return 1033;
                                            case 1033:
                                                return 1034;
                                            case 1034:
                                                return 1035;
                                            case 1035:
                                                return 1036;
                                            case 1036:
                                                return 1037;
                                        }
                                }
                        }
                }
        }
    }

    public static int p(int i) {
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ wls q(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wls) vucVarO;
    }

    public static void r(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wls wlsVar = (wls) vtwVar.b;
        wls wlsVar2 = wls.a;
        wlsVar.b = str;
    }

    public static /* synthetic */ wll s(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wll) vucVarO;
    }

    public static void t(String str, vtw vtwVar) {
        if (!vtwVar.b.A()) {
            vtwVar.u();
        }
        wll wllVar = (wll) vtwVar.b;
        wll wllVar2 = wll.a;
        wllVar.b = 1;
        wllVar.c = str;
    }

    public static /* synthetic */ wlg u(vtw vtwVar) {
        vuc vucVarO = vtwVar.r();
        vucVarO.getClass();
        return (wlg) vucVarO;
    }

    public static void w() {
        Iterator it = zlj.n().l().iterator();
        while (it.hasNext()) {
            ((xqj) it.next()).a();
        }
    }

    public static xpz x(xpz xpzVar, List list) {
        xpzVar.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xpzVar = new xqd(xpzVar, (xqc) it.next());
        }
        return xpzVar;
    }

    public static xpz y(xpz xpzVar, xqc... xqcVarArr) {
        return x(xpzVar, Arrays.asList(xqcVarArr));
    }

    public static xpz z(xpz xpzVar, List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse(arrayList);
        return x(xpzVar, arrayList);
    }

    public final synchronized zbr W(String str) {
        zbr zbrVar;
        String strConcat;
        str.getClass();
        Map map = zbr.b;
        zbrVar = (zbr) map.get(str);
        if (zbrVar == null) {
            if (ylh.ac(str, "TLS_")) {
                String strSubstring = str.substring(4);
                strSubstring.getClass();
                strConcat = "SSL_".concat(strSubstring);
            } else if (ylh.ac(str, "SSL_")) {
                String strSubstring2 = str.substring(4);
                strSubstring2.getClass();
                strConcat = "TLS_".concat(strSubstring2);
            } else {
                strConcat = str;
            }
            zbrVar = (zbr) map.get(strConcat);
            if (zbrVar == null) {
                zbrVar = new zbr(str);
            }
            map.put(str, zbrVar);
        }
        return zbrVar;
    }

    public void a(xtk xtkVar, xsm xsmVar) {
        throw null;
    }

    public xqe b() {
        throw null;
    }

    public void d(Object obj) {
        throw null;
    }

    public wbb(byte[] bArr) {
    }

    public void e() {
    }

    public void c(xsm xsmVar) {
    }
}
