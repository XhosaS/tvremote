package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abvd extends abxd implements abyr {
    public static final abvd a;
    private static volatile abyy c;
    public boolean b;

    static {
        abvd abvdVar = new abvd();
        a = abvdVar;
        abvdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abvd.class, abvdVar);
    }

    private abvd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abvd();
        }
        if (i2 == 4) {
            return new abvc();
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
        synchronized (abvd.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
