package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpw extends vuc implements vvk {
    public static final wpw a;
    public static final vvd g;
    private static volatile vvq h;
    public boolean c;
    public wkx d;
    public wmc e;
    public woi f;
    private int i;
    private byte j = 2;
    public String b = "";

    static {
        wpw wpwVar = new wpw();
        a = wpwVar;
        vuc.y(wpw.class, wpwVar);
        g = vuc.C(wkg.a, wpwVar, wpwVar, 403206638, vwo.MESSAGE);
    }

    private wpw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0002\u0003ဉ\u0003\u0004ဇ\u0001\u0005ᐉ\u0004", new Object[]{"i", "b", "d", "e", "c", "f"});
        }
        if (i2 == 3) {
            return new wpw();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wpw.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
