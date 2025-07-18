package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlb extends abxd implements abyr {
    public static final abxk a = new xkz();
    public static final xlb b;
    private static volatile abyy f;
    public int c;
    public abxj d = abxe.a;
    public boolean e;

    static {
        xlb xlbVar = new xlb();
        b = xlbVar;
        xlbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xlb.class, xlbVar);
    }

    private xlb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001ࠞ\u0004ဇ\u0002", new Object[]{"c", "d", acky.a, "e"});
        }
        if (i2 == 3) {
            return new xlb();
        }
        if (i2 == 4) {
            return new xla();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xlb.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
