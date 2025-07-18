package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stz extends abxd implements abyr {
    public static final stz a;
    private static volatile abyy f;
    public int b;
    public int c;
    public String d = "";
    public int e;

    static {
        stz stzVar = new stz();
        a = stzVar;
        stzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(stz.class, stzVar);
    }

    private stz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"b", "c", stc.a, "d", "e", ssu.a});
        }
        if (i2 == 3) {
            return new stz();
        }
        if (i2 == 4) {
            return new sty();
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
        synchronized (stz.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
