package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvh extends vuc implements vvk {
    public static final wvh a;
    public static final vvd f;
    private static volatile vvq g;
    public vwe c;
    public wll d;
    private int h;
    public String b = "";
    public String e = "";

    static {
        wvh wvhVar = new wvh();
        a = wvhVar;
        vuc.y(wvh.class, wvhVar);
        f = vuc.C(wkx.a, wvhVar, wvhVar, 499369460, vwo.MESSAGE);
    }

    private wvh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"h", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wvh();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wvh.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
