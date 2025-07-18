package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cym extends clt implements cna {
    private static volatile cng C;
    public static final cym a;
    public cww A;
    public cxu B;
    private cyn D;
    private cxw E;
    public int b;
    public long c;
    public cxc f;
    public cxe g;
    public cxy h;
    public cyi i;
    public cwl j;
    public cyf k;
    public cxh l;
    public cwh m;
    public cwu n;
    public cxs o;
    public cme p;
    public cyb q;
    public cme r;
    public cme w;
    public cxv x;
    public cyl y;
    public cyc z;
    private byte F = 2;
    public String d = "";
    public String e = "";

    static {
        cym cymVar = new cym();
        a = cymVar;
        clt.y(cym.class, cymVar);
    }

    private cym() {
        clu cluVar = clu.a;
        cnj cnjVar = cnj.a;
        this.p = cnjVar;
        this.r = cnjVar;
        this.w = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.F);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\u0018\u0000\u0001\u0001'\u0018\u0000\u0003\n\u0001ဉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0004ဉ\u0004\u0005ဉ\u0017\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0018\tဉ\u0007\nᐉ\b\fᐉ\n\u000eᐉ\u001a\u0010ᐉ\u000b\u0011ဈ\u0002\u0015ဉ\u001b\u0017ဉ\u0019\u001dᐉ\u0013\u001eဉ\u0015\u001fဉ\u0016 ᐉ\u0011\"\u001b%Л&\u001b'ဉ\u0014", new Object[]{"b", "f", "c", "d", "D", "x", "g", "h", "y", "i", "j", "k", "A", "l", "e", "B", "z", "E", "o", "q", "m", "w", cwx.class, "p", cyq.class, "r", cyg.class, "n"});
        }
        if (i2 == 3) {
            return new cym();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.F = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = C;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cym.class) {
            clpVar = C;
            if (clpVar == null) {
                clpVar = new clp(a);
                C = clpVar;
            }
        }
        return clpVar;
    }
}
