package j$.time.format;

/* loaded from: classes4.dex */
public class h implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final j$.time.temporal.n a;
    public final int b;
    public final int c;
    public final s d;
    public final int e;

    public h(j$.time.temporal.n nVar, int i, int i2, s sVar) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = sVar;
        this.e = 0;
    }

    public h a() {
        if (this.e == -1) {
            return this;
        }
        return new h(this.a, this.b, this.c, this.d, -1);
    }

    public h b(int i) {
        return new h(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // j$.time.format.e
    public boolean i(o oVar, StringBuilder sb) {
        j$.time.temporal.n nVar = this.a;
        Long lA = oVar.a(nVar);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        q qVar = oVar.b.c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        qVar.getClass();
        int i2 = this.b;
        s sVar = this.d;
        if (jLongValue >= 0) {
            int i3 = b.a[sVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jLongValue >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[sVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + String.valueOf(nVar) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        j$.time.temporal.n nVar = this.a;
        s sVar = this.d;
        int i = this.c;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && sVar == s.NORMAL) {
            return "Value(" + String.valueOf(nVar) + ")";
        }
        if (i2 == i && sVar == s.NOT_NEGATIVE) {
            return "Value(" + String.valueOf(nVar) + "," + i2 + ")";
        }
        return "Value(" + String.valueOf(nVar) + "," + i2 + "," + i + "," + String.valueOf(sVar) + ")";
    }

    public h(j$.time.temporal.n nVar, int i, int i2, s sVar, int i3) {
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = sVar;
        this.e = i3;
    }
}
