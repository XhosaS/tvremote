package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsu extends abxd implements abyr {
    public static final rsu a;
    private static volatile abyy h;
    public int b;
    public int c = 0;
    public Object d;
    public rth e;
    public long f;
    public int g;

    static {
        rsu rsuVar = new rsu();
        a = rsuVar;
        rsuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rsu.class, rsuVar);
    }

    private rsu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဂ\u0001\u0005င\u0002\u0007<\u0000", new Object[]{"d", "c", "b", rss.class, rtj.class, "e", "f", "g", rsw.class});
        }
        if (i2 == 3) {
            return new rsu();
        }
        if (i2 == 4) {
            return new rst();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rsu.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
