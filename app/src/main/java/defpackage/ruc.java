package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruc extends abxd implements abyr {
    public static final ruc a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;

    static {
        ruc rucVar = new ruc();
        a = rucVar;
        rucVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ruc.class, rucVar);
    }

    private ruc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"b", "c", rtx.a, "d", rtv.a});
        }
        if (i2 == 3) {
            return new ruc();
        }
        if (i2 == 4) {
            return new rub();
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
        synchronized (ruc.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
