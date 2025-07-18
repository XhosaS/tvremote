package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacz extends abxd implements abyr {
    public static final aacz a;
    private static volatile abyy e;
    public String b = "";
    public abvo c = abvo.b;
    public int d;

    static {
        aacz aaczVar = new aacz();
        a = aaczVar;
        aaczVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aacz.class, aaczVar);
    }

    private aacz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aacz();
        }
        if (i2 == 4) {
            return new aacx();
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
        synchronized (aacz.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
