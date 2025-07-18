package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfc extends abxd implements abyr {
    public static final adfc a;
    public static final abxc b;
    private static volatile abyy g;
    public adey d;
    public boolean e;
    private int h;
    public int c = 1;
    public String f = "";

    static {
        adfc adfcVar = new adfc();
        a = adfcVar;
        adfcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfc.class, adfcVar);
        b = new abxc(aczf.a, adfcVar, adfcVar, new abxb(null, 365954384, acap.MESSAGE, false, false));
    }

    private adfc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0001\u0004ဇ\u0002\u0005ဈ\u0003", new Object[]{"h", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new adfc();
        }
        if (i2 == 4) {
            return new adfb();
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
        synchronized (adfc.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
