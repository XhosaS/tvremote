package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xps extends abxd implements abyr {
    public static final xps a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        xps xpsVar = new xps();
        a = xpsVar;
        xpsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xps.class, xpsVar);
    }

    private xps() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"c", "b", xpm.class});
        }
        if (i2 == 3) {
            return new xps();
        }
        if (i2 == 4) {
            return new xpr();
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
        synchronized (xps.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
