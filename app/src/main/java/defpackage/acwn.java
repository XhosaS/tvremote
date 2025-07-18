package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwn extends abxd implements abyr {
    public static final acwn a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public int d;
    private int f;

    static {
        acwn acwnVar = new acwn();
        a = acwnVar;
        acwnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acwn.class, acwnVar);
        b = new abxc(acuz.a, acwnVar, acwnVar, new abxb(null, 212323971, acap.MESSAGE, false, false));
    }

    private acwn() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"f", "c", "d"});
        }
        if (i2 == 3) {
            return new acwn();
        }
        if (i2 == 4) {
            return new acwm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acwn.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
