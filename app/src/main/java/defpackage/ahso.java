package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahso extends abxd implements abyr {
    public static final ahso a;
    private static volatile abyy z;
    public int b;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public ahua l;
    public int m;
    public ahsk n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public abxm v;
    public String w;
    public ahsx x;
    public long y;
    private byte A = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        ahso ahsoVar = new ahso();
        a = ahsoVar;
        ahsoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahso.class, ahsoVar);
    }

    private ahso() {
        Object[] objArr = abzb.a;
        this.u = "";
        this.v = abyf.a;
        this.w = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.A);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0017\u0000\u0001\u0001\u001c\u0017\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001b᠌\f\u001cဂ\u0018", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", ahsu.a, "l", "n", "p", "q", ahsv.a, "r", ahss.a, "t", "u", "s", "w", "v", "x", "m", ahsm.a, "e", "o", ahsr.a, "y"});
        }
        if (i2 == 3) {
            return new ahso();
        }
        if (i2 == 4) {
            return new ahsl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.A = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = z;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahso.class) {
            abwxVar = z;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                z = abwxVar;
            }
        }
        return abwxVar;
    }
}
