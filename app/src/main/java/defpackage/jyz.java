package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyz extends abxd implements abyr {
    public static final jyz a;
    private static volatile abyy b;

    static {
        jyz jyzVar = new jyz();
        a = jyzVar;
        jyzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(jyz.class, jyzVar);
    }

    private jyz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new jyz();
        }
        if (i2 == 4) {
            return new jyy();
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
        synchronized (jyz.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
