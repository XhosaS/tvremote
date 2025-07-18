package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vai extends vuc implements vvk {
    public static final vai a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        vai vaiVar = new vai();
        a = vaiVar;
        vuc.y(vai.class, vaiVar);
    }

    private vai() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"c", "b", vcq.class, uzy.class, vab.class, vad.class, vah.class, vag.class, vaf.class, uzw.class});
        }
        if (i2 == 3) {
            return new vai();
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
        synchronized (vai.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
