package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vxn extends vuc implements vvk {
    public static final vxn a;
    private static volatile vvq b;
    private int c;
    private vxm d;

    static {
        vxn vxnVar = new vxn();
        a = vxnVar;
        vuc.y(vxn.class, vxnVar);
    }

    private vxn() {
        vuz vuzVar = vuz.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new vxn();
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
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vxn.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
