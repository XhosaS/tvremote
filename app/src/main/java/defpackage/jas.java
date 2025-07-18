package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jas extends abxd implements abyr {
    public static final jas a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abxs d = abzb.b;

    static {
        jas jasVar = new jas();
        a = jasVar;
        jasVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(jas.class, jasVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", abna.a, "d", jaq.class});
        }
        if (i2 == 3) {
            return new jas();
        }
        if (i2 == 4) {
            return new jar();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (jas.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
