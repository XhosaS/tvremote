package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wai extends vuc implements vvk {
    public static final wai a;
    private static volatile vvq d;
    public String b = "";
    public vun c = vvt.a;

    static {
        wai waiVar = new wai();
        a = waiVar;
        vuc.y(wai.class, waiVar);
    }

    private wai() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0000\u0001\u0004\u0002\u0000\u0001\u0000\u0001Ȉ\u0004\u001b", new Object[]{"b", "c", vcb.class});
        }
        if (i2 == 3) {
            return new wai();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wai.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
