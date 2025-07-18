package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wup extends vuc implements vvk {
    public static final wup a;
    public static final vvd c;
    private static volatile vvq d;
    public wll b;
    private int e;

    static {
        wup wupVar = new wup();
        a = wupVar;
        vuc.y(wup.class, wupVar);
        c = vuc.C(wkx.a, wupVar, wupVar, 349583815, vwo.MESSAGE);
    }

    private wup() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"e", "b"});
        }
        if (i2 == 3) {
            return new wup();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wup.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
