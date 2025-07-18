package defpackage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class zio extends zjh {
    final byte[] a;

    public zio(String str) {
        this.a = zxr.d(str);
        try {
            f();
        } catch (ParseException e) {
            throw new IllegalArgumentException("invalid date string: ".concat(String.valueOf(e.getMessage())));
        }
    }

    private final String j(String str) {
        String str2;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str2 = "-";
        } else {
            str2 = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (3600000 * i)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (g()) {
                    str = q(str);
                }
                if (timeZone.inDaylightTime(m().parse(str + "GMT" + str2 + o(i) + ":" + o(i2)))) {
                    i += true != str2.equals("+") ? -1 : 1;
                }
            }
        } catch (ParseException unused) {
        }
        return "GMT" + str2 + o(i) + ":" + o(i2);
    }

    private final SimpleDateFormat m() {
        SimpleDateFormat simpleDateFormat = g() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : i() ? new SimpleDateFormat("yyyyMMddHHmmssz") : h() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    private final boolean n(int i) {
        byte b;
        byte[] bArr = this.a;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    private static final String o(int i) {
        return i < 10 ? a.cf(i, "0") : Integer.toString(i);
    }

    private static final String q(String str) {
        char cCharAt;
        String strSubstring = str.substring(14);
        int i = 1;
        while (i < strSubstring.length() && (cCharAt = strSubstring.charAt(i)) >= '0' && cCharAt <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            return String.valueOf(str.substring(0, 14)).concat(String.valueOf(strSubstring.substring(0, 4)).concat(String.valueOf(strSubstring.substring(i))));
        }
        if (i2 == 1) {
            return String.valueOf(str.substring(0, 14)).concat(strSubstring.substring(0, i) + "00" + strSubstring.substring(i));
        }
        if (i2 != 2) {
            return str;
        }
        return String.valueOf(str.substring(0, 14)).concat(strSubstring.substring(0, i) + "0" + strSubstring.substring(i));
    }

    @Override // defpackage.zjh
    public int a(boolean z) {
        return zjf.b(z, this.a.length);
    }

    public final String b() {
        String strA = zxr.a(this.a);
        if (strA.charAt(strA.length() - 1) == 'Z') {
            return String.valueOf(strA.substring(0, strA.length() - 1)).concat("GMT+00:00");
        }
        int length = strA.length();
        char cCharAt = strA.charAt(length - 6);
        if ((cCharAt == '-' || cCharAt == '+') && strA.indexOf("GMT") == length - 9) {
            return strA;
        }
        int length2 = strA.length();
        int i = length2 - 5;
        char cCharAt2 = strA.charAt(i);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            int i2 = length2 - 2;
            return strA.substring(0, i) + "GMT" + strA.substring(i, i2) + ":" + strA.substring(i2);
        }
        int length3 = strA.length() - 3;
        char cCharAt3 = strA.charAt(length3);
        if (cCharAt3 != '-' && cCharAt3 != '+') {
            return strA.concat(j(strA));
        }
        return strA.substring(0, length3) + "GMT" + strA.substring(length3) + ":00";
    }

    @Override // defpackage.zjh
    public void c(zjf zjfVar, boolean z) throws IOException {
        zjfVar.j(z, 24, this.a);
    }

    @Override // defpackage.zjh
    public final boolean d(zjh zjhVar) {
        if (zjhVar instanceof zio) {
            return Arrays.equals(this.a, ((zio) zjhVar).a);
        }
        return false;
    }

    @Override // defpackage.zjh
    public final boolean e() {
        return false;
    }

    public final Date f() {
        SimpleDateFormat simpleDateFormatM;
        String strA = zxr.a(this.a);
        if (strA.endsWith("Z")) {
            simpleDateFormatM = g() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'", zli.a) : i() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'", zli.a) : h() ? new SimpleDateFormat("yyyyMMddHHmm'Z'", zli.a) : new SimpleDateFormat("yyyyMMddHH'Z'", zli.a);
            simpleDateFormatM.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (strA.indexOf(45) > 0 || strA.indexOf(43) > 0) {
            strA = b();
            simpleDateFormatM = m();
        } else {
            simpleDateFormatM = g() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : i() ? new SimpleDateFormat("yyyyMMddHHmmss") : h() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormatM.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (g()) {
            strA = q(strA);
        }
        return simpleDateFormatM.parse(strA);
    }

    protected final boolean g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    protected final boolean h() {
        return n(10) && n(11);
    }

    @Override // defpackage.zix
    public final int hashCode() {
        return vxr.ba(this.a);
    }

    protected final boolean i() {
        return n(12) && n(13);
    }

    @Override // defpackage.zjh
    public zjh k() {
        return new zkl(this.a);
    }

    public zio(byte[] bArr) {
        if (bArr.length >= 4) {
            this.a = bArr;
            if (!n(0) || !n(1) || !n(2) || !n(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }
}
