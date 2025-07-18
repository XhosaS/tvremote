package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqa extends vuc implements vvk {
    public static final wqa a;
    public static final vvd d;
    private static volatile vvq e;
    public String b = "";
    public String c = "";
    private int f;

    static {
        wqa wqaVar = new wqa();
        a = wqaVar;
        vuc.y(wqa.class, wqaVar);
        d = vuc.C(wkg.a, wqaVar, wqaVar, 385036965, vwo.MESSAGE);
    }

    private wqa() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"f", "b", "c"});
        }
        if (i2 == 3) {
            return new wqa();
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
        synchronized (wqa.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
