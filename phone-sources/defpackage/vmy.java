package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmy extends vuc implements vvk {
    public static final vmy a;
    private static volatile vvq e;
    public int b;
    public vuj c = vud.a;
    public int d;

    static {
        vmy vmyVar = new vmy();
        a = vmyVar;
        vuc.y(vmy.class, vmyVar);
    }

    private vmy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001'\u0002᠌\u0000", new Object[]{"b", "c", "d", vlj.q});
        }
        if (i2 == 3) {
            return new vmy();
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
        synchronized (vmy.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
