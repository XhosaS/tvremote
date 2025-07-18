package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucj extends vtz implements vua {
    public static final ucj a;
    private static volatile vvq m;
    public int b;
    public int c;
    public int g;
    public wcs h;
    public int i;
    public uav k;
    private byte n = 2;
    public int d = -1;
    public vuj e = vud.a;
    public String f = "";
    public int j = -1;

    static {
        ucj ucjVar = new ucj();
        a = ucjVar;
        vuc.y(ucj.class, ucjVar);
    }

    private ucj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\t\u0000\u0001\u0001è\t\u0000\u0001\u0002\u0001င\u0000\u0003င\u0001\u0004\u0016\u0005ဈ\u0002\u0006᠌\u0005\u0007င\u0003\u000bᐉ\u0004\u0095င\bèᐉ\t", new Object[]{"b", "c", "d", "e", "f", "i", ubu.g, "g", "h", "j", "k"});
        }
        if (i2 == 3) {
            return new ucj();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ucj.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
