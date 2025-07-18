package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeeb extends abxd implements abyr {
    public static final aeeb a;
    private static volatile abyy g;
    public int b;
    public abzy c;
    public abzy d;
    public abzy e;
    public abzy f;

    static {
        aeeb aeebVar = new aeeb();
        a = aeebVar;
        aeebVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeeb.class, aeebVar);
    }

    private aeeb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aeeb();
        }
        if (i2 == 4) {
            return new aeea();
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
        synchronized (aeeb.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
