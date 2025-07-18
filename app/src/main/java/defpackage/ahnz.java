package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahnz extends abxd implements abyr {
    public static final ahnz a;
    private static volatile abyy d;
    public int b;
    public int c;

    static {
        ahnz ahnzVar = new ahnz();
        a = ahnzVar;
        ahnzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahnz.class, ahnzVar);
    }

    private ahnz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", abna.a});
        }
        if (i2 == 3) {
            return new ahnz();
        }
        if (i2 == 4) {
            return new ahny();
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
        synchronized (ahnz.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
