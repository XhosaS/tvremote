package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mew {
    private static final char[] f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final StringBuilder a;
    public int b;
    public int c;
    public int d;
    public int e;
    private final StringBuilder g;
    private int h;
    private int i;
    private int j;

    public mew() {
        this.a = new StringBuilder("about:");
        this.g = new StringBuilder();
        this.h = 5;
        this.i = 6;
        this.b = 6;
        this.c = 6;
    }

    public static void e(StringBuilder sb, int i) {
        sb.ensureCapacity(sb.length() + i);
    }

    public static boolean g(CharSequence charSequence, int i, int i2) {
        return q(charSequence, i, i2, "-._~!$&'()*+,;=:@", true);
    }

    private static int m(CharSequence charSequence, int i, int i2, String str, boolean z) {
        int i3;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || str.indexOf(cCharAt) != -1))) {
                i++;
            } else {
                if (!z || cCharAt != '%' || (i3 = i + 2) >= i2 || !p(charSequence.charAt(i + 1)) || !p(charSequence.charAt(i3))) {
                    return i;
                }
                i += 3;
            }
        }
        return i2;
    }

    private static int n(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '&' || cCharAt == ';') {
                return i;
            }
            i++;
        }
        return i2;
    }

    private final void o(int i) {
        StringBuilder sb = this.g;
        sb.append('%');
        char[] cArr = f;
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    private static boolean p(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'A' || c > 'F') {
            return c >= 'a' && c <= 'f';
        }
        return true;
    }

    private static boolean q(CharSequence charSequence, int i, int i2, String str, boolean z) {
        return m(charSequence, i, i2, str, z) == i2;
    }

    private static boolean r(CharSequence charSequence, int i) {
        char cCharAt;
        if (i > 0 && (((cCharAt = charSequence.charAt(0)) >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
            return q(charSequence, 1, i, "+-.", false);
        }
        return false;
    }

    public final String a() {
        return this.a.toString();
    }

    public final String b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = this.g;
            sb.setLength(0);
            int length = str.length();
            int iOffsetByCodePoints = 0;
            while (iOffsetByCodePoints < length) {
                int iM = m(str, iOffsetByCodePoints, length, str2, false);
                if (iOffsetByCodePoints == 0) {
                    if (iM != length) {
                        iOffsetByCodePoints = 0;
                    }
                }
                sb.append((CharSequence) str, iOffsetByCodePoints, iM);
                if (iM < length) {
                    int iCodePointAt = str.codePointAt(iM);
                    if (iCodePointAt <= 127) {
                        e(sb, 3);
                        o(iCodePointAt);
                    } else if (iCodePointAt <= 2047) {
                        e(sb, 6);
                        o((iCodePointAt >> 6) | 192);
                        o((iCodePointAt & 63) | 128);
                    } else if (iCodePointAt <= 65535) {
                        e(sb, 9);
                        o((iCodePointAt >> 12) | 224);
                        o(((iCodePointAt >> 6) & 63) | 128);
                        o((iCodePointAt & 63) | 128);
                    } else {
                        e(sb, 12);
                        o((iCodePointAt >> 18) | 240);
                        o(((iCodePointAt >> 12) & 63) | 128);
                        o(((iCodePointAt >> 6) & 63) | 128);
                        o((iCodePointAt & 63) | 128);
                    }
                    iOffsetByCodePoints = str.offsetByCodePoints(iM, 1);
                } else {
                    iOffsetByCodePoints = iM;
                }
            }
            return sb.toString();
        }
        return str;
    }

    public final void c(String str, String str2) {
        Pattern pattern = ksh.a;
        int i = this.c;
        int i2 = i + 1;
        boolean z = str == null;
        int i3 = this.b;
        int length = z ? 0 : str.length();
        String strD = ksh.d(str2);
        int length2 = strD.length();
        int i4 = z ? length2 + 1 : length2 + length + 2;
        char c = i == i3 ? '?' : '&';
        StringBuilder sb = this.a;
        e(sb, i4);
        sb.insert(i, c);
        if (z) {
            sb.insert(i2, strD);
        } else {
            sb.insert(i2, str).insert(i2 + length, '=').insert(i + 2 + length, strD);
        }
        this.c += i4;
    }

    public final void d(String str) {
        int length;
        int i = this.b;
        boolean z = false;
        boolean z2 = this.i == i || this.a.charAt(i + (-1)) != '/';
        if (TextUtils.isEmpty(str)) {
            if (z2) {
                this.a.insert(i, '/');
                this.b++;
                this.c++;
                return;
            }
            return;
        }
        if (z2) {
            length = str.length() + 1;
            z = true;
        } else {
            length = str.length();
        }
        StringBuilder sb = this.a;
        e(sb, length);
        if (z) {
            sb.insert(i, '/').insert(i + 1, str);
        } else {
            sb.insert(i, str);
        }
        this.b += length;
        this.c += length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mew) {
            return a().equals(obj.toString());
        }
        return false;
    }

    public final void f(int i, String str) {
        int i2 = this.c;
        while (i <= i2) {
            StringBuilder sb = this.a;
            int iN = n(sb, i, i2);
            int iIndexOf = sb.indexOf("=", i);
            if (iIndexOf == -1 || iIndexOf >= iN) {
                if (str == null) {
                    this.d = i;
                    this.j = i;
                    this.e = iN;
                    return;
                }
            } else if (str != null && iIndexOf - i == str.length()) {
                int i3 = i;
                int i4 = 0;
                boolean z = true;
                while (z) {
                    if (i3 >= iIndexOf) {
                        this.d = i;
                        this.j = iIndexOf + 1;
                        this.e = iN;
                        return;
                    } else {
                        z = str.charAt(i4) == sb.charAt(i3);
                        i4++;
                        i3++;
                    }
                }
            }
            i = iN + 1;
        }
        this.d = -1;
        this.j = -1;
        this.e = -1;
    }

    public final void h(String str, String str2) {
        String strB;
        String strB2 = b(str, "-._~!$'()*+,:@/?");
        if (str2 == null) {
            strB = "";
        } else {
            strB = b(str2, str != null ? "-._~!$'()*+,=:@/?" : "-._~!$'()*+,:@/?");
        }
        c(strB2, strB);
    }

    public final int hashCode() {
        return mew.class.hashCode() ^ a().hashCode();
    }

    public final void i(String str) {
        d(b(str, "-._~!$&'()*+,;=:@"));
    }

    public final void j(String str) {
        String strB = b(str, "-._~!$'()*+,:@/?");
        f(this.b + 1, strB);
        while (true) {
            int i = this.d;
            if (i == -1) {
                return;
            }
            int i2 = this.e;
            if (i2 < this.c) {
                this.a.delete(i, i2 + 1);
            } else {
                this.a.delete(i - 1, i2);
            }
            this.c -= (i2 - i) + 1;
            f(i, strB);
        }
    }

    public final void k(String str) {
        krf.a(r(str, str.length()), "Invalid scheme %s", str);
        this.a.replace(0, this.h, str);
        int length = str.length();
        int i = this.h;
        int i2 = length - i;
        this.h = i + i2;
        this.i += i2;
        this.b += i2;
        this.c += i2;
    }

    public final void l(String str, String str2) {
        String strB = b(str, "-._~!$'()*+,:@/?");
        String strB2 = str2 == null ? "" : b(str2, "-._~!$'()*+,=:@/?");
        f(this.b + 1, strB);
        if (this.d == -1) {
            c(strB, strB2);
        } else {
            this.a.replace(this.j, this.e, strB2);
            this.c += strB2.length() - (this.e - this.j);
        }
    }

    public final String toString() {
        return a();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public mew(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mew.<init>(java.lang.String):void");
    }
}
