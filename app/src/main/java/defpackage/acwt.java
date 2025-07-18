package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwt extends abxd implements abyr {
    public static final acwt a;
    private static volatile abyy g;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public acvi f;

    static {
        acwt acwtVar = new acwt();
        a = acwtVar;
        acwtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acwt.class, acwtVar);
    }

    private acwt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", acws.a, "e", acwr.a, "f"});
        }
        if (i2 == 3) {
            return new acwt();
        }
        if (i2 == 4) {
            return new acwq();
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
        synchronized (acwt.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
