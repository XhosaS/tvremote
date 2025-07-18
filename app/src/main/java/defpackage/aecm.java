package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aecm extends abxd implements abyr {
    public static final aecm a;
    private static volatile abyy e;
    public Object c;
    public int b = 0;
    public abxs d = abzb.b;

    static {
        aecm aecmVar = new aecm();
        a = aecmVar;
        aecmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aecm.class, aecmVar);
    }

    private aecm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0001\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u00018\u0000\u0003\u001b\u00045\u0000", new Object[]{"c", "b", "d", aeck.class});
        }
        if (i2 == 3) {
            return new aecm();
        }
        if (i2 == 4) {
            return new aecl();
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
        synchronized (aecm.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
