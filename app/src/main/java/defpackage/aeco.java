package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeco extends abxd implements abyr {
    public static final aeco a;
    private static volatile abyy f;
    public int b;
    public long c;
    public abxs d = abzb.b;
    public abvo e = abvo.b;

    static {
        aeco aecoVar = new aeco();
        a = aecoVar;
        aecoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeco.class, aecoVar);
    }

    private aeco() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ည\u0002", new Object[]{"b", "c", "d", aecm.class, "e"});
        }
        if (i2 == 3) {
            return new aeco();
        }
        if (i2 == 4) {
            return new aecn();
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
        synchronized (aeco.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
