package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhh extends abxd implements abyr {
    public static final abhh a;
    private static volatile abyy g;
    public int b;
    public abhk e;
    public String c = "";
    public String d = "";
    public abxs f = abzb.b;

    static {
        abhh abhhVar = new abhh();
        a = abhhVar;
        abhhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abhh.class, abhhVar);
    }

    private abhh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", abgc.class});
        }
        if (i2 == 3) {
            return new abhh();
        }
        if (i2 == 4) {
            return new abhg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abhh.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
