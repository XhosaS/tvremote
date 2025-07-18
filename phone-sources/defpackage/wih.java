package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wih extends vuc implements vvk {
    public static final wih a;
    private static volatile vvq u;
    public int b;
    public int c;
    public int d;
    public win e;
    public wig f;
    public int g;
    public int h;
    public wie i;
    public why j;
    public wib k;
    public int l;
    public int o;
    public wif r;
    public int s;
    public boolean t;
    public String m = "";
    public String n = "";
    public String p = "";
    public vun q = vvt.a;

    static {
        wih wihVar = new wih();
        a = wihVar;
        vuc.y(wih.class, wihVar);
    }

    private wih() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0011\u0000\u0002\u0001'\u0011\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\bဉ\u0007\tဉ\b\nဉ\t\u000b᠌\n\rဈ\f\u000eဈ\r\u0017င\u0015\u0019ဈ\u0017#\u001b%᠌$&ဇ%'ဉ\"", new Object[]{"b", "c", "d", "e", "f", "g", "h", wia.d, "i", "j", "k", "l", wia.b, "m", "n", "o", "p", "q", whz.class, "s", wia.e, "t", "r"});
        }
        if (i2 == 3) {
            return new wih();
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
        synchronized (wih.class) {
            vtxVar = u;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                u = vtxVar;
            }
        }
        return vtxVar;
    }
}
