package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhg extends abwz implements abxa {
    public static final vhg a;
    private static volatile abyy k;
    public int b;
    public boolean i;
    private byte m = 2;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    private String l = "";
    public String j = "";

    static {
        vhg vhgVar = new vhg();
        a = vhgVar;
        vhgVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vhg.class, vhgVar);
    }

    private vhg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဇ\u0006\u0006ဈ\u0007\u0007ဈ\b\bဈ\u0002\tဈ\u0003", new Object[]{"b", "c", "d", "g", "h", "i", "l", "j", "e", "f"});
        }
        if (i2 == 3) {
            return new vhg();
        }
        if (i2 == 4) {
            return new vhf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = k;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (vhg.class) {
            abwxVar = k;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                k = abwxVar;
            }
        }
        return abwxVar;
    }
}
