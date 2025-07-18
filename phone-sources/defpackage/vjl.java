package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjl extends vuc implements vvk {
    public static final vjl a;
    private static volatile vvq e;
    public long d;
    private int f;
    private byte g = 2;
    public vun b = vvt.a;
    public String c = "";

    static {
        vjl vjlVar = new vjl();
        a = vjlVar;
        vuc.y(vjl.class, vjlVar);
    }

    private vjl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0007ဂ\u0001", new Object[]{"f", "b", vjk.class, "c", "d"});
        }
        if (i2 == 3) {
            return new vjl();
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
        synchronized (vjl.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
