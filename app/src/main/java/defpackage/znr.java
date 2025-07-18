package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znr extends abxd implements abyr {
    public static final znr a;
    public static final abxc b;
    private static volatile abyy e;
    public int c;
    public String d = "";

    static {
        znr znrVar = new znr();
        a = znrVar;
        znrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(znr.class, znrVar);
        b = new abxc(zot.a, znrVar, znrVar, new abxb(null, 627, acap.MESSAGE, false, false));
    }

    private znr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new znr();
        }
        if (i2 == 4) {
            return new znq();
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
        synchronized (znr.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
