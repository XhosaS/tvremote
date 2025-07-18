package j$.time.format;

/* loaded from: classes3.dex */
public class i implements InterfaceC0062e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.n a;
    public final int b;
    public final int c;
    public final F d;
    public final int e;

    public i(j$.time.temporal.n nVar, int i, int i2, F f2) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = 0;
    }

    public long a(y yVar, long j) {
        return j;
    }

    public boolean b(v vVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == F.NOT_NEGATIVE;
        }
        return true;
    }

    public int c(v vVar, long j, int i, int i2) {
        return vVar.f(this.a, j, i, i2);
    }

    public i d() {
        if (this.e == -1) {
            return this;
        }
        return new i(this.a, this.b, this.c, this.d, -1);
    }

    public i e(int i) {
        return new i(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.InterfaceC0062e
    public boolean i(y yVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = yVar.a(nVar);
        if (lA == null) {
            return false;
        }
        long jA = a(yVar, lA.longValue());
        C c = yVar.b.c;
        String string = jA == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jA));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jA + " exceeds the maximum print width of " + i);
        }
        c.getClass();
        int i2 = this.b;
        F f2 = this.d;
        if (jA >= 0) {
            int i3 = AbstractC0059b.a[f2.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jA >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC0059b.a[f2.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jA + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x0173, code lost:
    
        if (r6 <= r10) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0197  */
    @Override // j$.time.format.InterfaceC0062e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int l(j$.time.format.v r27, java.lang.CharSequence r28, int r29) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.i.l(j$.time.format.v, java.lang.CharSequence, int):int");
    }

    public String toString() {
        j$.time.temporal.n nVar = this.a;
        F f2 = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && f2 == F.NORMAL) {
            return "Value(" + String.valueOf(nVar) + ")";
        }
        if (i2 == i && f2 == F.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(nVar) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(nVar) + "," + i2 + "," + i + "," + String.valueOf(f2) + ")";
    }

    public i(j$.time.temporal.n nVar, int i, int i2, F f2, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = i3;
    }
}
