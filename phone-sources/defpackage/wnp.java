package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnp extends vuc implements vvk {
    public static final wnp a;
    private static volatile vvq d;
    public wno b;
    public vun c = vvt.a;
    private int e;

    static {
        wnp wnpVar = new wnp();
        a = wnpVar;
        vuc.y(wnp.class, wnpVar);
    }

    private wnp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"e", "b", "c", wpm.class});
        }
        if (i2 == 3) {
            return new wnp();
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
        synchronized (wnp.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
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
