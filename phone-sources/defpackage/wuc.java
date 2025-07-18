package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuc extends vuc implements vvk {
    public static final wuc a;
    public static final vvd c;
    private static volatile vvq d;
    public int b;
    private int e;

    static {
        wuc wucVar = new wuc();
        a = wucVar;
        vuc.y(wuc.class, wucVar);
        c = vuc.C(wkx.a, wucVar, wucVar, 479643728, vwo.MESSAGE);
    }

    private wuc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"e", "b", wjk.o});
        }
        if (i2 == 3) {
            return new wuc();
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
        synchronized (wuc.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
