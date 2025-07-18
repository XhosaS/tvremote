package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uyy extends vuc implements vvk {
    public static final uyy a;
    private static volatile vvq t;
    public int b;
    public int c = 0;
    public Object d;
    public wes e;
    public wes f;
    public wes g;
    public wes h;
    public wes i;
    public wes j;
    public wes k;
    public vun l;
    public vun m;
    public String n;
    public String o;
    public uxw p;
    public int q;
    public float r;
    public boolean s;

    static {
        uyy uyyVar = new uyy();
        a = uyyVar;
        vuc.y(uyy.class, uyyVar);
    }

    private uyy() {
        vvt vvtVar = vvt.a;
        this.l = vvtVar;
        this.m = vvtVar;
        this.n = "";
        this.o = "";
        this.r = 1.0f;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0012\u0001\u0001\u0001\u0014\u0012\u0000\u0002\u0000\u0001;\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဈ\b\u0005ဈ\t\u0006ဉ\u0004\bဉ\n\n;\u0000\u000b7\u0000\fဉ\u0003\rဉ\u0005\u000eဉ\u0002\u000fဉ\u0006\u0010᠌\f\u0011ခ\r\u0012\u001b\u0013\u001b\u0014ဇ\u000e", new Object[]{"d", "c", "b", "e", "f", "n", "o", "i", "p", "h", "j", "g", "k", "q", uxz.l, "r", "l", uyw.class, "m", uyw.class, "s"});
        }
        if (i2 == 3) {
            return new uyy();
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
        vvq vvqVar = t;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uyy.class) {
            vtxVar = t;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                t = vtxVar;
            }
        }
        return vtxVar;
    }
}
