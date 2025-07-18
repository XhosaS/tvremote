package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzg extends vuc implements vvk {
    public static final yzg a;
    private static volatile vvq g;
    public int b;
    public int c;
    public vtl d;
    public long e;
    public int f;

    static {
        yzg yzgVar = new yzg();
        a = yzgVar;
        vuc.y(yzg.class, yzgVar);
    }

    private yzg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003စ\u0002\u0004᠌\u0003", new Object[]{"b", "c", "d", "e", "f", yyv.c});
        }
        if (i2 == 3) {
            return new yzg();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzg.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
