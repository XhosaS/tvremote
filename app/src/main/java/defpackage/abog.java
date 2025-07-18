package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abog extends abwz implements abxa {
    public static final abog a;
    private static volatile abyy c;
    public int b;
    private int d;
    private abps e;
    private byte f = 2;

    static {
        abog abogVar = new abog();
        a = abogVar;
        abogVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abog.class, abogVar);
    }

    private abog() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\n\u0002\u0000\u0000\u0001\u0001᠌\u0000\nᐉ\t", new Object[]{"d", "b", abob.a, "e"});
        }
        if (i2 == 3) {
            return new abog();
        }
        if (i2 == 4) {
            return new abof();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abog.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
