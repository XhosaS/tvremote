package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xht extends abxd implements abyr {
    public static final xht a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        xht xhtVar = new xht();
        a = xhtVar;
        xhtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xht.class, xhtVar);
    }

    private xht() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0001\u0000\u0003\u0004\u0002\u0000\u0000\u0001\u0003<\u0000\u0004м\u0000", new Object[]{"c", "b", xho.class, xhm.class});
        }
        if (i2 == 3) {
            return new xht();
        }
        if (i2 == 4) {
            return new xhs();
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
        synchronized (xht.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
