package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uit extends vuc implements vvk {
    public static final uit a;
    private static volatile vvq n;
    public int b;
    public Object d;
    public Object f;
    public boolean h;
    public vsz j;
    public int k;
    public long l;
    public vsz m;
    public int c = 0;
    public int e = 0;
    public String g = "";
    public vun i = vvt.a;

    static {
        uit uitVar = new uit();
        a = uitVar;
        vuc.y(uit.class, uitVar);
    }

    private uit() {
        vud vudVar = vud.a;
        vsz vszVar = vsz.b;
        this.j = vszVar;
        this.m = vszVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u000b\u0002\u0001\u0001\u000f\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u00027\u0000\u0003\u001a\u0005ည\u0002\u0007;\u0001\t᠌\u0005\n;\u0001\u000bဇ\u0001\rဎ\u0007\u000eည\b\u000f5\u0000", new Object[]{"d", "c", "f", "e", "b", "g", "i", "j", "k", ubu.t, "h", "l", "m"});
        }
        if (i2 == 3) {
            return new uit();
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
        vvq vvqVar = n;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uit.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
