package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhq extends abxd implements abyr {
    public static final mhq a;
    private static volatile abyy b;

    static {
        mhq mhqVar = new mhq();
        a = mhqVar;
        mhqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(mhq.class, mhqVar);
    }

    private mhq() {
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
            return new mhq();
        }
        if (i2 == 4) {
            return new mhp();
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
        synchronized (mhq.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
