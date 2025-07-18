package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsm extends vuc implements vvk {
    public static final rsm a;
    private static volatile vvq e;
    public String b = "";
    public vun c = vvt.a;
    public boolean d;
    private int f;

    static {
        rsm rsmVar = new rsm();
        a = rsmVar;
        vuc.y(rsm.class, rsmVar);
    }

    private rsm() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"f", "b", "c", rsl.class, "d"});
        }
        if (i2 == 3) {
            return new rsm();
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
        synchronized (rsm.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
