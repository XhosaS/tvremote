package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzi extends vuc implements vvk {
    public static final rzi a;
    private static volatile vvq h;
    public int b;
    public long f;
    public String c = "";
    public vsz d = vsz.b;
    public String e = "";
    public vun g = vvt.a;

    static {
        rzi rziVar = new rzi();
        a = rziVar;
        vuc.y(rzi.class, rziVar);
    }

    private rzi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"b", "c", "d", "e", "f", "g", rzj.class});
        }
        if (i2 == 3) {
            return new rzi();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rzi.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
