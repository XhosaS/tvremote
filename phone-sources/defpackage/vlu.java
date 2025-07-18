package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlu extends vuc implements vvk {
    public static final vlu a;
    private static volatile vvq c;
    public vum b = vuz.a;

    static {
        vlu vluVar = new vlu();
        a = vluVar;
        vuc.y(vlu.class, vluVar);
    }

    private vlu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new vlu();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vlu.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vum vumVar = this.b;
        if (vumVar.c()) {
            return;
        }
        this.b = vuc.r(vumVar);
    }
}
