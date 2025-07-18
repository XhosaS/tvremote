package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zao extends vuc implements vvk {
    public static final zao a;
    private static volatile vvq g;
    public int b;
    public int c;
    public int d;
    public vuj e;
    public vuj f;

    static {
        zao zaoVar = new zao();
        a = zaoVar;
        vuc.y(zao.class, zaoVar);
    }

    private zao() {
        vud vudVar = vud.a;
        this.e = vudVar;
        this.f = vudVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zao();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zao.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
