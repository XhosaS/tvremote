package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykh extends abxd implements abyr {
    public static final ykh a;
    private static volatile abyy e;
    public int b;
    public yko c;
    public yme d;

    static {
        ykh ykhVar = new ykh();
        a = ykhVar;
        ykhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ykh.class, ykhVar);
    }

    private ykh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ykh();
        }
        if (i2 == 4) {
            return new ykg();
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
        synchronized (ykh.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
