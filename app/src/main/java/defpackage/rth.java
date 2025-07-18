package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rth extends abxd implements abyr {
    public static final rth a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        rth rthVar = new rth();
        a = rthVar;
        rthVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rth.class, rthVar);
    }

    private rth() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"c", "b", rtf.class, rtd.class, rtb.class});
        }
        if (i2 == 3) {
            return new rth();
        }
        if (i2 == 4) {
            return new rsz();
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
        synchronized (rth.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
