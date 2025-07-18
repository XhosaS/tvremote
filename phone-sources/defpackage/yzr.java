package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzr extends vuc implements vvk {
    private static volatile vvq A;
    public static final yzr a;
    public int b;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public zaf l;
    public int m;
    public yzp n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public vum v;
    public String w;
    public yzt x;
    public yzo y;
    public long z;
    private byte B = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        yzr yzrVar = new yzr();
        a = yzrVar;
        vuc.y(yzr.class, yzrVar);
    }

    private yzr() {
        vvt vvtVar = vvt.a;
        this.u = "";
        this.v = vuz.a;
        this.w = "";
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.B);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0018\u0000\u0001\u0001\u001c\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006ဋ\u0006\u0007ဋ\u0007\b᠌\b\nဉ\t\u000bဉ\u000b\rဂ\u000e\u000e᠌\u000f\u000f᠌\u0010\u0010င\u0012\u0011ဈ\u0013\u0013င\u0011\u0014ဈ\u0015\u0015(\u0016ဉ\u0016\u0018᠌\n\u0019ဈ\u0002\u001aဉ\u0017\u001b᠌\f\u001cဂ\u0018", new Object[]{"b", "c", "d", "f", "g", "h", "i", "j", "k", yyv.i, "l", "n", "p", "q", yyv.j, "r", yyv.h, "t", "u", "s", "w", "v", "x", "m", yyv.f, "e", "y", "o", yyv.g, "z"});
        }
        if (i2 == 3) {
            return new yzr();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.B = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = A;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzr.class) {
            vtxVar = A;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                A = vtxVar;
            }
        }
        return vtxVar;
    }
}
