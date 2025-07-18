package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmc extends vuc implements vvk {
    public static final vmc a;
    private static volatile vvq f;
    public Object c;
    public boolean e;
    private int g;
    public int b = 0;
    public String d = "";

    static {
        vmc vmcVar = new vmc();
        a = vmcVar;
        vuc.y(vmc.class, vmcVar);
    }

    private vmc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0001\u0002ဈ\u0000\u0003;\u0000\u0004;\u0000\u0005:\u0000\u0006:\u0000", new Object[]{"c", "b", "g", "e", "d"});
        }
        if (i2 == 3) {
            return new vmc();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vmc.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
