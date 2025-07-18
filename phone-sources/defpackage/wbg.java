package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbg extends vuc implements vvk {
    public static final wbg a;
    private static volatile vvq d;
    public int b;
    public vun c = vvt.a;

    static {
        wbg wbgVar = new wbg();
        a = wbgVar;
        vuc.y(wbg.class, wbgVar);
    }

    private wbg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"b", "c", vbh.class});
        }
        if (i2 == 3) {
            return new wbg();
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
        synchronized (wbg.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
