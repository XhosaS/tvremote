package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgx extends abxd implements abyr {
    public static final abgx a;
    private static volatile abyy d;
    public String b = "";
    public int c;

    static {
        abgx abgxVar = new abgx();
        a = abgxVar;
        abgxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abgx.class, abgxVar);
    }

    private abgx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0000\u0001\u0005\u0002\u0000\u0000\u0000\u0001Ȉ\u0005\f", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abgx();
        }
        if (i2 == 4) {
            return new abgw();
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
        synchronized (abgx.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
