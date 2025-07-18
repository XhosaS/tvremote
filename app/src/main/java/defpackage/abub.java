package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abub extends abxd implements abyr {
    public static final abub a;
    private static volatile abyy f;
    public int b;
    public abqx c;
    public int e;
    private byte g = 2;
    public abxj d = abxe.a;

    static {
        abub abubVar = new abub();
        a = abubVar;
        abubVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abub.class, abubVar);
    }

    private abub() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0004\u000e\u0003\u0000\u0001\u0001\u0004ᐉ\u0000\b'\u000eဌ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abub();
        }
        if (i2 == 4) {
            return new abua();
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
        synchronized (abub.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
