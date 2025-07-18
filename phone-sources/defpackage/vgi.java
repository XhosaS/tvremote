package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgi extends vuc implements vvk {
    public static final vgi a;
    private static volatile vvq d;
    public vuj b;
    public vuj c;

    static {
        vgi vgiVar = new vgi();
        a = vgiVar;
        vuc.y(vgi.class, vgiVar);
    }

    private vgi() {
        vud vudVar = vud.a;
        this.b = vudVar;
        this.c = vudVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002,", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new vgi();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vgi.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
