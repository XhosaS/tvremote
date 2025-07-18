package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylx extends abxd implements abyr {
    public static final ylx a;
    private static volatile abyy d;
    public ylw b;
    public abxs c = abzb.b;
    private int e;

    static {
        ylx ylxVar = new ylx();
        a = ylxVar;
        ylxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylx.class, ylxVar);
    }

    private ylx() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0002\b\u0002\u0000\u0001\u0000\u0002ဉ\u0001\b\u001b", new Object[]{"e", "b", "c", ylw.class});
        }
        if (i2 == 3) {
            return new ylx();
        }
        if (i2 == 4) {
            return new yls();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ylx.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
