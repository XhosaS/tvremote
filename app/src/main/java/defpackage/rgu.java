package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgu extends abxd implements abyr {
    public static final rgu a;
    private static volatile abyy j;
    public int b;
    public String c = "";
    public abvo d = abvo.b;
    public String e = "";
    public abxs f;
    public abxs g;
    public boolean h;
    public long i;

    static {
        rgu rguVar = new rgu();
        a = rguVar;
        rguVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rgu.class, rguVar);
    }

    private rgu() {
        abzb abzbVar = abzb.b;
        this.f = abzbVar;
        this.g = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"b", "e", "c", "d", "f", rgx.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new rgu();
        }
        if (i2 == 4) {
            return new rgt();
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
        synchronized (rgu.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
