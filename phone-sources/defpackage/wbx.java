package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbx extends vuc implements vvk {
    public static final wbx a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        wbx wbxVar = new wbx();
        a = wbxVar;
        vuc.y(wbx.class, wbxVar);
    }

    private wbx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\r\u0001\u0000\u0001\r\r\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000", new Object[]{"c", "b", wbk.class, wbn.class, wbu.class, wbs.class, wbv.class, wbw.class, wbl.class, wbm.class, wbo.class, wbp.class, wbt.class, wbq.class, wbr.class});
        }
        if (i2 == 3) {
            return new wbx();
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
        synchronized (wbx.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
