package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsi extends abxd implements abyr {
    public static final wsi a;
    private static volatile abyy g;
    public int b;
    public long e;
    public long c = -1;
    public abxs d = abzb.b;
    public abxj f = abxe.a;

    static {
        wsi wsiVar = new wsi();
        a = wsiVar;
        wsiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(wsi.class, wsiVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဂ\u0001\u0004\u0016", new Object[]{"b", "c", "d", wsg.class, "e", "f"});
        }
        if (i2 == 3) {
            return new wsi();
        }
        if (i2 == 4) {
            return new wsh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (wsi.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
