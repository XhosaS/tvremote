package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfa extends abxd implements abyr {
    public static final adfa a;
    public static final abxc b;
    private static volatile abyy g;
    public int c = 1;
    public adey d;
    public boolean e;
    public boolean f;
    private int h;

    static {
        adfa adfaVar = new adfa();
        a = adfaVar;
        adfaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfa.class, adfaVar);
        b = new abxc(aczf.a, adfaVar, adfaVar, new abxb(null, 369275142, acap.MESSAGE, false, false));
    }

    private adfa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0001\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{"h", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new adfa();
        }
        if (i2 == 4) {
            return new adez();
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
        synchronized (adfa.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
