package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmj extends abxd implements abyr {
    public static final abmj a;
    private static volatile abyy b;
    private int c;
    private aboe d;
    private byte e = 2;

    static {
        abmj abmjVar = new abmj();
        a = abmjVar;
        abmjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmj.class, abmjVar);
    }

    private abmj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0003", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new abmj();
        }
        if (i2 == 4) {
            return new abmi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abmj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
