package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abdx implements Closeable {
    public long d;
    public int e;
    public String f;
    public int[] h;
    private final Reader j;
    private int[] n;
    private String[] o;
    public int i = 2;
    public final char[] a = new char[1024];
    public int b = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    public int c = 0;
    public int g = 1;

    static {
        abbh.a = new abdw();
    }

    public abdx(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.o = new String[32];
        this.h = new int[32];
        this.j = reader;
    }

    private final int s(boolean z) throws IOException {
        int i;
        int i2 = this.b;
        int i3 = this.k;
        while (true) {
            if (i2 == i3) {
                this.b = i2;
                if (!w(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(d()));
                    }
                    return -1;
                }
                i2 = this.b;
                i3 = this.k;
            }
            char[] cArr = this.a;
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == '\n') {
                this.l++;
                this.m = i4;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i4;
                    if (i4 == i3) {
                        this.b = i2;
                        boolean zW = w(2);
                        this.b++;
                        if (!zW) {
                            return 47;
                        }
                    }
                    t();
                    int i5 = this.b;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.b = i5 + 1;
                        while (true) {
                            if (this.b + 2 > this.k && !w(2)) {
                                throw b("Unterminated comment");
                            }
                            int i6 = this.b;
                            if (cArr[i6] != '\n') {
                                while (i < 2) {
                                    i = cArr[this.b + i] == "*/".charAt(i) ? i + 1 : 0;
                                }
                                i2 = this.b + 2;
                                i3 = this.k;
                                break;
                            }
                            this.l++;
                            this.m = i6 + 1;
                            this.b++;
                        }
                    } else {
                        if (c2 != '/') {
                            return 47;
                        }
                        this.b = i5 + 1;
                        v();
                        i2 = this.b;
                        i3 = this.k;
                    }
                } else {
                    if (c != '#') {
                        this.b = i4;
                        return c;
                    }
                    this.b = i4;
                    t();
                    v();
                    i2 = this.b;
                    i3 = this.k;
                }
            }
            i2 = i4;
        }
    }

    private final void t() throws abea {
        if (this.i != 1) {
            throw b("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private final void u(int i) throws abea {
        int i2 = this.g;
        if (i2 - 1 >= 1280) {
            throw new abea("Nesting limit 1280 reached" + d());
        }
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.n = Arrays.copyOf(iArr, i3);
            this.h = Arrays.copyOf(this.h, i3);
            this.o = (String[]) Arrays.copyOf(this.o, i3);
        }
        int[] iArr2 = this.n;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr2[i4] = i;
    }

    private final void v() {
        char c;
        do {
            if (this.b >= this.k && !w(1)) {
                return;
            }
            char[] cArr = this.a;
            int i = this.b;
            int i2 = i + 1;
            this.b = i2;
            c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i2;
                return;
            }
        } while (c != '\r');
    }

    private final boolean w(int i) throws IOException {
        int i2;
        int i3 = this.m;
        int i4 = this.b;
        this.m = i3 - i4;
        char[] cArr = this.a;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.j;
            int i7 = this.k;
            int i8 = reader.read(cArr, i7, 1024 - i7);
            if (i8 == -1) {
                return false;
            }
            i2 = this.k + i8;
            this.k = i2;
            if (this.l == 0 && this.m == 0 && i2 > 0 && cArr[0] == 65279) {
                this.b++;
                this.m = 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean x(char c) throws abea {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        t();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0197, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x021c, code lost:
    
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0222, code lost:
    
        if (x(r1) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x023a, code lost:
    
        if (r3 == 0) goto L176;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x028e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdx.a():int");
    }

    public final abea b(String str) throws abea {
        throw new abea(str + d() + "\nSee https://github.com/google/gson/blob/main/Troubleshooting.md#malformed-json");
    }

    public final IllegalStateException c(String str) throws IOException {
        int iP = p();
        String strA = abdy.a(p());
        String strD = d();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strA);
        sb.append(strD);
        sb.append("\nSee ");
        sb.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(iP == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
        return new IllegalStateException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    public final String d() {
        int i = this.l + 1;
        int i2 = this.b - this.m;
        return " at line " + i + " column " + (i2 + 1) + " path " + r();
    }

    public final String e() throws IOException {
        String strF;
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 14) {
            strF = h();
        } else if (iA == 12) {
            strF = f('\'');
        } else {
            if (iA != 13) {
                throw c("a name");
            }
            strF = f('\"');
        }
        this.c = 0;
        this.o[this.g - 1] = strF;
        return strF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0114, code lost:
    
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0116, code lost:
    
        if (r0 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0118, code lost:
    
        r0 = new java.lang.StringBuilder(java.lang.Math.max(r3 + r3, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0124, code lost:
    
        r0.append(r4, r2, r3);
        r10.b = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String f(char r11) throws defpackage.abea {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdx.f(char):java.lang.String");
    }

    public final String g() throws IOException {
        String string;
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 10) {
            string = h();
        } else if (iA == 8) {
            string = f('\'');
        } else if (iA == 9) {
            string = f('\"');
        } else if (iA == 11) {
            string = this.f;
            this.f = null;
        } else if (iA == 15) {
            string = Long.toString(this.d);
        } else {
            if (iA != 16) {
                throw c("a string");
            }
            String str = new String(this.a, this.b, this.e);
            this.b += this.e;
            string = str;
        }
        this.c = 0;
        int[] iArr = this.h;
        int i = this.g - 1;
        iArr[i] = iArr[i] + 1;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        t();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h() throws defpackage.abea {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r5.b
            int r3 = r3 + r2
            int r4 = r5.k
            if (r3 >= r4) goto L4c
            char[] r4 = r5.a
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L59
            r4 = 10
            if (r3 == r4) goto L59
            r4 = 12
            if (r3 == r4) goto L59
            r4 = 13
            if (r3 == r4) goto L59
            r4 = 32
            if (r3 == r4) goto L59
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L59
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L59
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L59
            r4 = 58
            if (r3 == r4) goto L59
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L59;
                case 92: goto L48;
                case 93: goto L59;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.t()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.w(r3)
            if (r3 == 0) goto L59
            goto L3
        L59:
            r0 = r2
            goto L7b
        L5b:
            if (r1 != 0) goto L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L68:
            char[] r3 = r5.a
            int r4 = r5.b
            r1.append(r3, r4, r2)
            int r3 = r5.b
            int r3 = r3 + r2
            r5.b = r3
            r2 = 1
            boolean r2 = r5.w(r2)
            if (r2 != 0) goto L2
        L7b:
            if (r1 != 0) goto L87
            char[] r1 = r5.a
            java.lang.String r2 = new java.lang.String
            int r3 = r5.b
            r2.<init>(r1, r3, r0)
            goto L92
        L87:
            char[] r2 = r5.a
            int r3 = r5.b
            r1.append(r2, r3, r0)
            java.lang.String r2 = r1.toString()
        L92:
            int r1 = r5.b
            int r1 = r1 + r0
            r5.b = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abdx.h():java.lang.String");
    }

    public final void i() {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 3) {
            throw c("BEGIN_ARRAY");
        }
        u(1);
        this.h[this.g - 1] = 0;
        this.c = 0;
    }

    public final void j() {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 1) {
            throw c("BEGIN_OBJECT");
        }
        u(3);
        this.c = 0;
    }

    public final void k() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 4) {
            throw c("END_ARRAY");
        }
        int i = this.g;
        this.g = i - 1;
        int[] iArr = this.h;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.c = 0;
    }

    public final void l() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 2) {
            throw c("END_OBJECT");
        }
        int i = this.g;
        int i2 = i - 1;
        this.g = i2;
        this.o[i2] = null;
        int[] iArr = this.h;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.c = 0;
    }

    public final void m() {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA != 7) {
            throw c("null");
        }
        this.c = 0;
        int[] iArr = this.h;
        int i = this.g - 1;
        iArr[i] = iArr[i] + 1;
    }

    public final boolean n() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        return (iA == 2 || iA == 4 || iA == 17) ? false : true;
    }

    public final boolean o() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        if (iA == 5) {
            this.c = 0;
            int[] iArr = this.h;
            int i = this.g - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iA != 6) {
            throw c("a boolean");
        }
        this.c = 0;
        int[] iArr2 = this.h;
        int i2 = this.g - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    public final int p() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        switch (iA) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final void q(int i) {
        if (i == 0) {
            throw null;
        }
        this.i = i;
    }

    public final String r() {
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.g; i++) {
            int i2 = this.n[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.h[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.o[i];
                    if (str != null) {
                        sb.append(str);
                        break;
                    } else {
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(a.b(i2, "Unknown scope value: "));
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(d());
    }
}
