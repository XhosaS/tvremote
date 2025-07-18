package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acde extends abxd implements abyr {
    public static final acde a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        acde acdeVar = new acde();
        a = acdeVar;
        acdeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acde.class, acdeVar);
    }

    private acde() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", acdb.class, acdd.class});
        }
        if (i2 == 3) {
            return new acde();
        }
        if (i2 == 4) {
            return new accz();
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
        synchronized (acde.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
