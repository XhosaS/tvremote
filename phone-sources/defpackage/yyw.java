package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyw extends vuc implements vvk {
    public static final yyw a;
    private static volatile vvq m;
    public int b;
    public int c;
    public long d;
    public yzi g;
    public int h;
    public long i;
    public yzf j;
    public long k;
    public long l;
    private byte n = 2;
    public String e = "";
    public String f = "";

    static {
        yyw yywVar = new yyw();
        a = yywVar;
        vuc.y(yyw.class, yywVar);
    }

    private yyw() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.n);
        }
        if (i2 == 2) {
            vuh vuhVar = yyv.a;
            return new vvu(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001᠌\u0000\u0002᠌\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004\fဂ\t", new Object[]{"b", "c", vuhVar, "h", vuhVar, "i", "j", "k", "d", "e", "f", "g", "l"});
        }
        if (i2 == 3) {
            return new yyw();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.n = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yyw.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
