package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class advt extends abxd implements abyr {
    public static final advt a;
    private static volatile abyy d;
    public String b = "";
    public abxs c = abzb.b;
    private int e;

    static {
        advt advtVar = new advt();
        a = advtVar;
        advtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(advt.class, advtVar);
    }

    private advt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"e", "b", "c", advs.class});
        }
        if (i2 == 3) {
            return new advt();
        }
        if (i2 == 4) {
            return new advq();
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
        synchronized (advt.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
