package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackj extends abxd implements abyr {
    public static final ackj a;
    private static volatile abyy b;
    private int c;
    private aazw d;
    private abac e;
    private abag f;
    private byte g = 2;

    static {
        ackj ackjVar = new ackj();
        a = ackjVar;
        ackjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ackj.class, ackjVar);
    }

    private ackj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0002\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new ackj();
        }
        if (i2 == 4) {
            return new acki();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ackj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
