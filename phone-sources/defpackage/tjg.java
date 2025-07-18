package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjg extends vuc implements vvk {
    public static final tjg a;
    private static volatile vvq d;
    public int b;
    private byte e = 2;
    public vsz c = vsz.b;

    static {
        tjg tjgVar = new tjg();
        a = tjgVar;
        vuc.y(tjg.class, tjgVar);
    }

    private tjg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔊ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new tjg();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tjg.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
