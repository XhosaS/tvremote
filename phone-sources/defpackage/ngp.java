package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngp extends vuc implements vvk {
    public static final ngp a;
    private static volatile vvq h;
    public int b;
    public int d;
    public boolean f;
    public boolean g;
    private int i;
    public String c = "";
    public vun e = vvt.a;

    static {
        ngp ngpVar = new ngp();
        a = ngpVar;
        vuc.y(ngp.class, ngpVar);
    }

    private ngp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003င\u0000\u0004Ț\u0005\u0007\u0006\u0007", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ngp();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ngp.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
