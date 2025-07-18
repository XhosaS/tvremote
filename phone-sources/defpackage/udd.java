package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udd extends vuc implements vvk {
    public static final udd a;
    private static volatile vvq g;
    public int b;
    public long e;
    private byte h = 2;
    public String c = "";
    public String d = "";
    public vun f = vvt.a;

    static {
        udd uddVar = new udd();
        a = uddVar;
        vuc.y(udd.class, uddVar);
    }

    private udd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{"b", "c", "d", "e", "f", udc.class});
        }
        if (i2 == 3) {
            return new udd();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (udd.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
