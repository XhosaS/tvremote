package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhs extends vuc implements vvk {
    public static final vhs a;
    private static volatile vvq j;
    public int b;
    public int c;
    public int d;
    public int e;
    public vhy f;
    public int h;
    public String g = "";
    public vuj i = vud.a;

    static {
        vhs vhsVar = new vhs();
        a = vhsVar;
        vuc.y(vhs.class, vhsVar);
    }

    private vhs() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0007\u0000\u0001\u0001%\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0003᠌\u0003\u0004ဉ\u0004\u0005ဈ\u0005\b᠌\b\nࠬ%᠌\u0001", new Object[]{"b", "c", vgp.n, "e", vgp.m, "f", "g", "h", vgp.p, "i", vgp.o, "d", vgp.f});
        }
        if (i2 == 3) {
            return new vhs();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vhs.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
