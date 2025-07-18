package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgx extends abxd implements abyr {
    public static final pgx a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        pgx pgxVar = new pgx();
        a = pgxVar;
        pgxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pgx.class, pgxVar);
    }

    private pgx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", pgv.class});
        }
        if (i2 == 3) {
            return new pgx();
        }
        if (i2 == 4) {
            return new pgw();
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
        synchronized (pgx.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
