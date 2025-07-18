package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycq extends abxd implements abyr {
    private static volatile abyy B;
    public static final abxk a = new ycc();
    public static final abxk b = new ycd();
    public static final ycq c;
    public boolean A;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public abxj l;
    public abxj m;
    public abxs n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public abxs w;
    public boolean x;
    public boolean y;
    public long z;

    static {
        ycq ycqVar = new ycq();
        c = ycqVar;
        ycqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ycq.class, ycqVar);
    }

    private ycq() {
        abxe abxeVar = abxe.a;
        this.l = abxeVar;
        this.m = abxeVar;
        abzb abzbVar = abzb.b;
        this.n = abzbVar;
        this.w = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            abxh abxhVar = ycn.a;
            abxh abxhVar2 = ycf.a;
            abxh abxhVar3 = ycj.a;
            return new abzc(c, "\u0004\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bࠞ\tࠞ\n\u001b\u000b᠌\u0007\f᠌\b\r᠌\t\u000e᠌\n\u000f᠌\u000b\u0010᠌\f\u0011᠌\r\u0012᠌\u000e\u0013\u001b\u0014ဇ\u000f\u0015ဇ\u0010\u0016ဂ\u0011\u0017ဇ\u0012", new Object[]{"d", "e", ych.a, "f", "g", "h", abxhVar, "i", yci.a, "j", "k", "l", adzc.a, "m", adze.a, "n", ygm.class, "o", adzj.a, "p", abxhVar2, "q", yco.a, "r", abxhVar, "s", abxhVar2, "t", ybr.a, "u", abxhVar3, "v", abxhVar3, "w", ycm.class, "x", "y", "z", "A"});
        }
        if (i2 == 3) {
            return new ycq();
        }
        if (i2 == 4) {
            return new yce();
        }
        if (i2 == 5) {
            return c;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = B;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ycq.class) {
            abwxVar = B;
            if (abwxVar == null) {
                abwxVar = new abwx(c);
                B = abwxVar;
            }
        }
        return abwxVar;
    }
}
