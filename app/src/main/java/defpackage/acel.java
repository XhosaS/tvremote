package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acel extends abxd implements abyr {
    public static final acel a;
    private static volatile abyy f;
    public int b;
    public abxs c = abzb.b;
    public long d;
    public acek e;

    static {
        acel acelVar = new acel();
        a = acelVar;
        acelVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acel.class, acelVar);
    }

    private acel() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဂ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new acel();
        }
        if (i2 == 4) {
            return new acei();
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
        synchronized (acel.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
