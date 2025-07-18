package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpy extends vuc implements vvk {
    public static final wpy a;
    public static final vvd f;
    private static volatile vvq g;
    public wmc d;
    public woi e;
    private int h;
    private byte i = 2;
    public String b = "";
    public String c = "";

    static {
        wpy wpyVar = new wpy();
        a = wpyVar;
        vuc.y(wpy.class, wpyVar);
        f = vuc.C(wkg.a, wpyVar, wpyVar, 372454989, vwo.MESSAGE);
    }

    private wpy() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003", new Object[]{"h", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new wpy();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wpy.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
