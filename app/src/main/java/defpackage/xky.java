package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xky extends abxd implements abyr {
    public static final xky a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        xky xkyVar = new xky();
        a = xkyVar;
        xkyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xky.class, xkyVar);
    }

    private xky() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0000\u0000\u0001ဈ\u0004\u0002ဈ\u0002\bဈ\u0003\rဈ\u0001", new Object[]{"b", "f", "d", "e", "c"});
        }
        if (i2 == 3) {
            return new xky();
        }
        if (i2 == 4) {
            return new xkx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xky.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
