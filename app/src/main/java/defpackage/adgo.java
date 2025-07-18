package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adgo extends abxd implements abyr {
    public static final adgo a;
    private static volatile abyy e;
    public abxs b;
    public abxs c;
    public adgs d;
    private int f;

    static {
        adgo adgoVar = new adgo();
        a = adgoVar;
        adgoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adgo.class, adgoVar);
    }

    private adgo() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.c = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002\u001a\u0003ဉ\u0000", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new adgo();
        }
        if (i2 == 4) {
            return new adgn();
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
        synchronized (adgo.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
