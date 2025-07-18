package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lje extends abxd implements abyr {
    public static final lje a;
    private static volatile abyy g;
    public int b;
    public int c;
    public boolean e;
    public String d = "";
    public abxs f = abzb.b;

    static {
        lje ljeVar = new lje();
        a = ljeVar;
        ljeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lje.class, ljeVar);
    }

    private lje() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"b", "c", ljc.a, "d", "e", "f"});
        }
        if (i2 == 3) {
            return new lje();
        }
        if (i2 == 4) {
            return new ljb();
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
        synchronized (lje.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
