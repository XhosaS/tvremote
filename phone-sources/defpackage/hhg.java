package defpackage;

import android.support.v7.appcompat.R;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhg extends hhf {
    private static final zgn f;
    private static final zgn g;
    private static final zgn h;
    private static final zgn i;
    private static final zgn j;
    private final zgm k;
    private final zgk l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    static {
        zgn zgnVar = zgn.a;
        f = wcq.aD("'\\");
        g = wcq.aD("\"\\");
        h = wcq.aD("{}[]:, \n\t\r\f/\\;#=");
        i = wcq.aD("\n\r");
        j = wcq.aD("*/");
    }

    public hhg(zgm zgmVar) {
        this.k = zgmVar;
        this.l = ((zhi) zgmVar).b;
        k(6);
    }

    private final boolean A(int i2) throws hhe {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
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
        w();
        return false;
    }

    private final int B(String str, ghd ghdVar) {
        String[] strArr = (String[]) ghdVar.b;
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(strArr[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private final char r() throws hhe, EOFException {
        int i2;
        zgm zgmVar = this.k;
        if (!zgmVar.D(1L)) {
            throw c("Unterminated escape sequence");
        }
        zgk zgkVar = this.l;
        byte bD = zgkVar.d();
        if (bD == 10 || bD == 34 || bD == 39 || bD == 47 || bD == 92) {
            return (char) bD;
        }
        if (bD == 98) {
            return '\b';
        }
        if (bD == 102) {
            return '\f';
        }
        if (bD == 110) {
            return '\n';
        }
        if (bD == 114) {
            return '\r';
        }
        if (bD == 116) {
            return '\t';
        }
        if (bD != 117) {
            throw c("Invalid escape sequence: \\" + ((char) bD));
        }
        if (!zgmVar.D(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(d()));
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bC = zgkVar.c(i3);
            char c2 = (char) (c << 4);
            if (bC >= 48 && bC <= 57) {
                i2 = bC - 48;
            } else if (bC >= 97 && bC <= 102) {
                i2 = bC - 87;
            } else {
                if (bC < 65 || bC > 70) {
                    throw c("\\u".concat(zgkVar.o(4L)));
                }
                i2 = bC - 55;
            }
            c = (char) (c2 + i2);
        }
        zgkVar.B(4L);
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01be, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c4, code lost:
    
        if (A(r11) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c6, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ca, code lost:
    
        if (r4 != 2) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01cc, code lost:
    
        if (r10 == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01d2, code lost:
    
        if (r6 != Long.MIN_VALUE) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01d4, code lost:
    
        if (r9 == 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x01d7, code lost:
    
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01d9, code lost:
    
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01dc, code lost:
    
        if (r6 != r16) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01de, code lost:
    
        if (r3 != 0) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01e0, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01e1, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01e2, code lost:
    
        if (r3 == 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e5, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e6, code lost:
    
        r22.n = r6;
        r11 = r18;
        r11.B(r1);
        r22.m = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01f4, code lost:
    
        r11 = r18;
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01f8, code lost:
    
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01fa, code lost:
    
        if (r4 == 2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01fd, code lost:
    
        if (r4 == 4) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01ff, code lost:
    
        if (r4 != 7) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0201, code lost:
    
        r22.o = r5;
        r3 = 17;
        r22.m = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0230, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int s() throws defpackage.hhe, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhg.s():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r4 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        return 47;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ab A[EDGE_INSN: B:128:0x01ab->B:81:0x01ab BREAK  A[LOOP:2: B:28:0x0066->B:93:0x01cb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int t(boolean r32) throws defpackage.hhe, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhg.t(boolean):int");
    }

    private final String u(zgn zgnVar) throws hhe, EOFException {
        StringBuilder sb = null;
        while (true) {
            long j2 = this.k.j(zgnVar);
            if (j2 == -1) {
                throw c("Unterminated string");
            }
            zgk zgkVar = this.l;
            if (zgkVar.c(j2) != 92) {
                if (sb == null) {
                    String strO = zgkVar.o(j2);
                    zgkVar.d();
                    return strO;
                }
                sb.append(zgkVar.o(j2));
                zgkVar.d();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(zgkVar.o(j2));
            zgkVar.d();
            sb.append(r());
        }
    }

    private final String v() {
        long j2 = this.k.j(h);
        return j2 != -1 ? this.l.o(j2) : this.l.n();
    }

    private final void w() throws hhe {
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void x(zgn zgnVar) throws hhe, EOFException {
        while (true) {
            long j2 = this.k.j(zgnVar);
            if (j2 == -1) {
                throw c("Unterminated string");
            }
            long j3 = 1 + j2;
            zgk zgkVar = this.l;
            if (zgkVar.c(j2) != 92) {
                zgkVar.B(j3);
                return;
            } else {
                zgkVar.B(j3);
                r();
            }
        }
    }

    private final void y() {
        long j2 = this.k.j(i);
        zgk zgkVar = this.l;
        zgkVar.B(j2 != -1 ? j2 + 1 : zgkVar.b);
    }

    private final void z() {
        long j2 = this.k.j(h);
        zgk zgkVar = this.l;
        if (j2 == -1) {
            j2 = zgkVar.b;
        }
        zgkVar.B(j2);
    }

    @Override // defpackage.hhf
    public final double a() throws hhe, NumberFormatException, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.n;
        }
        if (iS == 17) {
            this.p = this.l.o(this.o);
        } else if (iS == 9) {
            this.p = u(g);
        } else if (iS == 8) {
            this.p = u(f);
        } else if (iS == 10) {
            this.p = v();
        } else if (iS != 11) {
            throw new hhd(hhh.a(this, "Expected a double but was "));
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new hhe("JSON forbids NaN and infinities: " + d + " at path " + d());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i3 = this.b - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new hhd("Expected a double but was " + this.p + " at path " + d());
        }
    }

    @Override // defpackage.hhf
    public final int b() throws hhe, NumberFormatException, EOFException {
        String strU;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 16) {
            long j2 = this.n;
            int i2 = (int) j2;
            if (j2 == i2) {
                this.m = 0;
                int[] iArr = this.e;
                int i3 = this.b - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new hhd("Expected an int but was " + j2 + " at path " + d());
        }
        if (iS == 17) {
            this.p = this.l.o(this.o);
        } else {
            if (iS == 9) {
                strU = u(g);
            } else if (iS == 8) {
                strU = u(f);
            } else if (iS != 11) {
                throw new hhd(hhh.a(this, "Expected an int but was "));
            }
            this.p = strU;
            try {
                int i4 = Integer.parseInt(strU);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return i4;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double d = Double.parseDouble(this.p);
            int i6 = (int) d;
            if (i6 == d) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            throw new hhd("Expected an int but was " + this.p + " at path " + d());
        } catch (NumberFormatException unused2) {
            throw new hhd("Expected an int but was " + this.p + " at path " + d());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.z();
        this.k.close();
    }

    @Override // defpackage.hhf
    public final String e() throws hhe, EOFException {
        String strU;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            strU = v();
        } else if (iS == 13) {
            strU = u(g);
        } else if (iS == 12) {
            strU = u(f);
        } else {
            if (iS != 15) {
                throw new hhd(hhh.a(this, "Expected a name but was "));
            }
            strU = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = strU;
        return strU;
    }

    @Override // defpackage.hhf
    public final String f() throws hhe, EOFException {
        String strO;
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 10) {
            strO = v();
        } else if (iS == 9) {
            strO = u(g);
        } else if (iS == 8) {
            strO = u(f);
        } else if (iS == 11) {
            strO = this.p;
            this.p = null;
        } else if (iS == 16) {
            strO = Long.toString(this.n);
        } else {
            if (iS != 17) {
                throw new hhd(hhh.a(this, "Expected a string but was "));
            }
            strO = this.l.o(this.o);
        }
        this.m = 0;
        int[] iArr = this.e;
        int i2 = this.b - 1;
        iArr[i2] = iArr[i2] + 1;
        return strO;
    }

    @Override // defpackage.hhf
    public final void g() throws hhe, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 3) {
            throw new hhd(hhh.a(this, "Expected BEGIN_ARRAY but was "));
        }
        k(1);
        this.e[this.b - 1] = 0;
        this.m = 0;
    }

    @Override // defpackage.hhf
    public final void h() throws hhe, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 1) {
            throw new hhd(hhh.a(this, "Expected BEGIN_OBJECT but was "));
        }
        k(3);
        this.m = 0;
    }

    @Override // defpackage.hhf
    public final void i() throws hhe, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 4) {
            throw new hhd(hhh.a(this, "Expected END_ARRAY but was "));
        }
        int i2 = this.b;
        this.b = i2 - 1;
        int[] iArr = this.e;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.m = 0;
    }

    @Override // defpackage.hhf
    public final void j() throws hhe, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS != 2) {
            throw new hhd(hhh.a(this, "Expected END_OBJECT but was "));
        }
        int i2 = this.b;
        int i3 = i2 - 1;
        this.b = i3;
        this.d[i3] = null;
        int[] iArr = this.e;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.m = 0;
    }

    @Override // defpackage.hhf
    public final void l() throws hhe, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 14) {
            z();
        } else if (iS == 13) {
            x(g);
        } else if (iS == 12) {
            x(f);
        } else if (iS != 15) {
            throw new hhd(hhh.a(this, "Expected a name but was "));
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.hhf
    public final void m() throws hhe, EOFException {
        int i2 = 0;
        do {
            int iS = this.m;
            if (iS == 0) {
                iS = s();
            }
            if (iS == 3) {
                k(1);
            } else if (iS == 1) {
                k(3);
            } else {
                if (iS == 4) {
                    i2--;
                    if (i2 < 0) {
                        throw new hhd(hhh.a(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 2) {
                    i2--;
                    if (i2 < 0) {
                        throw new hhd(hhh.a(this, "Expected a value but was "));
                    }
                    this.b--;
                } else if (iS == 14 || iS == 10) {
                    z();
                } else if (iS == 9 || iS == 13) {
                    x(g);
                } else if (iS == 8 || iS == 12) {
                    x(f);
                } else if (iS == 17) {
                    this.l.B(this.o);
                } else if (iS == 18) {
                    throw new hhd(hhh.a(this, "Expected a value but was "));
                }
                this.m = 0;
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        this.d[i3] = "null";
    }

    @Override // defpackage.hhf
    public final boolean n() throws hhe, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        return (iS == 2 || iS == 4 || iS == 18) ? false : true;
    }

    @Override // defpackage.hhf
    public final boolean o() throws hhe, EOFException {
        int iS = this.m;
        if (iS == 0) {
            iS = s();
        }
        if (iS == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i2 = this.b - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (iS != 6) {
            throw new hhd(hhh.a(this, "Expected a boolean but was "));
        }
        this.m = 0;
        int[] iArr2 = this.e;
        int i3 = this.b - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    @Override // defpackage.hhf
    public final int p() throws hhe, EOFException {
        int iS = this.m;
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
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a1, code lost:
    
        r9 = r16;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090 A[LOOP:2: B:27:0x0058->B:43:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0089 A[SYNTHETIC] */
    @Override // defpackage.hhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q(defpackage.ghd r22) throws defpackage.hhe, java.io.EOFException {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhg.q(ghd):int");
    }

    public final String toString() {
        return "JsonReader(" + this.k.toString() + ")";
    }
}
