package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbh extends vuc implements vvk {
    public static final vuk a = new qiu(14);
    public static final vbh b;
    private static volatile vvq f;
    public int c;
    public vbi d;
    public vuj e = vud.a;

    static {
        vbh vbhVar = new vbh();
        b = vbhVar;
        vuc.y(vbh.class, vbhVar);
    }

    private vbh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002,", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new vbh();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vbh.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
