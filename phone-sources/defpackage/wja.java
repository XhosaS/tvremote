package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wja extends vuc implements vvk {
    private static volatile vvq B;
    public static final wja a;
    public int A;
    public int b;
    public int c;
    public int d;
    public wje e;
    public int f;
    public win g;
    public wiz h;
    public int i;
    public int j;
    public int k;
    public wiy l;
    public int m;
    public boolean n;
    public int o;
    public int p;
    public wix q;
    public String r = "";
    public int s;
    public boolean t;
    public wik u;
    public int v;
    public wiw w;
    public String x;
    public String y;
    public String z;

    static {
        wja wjaVar = new wja();
        a = wjaVar;
        vuc.y(wja.class, wjaVar);
    }

    private wja() {
        vud vudVar = vud.a;
        this.x = "";
        this.y = "";
        this.z = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0019\u0000\u0001\u0001 \u0019\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0004ဉ\u0003\u0005င\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bင\u0007\tင\b\n᠌\t\u000bဉ\n\fင\u000b\rဇ\f\u000eင\r\u000f᠌\u000e\u0010ဉ\u000f\u0011ဈ\u0010\u0013င\u0012\u0014ဇ\u0013\u0017ဉ\u0016\u0018᠌\u0017\u001cဉ\u001a\u001dဈ\u001b\u001eဈ\u001c\u001fဈ\u001d ᠌\u001e", new Object[]{"b", "c", wia.o, "d", wia.s, "e", "f", "g", "h", "i", "j", "k", wia.p, "l", "m", "n", "o", "p", wia.t, "q", "r", "s", "t", "u", "v", wia.q, "w", "x", "y", "z", "A", wia.n});
        }
        if (i2 == 3) {
            return new wja();
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
        vvq vvqVar = B;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wja.class) {
            vtxVar = B;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                B = vtxVar;
            }
        }
        return vtxVar;
    }
}
