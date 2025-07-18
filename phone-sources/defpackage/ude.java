package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ude extends vuc implements vvk {
    public static final ude a;
    private static volatile vvq c;
    private byte d = 2;
    public vun b = vvt.a;

    static {
        ude udeVar = new ude();
        a = udeVar;
        vuc.y(ude.class, udeVar);
    }

    private ude() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", udf.class});
        }
        if (i2 == 3) {
            return new ude();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ude.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.b;
        if (vunVar.c()) {
            return;
        }
        this.b = vuc.s(vunVar);
    }
}
