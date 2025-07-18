package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoh extends abxd implements abyr {
    public static final zoh a;
    private static volatile abyy g;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public long f;

    static {
        zoh zohVar = new zoh();
        a = zohVar;
        zohVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zoh.class, zohVar);
    }

    private zoh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဇ\u0002\u0005ဂ\u0004", new Object[]{"b", "c", tft.a, "d", zoc.a, "e", "f"});
        }
        if (i2 == 3) {
            return new zoh();
        }
        if (i2 == 4) {
            return new zog();
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
        synchronized (zoh.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
