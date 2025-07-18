package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vcg extends vuc implements vvk {
    public static final vcg a;
    private static volatile vvq e;
    public int b;
    public vdt c;
    public int d;

    static {
        vcg vcgVar = new vcg();
        a = vcgVar;
        vuc.y(vcg.class, vcgVar);
    }

    private vcg() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new vcg();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vcg.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
