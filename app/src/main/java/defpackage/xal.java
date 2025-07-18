package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xal extends abwz implements abxa {
    public static final xal a;
    private static volatile abyy h;
    public int b;
    public int f;
    public int g;
    private byte i = 2;
    public String c = "";
    public abvo d = abvo.b;
    public String e = "";

    static {
        xal xalVar = new xal();
        a = xalVar;
        xalVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xal.class, xalVar);
    }

    private xal() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0006\u0003င\u0007\u0004င\b\u0005ည\u0003", new Object[]{"b", "c", "e", "f", "g", "d"});
        }
        if (i2 == 3) {
            return new xal();
        }
        if (i2 == 4) {
            return new xak();
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
        synchronized (xal.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
