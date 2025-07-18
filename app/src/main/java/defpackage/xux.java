package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xux extends abxd implements abyr {
    public static final xux a;
    private static volatile abyy d;
    public int b;
    public int c;
    private int e;

    static {
        xux xuxVar = new xux();
        a = xuxVar;
        xuxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xux.class, xuxVar);
    }

    private xux() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"e", "b", abna.a, "c"});
        }
        if (i2 == 3) {
            return new xux();
        }
        if (i2 == 4) {
            return new xuw();
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
        synchronized (xux.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
