package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lxp extends abxd implements abyr {
    public static final lxp a;
    private static volatile abyy l;
    public int b;
    public int c;
    public String d = "";
    public abxs e;
    public String f;
    public abxs g;
    public String h;
    public String i;
    public abxs j;
    public boolean k;

    static {
        lxp lxpVar = new lxp();
        a = lxpVar;
        lxpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(lxp.class, lxpVar);
    }

    private lxp() {
        abzb abzbVar = abzb.b;
        this.e = abzbVar;
        this.f = "";
        this.g = abzbVar;
        this.h = "";
        this.i = "";
        this.j = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005\u001a\u0006ဈ\u0003\u0007ဈ\u0004\b\u001b\tဇ\u0005", new Object[]{"b", "c", lxm.a, "d", "e", "f", "g", "h", "i", "j", lxo.class, "k"});
        }
        if (i2 == 3) {
            return new lxp();
        }
        if (i2 == 4) {
            return new lxl();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (lxp.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
