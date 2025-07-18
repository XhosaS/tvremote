package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achi extends abxd implements abyr {
    public static final achi a;
    private static volatile abyy g;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public String f = "";

    static {
        achi achiVar = new achi();
        a = achiVar;
        achiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(achi.class, achiVar);
    }

    private achi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", achf.a, "f"});
        }
        if (i2 == 3) {
            return new achi();
        }
        if (i2 == 4) {
            return new achh();
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
        synchronized (achi.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
