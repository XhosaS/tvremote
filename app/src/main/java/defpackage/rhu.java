package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhu extends abxd implements abyr {
    public static final abxk a = new rhs();
    public static final rhu b;
    private static volatile abyy m;
    public int c;
    public boolean e;
    public abxs g;
    public abxs h;
    public abxj i;
    public rhw j;
    public boolean k;
    public boolean l;
    public abvo d = abvo.b;
    public String f = "";

    static {
        rhu rhuVar = new rhu();
        b = rhuVar;
        rhuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rhu.class, rhuVar);
    }

    private rhu() {
        abzb abzbVar = abzb.b;
        this.g = abzbVar;
        this.h = abzbVar;
        this.i = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "i", aagr.a, "j", "k", "l"});
        }
        if (i2 == 3) {
            return new rhu();
        }
        if (i2 == 4) {
            return new rht();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rhu.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
