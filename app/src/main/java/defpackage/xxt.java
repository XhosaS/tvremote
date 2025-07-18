package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxt extends abxd implements abyr {
    public static final xxt a;
    private static volatile abyy d;
    public int b;
    public int c;
    private int e;

    static {
        xxt xxtVar = new xxt();
        a = xxtVar;
        xxtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xxt.class, xxtVar);
    }

    private xxt() {
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"e", "b", xxr.a, "c"});
        }
        if (i2 == 3) {
            return new xxt();
        }
        if (i2 == 4) {
            return new xxq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xxt.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
