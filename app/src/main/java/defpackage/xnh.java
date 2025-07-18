package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnh extends abxd implements abyr {
    public static final xnh a;
    public static final abxc b;
    private static volatile abyy d;
    public int c;
    private int e;

    static {
        xnh xnhVar = new xnh();
        a = xnhVar;
        xnhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xnh.class, xnhVar);
        b = new abxc(xnj.a, xnhVar, xnhVar, new abxb(null, 444390286, acap.MESSAGE, false, false));
    }

    private xnh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"e", "c", acbm.a});
        }
        if (i2 == 3) {
            return new xnh();
        }
        if (i2 == 4) {
            return new xng();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xnh.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
