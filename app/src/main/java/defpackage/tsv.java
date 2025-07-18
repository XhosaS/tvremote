package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tsv extends abxd implements abyr {
    public static final tsv a;
    private static volatile abyy b;
    private abyl c = abyl.a;

    static {
        tsv tsvVar = new tsv();
        a = tsvVar;
        tsvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(tsv.class, tsvVar);
    }

    private tsv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", tst.a});
        }
        if (i2 == 3) {
            return new tsv();
        }
        if (i2 == 4) {
            return new tsu();
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
        synchronized (tsv.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
