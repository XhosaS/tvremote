package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxy extends abxd implements abyr {
    public static final aaxy a;
    private static volatile abyy d;
    public abxj b = abxe.a;
    public abxs c = abzb.b;

    static {
        aaxy aaxyVar = new aaxy();
        a = aaxyVar;
        aaxyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aaxy.class, aaxyVar);
    }

    private aaxy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002\u001a", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aaxy();
        }
        if (i2 == 4) {
            return new aaxx();
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
        synchronized (aaxy.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
