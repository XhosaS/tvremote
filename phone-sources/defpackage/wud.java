package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wud extends vuc implements vvk {
    public static final wud a;
    public static final vvd e;
    private static volatile vvq f;
    public int b;
    public wls c;
    public wow d;

    static {
        wud wudVar = new wud();
        a = wudVar;
        vuc.y(wud.class, wudVar);
        e = vuc.C(wkx.a, wudVar, wudVar, 368315869, vwo.MESSAGE);
    }

    private wud() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new wud();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wud.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
