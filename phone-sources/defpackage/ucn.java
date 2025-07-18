package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ucn extends vuc implements vvk {
    public static final ucn a;
    private static volatile vvq m;
    public int b;
    public ucv c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;

    static {
        ucn ucnVar = new ucn();
        a = ucnVar;
        vuc.y(ucn.class, ucnVar);
    }

    private ucn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003စ\u0002\u0007င\u0006\bင\u0007\u000bင\n\fဇ\u000b\rင\f\u000eင\r\u000fဇ\u000e", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new ucn();
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
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ucn.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
