package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tuw extends abxd implements abyr {
    public static final tuw a;
    private static volatile abyy f;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        tuw tuwVar = new tuw();
        a = tuwVar;
        tuwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(tuw.class, tuwVar);
    }

    private tuw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new tuw();
        }
        if (i2 == 4) {
            return new tuv();
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
        synchronized (tuw.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
