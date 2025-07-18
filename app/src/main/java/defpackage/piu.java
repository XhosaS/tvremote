package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class piu extends abxd implements abyr {
    public static final piu a;
    private static volatile abyy e;
    public abyl b;
    public abyl c;
    public abxs d;

    static {
        piu piuVar = new piu();
        a = piuVar;
        piuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(piu.class, piuVar);
    }

    private piu() {
        abyl abylVar = abyl.a;
        this.b = abylVar;
        this.c = abylVar;
        this.d = abzb.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0001\u0000\u00012\u00022\u0003\u001b", new Object[]{"b", pis.a, "c", pit.a, "d", pia.class});
        }
        if (i2 == 3) {
            return new piu();
        }
        if (i2 == 4) {
            return new pir();
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
        synchronized (piu.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
