package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bag extends clt implements cna {
    public static final bag a;
    private static volatile cng l;
    public int b;
    public cwt c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public cww j;
    public int k;
    private byte m = 2;
    public String i = "";

    static {
        bag bagVar = new bag();
        a = bagVar;
        clt.y(bag.class, bagVar);
    }

    private bag() {
    }

    @Override // defpackage.clt
    public final Object a(int i, Object obj) {
        cng clpVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new cnk(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new bag();
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
        synchronized (bag.class) {
            clpVar = l;
            if (clpVar == null) {
                clpVar = new clp(a);
                l = clpVar;
            }
        }
        return clpVar;
    }
}
