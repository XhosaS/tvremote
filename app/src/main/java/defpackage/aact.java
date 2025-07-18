package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aact extends abxd implements abyr {
    public static final aact a;
    private static volatile abyy e;
    public int b;
    public abvo c = abvo.b;
    public aadi d;

    static {
        aact aactVar = new aact();
        a = aactVar;
        aactVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aact.class, aactVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aact();
        }
        if (i2 == 4) {
            return new aacs();
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
        synchronized (aact.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
