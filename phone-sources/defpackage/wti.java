package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wti extends vuc implements vvk {
    public static final wti a;
    public static final vvd e;
    private static volatile vvq f;
    public int b;
    public vun c = vvt.a;
    public wni d;

    static {
        wti wtiVar = new wti();
        a = wtiVar;
        vuc.y(wti.class, wtiVar);
        e = vuc.C(wkx.a, wtiVar, wtiVar, 512746297, vwo.MESSAGE);
    }

    private wti() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", wth.class, "d"});
        }
        if (i2 == 3) {
            return new wti();
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
        synchronized (wti.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
