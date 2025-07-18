package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udf extends vuc implements vvk {
    public static final udf a;
    private static volatile vvq f;
    public int b;
    public udd c;
    public int d;
    private byte g = 2;
    public vuj e = vud.a;

    static {
        udf udfVar = new udf();
        a = udfVar;
        vuc.y(udf.class, udfVar);
    }

    private udf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new udf();
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
        synchronized (udf.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
