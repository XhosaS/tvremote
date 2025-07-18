package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmk extends vuc implements vvk {
    public static final vmk a;
    private static volatile vvq f;
    public int b;
    public long c;
    public vmj d;
    public int e;
    private int g;

    static {
        vmk vmkVar = new vmk();
        a = vmkVar;
        vuc.y(vmk.class, vmkVar);
    }

    private vmk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0004᠌\u0003", new Object[]{"g", "b", vlj.l, "c", "d", "e", vlj.f});
        }
        if (i2 == 3) {
            return new vmk();
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
        synchronized (vmk.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
