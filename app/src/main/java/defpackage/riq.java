package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class riq extends abxd implements abyr {
    public static final riq a;
    private static volatile abyy e;
    public int b;
    public abxs c = abzb.b;
    public String d = "";

    static {
        riq riqVar = new riq();
        a = riqVar;
        riqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(riq.class, riqVar);
    }

    private riq() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new riq();
        }
        if (i2 == 4) {
            return new rip();
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
        synchronized (riq.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
