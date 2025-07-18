package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzt extends vuc implements vvk {
    public static final uzt a;
    private static volatile vvq e;
    public int b;
    public vun c = vvt.a;
    public String d = "";

    static {
        uzt uztVar = new uzt();
        a = uztVar;
        vuc.y(uzt.class, uztVar);
    }

    private uzt() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002\u001b\u0003Ȉ", new Object[]{"b", "c", vcn.class, "d"});
        }
        if (i2 == 3) {
            return new uzt();
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
        synchronized (uzt.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
