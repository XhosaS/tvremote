package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tno extends vuc implements vvk {
    public static final vuk a = new qiu(6);
    public static final tno b;
    private static volatile vvq f;
    public int c;
    public tmp d;
    public vuj e = vud.a;
    private int g;

    static {
        tno tnoVar = new tno();
        b = tnoVar;
        vuc.y(tno.class, tnoVar);
    }

    private tno() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ࠞ", new Object[]{"g", "c", "d", "e", kzn.q});
        }
        if (i2 == 3) {
            return new tno();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tno.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
