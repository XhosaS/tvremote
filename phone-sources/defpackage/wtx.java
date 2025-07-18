package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtx extends vuc implements vvk {
    public static final wtx a;
    public static final vvd e;
    private static volatile vvq f;
    public wls b;
    public wls c;
    public wkp d;
    private int g;
    private byte h = 2;

    static {
        wtx wtxVar = new wtx();
        a = wtxVar;
        vuc.y(wtx.class, wtxVar);
        e = vuc.C(wkx.a, wtxVar, wtxVar, 525000002, vwo.MESSAGE);
    }

    private wtx() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"g", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wtx();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wtx.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
