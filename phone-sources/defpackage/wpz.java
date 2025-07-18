package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpz extends vuc implements vvk {
    public static final wpz a;
    public static final vvd f;
    private static volatile vvq g;
    public int b;
    public wll c;
    public String d = "";
    public wni e;

    static {
        wpz wpzVar = new wpz();
        a = wpzVar;
        vuc.y(wpz.class, wpzVar);
        f = vuc.C(wkg.a, wpzVar, wpzVar, 432579247, vwo.MESSAGE);
    }

    private wpz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wpz();
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
        synchronized (wpz.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
