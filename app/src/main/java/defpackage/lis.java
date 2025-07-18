package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lis extends abxd implements abyr {
    public static final lis a;
    private static volatile abyy j;
    public int b;
    public int c;
    public String d = "";
    public abxs e = abzb.b;
    public liy f;
    public boolean g;
    public boolean h;
    public boolean i;

    static {
        lis lisVar = new lis();
        a = lisVar;
        lisVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lis.class, lisVar);
    }

    private lis() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"b", "c", "d", "e", liu.class, "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new lis();
        }
        if (i2 == 4) {
            return new lir();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lis.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
