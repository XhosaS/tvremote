package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacr extends abxd implements abyr {
    public static final aacr a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;

    static {
        aacr aacrVar = new aacr();
        a = aacrVar;
        aacrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aacr.class, aacrVar);
    }

    private aacr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new aacr();
        }
        if (i2 == 4) {
            return new aacq();
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
        synchronized (aacr.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
