package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acdb extends abxd implements abyr {
    public static final acdb a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        acdb acdbVar = new acdb();
        a = acdbVar;
        acdbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acdb.class, acdbVar);
    }

    private acdb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", acby.class});
        }
        if (i2 == 3) {
            return new acdb();
        }
        if (i2 == 4) {
            return new acda();
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
        synchronized (acdb.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
