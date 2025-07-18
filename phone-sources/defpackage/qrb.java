package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qrb extends vuc implements vvk {
    public static final vuk a = new qiu(3);
    public static final qrb b;
    private static volatile vvq d;
    public vuj c = vud.a;

    static {
        qrb qrbVar = new qrb();
        b = qrbVar;
        vuc.y(qrb.class, qrbVar);
    }

    private qrb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"c", vlj.h});
        }
        if (i2 == 3) {
            return new qrb();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (qrb.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
