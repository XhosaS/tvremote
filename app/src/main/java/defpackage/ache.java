package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ache extends abxd implements abyr {
    public static final ache a;
    public static final abxc b;
    private static volatile abyy f;
    public int c;
    public int d;
    public int e;

    static {
        ache acheVar = new ache();
        a = acheVar;
        acheVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ache.class, acheVar);
        b = new abxc(achk.a, acheVar, acheVar, new abxb(null, 23, acap.MESSAGE, false, false));
    }

    private ache() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new ache();
        }
        if (i2 == 4) {
            return new achd();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ache.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
