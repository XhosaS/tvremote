package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmz extends abxd implements abyr {
    public static final abmz a;
    private static volatile abyy j;
    public int b;
    public boolean g;
    public adxk h;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public abxs i = abzb.b;

    static {
        abmz abmzVar = new abmz();
        a = abmzVar;
        abmzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmz.class, abmzVar);
    }

    private abmz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ဈ\u0001\u0002ဈ\u0003\u0003ဈ\u0004\u0004ဉ\t\u0005ဇ\u0005\u0007ဈ\u0000\b\u001b", new Object[]{"b", "d", "e", "f", "h", "g", "c", "i", xjr.class});
        }
        if (i2 == 3) {
            return new abmz();
        }
        if (i2 == 4) {
            return new abmy();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abmz.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
