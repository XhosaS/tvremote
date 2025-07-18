package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacp extends abxd implements abyr {
    public static final aacp a;
    public static volatile abyy b;
    public int c;
    public int d;
    public aacr e;
    public abvo f = abvo.b;

    static {
        aacp aacpVar = new aacp();
        a = aacpVar;
        aacpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aacp.class, aacpVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aacp();
        }
        if (i2 == 4) {
            return new aaco();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aacp.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
