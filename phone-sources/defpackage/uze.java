package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uze extends vuc implements vvk {
    public static final uze a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        uze uzeVar = new uze();
        a = uzeVar;
        vuc.y(uze.class, uzeVar);
    }

    private uze() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u083f\u0000\u0006<\u0000", new Object[]{"c", "b", uxl.class, uyt.class, uxi.class, uzh.class, uvj.h, uxu.class});
        }
        if (i2 == 3) {
            return new uze();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uze.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
