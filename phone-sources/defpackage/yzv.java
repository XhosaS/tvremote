package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzv extends vuc implements vvk {
    public static final yzv a;
    private static volatile vvq g;
    public int b;
    public long c;
    public int d;
    public yzz f;
    private byte h = 2;
    public vun e = vvt.a;

    static {
        yzv yzvVar = new yzv();
        a = yzvVar;
        vuc.y(yzv.class, yzvVar);
    }

    private yzv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", yzw.class, "d", yyv.l, "f"});
        }
        if (i2 == 3) {
            return new yzv();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzv.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void c() {
        vun vunVar = this.e;
        if (vunVar.c()) {
            return;
        }
        this.e = vuc.s(vunVar);
    }
}
