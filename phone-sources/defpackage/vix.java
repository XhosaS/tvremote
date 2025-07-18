package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vix extends vuc implements vvk {
    public static final vix a;
    private static volatile vvq h;
    public int b;
    public long e;
    public long g;
    public String c = "";
    public String d = "";
    public String f = "";

    static {
        vix vixVar = new vix();
        a = vixVar;
        vuc.y(vix.class, vixVar);
    }

    private vix() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဈ\u0001", new Object[]{"b", "c", "f", "e", "g", "d"});
        }
        if (i2 == 3) {
            return new vix();
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
        synchronized (vix.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
