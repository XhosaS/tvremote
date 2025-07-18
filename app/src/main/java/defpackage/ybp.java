package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ybp extends abxd implements abyr {
    public static final abxk a = new ybg();
    public static final ybp b;
    private static volatile abyy k;
    public int c;
    public int d;
    public boolean e;
    public int f;
    public abxj g = abxe.a;
    public ygm h;
    public int i;
    public boolean j;

    static {
        ybp ybpVar = new ybp();
        b = ybpVar;
        ybpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ybp.class, ybpVar);
    }

    private ybp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004ࠬ\u0005ဉ\u0003\u0007᠌\u0005\bဇ\u0006", new Object[]{"c", "d", ybn.a, "e", "f", ybm.a, "g", ybk.a, "h", "i", ybi.a, "j"});
        }
        if (i2 == 3) {
            return new ybp();
        }
        if (i2 == 4) {
            return new ybh();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ybp.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
