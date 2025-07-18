package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbf extends vuc implements vvk {
    public static final vuk a = new qiu(13);
    public static final vbf b;
    private static volatile vvq k;
    public int c;
    public vun d;
    public vuj e;
    public vco f;
    public vbb g;
    public vdb h;
    public vun i;
    public vbe j;

    static {
        vbf vbfVar = new vbf();
        b = vbfVar;
        vuc.y(vbf.class, vbfVar);
    }

    private vbf() {
        vvt vvtVar = vvt.a;
        this.d = vvtVar;
        this.e = vud.a;
        this.i = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001\u001b\u0002,\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006\u001b\u0007ဉ\u0003", new Object[]{"c", "d", vch.class, "e", "f", "g", "h", "i", vcb.class, "j"});
        }
        if (i2 == 3) {
            return new vbf();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vbf.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
