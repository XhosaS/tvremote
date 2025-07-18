package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbf extends vuc implements vvk {
    public static final xbf a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        xbf xbfVar = new xbf();
        a = xbfVar;
        vuc.y(xbf.class, xbfVar);
    }

    private xbf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0000ϯϯ\u0001\u0000\u0001\u0000ϯ\u001b", new Object[]{"b", xbg.class});
        }
        if (i2 == 3) {
            return new xbf();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xbf.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
