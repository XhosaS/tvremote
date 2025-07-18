package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjb extends abxd implements abyr {
    public static final adjb a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public int d;

    static {
        adjb adjbVar = new adjb();
        a = adjbVar;
        adjbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjb.class, adjbVar);
        b = new abxc(adjm.a, adjbVar, adjbVar, new abxb(null, 295125038, acap.MESSAGE, false, false));
    }

    private adjb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "d", adja.a});
        }
        if (i2 == 3) {
            return new adjb();
        }
        if (i2 == 4) {
            return new adiz();
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
        synchronized (adjb.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
