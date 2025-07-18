package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pgk extends abxd implements abyr {
    public static final pgk a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        pgk pgkVar = new pgk();
        a = pgkVar;
        pgkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pgk.class, pgkVar);
    }

    private pgk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", pgj.a});
        }
        if (i2 == 3) {
            return new pgk();
        }
        if (i2 == 4) {
            return new pgi();
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
        synchronized (pgk.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
