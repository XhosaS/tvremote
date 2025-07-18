package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ypp extends abxd implements abyr {
    public static final ypp a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        ypp yppVar = new ypp();
        a = yppVar;
        yppVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ypp.class, yppVar);
    }

    private ypp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", aayq.class});
        }
        if (i2 == 3) {
            return new ypp();
        }
        if (i2 == 4) {
            return new ypo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ypp.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
