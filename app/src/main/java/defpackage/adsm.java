package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsm extends abxd implements abyr {
    public static final adsm a;
    private static volatile abyy e;
    public int b;
    public int c;
    public adms d;

    static {
        adsm adsmVar = new adsm();
        a = adsmVar;
        adsmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adsm.class, adsmVar);
    }

    private adsm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0003ဉ\u0002", new Object[]{"b", "c", adsl.a, "d"});
        }
        if (i2 == 3) {
            return new adsm();
        }
        if (i2 == 4) {
            return new adsk();
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
        synchronized (adsm.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
