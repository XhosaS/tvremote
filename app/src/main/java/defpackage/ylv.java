package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylv extends abxd implements abyr {
    public static final ylv a;
    private static volatile abyy g;
    public String b;
    public abxs c;
    public String d;
    public abxs e;
    public abxs f;
    private int h;

    static {
        ylv ylvVar = new ylv();
        a = ylvVar;
        ylvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ylv.class, ylvVar);
    }

    private ylv() {
        abvo abvoVar = abvo.b;
        this.b = "";
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = "";
        this.e = abzbVar;
        this.f = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0004\t\u0005\u0000\u0003\u0000\u0004ဈ\u0003\u0005\u001a\u0006ဈ\u0004\u0007\u001b\t\u001a", new Object[]{"h", "b", "c", "d", "e", ymn.class, "f"});
        }
        if (i2 == 3) {
            return new ylv();
        }
        if (i2 == 4) {
            return new ylu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ylv.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
