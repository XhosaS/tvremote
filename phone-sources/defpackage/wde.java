package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wde extends vuc implements vvk {
    public static final wde a;
    private static volatile vvq m;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;
    public long l;

    static {
        wde wdeVar = new wde();
        a = wdeVar;
        vuc.y(wde.class, wdeVar);
    }

    private wde() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"b", "c", "e", "f", "g", "d", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new wde();
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
        synchronized (wde.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
