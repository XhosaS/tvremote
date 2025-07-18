package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xmk extends abxd implements abyr {
    public static final xmk a;
    private static volatile abyy t;
    public int b;
    public Object d;
    public int i;
    public int j;
    public int k;
    public xal l;
    public int m;
    public int n;
    public int o;
    public abxs q;
    public abxs r;
    public String s;
    private xaj u;
    public int c = 0;
    private byte v = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String p = "";

    static {
        xmk xmkVar = new xmk();
        a = xmkVar;
        xmkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xmk.class, xmkVar);
    }

    private xmk() {
        abzb abzbVar = abzb.b;
        this.q = abzbVar;
        this.r = abzbVar;
        this.s = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.v);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0015\u0001\u0001\u0001)\u0015\u0000\u0002\u0004\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0005\u0005င\u0006\u0006᠌\t\bᐉ\n\tင\u000b\nဈ\u0002\fင\u000f\rင\u0010\u0010ဈ\u0013\u0012<\u0000\u0013င\b\u0015Л\u001a<\u0000\u001b<\u0000$ᐉ\u001a%<\u0000&Л(ဈ\u001b)<\u0000", new Object[]{"d", "c", "b", "e", "f", "h", "i", "k", xmi.a, "l", "m", "g", "n", "o", "p", xmo.class, "j", "q", xmg.class, xmq.class, xmu.class, "u", xms.class, "r", xmm.class, "s", xma.class});
        }
        if (i2 == 3) {
            return new xmk();
        }
        if (i2 == 4) {
            return new xmh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.v = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = t;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xmk.class) {
            abwxVar = t;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                t = abwxVar;
            }
        }
        return abwxVar;
    }
}
