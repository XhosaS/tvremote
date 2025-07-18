package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzl extends vuc implements vvk {
    public static final uzl a;
    private static volatile vvq e;
    public int b;
    public int c;
    public vve d = vve.a;

    static {
        uzl uzlVar = new uzl();
        a = uzlVar;
        vuc.y(uzl.class, uzlVar);
    }

    private uzl() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001င\u0000\u00022", new Object[]{"b", "c", "d", uzk.a});
        }
        if (i2 == 3) {
            return new uzl();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uzl.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }

    public final vve b() {
        vve vveVar = this.d;
        if (!vveVar.b) {
            this.d = vveVar.a();
        }
        return this.d;
    }
}
