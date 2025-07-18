package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xac extends vuc implements vvk {
    public static final xac a;
    private static volatile vvq e;
    public int b;
    public vun c = vvt.a;
    public String d = "";
    private int f;

    static {
        xac xacVar = new xac();
        a = xacVar;
        vuc.y(xac.class, xacVar);
    }

    private xac() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001", new Object[]{"f", "b", wjk.t, "c", xat.class, "d"});
        }
        if (i2 == 3) {
            return new xac();
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
        synchronized (xac.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
