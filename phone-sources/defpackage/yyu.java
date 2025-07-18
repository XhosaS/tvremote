package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyu extends vuc implements vvk {
    public static final yyu a;
    private static volatile vvq c;
    public vuj b = vud.a;

    static {
        yyu yyuVar = new yyu();
        a = yyuVar;
        vuc.y(yyu.class, yyuVar);
    }

    private yyu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"b", yyv.b});
        }
        if (i2 == 3) {
            return new yyu();
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
        synchronized (yyu.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
