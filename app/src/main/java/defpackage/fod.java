package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fod extends abxd implements abyr {
    public static final fod a;
    private static volatile abyy c;
    public int b;

    static {
        fod fodVar = new fod();
        a = fodVar;
        fodVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fod.class, fodVar);
    }

    private fod() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new fod();
        }
        if (i2 == 4) {
            return new fob();
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
        synchronized (fod.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
