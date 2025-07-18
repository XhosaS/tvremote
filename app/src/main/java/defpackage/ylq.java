package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylq extends abxd implements abyr {
    public static final ylq a;
    private static volatile abyy d;
    public int b;
    public String c = "";

    static {
        ylq ylqVar = new ylq();
        a = ylqVar;
        ylqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylq.class, ylqVar);
    }

    private ylq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ylq();
        }
        if (i2 == 4) {
            return new ylp();
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
        synchronized (ylq.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
