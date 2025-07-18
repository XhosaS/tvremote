package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahth extends abwz implements abxa {
    public static final ahth a;
    private static volatile abyy l;
    public int b;
    public long d;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public int k;
    private byte m = 2;
    public String c = "";
    public String e = "";

    static {
        ahth ahthVar = new ahth();
        a = ahthVar;
        ahthVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahth.class, ahthVar);
    }

    private ahth() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002စ\u0003\u0003စ\u0004\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\u0007᠌\r\bစ\u0001\tဈ\u0002", new Object[]{"b", "c", "f", "g", "h", "i", "j", "k", ahtg.a, "d", "e"});
        }
        if (i2 == 3) {
            return new ahth();
        }
        if (i2 == 4) {
            return new ahtf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahth.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
