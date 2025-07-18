package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlb extends vuc implements vvk {
    public static final vlb a;
    private static volatile vvq h;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private int i;

    static {
        vlb vlbVar = new vlb();
        a = vlbVar;
        vuc.y(vlb.class, vlbVar);
    }

    private vlb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"i", "b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new vlb();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vlb.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
