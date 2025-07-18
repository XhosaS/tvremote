package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahri extends abxd implements abyr {
    public static final ahri a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        ahri ahriVar = new ahri();
        a = ahriVar;
        ahriVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahri.class, ahriVar);
    }

    private ahri() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ahri();
        }
        if (i2 == 4) {
            return new ahrh();
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
        synchronized (ahri.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
