package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqe extends abxd implements abyr {
    public static final xqe a;
    private static volatile abyy j;
    public int b;
    public xal d;
    public int h;
    private byte k = 2;
    public String c = "";
    public abxs e = abzb.b;
    public String f = "";
    public int g = 1;
    public String i = "";

    static {
        xqe xqeVar = new xqe();
        a = xqeVar;
        xqeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xqe.class, xqeVar);
    }

    private xqe() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0002\u0001ဈ\u0000\u0003ᐉ\u0002\u0007Л\bဈ\u0005\t᠌\u0006\n᠌\u0007\u000bဈ\b", new Object[]{"b", "c", "d", "e", xly.class, "f", "g", xqc.a, "h", xqa.a, "i"});
        }
        if (i2 == 3) {
            return new xqe();
        }
        if (i2 == 4) {
            return new xpz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xqe.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
