package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwb extends abxd implements abyr {
    public static final xwb a;
    private static volatile abyy e;
    public int b;
    public xvd c;
    public xvg d;
    private byte f = 2;

    static {
        xwb xwbVar = new xwb();
        a = xwbVar;
        xwbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xwb.class, xwbVar);
    }

    private xwb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xwb();
        }
        if (i2 == 4) {
            return new xwa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xwb.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
