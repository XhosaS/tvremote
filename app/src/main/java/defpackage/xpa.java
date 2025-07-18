package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpa extends abxd implements abyr {
    public static final xpa a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public abzy e;
    public int c = 0;
    private byte g = 2;

    static {
        xpa xpaVar = new xpa();
        a = xpaVar;
        xpaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xpa.class, xpaVar);
    }

    private xpa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0003\u0001м\u0000\u0002<\u0000\u0003м\u0000\u0004ဉ\u0000\u0005<\u0000\u0006<\u0000\u0007м\u0000\b<\u0000", new Object[]{"d", "c", "b", xdz.class, xoy.class, xds.class, "e", xeu.class, xbz.class, xdl.class, xfy.class});
        }
        if (i2 == 3) {
            return new xpa();
        }
        if (i2 == 4) {
            return new xoz();
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
        synchronized (xpa.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
