package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvi extends clt implements cna {
    public static final bvi a;
    private static volatile cng w;
    public int b;
    public int c;
    public int d;
    public int e;
    public int h;
    public int k;
    public int o;
    public cme q;
    public cme r;
    public String f = "";
    public String g = "";
    public int i = -1;
    public int j = -1;
    public String l = "";
    public String m = "";
    public String n = "";
    public String p = "";

    static {
        bvi bviVar = new bvi();
        a = bviVar;
        clt.y(bvi.class, bviVar);
    }

    private bvi() {
        cnj cnjVar = cnj.a;
        this.q = cnjVar;
        this.r = cnjVar;
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nဈ\t\u000bဈ\n\fဈ\u000b\rင\f\u000eဈ\r\u0010\u001b\u0011\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", bvh.class, "r"});
        }
        if (i2 == 3) {
            return new bvi();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        cng cngVar = w;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bvi.class) {
            clpVar = w;
            if (clpVar == null) {
                clpVar = new clp(a);
                w = clpVar;
            }
        }
        return clpVar;
    }
}
