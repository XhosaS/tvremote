package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ynl extends abxd implements abyr {
    public static final ynl a;
    private static volatile abyy f;
    public int b;
    public int c;
    public ymw d;
    public yne e;

    static {
        ynl ynlVar = new ynl();
        a = ynlVar;
        ynlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ynl.class, ynlVar);
    }

    private ynl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003᠌\u0000", new Object[]{"b", "d", "e", "c", ynk.a});
        }
        if (i2 == 3) {
            return new ynl();
        }
        if (i2 == 4) {
            return new ynj();
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
        synchronized (ynl.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
