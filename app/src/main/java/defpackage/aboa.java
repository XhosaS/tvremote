package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboa extends abwz implements abxa {
    public static final aboa a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aboa aboaVar = new aboa();
        a = aboaVar;
        aboaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aboa.class, aboaVar);
    }

    private aboa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0001\u0000\u0001\n\u0005\u0000\u0000\u0000\u0001=\u0000\u00025\u0000\u00036\u0000\u0006=\u0000\n<\u0000", new Object[]{"c", "b", abny.class});
        }
        if (i2 == 3) {
            return new aboa();
        }
        if (i2 == 4) {
            return new abnz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aboa.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
