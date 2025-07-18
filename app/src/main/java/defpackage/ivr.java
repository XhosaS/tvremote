package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ivr extends abxd implements abyr {
    public static final ivr a;
    private static volatile abyy f;
    public int b;
    public abzy c;
    public boolean d;
    public int e;

    static {
        ivr ivrVar = new ivr();
        a = ivrVar;
        ivrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ivr.class, ivrVar);
    }

    private ivr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဇ\u0001\u0004င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ivr();
        }
        if (i2 == 4) {
            return new ivq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ivr.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
