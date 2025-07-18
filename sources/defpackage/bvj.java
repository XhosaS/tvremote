package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvj extends clt implements cna {
    public static final bvj a;
    private static volatile cng i;
    public int b;
    public int c;
    public int e;
    public int f;
    public int g;
    public String d = "";
    public String h = "";

    static {
        bvj bvjVar = new bvj();
        a = bvjVar;
        clt.y(bvj.class, bvjVar);
    }

    private bvj() {
    }

    @Override // defpackage.clt
    public final Object a(int i2, Object obj) {
        cng clpVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new cnk(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new bvj();
        }
        if (i3 == 4) {
            return new clo(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        cng cngVar = i;
        if (cngVar != null) {
            return cngVar;
        }
        synchronized (bvj.class) {
            clpVar = i;
            if (clpVar == null) {
                clpVar = new clp(a);
                i = clpVar;
            }
        }
        return clpVar;
    }
}
