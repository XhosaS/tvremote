package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkb extends abwz implements abxa {
    public static final adkb a;
    private static volatile abyy f;
    public int b;
    public boolean e;
    private byte g = 2;
    public String c = "";
    public boolean d = true;

    static {
        adkb adkbVar = new adkb();
        a = adkbVar;
        adkbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkb.class, adkbVar);
    }

    private adkb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new adkb();
        }
        if (i2 == 4) {
            return new adka();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adkb.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
