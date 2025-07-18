package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzi extends vuc implements vvk {
    public static final uzi a;
    private static volatile vvq b;

    static {
        uzi uziVar = new uzi();
        a = uziVar;
        vuc.y(uzi.class, uziVar);
    }

    private uzi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new uzi();
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
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uzi.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
