package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtv extends abxd implements abyr {
    public static final adtv a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public int d;
    private int f;

    static {
        adtv adtvVar = new adtv();
        a = adtvVar;
        adtvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adtv.class, adtvVar);
    }

    private adtv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002᠌\u0000\u0003ဈ\u0001\u0004᠌\u0002", new Object[]{"f", "b", adlz.a, "c", "d", admb.a});
        }
        if (i2 == 3) {
            return new adtv();
        }
        if (i2 == 4) {
            return new adtu();
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
        synchronized (adtv.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
