package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjp extends abxd implements abyr {
    public static final adjp a;
    private static volatile abyy f;
    public int b;
    public int c;
    public boolean d;
    public String e = "";

    static {
        adjp adjpVar = new adjp();
        a = adjpVar;
        adjpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjp.class, adjpVar);
    }

    private adjp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", adjo.a, "d", "e"});
        }
        if (i2 == 3) {
            return new adjp();
        }
        if (i2 == 4) {
            return new adjn();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adjp.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
