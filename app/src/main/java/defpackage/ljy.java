package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljy extends abxd implements abyr {
    public static final ljy a;
    private static volatile abyy m;
    public int b;
    public long c;
    public String d = "";
    public abxs e;
    public abxs f;
    public abxs g;
    public abxs h;
    public abxs i;
    public String j;
    public ljs k;
    public lkc l;

    static {
        ljy ljyVar = new ljy();
        a = ljyVar;
        ljyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ljy.class, ljyVar);
    }

    private ljy() {
        abzb abzbVar = abzb.b;
        this.e = abzbVar;
        this.f = abzbVar;
        this.g = abzbVar;
        this.h = abzbVar;
        this.i = abzbVar;
        this.j = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\n\u0000\u0001\u0001\u0011\n\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0004\u001b\u0005\u001b\u0006\u001b\t\u001b\n\u001b\u000bဈ\u0005\u000fဉ\u0007\u0011ဉ\t", new Object[]{"b", "c", "d", "e", lka.class, "f", ljw.class, "g", liq.class, "h", lma.class, "i", lju.class, "j", "k", "l"});
        }
        if (i2 == 3) {
            return new ljy();
        }
        if (i2 == 4) {
            return new ljx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ljy.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
