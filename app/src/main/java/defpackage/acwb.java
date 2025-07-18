package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwb extends abxd implements abyr {
    public static final acwb a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        acwb acwbVar = new acwb();
        a = acwbVar;
        acwbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acwb.class, acwbVar);
    }

    private acwb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", acwd.class});
        }
        if (i2 == 3) {
            return new acwb();
        }
        if (i2 == 4) {
            return new acwa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acwb.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
