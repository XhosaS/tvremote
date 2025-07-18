package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbg extends vuc implements vvk {
    public static final vbg a;
    private static volatile vvq d;
    public vbi b;
    public String c = "";
    private int e;

    static {
        vbg vbgVar = new vbg();
        a = vbgVar;
        vuc.y(vbg.class, vbgVar);
    }

    private vbg() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new vbg();
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
        synchronized (vbg.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
