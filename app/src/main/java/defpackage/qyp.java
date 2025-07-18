package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyp extends abxd implements abyr {
    public static final qyp a;
    private static volatile abyy e;
    public String b = "";
    public abxs c = abzb.b;
    public boolean d;
    private int f;

    static {
        qyp qypVar = new qyp();
        a = qypVar;
        qypVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(qyp.class, qypVar);
    }

    private qyp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"f", "b", "c", qym.class, "d"});
        }
        if (i2 == 3) {
            return new qyp();
        }
        if (i2 == 4) {
            return new qyk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (qyp.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
