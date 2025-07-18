package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnc extends abxd implements abyr {
    public static final fnc a;
    private static volatile abyy e;
    public int b;
    public fnb c;
    public long d;

    static {
        fnc fncVar = new fnc();
        a = fncVar;
        fncVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fnc.class, fncVar);
    }

    private fnc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new fnc();
        }
        if (i2 == 4) {
            return new fmz();
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
        synchronized (fnc.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
