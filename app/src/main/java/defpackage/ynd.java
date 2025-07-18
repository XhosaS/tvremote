package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynd extends abxd implements abyr {
    public static final ynd a;
    private static volatile abyy d;
    public int b;
    public int c = 1;

    static {
        ynd yndVar = new ynd();
        a = yndVar;
        yndVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ynd.class, yndVar);
    }

    private ynd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", ync.a});
        }
        if (i2 == 3) {
            return new ynd();
        }
        if (i2 == 4) {
            return new ynb();
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
        synchronized (ynd.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
