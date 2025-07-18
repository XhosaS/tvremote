package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vha extends vuc implements vvk {
    public static final vha a;
    private static volatile vvq f;
    public int b;
    public int c = 0;
    public Object d;
    public vgz e;

    static {
        vha vhaVar = new vha();
        a = vhaVar;
        vuc.y(vha.class, vhaVar);
    }

    private vha() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0006<\u0000", new Object[]{"d", "c", "b", "e", vii.class, vhs.class, via.class, vhe.class});
        }
        if (i2 == 3) {
            return new vha();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vha.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
