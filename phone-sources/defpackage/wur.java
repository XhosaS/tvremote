package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wur extends vuc implements vvk {
    public static final wur a;
    public static final vvd d;
    private static volatile vvq e;
    public wll b;
    public String c = "";
    private int f;

    static {
        wur wurVar = new wur();
        a = wurVar;
        vuc.y(wur.class, wurVar);
        d = vuc.C(wkx.a, wurVar, wurVar, 353725458, vwo.MESSAGE);
    }

    private wur() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001", new Object[]{"f", "b", "c"});
        }
        if (i2 == 3) {
            return new wur();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wur.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
