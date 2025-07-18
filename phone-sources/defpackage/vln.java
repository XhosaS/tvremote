package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vln extends vuc implements vvk {
    public static final vln a;
    private static volatile vvq g;
    public int b;
    public int c = 0;
    public Object d;
    public int e;
    public int f;

    static {
        vln vlnVar = new vln();
        a = vlnVar;
        vuc.y(vln.class, vlnVar);
    }

    private vln() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003င\u0000\u0004င\u0001", new Object[]{"d", "c", "b", vlf.class, vmy.class, "e", "f"});
        }
        if (i2 == 3) {
            return new vln();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vln.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
