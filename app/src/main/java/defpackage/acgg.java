package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgg extends abxd implements abyr {
    public static final acgg a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public xky d;

    static {
        acgg acggVar = new acgg();
        a = acggVar;
        acggVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acgg.class, acggVar);
        b = new abxc(achk.a, acggVar, acggVar, new abxb(null, 449863242, acap.MESSAGE, false, false));
    }

    private acgg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acgg();
        }
        if (i2 == 4) {
            return new acgf();
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
        synchronized (acgg.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
