package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wao extends vuc implements vvk {
    public static final wao a;
    private static volatile vvq f;
    public vun b;
    public vun c;
    public int d;
    public vun e;

    static {
        wao waoVar = new wao();
        a = waoVar;
        vuc.y(wao.class, waoVar);
    }

    private wao() {
        vvt vvtVar = vvt.a;
        this.b = vvtVar;
        this.c = vvtVar;
        this.e = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0005\f\u0006\u001b", new Object[]{"b", val.class, "c", val.class, "d", "e", vcb.class});
        }
        if (i2 == 3) {
            return new wao();
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
        synchronized (wao.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
