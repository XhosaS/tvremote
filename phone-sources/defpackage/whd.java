package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whd extends vuc implements vvk {
    public static final whd a;
    private static volatile vvq x;
    public int b;
    public long c;
    public long e;
    public int f;
    public int u;
    public boolean v;
    public int w;
    public String d = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String q = "";
    public String r = "";
    public String s = "";
    public String t = "";

    static {
        whd whdVar = new whd();
        a = whdVar;
        vuc.y(whd.class, whdVar);
    }

    private whd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0015\u0000\u0001\u0001#\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\b\u0007ဈ\t\bဈ\u0006\tဈ\u0007\nဈ\n\u000bဈ\u000b\fဈ\f\rဈ\r\u000eဈ\u000e\u000fဈ\u000f\u0010ဈ\u0010\u0011ဈ\u0011\u0012ဂ\u0002\u0013င\u0012\u0014ဇ\u0013#᠌\u0019", new Object[]{"b", "c", "d", "f", "g", "h", "k", "l", "i", "j", "m", "n", "o", "p", "q", "r", "s", "t", "e", "u", "v", "w", wdp.q});
        }
        if (i2 == 3) {
            return new whd();
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
        vvq vvqVar = x;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (whd.class) {
            vtxVar = x;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                x = vtxVar;
            }
        }
        return vtxVar;
    }
}
