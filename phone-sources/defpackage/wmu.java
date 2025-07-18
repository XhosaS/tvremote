package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmu extends vuc implements vvk {
    public static final wmu a;
    private static volatile vvq g;
    public Object c;
    public wni d;
    public wlp e;
    private int h;
    public int b = 0;
    private byte i = 2;
    public vun f = vvt.a;

    static {
        wmu wmuVar = new wmu();
        a = wmuVar;
        vuc.y(wmu.class, wmuVar);
    }

    private wmu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0001\u0003\u0001ဉ\u0000\u0002м\u0000\u0003м\u0000\u0004<\u0000\u0005м\u0000\u0006ဉ\u0001\u0007\u001b", new Object[]{"c", "b", "h", "d", wmr.class, wmt.class, wms.class, wmq.class, "e", "f", wlx.class});
        }
        if (i2 == 3) {
            return new wmu();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmu.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
