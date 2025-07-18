package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acul extends abxd implements abyr {
    public static final acul a;
    public static final abxc b;
    private static volatile abyy e;
    public abxs c = abzb.b;
    public int d;
    private int f;

    static {
        acul aculVar = new acul();
        a = aculVar;
        aculVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acul.class, aculVar);
        b = new abxc(acuz.a, aculVar, aculVar, new abxb(null, 188490103, acap.MESSAGE, false, false));
    }

    private acul() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"f", "c", acun.class, "d"});
        }
        if (i2 == 3) {
            return new acul();
        }
        if (i2 == 4) {
            return new acuk();
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
        synchronized (acul.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
