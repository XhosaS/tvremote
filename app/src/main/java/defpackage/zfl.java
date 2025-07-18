package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum zfl {
    STRING('s', zfn.GENERAL, "-#", true),
    BOOLEAN('b', zfn.BOOLEAN, "-", true),
    CHAR('c', zfn.CHARACTER, "-", true),
    DECIMAL('d', zfn.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', zfn.INTEGRAL, "-#0(", false),
    HEX('x', zfn.INTEGRAL, "-#0(", true),
    FLOAT('f', zfn.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', zfn.FLOAT, "-#0+ (", true),
    GENERAL('g', zfn.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', zfn.FLOAT, "-#0+ ", true);

    public static final zfl[] k = new zfl[26];
    public final char l;
    public final zfn m;
    public final int n;
    public final String o;

    static {
        for (zfl zflVar : values()) {
            k[a(zflVar.l)] = zflVar;
        }
    }

    zfl(char c, zfn zfnVar, String str, boolean z) {
        this.l = c;
        this.m = zfnVar;
        zfm zfmVar = zfm.a;
        int i = true != z ? 0 : 128;
        for (int i2 = 0; i2 < str.length(); i2++) {
            int iA = zfm.a(str.charAt(i2));
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
