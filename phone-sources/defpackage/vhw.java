package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vhw extends vuc implements vvk {
    public static final vhw a;
    private static volatile vvq s;
    public int b;
    public float c;
    public int d;
    public int k;
    public vun m;
    public vun n;
    public int o;
    public String p;
    public vhv q;
    public int r;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";

    static {
        vhw vhwVar = new vhw();
        a = vhwVar;
        vuc.y(vhw.class, vhwVar);
    }

    private vhw() {
        vvt vvtVar = vvt.a;
        this.m = vvtVar;
        this.n = vvtVar;
        this.p = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0010\u0000\u0001\u0002\u0015\u0010\u0000\u0002\u0000\u0002ခ\u0000\u0003᠌\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nဈ\t\f\u001b\r\u001b\u000e᠌\u000b\u000fဈ\f\u0010ဉ\u000e\u0011᠌\u000f\u0015ဈ\u0004", new Object[]{"b", "c", "d", vgp.a, "e", "f", "h", "i", "j", "k", "l", "m", vgv.class, "n", vgs.class, "o", vgp.r, "p", "q", "r", vgp.t, "g"});
        }
        if (i2 == 3) {
            return new vhw();
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
        vvq vvqVar = s;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vhw.class) {
            vtxVar = s;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                s = vtxVar;
            }
        }
        return vtxVar;
    }
}
