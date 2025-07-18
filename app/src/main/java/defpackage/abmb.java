package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmb extends abwz implements abxa {
    public static final abmb a;
    private static volatile abyy b;
    private int c;
    private abac d;
    private aazw e;
    private byte f = 2;

    static {
        abmb abmbVar = new abmb();
        a = abmbVar;
        abmbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmb.class, abmbVar);
    }

    private abmb() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new abmb();
        }
        if (i2 == 4) {
            return new abma();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abmb.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
