package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zad extends vuc implements vvk {
    public static final zad a;
    private static volatile vvq b;

    static {
        zad zadVar = new zad();
        a = zadVar;
        vuc.y(zad.class, zadVar);
    }

    private zad() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new zad();
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
        synchronized (zad.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
