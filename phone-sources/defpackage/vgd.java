package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgd extends vuc implements vvk {
    public static final vgd a;
    private static volatile vvq e;
    public String b = "";
    public String c = "";
    public int d;

    static {
        vgd vgdVar = new vgd();
        a = vgdVar;
        vuc.y(vgd.class, vgdVar);
    }

    private vgd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new vgd();
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
        synchronized (vgd.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
