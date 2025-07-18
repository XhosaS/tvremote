package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahut extends abxd implements abyr {
    public static final ahut a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;

    static {
        ahut ahutVar = new ahut();
        a = ahutVar;
        ahutVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahut.class, ahutVar);
    }

    private ahut() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001", new Object[]{"b", "c", ahur.a, "d"});
        }
        if (i2 == 3) {
            return new ahut();
        }
        if (i2 == 4) {
            return new ahuq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahut.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
