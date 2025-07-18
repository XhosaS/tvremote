package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnu extends vuc implements vvk {
    public static final wnu a;
    private static volatile vvq g;
    public int d;
    public int e;
    public String b = "";
    public String c = "";
    public String f = "";

    static {
        wnu wnuVar = new wnu();
        a = wnuVar;
        vuc.y(wnu.class, wnuVar);
    }

    private wnu() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wnu();
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
        synchronized (wnu.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
