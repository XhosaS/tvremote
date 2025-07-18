package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablx extends abxd implements abyr {
    public static final ablx a;
    private static volatile abyy b;
    private int c;
    private ablp d;
    private byte e = 2;

    static {
        ablx ablxVar = new ablx();
        a = ablxVar;
        ablxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ablx.class, ablxVar);
    }

    private ablx() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001ee\u0001\u0000\u0000\u0001eᐉ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new ablx();
        }
        if (i2 == 4) {
            return new ablw();
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
        synchronized (ablx.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
