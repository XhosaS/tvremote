package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xiv extends abwz implements abxa {
    public static final xiv a;
    private static volatile abyy h;
    public abxs d;
    public abxs e;
    public String f;
    public boolean g;
    private int i;
    private byte j = 2;
    public String b = "";
    public String c = "";

    static {
        xiv xivVar = new xiv();
        a = xivVar;
        xivVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xiv.class, xivVar);
    }

    private xiv() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
        this.f = "";
        this.g = true;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0007\u001b\t\u001a\nဈ\u0005\u0011ဇ\r", new Object[]{"i", "b", "c", "d", xiu.class, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xiv();
        }
        if (i2 == 4) {
            return new xis();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xiv.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
