package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzv extends abxd implements abyr {
    public static final vzv a;
    private static volatile abyy j;
    public int b;
    public String c = "";
    public String d = "";
    public abvo e = abvo.b;
    public abxs f;
    public abxs g;
    public int h;
    public long i;

    static {
        vzv vzvVar = new vzv();
        a = vzvVar;
        vzvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vzv.class, vzvVar);
    }

    private vzv() {
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
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004\u001b\u0005\u001a\u0006ဆ\u0003\u0007စ\u0004", new Object[]{"b", "c", "d", "e", "f", vzz.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new vzv();
        }
        if (i2 == 4) {
            return new vzu();
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
        synchronized (vzv.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
