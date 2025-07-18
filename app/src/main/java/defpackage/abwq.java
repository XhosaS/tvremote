package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abwq extends abxd implements abyr {
    public static final abwq a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        abwq abwqVar = new abwq();
        a = abwqVar;
        abwqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abwq.class, abwqVar);
    }

    private abwq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abwq();
        }
        if (i2 == 4) {
            return new abwp();
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
        synchronized (abwq.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
