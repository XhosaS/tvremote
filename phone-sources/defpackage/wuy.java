package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuy extends vuc implements vvk {
    public static final wuy a;
    public static final vvd d;
    private static volatile vvq e;
    public wll b;
    public String c = "";
    private int f;

    static {
        wuy wuyVar = new wuy();
        a = wuyVar;
        vuc.y(wuy.class, wuyVar);
        d = vuc.C(wkx.a, wuyVar, wuyVar, 357070949, vwo.MESSAGE);
    }

    private wuy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဈ\u0002", new Object[]{"f", "b", "c"});
        }
        if (i2 == 3) {
            return new wuy();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wuy.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
