package defpackage;

import android.support.v7.appcompat.R;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvm implements Closeable {
    public long d;
    public int e;
    public String f;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int[] n;
    public final char[] a = new char[1024];
    public int b = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    public int c = 0;
    public int g = 1;

    static {
        sij.a = new sij();
    }

    public uvm(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = reader;
    }

    private final int k(boolean z) throws IOException {
        int i;
        int i2 = this.b;
        int i3 = this.k;
        while (true) {
            if (i2 == i3) {
                this.b = i2;
                if (!n(1)) {
                    if (z) {
                        throw new EOFException("End of input".concat(e()));
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
                        boolean zN = n(2);
                        this.b++;
                        if (!zN) {
                            return 47;
                        }
                    }
                    l();
                    int i5 = this.b;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.b = i5 + 1;
                        while (true) {
                            if (this.b + 2 > this.k && !n(2)) {
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
                        m();
                        i2 = this.b;
                        i3 = this.k;
                    }
                } else {
                    if (c != '#') {
                        this.b = i4;
                        return c;
                    }
                    this.b = i4;
                    l();
                    m();
                    i2 = this.b;
                    i3 = this.k;
                }
            }
            i2 = i4;
        }
    }

    private final void l() throws uvn {
        throw b("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
    }

    private final void m() {
        char c;
        do {
            if (this.b >= this.k && !n(1)) {
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

    private final boolean n(int i) throws IOException {
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

    private final boolean o(char c) throws uvn {
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
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            return false;
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        l();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x01c5, code lost:
    
        r23 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01cb, code lost:
    
        if (o(r13) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01cf, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01d0, code lost:
    
        if (r9 != r1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d2, code lost:
    
        if (r10 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d8, code lost:
    
        if (r23 != Long.MIN_VALUE) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01da, code lost:
    
        if (r18 == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01dd, code lost:
    
        r8 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e1, code lost:
    
        if (r23 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01e3, code lost:
    
        if (r8 != false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e6, code lost:
    
        if (r8 == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01e8, code lost:
    
        r6 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01eb, code lost:
    
        r6 = -r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ee, code lost:
    
        r27.d = r6;
        r27.b += r4;
        r27.c = 15;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01fc, code lost:
    
        r7 = 2;
        r9 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ff, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0200, code lost:
    
        if (r9 == r7) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0203, code lost:
    
        if (r9 == 4) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0206, code lost:
    
        if (r9 != 7) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0208, code lost:
    
        r27.e = r4;
        r6 = 16;
        r27.c = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0242 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x025c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvm.a():int");
    }

    public final uvn b(String str) throws uvn {
        throw new uvn(str + e() + "\nSee " + sij.aa("malformed-json"));
    }

    public final IllegalStateException c(String str) throws IOException {
        int iJ = j();
        String strAg = a.ag(j());
        String strE = e();
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(str);
        sb.append(" but was ");
        sb.append(strAg);
        sb.append(strE);
        sb.append("\nSee ");
        sb.append(sij.aa(iJ == 9 ? "adapter-not-null-safe" : "unexpected-json-structure"));
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
        StringBuilder sb = new StringBuilder("$");
        for (int i = 0; i < this.g; i++) {
            int i2 = this.n[i];
            switch (i2) {
                case 1:
                case 2:
                    int i3 = this.i[i];
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.h[i];
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
                    throw new AssertionError(a.cf(i2, "Unknown scope value: "));
            }
        }
        return sb.toString();
    }

    final String e() {
        int i = this.l + 1;
        int i2 = this.b - this.m;
        return " at line " + i + " column " + (i2 + 1) + " path " + d();
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
    public final java.lang.String f(char r11) throws defpackage.uvn {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvm.f(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
    
        l();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0042. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String g() throws defpackage.uvn {
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
            r5.l()
            goto L59
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5b
            int r3 = r2 + 1
            boolean r3 = r5.n(r3)
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
            boolean r2 = r5.n(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvm.g():java.lang.String");
    }

    public final void h(int i) throws uvn {
        int i2 = this.g;
        if (i2 - 1 >= 1280) {
            throw new uvn("Nesting limit 1280 reached" + e());
        }
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.n = Arrays.copyOf(iArr, i3);
            this.i = Arrays.copyOf(this.i, i3);
            this.h = (String[]) Arrays.copyOf(this.h, i3);
        }
        int[] iArr2 = this.n;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean i() throws IOException {
        int iA = this.c;
        if (iA == 0) {
            iA = a();
        }
        return (iA == 2 || iA == 4 || iA == 17) ? false : true;
    }

    public final int j() throws IOException {
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
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return String.valueOf(getClass().getSimpleName()).concat(e());
    }
}
