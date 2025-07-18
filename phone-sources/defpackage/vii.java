package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vii extends vuc implements vvk {
    public static final vii a;
    private static volatile vvq o;
    public int b;
    public int c;
    public int e;
    public int g;
    public vgv h;
    public vgs i;
    public vhy j;
    public int k;
    public int l;
    public int m;
    public vig n;
    public String d = "";
    public vun f = vvt.a;

    static {
        vii viiVar = new vii();
        a = viiVar;
        vuc.y(vii.class, viiVar);
    }

    private vii() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\f\u0000\u0001\u0001\"\f\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0005ဉ\u0007\u0006ဉ\b\t᠌\u0002\n᠌\f\f\u001b\r᠌\r\u000eဉ\u000b\u000f᠌\u000e\u0013ဉ\u0010\"᠌\u0006", new Object[]{"b", "c", vid.d, "d", "h", "i", "e", vid.a, "k", vid.c, "f", vih.class, "l", vgp.q, "j", "m", vgp.i, "n", "g", vgp.f});
        }
        if (i2 == 3) {
            return new vii();
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
        vvq vvqVar = o;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vii.class) {
            vtxVar = o;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                o = vtxVar;
            }
        }
        return vtxVar;
    }
}
