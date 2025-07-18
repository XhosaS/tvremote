package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vam extends vuc implements vvk {
    public static final vam a;
    private static volatile vvq e;
    public vun b;
    public vun c;
    public vdp d;
    private int f;

    static {
        vam vamVar = new vam();
        a = vamVar;
        vuc.y(vam.class, vamVar);
    }

    private vam() {
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
            return new vvu(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"f", "b", vcn.class, "c", vdv.class, "d"});
        }
        if (i2 == 3) {
            return new vam();
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
        synchronized (vam.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
