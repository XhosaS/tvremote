package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdh extends vuc implements vvk {
    public static final wdh a;
    private static volatile vvq f;
    public int b;
    public int c = 0;
    public Object d;
    public wde e;

    static {
        wdh wdhVar = new wdh();
        a = wdhVar;
        vuc.y(wdh.class, wdhVar);
    }

    private wdh() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", wcy.class, wcz.class, wdj.class, wdd.class, wdb.class, wdi.class});
        }
        if (i2 == 3) {
            return new wdh();
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
        synchronized (wdh.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
