package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vaj extends vuc implements vvk {
    public static final vaj a;
    private static volatile vvq e;
    public int b = 0;
    public Object c;
    public vbr d;
    private int f;

    static {
        vaj vajVar = new vaj();
        a = vajVar;
        vuc.y(vaj.class, vajVar);
    }

    private vaj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"c", "b", "f", "d", vck.class, vdc.class, vap.class, vcl.class, var.class, vao.class, uzv.class, vao.class, vds.class, vcs.class, vcp.class, vdq.class, vbl.class, vdz.class, vct.class, vde.class, vdk.class});
        }
        if (i2 == 3) {
            return new vaj();
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
        synchronized (vaj.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
