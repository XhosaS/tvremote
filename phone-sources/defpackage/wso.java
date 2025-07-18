package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wso extends vuc implements vvk {
    public static final wso a;
    public static final vvd i;
    private static volatile vvq j;
    public int b;
    public Object d;
    public wly e;
    public boolean f;
    public boolean g;
    public int h;
    public int c = 0;
    private byte k = 2;

    static {
        wso wsoVar = new wso();
        a = wsoVar;
        vuc.y(wso.class, wsoVar);
        i = vuc.C(wkx.a, wsoVar, wsoVar, 356581341, vwo.MESSAGE);
    }

    private wso() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\n\u0001\u0001\u0001\n\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002<\u0000\u0003<\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006᠌\u0003\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"d", "c", "b", "e", wsj.class, wsm.class, "f", "g", "h", wjk.j, wsf.class, wsn.class, wsk.class, wsl.class});
        }
        if (i3 == 3) {
            return new wso();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wso.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
