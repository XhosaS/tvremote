package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyr extends vuc implements vvk {
    public static final uyr a;
    private static volatile vvq i;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public boolean f;
    public int g;
    public int h;

    static {
        uyr uyrVar = new uyr();
        a = uyrVar;
        vuc.y(uyr.class, uyrVar);
    }

    private uyr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\n\u0001\u0001\u0002\u000b\n\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007᠌\u0003\b᠌\u0001\tဇ\u0002\n᠌\u0004\u000b<\u0000", new Object[]{"d", "c", "b", uyc.class, uyy.class, uxg.class, uzb.class, uyo.class, "g", uxz.i, "e", uxz.j, "f", "h", uxz.h, uyd.class});
        }
        if (i3 == 3) {
            return new uyr();
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
        synchronized (uyr.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
