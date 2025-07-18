package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnb extends abxd implements abyr {
    public static final fnb a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        fnb fnbVar = new fnb();
        a = fnbVar;
        fnbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fnb.class, fnbVar);
    }

    private fnb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new fnb();
        }
        if (i2 == 4) {
            return new fna();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (fnb.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
