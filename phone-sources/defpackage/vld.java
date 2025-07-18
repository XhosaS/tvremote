package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vld extends vuc implements vvk {
    public static final vld a;
    private static volatile vvq z;
    public int b;
    public vls f;
    public long g;
    public vla i;
    public vlb k;
    public int l;
    public vlc m;
    public vkw o;
    public int q;
    public int s;
    public boolean t;
    public int u;
    public vly w;
    public vlz x;
    public boolean y;
    public String c = "";
    public String d = "";
    public vun e = vvt.a;
    public String h = "";
    public String j = "";
    public String n = "";
    public String p = "";
    public String r = "";
    public String v = "";

    static {
        vld vldVar = new vld();
        a = vldVar;
        vuc.y(vld.class, vldVar);
    }

    private vld() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\bဈ\u0006\tဉ\u0007\n᠌\b\u000bဉ\t\fဈ\n\rဉ\u000b\u000eဈ\f\u000fင\r\u0010ဈ\u000e\u0011᠌\u000f\u0012ဇ\u0010\u0013ဈ\u0012\u0016ဉ\u0015\u0017ဉ\u0016\u0019ဇ\u0018\u001a᠌\u0011", new Object[]{"b", "c", "d", "e", vls.class, "f", "g", "h", "i", "j", "k", "l", vid.s, "m", "n", "o", "p", "q", "r", "s", vid.u, "t", "v", "w", "x", "y", "u", vlj.b});
        }
        if (i2 == 3) {
            return new vld();
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
        vvq vvqVar = z;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vld.class) {
            vtxVar = z;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                z = vtxVar;
            }
        }
        return vtxVar;
    }
}
