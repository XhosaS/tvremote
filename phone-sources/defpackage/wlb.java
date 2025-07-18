package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlb extends vuc implements vvk {
    public static final wlb a;
    private static volatile vvq e;
    public wkg c;
    public int d;
    private int f;
    private byte g = 2;
    public String b = "";

    static {
        wlb wlbVar = new wlb();
        a = wlbVar;
        vuc.y(wlb.class, wlbVar);
    }

    private wlb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Ȉ\u0002ᐉ\u0000\u0003\f", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wlb();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wlb.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
