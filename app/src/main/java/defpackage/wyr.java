package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyr extends abxd implements abyr {
    public static final wyr a;
    private static volatile abyy j;
    public int b;
    public long c;
    public long d;
    public abxs e = abzb.b;
    public long f;
    public long g;
    public wtn h;
    public int i;

    static {
        wyr wyrVar = new wyr();
        a = wyrVar;
        wyrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(wyr.class, wyrVar);
    }

    private wyr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001စ\u0000\u0002စ\u0001\u0003\u001b\u0004ဂ\u0002\u0005ဂ\u0003\nဉ\u0005\u000b᠌\u0006", new Object[]{"b", "c", "d", "e", wvv.class, "f", "g", "h", "i", wyq.a});
        }
        if (i2 == 3) {
            return new wyr();
        }
        if (i2 == 4) {
            return new wyp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (wyr.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
