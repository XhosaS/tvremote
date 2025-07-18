package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adeq extends abxd implements abyr {
    public static final adeq a;
    private static volatile abyy j;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i = "";

    static {
        adeq adeqVar = new adeq();
        a = adeqVar;
        adeqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adeq.class, adeqVar);
    }

    private adeq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new adeq();
        }
        if (i2 == 4) {
            return new adep();
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
        synchronized (adeq.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
