package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbz extends vuc implements vvk {
    public static final vbz a;
    private static volatile vvq e;
    public vuj b = vud.a;
    public vun c = vvt.a;
    public int d;

    static {
        vbz vbzVar = new vbz();
        a = vbzVar;
        vuc.y(vbz.class, vbzVar);
    }

    private vbz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0002\u0000\u0001,\u0002\u001b\u0005\u0004", new Object[]{"b", "c", val.class, "d"});
        }
        if (i2 == 3) {
            return new vbz();
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
        synchronized (vbz.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.c;
        if (vunVar.c()) {
            return;
        }
        this.c = vuc.s(vunVar);
    }
}
