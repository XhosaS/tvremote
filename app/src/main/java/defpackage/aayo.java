package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aayo extends abxd implements abyr {
    public static final aayo a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        aayo aayoVar = new aayo();
        a = aayoVar;
        aayoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aayo.class, aayoVar);
    }

    private aayo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003<\u0000", new Object[]{"c", "b", aayi.class});
        }
        if (i2 == 3) {
            return new aayo();
        }
        if (i2 == 4) {
            return new aayn();
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
        synchronized (aayo.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
