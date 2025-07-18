package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xan extends abxd implements abyr {
    public static final xan a;
    private static volatile abyy d;
    public int b;
    public xgw c;
    private byte e = 2;

    static {
        xan xanVar = new xan();
        a = xanVar;
        xanVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xan.class, xanVar);
    }

    private xan() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဉ\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xan();
        }
        if (i2 == 4) {
            return new xam();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xan.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
