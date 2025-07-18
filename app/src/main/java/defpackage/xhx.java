package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhx extends abxd implements abyr {
    public static final xhx a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        xhx xhxVar = new xhx();
        a = xhxVar;
        xhxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xhx.class, xhxVar);
    }

    private xhx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", xjr.class});
        }
        if (i2 == 3) {
            return new xhx();
        }
        if (i2 == 4) {
            return new xhw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xhx.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
