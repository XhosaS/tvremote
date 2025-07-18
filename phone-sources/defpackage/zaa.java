package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zaa extends vuc implements vvk {
    public static final zaa a;
    private static volatile vvq d;
    public vwe b;
    public vun c = vvt.a;
    private int e;

    static {
        zaa zaaVar = new zaa();
        a = zaaVar;
        vuc.y(zaa.class, zaaVar);
    }

    private zaa() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0000\u0001\u0004\u0007\u0002\u0000\u0001\u0000\u0004ဉ\u0004\u0007\u001b", new Object[]{"e", "b", "c", zae.class});
        }
        if (i2 == 3) {
            return new zaa();
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
        synchronized (zaa.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
