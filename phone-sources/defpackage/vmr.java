package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmr extends vuc implements vvk {
    public static final vmr a;
    private static volatile vvq d;
    public vun b;
    public vun c;

    static {
        vmr vmrVar = new vmr();
        a = vmrVar;
        vuc.y(vmr.class, vmrVar);
    }

    private vmr() {
        vvt vvtVar = vvt.a;
        this.b = vvtVar;
        this.c = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new vmr();
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
        synchronized (vmr.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
