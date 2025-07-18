package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtb extends vuc implements vvk {
    public static final wtb a;
    public static final vvd b;
    private static volatile vvq c;

    static {
        wtb wtbVar = new wtb();
        a = wtbVar;
        vuc.y(wtb.class, wtbVar);
        b = vuc.C(wkx.a, wtbVar, wtbVar, 362624183, vwo.MESSAGE);
    }

    private wtb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new wtb();
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
        synchronized (wtb.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
