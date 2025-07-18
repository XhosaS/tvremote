package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whb extends vuc implements vvk {
    public static final whb a;
    private static volatile vvq f;
    public int b;
    public vun c = vvt.a;
    public vum d;
    public uir e;

    static {
        whb whbVar = new whb();
        a = whbVar;
        vuc.y(whb.class, whbVar);
    }

    private whb() {
        vud vudVar = vud.a;
        this.d = vuz.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0002\u0000\u0001\u001a\u0004\u0014\u0007ဉ\u0001", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new whb();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (whb.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void c() {
        vun vunVar = this.c;
        if (vunVar.c()) {
            return;
        }
        this.c = vuc.s(vunVar);
    }
}
