package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxs extends abxd implements abyr {
    public static final rxs a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public long e;
    public int c = 0;
    private byte g = 2;

    static {
        rxs rxsVar = new rxs();
        a = rxsVar;
        rxsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rxs.class, rxsVar);
    }

    private rxs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဂ\u0000\u0002м\u0000\u0003<\u0000\u0004м\u0000", new Object[]{"d", "c", "b", "e", rye.class, ryi.class, ryg.class});
        }
        if (i2 == 3) {
            return new rxs();
        }
        if (i2 == 4) {
            return new rxr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rxs.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
