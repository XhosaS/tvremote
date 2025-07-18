package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adaq extends abxd implements abyr {
    public static final adaq a;
    private static volatile abyy h;
    public int b;
    public abzy d;
    public int e;
    public adat g;
    private abyl i = abyl.a;
    public String c = "";
    public String f = "";

    static {
        adaq adaqVar = new adaq();
        a = adaqVar;
        adaqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adaq.class, adaqVar);
    }

    private adaq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u00052\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", adar.a, "f", "i", adao.a, "g"});
        }
        if (i2 == 3) {
            return new adaq();
        }
        if (i2 == 4) {
            return new adap();
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
        synchronized (adaq.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
