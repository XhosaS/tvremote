package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahtj extends abxd implements abyr {
    public static final ahtj a;
    private static volatile abyy g;
    public int b;
    public String c = "";
    public long d;
    public long e;
    public long f;

    static {
        ahtj ahtjVar = new ahtj();
        a = ahtjVar;
        ahtjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahtj.class, ahtjVar);
    }

    private ahtj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new ahtj();
        }
        if (i2 == 4) {
            return new ahti();
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
        synchronized (ahtj.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
