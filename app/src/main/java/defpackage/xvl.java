package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvl extends abwz implements abxa {
    public static final xvl a;
    private static volatile abyy b;
    private int c;
    private zpn d;
    private byte e = 2;

    static {
        xvl xvlVar = new xvl();
        a = xvlVar;
        xvlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xvl.class, xvlVar);
    }

    private xvl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0001\nᐉ\u0007", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new xvl();
        }
        if (i2 == 4) {
            return new xvk();
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
        synchronized (xvl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
