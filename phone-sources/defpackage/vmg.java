package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vmg extends vuc implements vvk {
    public static final vmg a;
    private static volatile vvq k;
    public int b;
    public vmf c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public vuj h = vud.a;
    public boolean i;
    public boolean j;

    static {
        vmg vmgVar = new vmg();
        a = vmgVar;
        vuc.y(vmg.class, vmgVar);
    }

    private vmg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\u000f\b\u0000\u0001\u0000\u0001ဉ\u0000\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\u000bࠬ\rဇ\u000b\u000fဇ\r", new Object[]{"b", "c", "d", "e", "f", "g", "h", vlj.c, "i", "j"});
        }
        if (i2 == 3) {
            return new vmg();
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
        synchronized (vmg.class) {
            vtxVar = k;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                k = vtxVar;
            }
        }
        return vtxVar;
    }
}
