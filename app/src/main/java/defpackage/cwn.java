package defpackage;

import java.io.EOFException;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwn extends cwm {
    private static final ahxb f = ahxb.a.a("'\\");
    private static final ahxb g = ahxb.a.a("\"\\");
    private static final ahxb h = ahxb.a.a("{}[]:, \n\t\r\f/\\;#=");
    private final ahwz i;
    private final ahwx j;
    private int k = 0;
    private long l;
    private int m;
    private String n;

    static {
        ahxb.a.a("\n\r");
        ahxb.a.a("*/");
    }

    public cwn(ahwz ahwzVar) {
        this.i = ahwzVar;
        this.j = ((ahxk) ahwzVar).b;
        l(6);
    }

    private final char r() throws cwj, EOFException {
        int i;
        ahwz ahwzVar = this.i;
        if (!ahwzVar.p(1L)) {
            throw d("Unterminated escape sequence");
        }
        ahwx ahwxVar = this.j;
        byte bC = ahwxVar.c();
        if (bC == 10 || bC == 34 || bC == 39 || bC == 47 || bC == 92) {
            return (char) bC;
        }
        if (bC == 98) {
            return '\b';
        }
        if (bC == 102) {
            return '\f';
        }
        if (bC == 110) {
            return '\n';
        }
        if (bC == 114) {
            return '\r';
        }
        if (bC == 116) {
            return '\t';
        }
        if (bC != 117) {
            throw d("Invalid escape sequence: \\" + ((char) bC));
        }
        if (!ahwzVar.p(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(e()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte b = ahwxVar.b(i2);
            char c2 = (char) (c << 4);
            if (b >= 48 && b <= 57) {
                i = b - 48;
            } else if (b >= 97 && b <= 102) {
                i = b - 87;
            } else {
                if (b < 65 || b > 70) {
                    throw d("\\u".concat(ahwxVar.h(4L, agyo.a)));
                }
                i = b - 55;
            }
            c = (char) (c2 + i);
        }
        ahwxVar.o(4L);
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x0197, code lost:
    
        if (z(r10) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x019b, code lost:
    
        if (r2 != 2) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
    
        if (r9 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01a3, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a5, code lost:
    
        if (r8 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01a7, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01a9, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01ac, code lost:
    
        if (r6 != r17) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01ae, code lost:
    
        if (r3 != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01b0, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01b3, code lost:
    
        r16 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01b5, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01b6, code lost:
    
        if (r16 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01b9, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01ba, code lost:
    
        r22.l = r6;
        r1.o(r2);
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01c2, code lost:
    
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01c3, code lost:
    
        if (r2 == 2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c6, code lost:
    
        if (r2 == 4) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01c9, code lost:
    
        if (r2 != 7) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01cb, code lost:
    
        r22.m = r4;
        r6 = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01cf, code lost:
    
        r22.k = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0212 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int s() throws defpackage.cwj, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwn.s():int");
    }

    private final int t(String str, cwk cwkVar) {
        String[] strArr = cwkVar.a;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(strArr[i])) {
                this.k = 0;
                this.d[this.b - 1] = str;
                return i;
            }
        }
        return -1;
    }

    private final int u(boolean z) throws cwj, EOFException {
        int i = 0;
        while (true) {
            ahwz ahwzVar = this.i;
            int i2 = i + 1;
            if (!ahwzVar.p(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            ahwx ahwxVar = this.j;
            byte b = ahwxVar.b(i);
            if (b != 10 && b != 32 && b != 13 && b != 9) {
                ahwxVar.o(i);
                if (b == 47) {
                    if (ahwzVar.p(2L)) {
                        throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                    return 47;
                }
                if (b != 35) {
                    return b;
                }
                throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
            i = i2;
        }
    }

    private final String v(ahxb ahxbVar) throws cwj, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jG = this.i.g(ahxbVar);
            if (jG == -1) {
                throw d("Unterminated string");
            }
            ahwx ahwxVar = this.j;
            if (ahwxVar.b(jG) != 92) {
                if (sb == null) {
                    String strH = ahwxVar.h(jG, agyo.a);
                    ahwxVar.c();
                    return strH;
                }
                sb.append(ahwxVar.h(jG, agyo.a));
                ahwxVar.c();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(ahwxVar.h(jG, agyo.a));
            ahwxVar.c();
            sb.append(r());
        }
    }

    private final String w() {
        long jG = this.i.g(h);
        return jG != -1 ? this.j.h(jG, agyo.a) : this.j.i();
    }

    private final void x(ahxb ahxbVar) throws cwj, EOFException {
        while (true) {
            long jG = this.i.g(ahxbVar);
            if (jG == -1) {
                throw d("Unterminated string");
            }
            long j = 1 + jG;
            ahwx ahwxVar = this.j;
            if (ahwxVar.b(jG) != 92) {
                ahwxVar.o(j);
                return;
            } else {
                ahwxVar.o(j);
                r();
            }
        }
    }

    private final void y() throws EOFException {
        long jG = this.i.g(h);
        ahwx ahwxVar = this.j;
        if (jG == -1) {
            jG = ahwxVar.b;
        }
        ahwxVar.o(jG);
    }

    private final boolean z(int i) throws cwj {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        throw d("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    @Override // defpackage.cwm
    public final double a() throws cwj, NumberFormatException, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            this.k = 0;
            int[] iArr = this.e;
            int i = this.b - 1;
            iArr[i] = iArr[i] + 1;
            return this.l;
        }
        if (iS == 17) {
            this.n = this.j.h(this.m, agyo.a);
        } else if (iS == 9) {
            this.n = v(g);
        } else if (iS == 8) {
            this.n = v(f);
        } else if (iS == 10) {
            this.n = w();
        } else if (iS != 11) {
            throw new cwi(cwk.b(this, "Expected a double but was "));
        }
        this.k = 11;
        try {
            double d = Double.parseDouble(this.n);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new cwj("JSON forbids NaN and infinities: " + d + " at path " + e());
            }
            this.n = null;
            this.k = 0;
            int[] iArr2 = this.e;
            int i2 = this.b - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new cwi("Expected a double but was " + this.n + " at path " + e());
        }
    }

    @Override // defpackage.cwm
    public final int b() throws cwj, NumberFormatException, EOFException {
        String strV;
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            long j = this.l;
            int i = (int) j;
            if (j == i) {
                this.k = 0;
                int[] iArr = this.e;
                int i2 = this.b - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new cwi("Expected an int but was " + j + " at path " + e());
        }
        if (iS == 17) {
            this.n = this.j.h(this.m, agyo.a);
        } else {
            if (iS == 9) {
                strV = v(g);
            } else if (iS == 8) {
                strV = v(f);
            } else if (iS != 11) {
                throw new cwi(cwk.b(this, "Expected an int but was "));
            }
            this.n = strV;
            try {
                int i3 = Integer.parseInt(strV);
                this.k = 0;
                int[] iArr2 = this.e;
                int i4 = this.b - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.k = 11;
        try {
            double d = Double.parseDouble(this.n);
            int i5 = (int) d;
            if (i5 == d) {
                this.n = null;
                this.k = 0;
                int[] iArr3 = this.e;
                int i6 = this.b - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new cwi("Expected an int but was " + this.n + " at path " + e());
        } catch (NumberFormatException unused2) {
            throw new cwi("Expected an int but was " + this.n + " at path " + e());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[LOOP:2: B:27:0x0055->B:43:0x008d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0086 A[SYNTHETIC] */
    @Override // defpackage.cwm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(defpackage.cwk r22) throws defpackage.cwj, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwn.c(cwk):int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        this.k = 0;
        this.c[0] = 8;
        this.b = 1;
        ahwx ahwxVar = this.j;
        ahwxVar.o(ahwxVar.b);
        this.i.close();
    }

    @Override // defpackage.cwm
    public final String f() throws cwj, EOFException {
        String strV;
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strV = w();
        } else if (iS == 13) {
            strV = v(g);
        } else if (iS == 12) {
            strV = v(f);
        } else {
            if (iS != 15) {
                throw new cwi(cwk.b(this, "Expected a name but was "));
            }
            strV = this.n;
        }
        this.k = 0;
        this.d[this.b - 1] = strV;
        return strV;
    }

    @Override // defpackage.cwm
    public final String g() throws cwj, EOFException {
        String strH;
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            strH = w();
        } else if (iS == 9) {
            strH = v(g);
        } else if (iS == 8) {
            strH = v(f);
        } else if (iS == 11) {
            strH = this.n;
            this.n = null;
        } else if (iS == 16) {
            strH = Long.toString(this.l);
        } else {
            if (iS != 17) {
                throw new cwi(cwk.b(this, "Expected a string but was "));
            }
            strH = this.j.h(this.m, agyo.a);
        }
        this.k = 0;
        int[] iArr = this.e;
        int i = this.b - 1;
        iArr[i] = iArr[i] + 1;
        return strH;
    }

    @Override // defpackage.cwm
    public final void h() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            throw new cwi(cwk.b(this, "Expected BEGIN_ARRAY but was "));
        }
        l(1);
        this.e[this.b - 1] = 0;
        this.k = 0;
    }

    @Override // defpackage.cwm
    public final void i() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            throw new cwi(cwk.b(this, "Expected BEGIN_OBJECT but was "));
        }
        l(3);
        this.k = 0;
    }

    @Override // defpackage.cwm
    public final void j() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            throw new cwi(cwk.b(this, "Expected END_ARRAY but was "));
        }
        int i = this.b;
        this.b = i - 1;
        int[] iArr = this.e;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.k = 0;
    }

    @Override // defpackage.cwm
    public final void k() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            throw new cwi(cwk.b(this, "Expected END_OBJECT but was "));
        }
        int i = this.b;
        int i2 = i - 1;
        this.b = i2;
        this.d[i2] = null;
        int[] iArr = this.e;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.k = 0;
    }

    @Override // defpackage.cwm
    public final void m() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            y();
        } else if (iS == 13) {
            x(g);
        } else if (iS == 12) {
            x(f);
        } else if (iS != 15) {
            throw new cwi(cwk.b(this, "Expected a name but was "));
        }
        this.k = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.cwm
    public final void n() throws cwj, EOFException {
        int i = 0;
        do {
            int iS = this.k;
            if (iS == 0) {
                iS = s();
            }
            if (iS == 3) {
                l(1);
            } else if (iS == 1) {
                l(3);
            } else {
                if (iS == 4) {
                    i--;
                    if (i < 0) {
                        throw new cwi(cwk.b(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 2) {
                    i--;
                    if (i < 0) {
                        throw new cwi(cwk.b(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 14 || iS == 10) {
                    y();
                } else if (iS == 9 || iS == 13) {
                    x(g);
                } else if (iS == 8 || iS == 12) {
                    x(f);
                } else if (iS == 17) {
                    this.j.o(this.m);
                } else if (iS == 18) {
                    throw new cwi(cwk.b(this, "Expected a value but was "));
                }
                this.k = 0;
            }
            i++;
            this.k = 0;
        } while (i != 0);
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        this.d[i2] = "null";
    }

    @Override // defpackage.cwm
    public final boolean o() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 18) ? false : true;
    }

    @Override // defpackage.cwm
    public final boolean p() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.k = 0;
            int[] iArr = this.e;
            int i = this.b - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iS != 6) {
            throw new cwi(cwk.b(this, "Expected a boolean but was "));
        }
        this.k = 0;
        int[] iArr2 = this.e;
        int i2 = this.b - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    @Override // defpackage.cwm
    public final int q() throws cwj, EOFException {
        int iS = this.k;
        if (iS == 0) {
            iS = s();
        }
        switch (iS) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        return "JsonReader(" + this.i.toString() + ")";
    }
}
