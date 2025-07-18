package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcl extends vuc implements vvk {
    public static final lcl a;
    private static volatile vvq t;
    public int b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long h;
    public long i;
    public long j;
    public kzo l;
    public int m;
    public float q;
    public int r;
    public int s;
    public vsz g = vsz.b;
    public String k = "";
    public String n = "";
    public String o = "";
    public String p = "";

    static {
        lcl lclVar = new lcl();
        a = lclVar;
        vuc.y(lcl.class, lclVar);
    }

    private lcl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ည\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဈ\b\nဉ\t\u000bင\n\fဈ\u000b\r᠌\u000f\u000e᠌\u0010\u000fဈ\f\u0010ဈ\r\u0011ခ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "r", kzn.d, "s", kzn.c, "o", "p", "q"});
        }
        if (i2 == 3) {
            return new lcl();
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
        synchronized (lcl.class) {
            vtxVar = t;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                t = vtxVar;
            }
        }
        return vtxVar;
    }
}
