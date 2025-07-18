package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxy extends clt implements cna {
    public static final cxy a;
    private static volatile cng l;
    public int b;
    public boolean c;
    public cxr d;
    public int g;
    public cgl i;
    public cya j;
    public cxx k;
    private byte m = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        cxy cxyVar = new cxy();
        a = cxyVar;
        clt.y(cxy.class, cxyVar);
    }

    private cxy() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", cxb.g, "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new cxy();
        }
        if (i2 == 4) {
            return new clo(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        cng cngVar = l;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (cxy.class) {
            clpVar = l;
            if (clpVar == null) {
                clpVar = new clp(a);
                l = clpVar;
            }
        }
        return clpVar;
    }
}
