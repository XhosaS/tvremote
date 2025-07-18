package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uaz extends vuc implements vvk {
    public static final uaz a;
    private static volatile vvq f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    private byte g = 2;

    static {
        uaz uazVar = new uaz();
        a = uazVar;
        vuc.y(uaz.class, uazVar);
    }

    private uaz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0002\u0000\u0001\u0005\u0005\u0000\u0000\u0003\u0001м\u0000\u0002м\u0001\u0003м\u0000\u0004;\u0000\u0005;\u0001", new Object[]{"c", "b", "e", "d", uda.class, ucy.class, ucz.class});
        }
        if (i2 == 3) {
            return new uaz();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uaz.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
