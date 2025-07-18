package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjo extends abxd implements abyr {
    public static final abjo a;
    private static volatile abyy d;
    public int b;
    public abki c;

    static {
        abjo abjoVar = new abjo();
        a = abjoVar;
        abjoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abjo.class, abjoVar);
    }

    private abjo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0015\u0015\u0001\u0000\u0000\u0000\u0015ဉ\u0002", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abjo();
        }
        if (i2 == 4) {
            return new abjn();
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
        synchronized (abjo.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
