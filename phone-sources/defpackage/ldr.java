package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldr extends vuc implements vvk {
    public static final ldr a;
    private static volatile vvq f;
    public int b;
    public String c = "";
    public vun d = vvt.a;
    public int e;

    static {
        ldr ldrVar = new ldr();
        a = ldrVar;
        vuc.y(ldr.class, ldrVar);
    }

    private ldr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"b", "c", "d", ldp.class, "e"});
        }
        if (i2 == 3) {
            return new ldr();
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
        synchronized (ldr.class) {
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
