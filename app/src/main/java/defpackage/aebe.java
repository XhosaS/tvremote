package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aebe extends abxd implements abyr {
    public static final aebe a;
    private static volatile abyy h;
    public int b;
    public boolean e;
    public int f;
    private int i;
    public String c = "";
    public String d = "";
    public abvo g = abvo.b;

    static {
        aebe aebeVar = new aebe();
        a = aebeVar;
        aebeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aebe.class, aebeVar);
    }

    private aebe() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ည\u0005", new Object[]{"i", "b", aebc.a, "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new aebe();
        }
        if (i2 == 4) {
            return new aebb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aebe.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
