package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcg extends vuc implements vvk {
    public static final lcg a;
    private static volatile vvq r;
    public int b;
    public lch c;
    public lcr e;
    public lcr f;
    public lcv g;
    public lac i;
    public boolean j;
    public boolean k;
    public int l;
    public vun m;
    public vun n;
    public vun o;
    public float p;
    public vun q;
    public String d = "";
    public String h = "";

    static {
        lcg lcgVar = new lcg();
        a = lcgVar;
        vuc.y(lcg.class, lcgVar);
    }

    private lcg() {
        vvt vvtVar = vvt.a;
        this.m = vvtVar;
        this.n = vvtVar;
        this.o = vvtVar;
        this.q = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0004\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006Ȉ\u0007ဉ\u0004\b\u0007\t\u0007\n\u0004\u000bȚ\f\u001b\r\u001b\u000e\u0001\u000f\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", lce.class, "o", lav.class, "p", "q", kzm.class});
        }
        if (i2 == 3) {
            return new lcg();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = r;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lcg.class) {
            vtxVar = r;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                r = vtxVar;
            }
        }
        return vtxVar;
    }
}
