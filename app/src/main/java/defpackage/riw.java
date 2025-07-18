package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class riw extends abxd implements abyr {
    public static final riw a;
    private static volatile abyy c;
    public abyl b = abyl.a;

    static {
        riw riwVar = new riw();
        a = riwVar;
        riwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(riw.class, riwVar);
    }

    private riw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", riu.a});
        }
        if (i2 == 3) {
            return new riw();
        }
        if (i2 == 4) {
            return new riv();
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
        synchronized (riw.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
