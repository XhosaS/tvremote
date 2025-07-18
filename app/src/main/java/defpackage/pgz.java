package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgz extends abxd implements abyr {
    public static final pgz a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public long d;
    public long e;

    static {
        pgz pgzVar = new pgz();
        a = pgzVar;
        pgzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pgz.class, pgzVar);
        b = new abxc(pgp.a, pgzVar, pgzVar, new abxb(null, 1000, acap.MESSAGE, false, false));
    }

    private pgz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new pgz();
        }
        if (i2 == 4) {
            return new pgy();
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
        synchronized (pgz.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
