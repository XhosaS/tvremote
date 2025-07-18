package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayp extends abxd implements abyr {
    public static final aayp a;
    private static volatile abyy e;
    public int b;
    public abxs c = abzb.b;
    public aayo d;

    static {
        aayp aaypVar = new aayp();
        a = aaypVar;
        aaypVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aayp.class, aaypVar);
    }

    private aayp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", aaym.class, "d"});
        }
        if (i2 == 3) {
            return new aayp();
        }
        if (i2 == 4) {
            return new aayk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aayp.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
