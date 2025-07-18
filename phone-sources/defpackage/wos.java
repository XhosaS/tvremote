package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wos extends vuc implements vvk {
    public static final wos a;
    private static volatile vvq e;
    public String b = "";
    public vun c;
    public vun d;

    static {
        wos wosVar = new wos();
        a = wosVar;
        vuc.y(wos.class, wosVar);
    }

    private wos() {
        vvt vvtVar = vvt.a;
        this.c = vvtVar;
        this.d = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b", new Object[]{"b", "c", wov.class, "d", wou.class});
        }
        if (i2 == 3) {
            return new wos();
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
        synchronized (wos.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
