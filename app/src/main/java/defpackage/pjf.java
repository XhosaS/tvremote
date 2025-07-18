package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pjf extends abxd implements abyr {
    public static final pjf a;
    private static volatile abyy h;
    public int b;
    public long d;
    public int f;
    public adwd g;
    public String c = "";
    public String e = "";

    static {
        pjf pjfVar = new pjf();
        a = pjfVar;
        pjfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(pjf.class, pjfVar);
    }

    private pjf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", phx.a, "g"});
        }
        if (i2 == 3) {
            return new pjf();
        }
        if (i2 == 4) {
            return new pje();
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
        synchronized (pjf.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
