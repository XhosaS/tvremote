package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlg extends vuc implements vvk {
    public static final wlg a;
    private static volatile vvq e;
    public wlp c;
    private int f;
    private byte g = 2;
    public vun b = vvt.a;
    public String d = "";

    static {
        wlg wlgVar = new wlg();
        a = wlgVar;
        vuc.y(wlg.class, wlgVar);
    }

    private wlg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003Ȉ", new Object[]{"f", "b", wlf.class, "c", "d"});
        }
        if (i2 == 3) {
            return new wlg();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wlg.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void c() {
        vun vunVar = this.b;
        if (vunVar.c()) {
            return;
        }
        this.b = vuc.s(vunVar);
    }
}
