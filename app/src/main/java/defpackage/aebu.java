package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aebu extends abxd implements abyr {
    public static final aebu a;
    private static volatile abyy e;
    public int b;
    public boolean c;
    public int d;

    static {
        aebu aebuVar = new aebu();
        a = aebuVar;
        aebuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aebu.class, aebuVar);
    }

    private aebu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", aebx.a});
        }
        if (i2 == 3) {
            return new aebu();
        }
        if (i2 == 4) {
            return new aebt();
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
        synchronized (aebu.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
