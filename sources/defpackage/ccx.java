package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ccx {
    STRING('s', ccz.GENERAL, "-#", true),
    BOOLEAN('b', ccz.BOOLEAN, "-", true),
    CHAR('c', ccz.CHARACTER, "-", true),
    DECIMAL('d', ccz.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', ccz.INTEGRAL, "-#0(", false),
    HEX('x', ccz.INTEGRAL, "-#0(", true),
    FLOAT('f', ccz.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', ccz.FLOAT, "-#0+ (", true),
    GENERAL('g', ccz.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', ccz.FLOAT, "-#0+ ", true);

    public static final ccx[] k = new ccx[26];
    public final char l;
    public final ccz m;
    public final int n;
    public final String o;

    static {
        for (ccx ccxVar : values()) {
            k[a(ccxVar.l)] = ccxVar;
        }
    }

    ccx(char c, ccz cczVar, String str, boolean z) {
        this.l = c;
        this.m = cczVar;
        ccy ccyVar = ccy.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = ccy.a(str.charAt(i2));
            if (iA < 0) {
                throw new IllegalArgumentException("invalid flags: ".concat(str));
            }
            i |= 1 << iA;
        }
        this.n = i;
        this.o = "%" + c;
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
