package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pdb extends abxd implements abyr {
    public static final pdb a;
    private static volatile abyy c;
    public int b;
    private int d;

    static {
        pdb pdbVar = new pdb();
        a = pdbVar;
        pdbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pdb.class, pdbVar);
    }

    private pdb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"d", "b", zsr.a});
        }
        if (i2 == 3) {
            return new pdb();
        }
        if (i2 == 4) {
            return new pda();
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
        synchronized (pdb.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
