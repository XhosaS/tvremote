package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeci extends abwz implements abxa {
    public static final aeci a;
    private static volatile abyy f;
    public int b;
    public acpx c;
    public int d;
    public abiw e;
    private byte g = 2;

    static {
        aeci aeciVar = new aeci();
        a = aeciVar;
        aeciVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aeci.class, aeciVar);
    }

    private aeci() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", aecg.a, "e"});
        }
        if (i2 == 3) {
            return new aeci();
        }
        if (i2 == 4) {
            return new aecf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aeci.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
