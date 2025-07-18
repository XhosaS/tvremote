package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqi extends vuc implements vvk {
    public static final wqi a;
    public static final vvd d;
    private static volatile vvq e;
    public String b = "";
    public boolean c;
    private int f;

    static {
        wqi wqiVar = new wqi();
        a = wqiVar;
        vuc.y(wqi.class, wqiVar);
        d = vuc.C(wkg.a, wqiVar, wqiVar, 389536254, vwo.MESSAGE);
    }

    private wqi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"f", "b", "c"});
        }
        if (i2 == 3) {
            return new wqi();
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
        synchronized (wqi.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
