package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xey extends abxd implements abyr {
    public static final xey a;
    public static volatile abyy b;
    public boolean c;
    private int d;

    static {
        xey xeyVar = new xey();
        a = xeyVar;
        xeyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xey.class, xeyVar);
    }

    private xey() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "c"});
        }
        if (i2 == 3) {
            return new xey();
        }
        if (i2 == 4) {
            return new xex();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xey.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
