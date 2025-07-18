package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yju extends abxd implements abyr {
    public static final yju a;
    private static volatile abyy h;
    public int b;
    public boolean e;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        yju yjuVar = new yju();
        a = yjuVar;
        yjuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yju.class, yjuVar);
    }

    private yju() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဇ\u0003\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new yju();
        }
        if (i2 == 4) {
            return new yjt();
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
        synchronized (yju.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
