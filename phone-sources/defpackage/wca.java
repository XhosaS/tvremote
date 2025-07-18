package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wca extends vuc implements vvk {
    public static final wca a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        wca wcaVar = new wca();
        a = wcaVar;
        vuc.y(wca.class, wcaVar);
    }

    private wca() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u000f\u0001\u0000\u0001\u0010\u000f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\bȻ\u0000\t<\u0000\n<\u0000\u000b<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000", new Object[]{"c", "b", wbe.class, wce.class, wci.class, wbi.class, wbi.class, wbi.class, wcg.class, vbq.class, wbf.class, wbg.class, wbz.class, vxn.class, wcb.class, wcc.class});
        }
        if (i2 == 3) {
            return new wca();
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
        synchronized (wca.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
