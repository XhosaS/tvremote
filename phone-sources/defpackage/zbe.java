package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbe extends vuc implements vvk {
    public static final zbe a;
    private static volatile vvq f;
    public int b;
    public Object d;
    public zbd e;
    public int c = 0;
    private byte g = 2;

    static {
        zbe zbeVar = new zbe();
        a = zbeVar;
        vuc.y(zbe.class, zbeVar);
    }

    private zbe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001<\u0000\u0002ᐉ\u0000\u0003м\u0000", new Object[]{"d", "c", "b", zaa.class, "e", zbh.class});
        }
        if (i2 == 3) {
            return new zbe();
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
        synchronized (zbe.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
