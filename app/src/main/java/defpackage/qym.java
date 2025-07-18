package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qym extends abxd implements abyr {
    public static final qym a;
    private static volatile abyy d;
    public int b;
    public String c = "";
    private int e;

    static {
        qym qymVar = new qym();
        a = qymVar;
        qymVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(qym.class, qymVar);
    }

    private qym() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"e", "b", qyn.a, "c"});
        }
        if (i2 == 3) {
            return new qym();
        }
        if (i2 == 4) {
            return new qyl();
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
        synchronized (qym.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
