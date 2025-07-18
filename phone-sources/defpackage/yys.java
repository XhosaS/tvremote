package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yys extends vuc implements vvk {
    public static final yys a;
    private static volatile vvq p;
    public int b;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public yyr l;
    public yzi m;
    public zbc n;
    public zbf o;
    private byte q = 2;
    public String c = "";

    static {
        yys yysVar = new yys();
        a = yysVar;
        vuc.y(yys.class, yysVar);
    }

    private yys() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0000\u0002\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0006\u0007ဂ\u0007\bဇ\b\tဉ\t\nဂ\u0005\u000bᐉ\n\fᐉ\u000b\rဉ\f", new Object[]{"b", "c", "d", yyv.b, "e", "f", xal.u, "g", "i", "j", "k", "l", "h", "m", "n", "o"});
        }
        if (i2 == 3) {
            return new yys();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = p;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yys.class) {
            vtxVar = p;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                p = vtxVar;
            }
        }
        return vtxVar;
    }
}
