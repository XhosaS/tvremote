package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erz extends abxd implements abyr {
    public static final erz a;
    private static volatile abyy b;
    private int c;
    private abyl d = abyl.a;
    private esc e;

    static {
        erz erzVar = new erz();
        a = erzVar;
        erzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(erz.class, erzVar);
    }

    private erz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0001\u0000\u0000\u00042\u0005ဉ\u0003", new Object[]{"c", "d", ery.a, "e"});
        }
        if (i2 == 3) {
            return new erz();
        }
        if (i2 == 4) {
            return new erx();
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
        synchronized (erz.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
