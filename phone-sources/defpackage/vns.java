package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vns extends vuc implements vvk {
    public static final vns a;
    private static volatile vvq i;
    public int b;
    public Object d;
    public boolean e;
    public int f;
    public boolean g;
    public int c = 0;
    public vuj h = vud.a;

    static {
        vns vnsVar = new vns();
        a = vnsVar;
        vuc.y(vns.class, vnsVar);
    }

    private vns() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\n\u0001\u0001\u0001\r\n\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007ဇ\u0000\b᠌\u0001\tဇ\u0002\u000b\u0016\r<\u0000", new Object[]{"d", "c", "b", vnl.class, vnq.class, vny.class, vnw.class, vnu.class, "e", "f", vnk.e, "g", "h", vnm.class});
        }
        if (i3 == 3) {
            return new vns();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vns.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
