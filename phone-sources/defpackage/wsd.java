package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsd extends vuc implements vvk {
    public static final wsd a;
    public static final vvd o;
    private static volatile vvq p;
    public Object c;
    public Object e;
    public wlx f;
    public wls g;
    public wls h;
    public boolean i;
    public wkg k;
    public wll l;
    public wls m;
    public wkg n;
    private int q;
    public int b = 0;
    public int d = 0;
    private byte r = 2;
    public String j = "";

    static {
        wsd wsdVar = new wsd();
        a = wsdVar;
        vuc.y(wsd.class, wsdVar);
        o = vuc.C(wkx.a, wsdVar, wsdVar, 361897394, vwo.MESSAGE);
    }

    private wsd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\r\u0002\u0001\u0001\u000f\r\u0000\u0000\u0003\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005<\u0000\u0006ဇ\u0004\u0007ဈ\u0005\bᐉ\u0006\tဉ\u0007\n<\u0000\u000bဉ\b\fᐉ\t\u000e<\u0001\u000fм\u0001", new Object[]{"c", "b", "e", "d", "q", "f", "g", "h", wlx.class, "i", "j", "k", "l", wlx.class, "m", "n", wsb.class, wsc.class});
        }
        if (i2 == 3) {
            return new wsd();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.r = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = p;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wsd.class) {
            vtxVar = p;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                p = vtxVar;
            }
        }
        return vtxVar;
    }
}
