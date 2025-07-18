package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybz extends abxd implements abyr {
    private static volatile abyy A;
    public static final abxk a = new ybq();
    public static final ybz b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean i;
    public boolean l;
    public boolean m;
    public boolean n;
    public int p;
    public int q;
    public int r;
    public boolean t;
    public int u;
    public boolean w;
    public int x;
    public int y;
    public boolean z;
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";
    public String o = "";
    public abxj s = abxe.a;
    public String v = "";

    static {
        ybz ybzVar = new ybz();
        b = ybzVar;
        ybzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ybz.class, ybzVar);
    }

    private ybz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\u0017\u0000\u0001\u0001\u001b\u0017\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဈ\u0006\bဈ\u0007\tဇ\b\nဇ\t\u000bဈ\u000b\f᠌\f\r᠌\r\u000eဇ\n\u0012᠌\u0011\u0014ࠞ\u0015ဇ\u0013\u0016င\u0014\u0017ဈ\u0015\u0018ဇ\u0016\u0019᠌\u0017\u001a᠌\u0018\u001bဇ\u0019", new Object[]{"c", "d", yby.a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "o", "p", ybt.a, "q", ybr.a, "n", "r", abna.a, "s", ybu.a, "t", "u", "v", "w", "x", ybw.a, "y", ybx.a, "z"});
        }
        if (i2 == 3) {
            return new ybz();
        }
        if (i2 == 4) {
            return new ybs();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = A;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ybz.class) {
            abwxVar = A;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                A = abwxVar;
            }
        }
        return abwxVar;
    }
}
