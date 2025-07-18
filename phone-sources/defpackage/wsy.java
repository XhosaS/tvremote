package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsy extends vuc implements vvk {
    public static final wsy a;
    public static final vvd l;
    private static volatile vvq m;
    public int b;
    public Object d;
    public wls e;
    public wls f;
    public wkg h;
    public boolean i;
    public int c = 0;
    private byte n = 2;
    public String g = "";
    public String j = "";
    public vun k = vvt.a;

    static {
        wsy wsyVar = new wsy();
        a = wsyVar;
        vuc.y(wsy.class, wsyVar);
        l = vuc.C(wkx.a, wsyVar, wsyVar, 401575330, vwo.MESSAGE);
    }

    private wsy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0001\u0001\u0001\t\t\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u083f\u0000\u0004<\u0000\u0005ဈ\u0002\u0006ᐉ\u0003\u0007ဇ\u0004\bဈ\u0005\t\u001a", new Object[]{"d", "c", "b", "e", "f", wjk.k, wlx.class, "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new wsy();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wsy.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
