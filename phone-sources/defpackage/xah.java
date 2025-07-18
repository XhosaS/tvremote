package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xah extends vuc implements vvk {
    public static final xah a;
    private static volatile vvq l;
    public boolean b;
    public boolean c;
    public vun d = vvt.a;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    private int m;

    static {
        xah xahVar = new xah();
        a = xahVar;
        vuc.y(xah.class, xahVar);
    }

    private xah() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\n\u0000\u0001\u0002\u001d\n\u0000\u0001\u0000\u0002ဇ\u0000\u0003ဇ\u0001\u0004\u001b\u0005ဇ\u0002\u0014ဇ\u0005\u0015ဇ\u0006\u0016ဇ\b\u0017ဇ\t\u001cဇ\u000e\u001dဇ\u0007", new Object[]{"m", "b", "c", "d", xbc.class, "e", "f", "g", "i", "j", "k", "h"});
        }
        if (i2 == 3) {
            return new xah();
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
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xah.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
