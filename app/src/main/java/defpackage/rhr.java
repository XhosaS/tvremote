package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhr extends abxd implements abyr {
    public static final abxk a = new rhp();
    public static final rhr b;
    private static volatile abyy n;
    public int c;
    public boolean e;
    public long g;
    public abxs h;
    public abxs i;
    public abxj j;
    public rhw k;
    public boolean l;
    public boolean m;
    public abvo d = abvo.b;
    public String f = "";

    static {
        rhr rhrVar = new rhr();
        b = rhrVar;
        rhrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(rhr.class, rhrVar);
    }

    private rhr() {
        abzb abzbVar = abzb.b;
        this.h = abzbVar;
        this.i = abzbVar;
        this.j = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(b, "\u0004\n\u0000\u0001\u0001\u000b\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", aagr.a, "k", "l", "m"});
        }
        if (i2 == 3) {
            return new rhr();
        }
        if (i2 == 4) {
            return new rhq();
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = n;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (rhr.class) {
            abwxVar = n;
            if (abwxVar == null) {
                abwxVar = new abwx(b);
                n = abwxVar;
            }
        }
        return abwxVar;
    }
}
