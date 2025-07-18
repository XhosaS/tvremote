package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjx extends abxd implements abyr {
    public static final adjx a;
    public static final abxc b;
    private static volatile abyy d;
    public abxj c = abxe.a;

    static {
        adjx adjxVar = new adjx();
        a = adjxVar;
        adjxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adjx.class, adjxVar);
        b = new abxc(adkb.a, adjxVar, adjxVar, new abxb(null, 313216766, acap.MESSAGE, false, false));
    }

    private adjx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"c"});
        }
        if (i2 == 3) {
            return new adjx();
        }
        if (i2 == 4) {
            return new adjw();
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
        synchronized (adjx.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
