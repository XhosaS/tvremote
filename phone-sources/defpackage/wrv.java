package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrv extends vuc implements vvk {
    public static final wrv a;
    private static volatile vvq j;
    public int b;
    public boolean e;
    public wlx f;
    public wkg h;
    public wlx i;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String g = "";

    static {
        wrv wrvVar = new wrv();
        a = wrvVar;
        vuc.y(wrv.class, wrvVar);
    }

    private wrv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new wrv();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wrv.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
