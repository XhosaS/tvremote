package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bst extends clt implements cna {
    public static final bst a;
    private static volatile cng n;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public long m;

    static {
        bst bstVar = new bst();
        a = bstVar;
        clt.y(bst.class, bstVar);
    }

    private bst() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\fင\u000b\rဂ\f", new Object[]{"b", "c", awv.i, "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new bst();
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
        cng cngVar = n;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bst.class) {
            clpVar = n;
            if (clpVar == null) {
                clpVar = new clp(a);
                n = clpVar;
            }
        }
        return clpVar;
    }
}
