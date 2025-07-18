package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class advz extends abxd implements abyr {
    public static final advz a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        advz advzVar = new advz();
        a = advzVar;
        advzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(advz.class, advzVar);
    }

    private advz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001;\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new advz();
        }
        if (i2 == 4) {
            return new advy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (advz.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
