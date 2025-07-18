package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wph extends vuc implements vvk {
    public static final wph a;
    private static volatile vvq d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        wph wphVar = new wph();
        a = wphVar;
        vuc.y(wph.class, wphVar);
    }

    private wph() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000", new Object[]{"c", "b", wpf.class, wpe.class});
        }
        if (i2 == 3) {
            return new wph();
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
        synchronized (wph.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
