package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xog extends abxd implements abyr {
    public static final xog a;
    private static volatile abyy d;
    public int b;
    public boolean c;
    private abyl e = abyl.a;

    static {
        xog xogVar = new xog();
        a = xogVar;
        xogVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xog.class, xogVar);
    }

    private xog() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဇ\u0000\u00022", new Object[]{"b", "c", "e", xof.a});
        }
        if (i2 == 3) {
            return new xog();
        }
        if (i2 == 4) {
            return new xoe();
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
        synchronized (xog.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
