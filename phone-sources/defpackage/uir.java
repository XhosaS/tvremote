package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uir extends vuc implements vvk {
    public static final uir a;
    private static volatile vvq f;
    public int b;
    public vsz c = vsz.b;
    public vun d = vvt.a;
    public boolean e;

    static {
        uir uirVar = new uir();
        a = uirVar;
        vuc.y(uir.class, uirVar);
    }

    private uir() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new uir();
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
        synchronized (uir.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.d;
        if (vunVar.c()) {
            return;
        }
        this.d = vuc.s(vunVar);
    }
}
