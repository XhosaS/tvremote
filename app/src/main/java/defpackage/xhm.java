package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhm extends abwz implements abxa {
    public static final xhm a;
    private static volatile abyy c;
    public xha b;
    private int d;
    private byte e = 2;

    static {
        xhm xhmVar = new xhm();
        a = xhmVar;
        xhmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xhm.class, xhmVar);
    }

    private xhm() {
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
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0004", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new xhm();
        }
        if (i2 == 4) {
            return new xhl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xhm.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
