package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xag extends vuc implements vvk {
    public static final xag a;
    private static volatile vvq d;
    public long b;
    public vun c = vvt.a;
    private int e;

    static {
        xag xagVar = new xag();
        a = xagVar;
        vuc.y(xag.class, xagVar);
    }

    private xag() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0000\u0001\u0016ϯ\u0002\u0000\u0001\u0000\u0016ဂ\u0001ϯ\u001b", new Object[]{"e", "b", "c", xax.class});
        }
        if (i2 == 3) {
            return new xag();
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
        synchronized (xag.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
