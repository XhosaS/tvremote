package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tms extends vuc implements vvk {
    public static final tms a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        tms tmsVar = new tms();
        a = tmsVar;
        vuc.y(tms.class, tmsVar);
    }

    private tms() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0011\u0001\u0000\u0001Z\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\b<\u0000\t<\u0000\n<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u001e<\u0000\u001f=\u0000 <\u00002<\u00003<\u0000<<\u0000=<\u0000F<\u0000Z<\u0000", new Object[]{"c", "b", tmq.class, tmr.class, tnk.class, tnl.class, tnj.class, tnf.class, tmv.class, tnh.class, tnr.class, tnu.class, tnz.class, tnx.class, tmo.class, tmn.class, tmu.class, tml.class});
        }
        if (i2 == 3) {
            return new tms();
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
        synchronized (tms.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
