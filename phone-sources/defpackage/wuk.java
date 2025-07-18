package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuk extends vuc implements vvk {
    public static final wuk a;
    public static final vvd f;
    private static volatile vvq g;
    public int b;
    public wll d;
    public wul e;
    private byte h = 2;
    public vun c = vvt.a;

    static {
        wuk wukVar = new wuk();
        a = wukVar;
        vuc.y(wuk.class, wukVar);
        f = vuc.C(wkx.a, wukVar, wukVar, 357978693, vwo.MESSAGE);
    }

    private wuk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Л\u0002ဉ\u0000\u0004ᐉ\u0002", new Object[]{"b", "c", wuj.class, "d", "e"});
        }
        if (i2 == 3) {
            return new wuk();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wuk.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
