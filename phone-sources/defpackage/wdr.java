package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdr extends vuc implements vvk {
    public static final wdr a;
    private static volatile vvq m;
    public int b;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public wdl k;
    public boolean l;
    public String c = "";
    public String d = "";
    public String j = "";

    static {
        wdr wdrVar = new wdr();
        a = wdrVar;
        vuc.y(wdr.class, wdrVar);
    }

    private wdr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\bဇ\u0007\t᠌\b\nဈ\t\u000bဉ\n\fဇ\u000b", new Object[]{"b", "c", "d", "e", wdp.c, "f", vnk.t, "g", wdp.a, "h", "i", vnk.u, "j", "k", "l"});
        }
        if (i2 == 3) {
            return new wdr();
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
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wdr.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
