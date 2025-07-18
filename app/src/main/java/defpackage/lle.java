package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lle extends abxd implements abyr {
    public static final lle a;
    private static volatile abyy af;
    public String A;
    public String B;
    public boolean C;
    public abxs D;
    public String E;
    public int F;
    public String G;
    public long H;
    public String I;
    public int J;
    public llg K;
    public abxj L;
    public long M;
    public long N;
    public String O;
    public String P;
    public abxs Q;
    public String R;
    public long S;
    public boolean T;
    public String U;
    public boolean V;
    public String W;
    public int X;
    public lki Y;
    public int Z;
    public lkg aa;
    public lls ab;
    public long ac;
    public String ad;
    public lks ae;
    public int b;
    public int c;
    public int d;
    public abxs e;
    public abxs f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public String l;
    public String m;
    public String n;
    public String o;
    public int p;
    public String q;
    public String r;
    public String s;
    public long t;
    public long u;
    public String v;
    public boolean w;
    public String x;
    public long y;
    public int z;

    static {
        lle lleVar = new lle();
        a = lleVar;
        lleVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lle.class, lleVar);
    }

    private lle() {
        abzb abzbVar = abzb.b;
        this.e = abzbVar;
        this.f = abzbVar;
        this.l = "";
        this.m = "";
        this.n = "";
        this.o = "";
        this.q = "";
        this.r = "";
        this.s = "";
        this.v = "";
        this.x = "";
        this.A = "";
        this.B = "";
        this.D = abzbVar;
        this.E = "";
        this.G = "";
        this.I = "";
        this.L = abxe.a;
        this.O = "";
        this.P = "";
        this.Q = abzbVar;
        this.R = "";
        this.U = "";
        this.W = "";
        this.ad = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u00046\u0000\u0002\u0001V6\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019\"ဈ\u001c#ဂ\u001d%ဈ\u001f'င!,ဉ#-\u001d.ဂ$/ဂ%4ဈ'?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Lဉ6Mင7Oဉ8Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"b", "c", "d", "e", lkw.class, "f", llu.class, "g", "h", "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "j", "C", "D", lkk.class, "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "aa", "ab", "ac", "ad", "ae"});
        }
        if (i2 == 3) {
            return new lle();
        }
        if (i2 == 4) {
            return new lld();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = af;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lle.class) {
            abwxVar = af;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                af = abwxVar;
            }
        }
        return abwxVar;
    }
}
