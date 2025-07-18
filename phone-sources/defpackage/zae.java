package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zae extends vuc implements vvk {
    public static final zae a;
    private static volatile vvq e;
    public int b = 0;
    public long c;
    public vtl d;
    private int f;
    private Object g;

    static {
        zae zaeVar = new zae();
        a = zaeVar;
        vuc.y(zae.class, zaeVar);
    }

    private zae() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"g", "b", "f", "c", "d", zac.class, zad.class, zab.class});
        }
        if (i2 == 3) {
            return new zae();
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
        synchronized (zae.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
