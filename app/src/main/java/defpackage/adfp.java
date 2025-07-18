package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfp extends abxd implements abyr {
    public static final adfp a;
    private static volatile abyy c;
    public abyl b = abyl.a;

    static {
        adfp adfpVar = new adfp();
        a = adfpVar;
        adfpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adfp.class, adfpVar);
    }

    private adfp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", adfo.a});
        }
        if (i2 == 3) {
            return new adfp();
        }
        if (i2 == 4) {
            return new adfn();
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
        synchronized (adfp.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
