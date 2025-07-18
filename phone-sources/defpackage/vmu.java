package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmu extends vuc implements vvk {
    public static final vmu a;
    private static volatile vvq k;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public vli f;
    public vun g = vvt.a;
    public int h;
    public vms i;
    public vmr j;

    static {
        vmu vmuVar = new vmu();
        a = vmuVar;
        vuc.y(vmu.class, vmuVar);
    }

    private vmu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\t\b\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0002\u0003ဉ\u0003\u0005\u001b\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဇ\u0001", new Object[]{"b", "c", vlj.n, "e", "f", "g", vmt.class, "h", vlj.o, "i", "j", "d"});
        }
        if (i2 == 3) {
            return new vmu();
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
        vvq vvqVar = k;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vmu.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
