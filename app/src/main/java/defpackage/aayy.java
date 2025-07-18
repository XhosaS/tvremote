package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayy extends abxd implements abyr {
    public static final aayy a;
    private static volatile abyy b;
    private int c;
    private abac d;
    private byte e = 2;

    static {
        aayy aayyVar = new aayy();
        a = aayyVar;
        aayyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aayy.class, aayyVar);
    }

    private aayy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new aayy();
        }
        if (i2 == 4) {
            return new aayx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aayy.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
