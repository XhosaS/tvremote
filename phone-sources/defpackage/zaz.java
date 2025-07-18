package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zaz extends vuc implements vvk {
    public static final zaz a;
    private static volatile vvq e;
    public int b;
    public int c;
    private zay f;
    private byte g = 2;
    public int d = 1;

    static {
        zaz zazVar = new zaz();
        a = zazVar;
        vuc.y(zaz.class, zazVar);
    }

    private zaz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", yyv.s, "d", "f"});
        }
        if (i2 == 3) {
            return new zaz();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zaz.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
