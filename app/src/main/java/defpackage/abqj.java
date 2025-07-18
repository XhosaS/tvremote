package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqj extends abwz implements abxa {
    public static final abqj a;
    private static volatile abyy b;
    private int c;
    private int d;
    private abql e;
    private byte f = 2;

    static {
        abqj abqjVar = new abqj();
        a = abqjVar;
        abqjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abqj.class, abqjVar);
    }

    private abqj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᔉ\u0001", new Object[]{"c", "d", abqi.a, "e"});
        }
        if (i2 == 3) {
            return new abqj();
        }
        if (i2 == 4) {
            return new abqh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abqj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
