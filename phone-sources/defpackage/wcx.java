package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wcx extends vuc implements vvk {
    public static final wcx a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        wcx wcxVar = new wcx();
        a = wcxVar;
        vuc.y(wcx.class, wcxVar);
    }

    private wcx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", wcw.class});
        }
        if (i2 == 3) {
            return new wcx();
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
        synchronized (wcx.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void c() {
        vun vunVar = this.b;
        if (vunVar.c()) {
            return;
        }
        this.b = vuc.s(vunVar);
    }
}
