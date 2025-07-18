package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abpq extends abxd implements abyr {
    public static final abpq a;
    private static volatile abyy b;
    private abyl c;
    private abyl d;

    static {
        abpq abpqVar = new abpq();
        a = abpqVar;
        abpqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abpq.class, abpqVar);
    }

    private abpq() {
        abyl abylVar = abyl.a;
        this.c = abylVar;
        this.d = abylVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\r\u000e\u0002\u0002\u0000\u0000\r2\u000e2", new Object[]{"c", abpo.a, "d", abpp.a});
        }
        if (i2 == 3) {
            return new abpq();
        }
        if (i2 == 4) {
            return new abpn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abpq.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
