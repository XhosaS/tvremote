package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkh extends vuc implements vvk {
    public static final vkh a;
    private static volatile vvq u;
    public int b;
    public float c;
    public int d;
    public int k;
    public vun n;
    public vun o;
    public int p;
    public String q;
    public vlu r;
    public vmg s;
    public int t;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String l = "";
    public String m = "";

    static {
        vkh vkhVar = new vkh();
        a = vkhVar;
        vuc.y(vkh.class, vkhVar);
    }

    private vkh() {
        vvt vvtVar = vvt.a;
        this.n = vvtVar;
        this.o = vvtVar;
        this.q = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0012\u0000\u0001\u0002\u0018\u0012\u0000\u0002\u0000\u0002ခ\u0000\u0003ဈ\u0003\u0004ဈ\u0005\u0005ဈ\u0006\u0006ဈ\u0007\u0007င\b\bဈ\t\t᠌\u0001\nဈ\u0002\u000bဈ\n\f\u001b\r\u001b\u000e᠌\u000b\u000fဈ\f\u0010ဉ\r\u0011ဉ\u000e\u0012᠌\u000f\u0018ဈ\u0004", new Object[]{"b", "c", "f", "h", "i", "j", "k", "l", "d", vid.q, "e", "m", "n", vke.class, "o", vkg.class, "p", vid.m, "q", "r", "s", "t", vid.l, "g"});
        }
        if (i2 == 3) {
            return new vkh();
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
        vvq vvqVar = u;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vkh.class) {
            vtxVar = u;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                u = vtxVar;
            }
        }
        return vtxVar;
    }
}
