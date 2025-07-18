package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aecd extends abwz implements abxa {
    public static final aecd a;
    private static volatile abyy m;
    public int b;
    public long c;
    public long d;
    public int e;
    public abvo f;
    public long g;
    public abvo h;
    public boolean i;
    public String j;
    public double k;
    public aeci l;
    private byte o = 2;

    static {
        aecd aecdVar = new aecd();
        a = aecdVar;
        aecdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aecd.class, aecdVar);
    }

    private aecd() {
        Object[] objArr = abzb.a;
        abvo abvoVar = abvo.b;
        abvo abvoVar2 = abvo.b;
        this.f = abvoVar2;
        this.g = 180000L;
        this.h = abvoVar2;
        abxe abxeVar = abxe.a;
        this.j = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\n\u0000\u0001\u0001!\n\u0000\u0000\u0001\u0001ဂ\u0000\u0006ည\u000b\u000bင\u0005\u000fတ\u0011\u0011ဂ\u0001\u0012ည\u0013\u0019ဇ\u0017\u001cဈ\u0018 က\u001a!ᐉ\u001c", new Object[]{"b", "c", "f", "e", "g", "d", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new aecd();
        }
        if (i2 == 4) {
            return new aecc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = m;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aecd.class) {
            abwxVar = m;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                m = abwxVar;
            }
        }
        return abwxVar;
    }
}
