package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adyv extends abxd implements abyr {
    public static final adyv a;
    private static volatile abyy f;
    public boolean b;
    public abxs c;
    public abxs d;
    public abxs e;
    private int g;

    static {
        adyv adyvVar = new adyv();
        a = adyvVar;
        adyvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adyv.class, adyvVar);
    }

    private adyv() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = abzbVar;
        this.e = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001a\u0003\u001a\u0004\u001a", new Object[]{"g", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new adyv();
        }
        if (i2 == 4) {
            return new adyu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adyv.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
