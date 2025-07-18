package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achs extends abwz implements abxa {
    public static final achs a;
    private static volatile abyy h;
    public int b;
    public int c;
    public abxs e;
    public abxs f;
    public String g;
    private byte i = 2;
    public String d = "";

    static {
        achs achsVar = new achs();
        a = achsVar;
        achsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(achs.class, achsVar);
    }

    private achs() {
        abzb abzbVar = abzb.b;
        this.e = abzbVar;
        this.f = abzbVar;
        this.g = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0002\u0002\u0001᠌\u0000\u0004ဈ\u0002\u0005Л\u0006Л\bဈ\u0005", new Object[]{"b", "c", acgc.a, "d", "e", acgi.class, "f", acgi.class, "g"});
        }
        if (i2 == 3) {
            return new achs();
        }
        if (i2 == 4) {
            return new achr();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (achs.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
