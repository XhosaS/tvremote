package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmy extends abxd implements abyr {
    public static final fmy a;
    private static volatile abyy g;
    public int b;
    public abuy c;
    public abxs d = abzb.b;
    public xfy e;
    public xcj f;

    static {
        fmy fmyVar = new fmy();
        a = fmyVar;
        fmyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fmy.class, fmyVar);
    }

    private fmy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"b", "c", "d", xga.class, "e", "f"});
        }
        if (i2 == 3) {
            return new fmy();
        }
        if (i2 == 4) {
            return new fmx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (fmy.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
