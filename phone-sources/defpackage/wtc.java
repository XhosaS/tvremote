package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtc extends vuc implements vvk {
    public static final wtc a;
    public static final vvd b;
    private static volatile vvq c;
    private int d;
    private wly e;
    private byte f = 2;

    static {
        wtc wtcVar = new wtc();
        a = wtcVar;
        vuc.y(wtc.class, wtcVar);
        b = vuc.C(wkx.a, wtcVar, wtcVar, 356586969, vwo.MESSAGE);
    }

    private wtc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "e"});
        }
        if (i2 == 3) {
            return new wtc();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wtc.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
