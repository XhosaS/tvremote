package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpl extends vuc implements vvk {
    public static final tpl a;
    private static volatile vvq f;
    public vun b;
    public vun c;
    public vun d;
    public vun e;
    private byte g = 2;

    static {
        tpl tplVar = new tpl();
        a = tplVar;
        vuc.y(tpl.class, tplVar);
    }

    private tpl() {
        vvt vvtVar = vvt.a;
        this.b = vvtVar;
        this.c = vvtVar;
        this.d = vvtVar;
        this.e = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new Object[]{"c", tpk.class, "d", tpo.class, "b", tpp.class, "e", tpj.class});
        }
        if (i2 == 3) {
            return new tpl();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tpl.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
