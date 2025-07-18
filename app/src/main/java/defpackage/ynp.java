package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynp extends abxd implements abyr {
    public static final ynp a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        ynp ynpVar = new ynp();
        a = ynpVar;
        ynpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ynp.class, ynpVar);
    }

    private ynp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0001", new Object[]{"b", "c", yng.a});
        }
        if (i2 == 3) {
            return new ynp();
        }
        if (i2 == 4) {
            return new yno();
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
        synchronized (ynp.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
