package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ngr extends vuc implements vvk {
    public static final ngr a;
    private static volatile vvq n;
    public Object c;
    public int e;
    public vuj g;
    public vuj h;
    public vuj i;
    public vum j;
    public vui k;
    public vuf l;
    public vue m;
    public int b = 0;
    public String d = "";
    public vun f = vvt.a;

    static {
        ngr ngrVar = new ngr();
        a = ngrVar;
        vuc.y(ngr.class, ngrVar);
    }

    private ngr() {
        vud vudVar = vud.a;
        this.g = vudVar;
        this.h = vudVar;
        this.i = vudVar;
        this.j = vuz.a;
        this.k = vtt.a;
        this.l = vtk.a;
        this.m = vsp.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\b\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u00047\u0000\u00057\u0000\u00067\u0000\u00075\u0000\b4\u0000\t3\u0000\n:\u0000\u000bȚ\f'\r'\u000e'\u000f%\u0010$\u0011#\u0012*", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new ngr();
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
        synchronized (ngr.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
