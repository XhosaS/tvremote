package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahoy extends abxd implements abyr {
    public static final ahoy a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public long d;
    public long e;

    static {
        ahoy ahoyVar = new ahoy();
        a = ahoyVar;
        ahoyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahoy.class, ahoyVar);
        b = new abxc(epd.a, ahoyVar, ahoyVar, new abxb(null, 465529016, acap.MESSAGE, false, false));
    }

    private ahoy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new ahoy();
        }
        if (i2 == 4) {
            return new ahox();
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
        synchronized (ahoy.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
