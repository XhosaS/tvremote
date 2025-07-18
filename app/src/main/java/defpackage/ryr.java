package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryr extends abwz implements abxa {
    public static final ryr a;
    private static volatile abyy f;
    public int b;
    public int c;
    public int d;
    public int e;
    private byte g = 2;

    static {
        ryr ryrVar = new ryr();
        a = ryrVar;
        ryrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ryr.class, ryrVar);
    }

    private ryr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new ryr();
        }
        if (i2 == 4) {
            return new ryq();
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
        synchronized (ryr.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
