package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjf extends abxd implements abyr {
    public static final adjf a;
    public static final abxc b;
    private static volatile abyy g;
    public int c;
    public int d;
    public float e;
    public int f = 1;

    static {
        adjf adjfVar = new adjf();
        a = adjfVar;
        adjfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjf.class, adjfVar);
        b = new abxc(adkb.a, adjfVar, adjfVar, new abxb(null, 293100, acap.MESSAGE, false, false));
    }

    private adjf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ခ\u0001\u0003᠌\u0000\u0004င\u0002", new Object[]{"c", "e", "d", adir.a, "f"});
        }
        if (i2 == 3) {
            return new adjf();
        }
        if (i2 == 4) {
            return new adje();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adjf.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
