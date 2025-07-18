package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum tvq {
    STRING('s', tvs.GENERAL, "-#", true),
    BOOLEAN('b', tvs.BOOLEAN, "-", true),
    CHAR('c', tvs.CHARACTER, "-", true),
    DECIMAL('d', tvs.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', tvs.INTEGRAL, "-#0(", false),
    HEX('x', tvs.INTEGRAL, "-#0(", true),
    FLOAT('f', tvs.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', tvs.FLOAT, "-#0+ (", true),
    GENERAL('g', tvs.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', tvs.FLOAT, "-#0+ ", true);

    public static final tvq[] k = new tvq[26];
    public final char l;
    public final tvs m;
    public final int n;
    public final String o;

    static {
        for (tvq tvqVar : values()) {
            k[a(tvqVar.l)] = tvqVar;
        }
    }

    tvq(char c, tvs tvsVar, String str, boolean z) {
        this.l = c;
        this.m = tvsVar;
        tvr tvrVar = tvr.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = tvr.a(str.charAt(i2));
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
