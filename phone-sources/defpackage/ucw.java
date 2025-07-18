package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucw extends vuc implements vvk {
    public static final ucw a;
    private static volatile vvq b;
    private int c;
    private int d;
    private byte e = 2;

    static {
        ucw ucwVar = new ucw();
        a = ucwVar;
        vuc.y(ucw.class, ucwVar);
    }

    private ucw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᴌ\u0000", new Object[]{"c", "d", ubu.i});
        }
        if (i2 == 3) {
            return new ucw();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ucw.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
