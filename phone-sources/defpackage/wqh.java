package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqh extends vuc implements vvk {
    public static final wqh a;
    public static final vvd e;
    private static volatile vvq f;
    public wpm b;
    public wll c;
    public String d = "";
    private int g;

    static {
        wqh wqhVar = new wqh();
        a = wqhVar;
        vuc.y(wqh.class, wqhVar);
        e = vuc.C(wkg.a, wqhVar, wqhVar, 363917300, vwo.MESSAGE);
    }

    private wqh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"g", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wqh();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wqh.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
