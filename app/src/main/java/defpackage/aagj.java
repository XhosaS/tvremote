package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagj extends abxd implements abyr {
    public static final aagj a;
    private static volatile abyy c;
    public boolean b;
    private int d;

    static {
        aagj aagjVar = new aagj();
        a = aagjVar;
        aagjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aagj.class, aagjVar);
    }

    private aagj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new aagj();
        }
        if (i2 == 4) {
            return new aagi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aagj.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
