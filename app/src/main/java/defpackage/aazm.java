package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazm extends abxd implements abyr {
    public static final aazm a;
    private static volatile abyy b;
    private int c;
    private int d;
    private aazw e;
    private aazw f;
    private byte g = 2;

    static {
        aazm aazmVar = new aazm();
        a = aazmVar;
        aazmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aazm.class, aazmVar);
    }

    private aazm() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aazm();
        }
        if (i2 == 4) {
            return new aazl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aazm.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
