package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfp extends abxd implements abyr {
    public static final abfp a;
    private static volatile abyy f;
    public int b;
    public abhh d;
    public String c = "";
    public abxs e = abzb.b;

    static {
        abfp abfpVar = new abfp();
        a = abfpVar;
        abfpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abfp.class, abfpVar);
    }

    private abfp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b", new Object[]{"b", "c", "d", "e", abfv.class});
        }
        if (i2 == 3) {
            return new abfp();
        }
        if (i2 == 4) {
            return new abfo();
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
        synchronized (abfp.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
