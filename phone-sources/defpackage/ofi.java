package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ofi extends vuc implements vvk {
    public static final ofi a;
    private static volatile vvq j;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public boolean h;
    public ofh i;
    private int k;

    static {
        ofi ofiVar = new ofi();
        a = ofiVar;
        vuc.y(ofi.class, ofiVar);
    }

    private ofi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001\u0004ለ\u0002\u0005ለ\u0003\u0006\u0007\u0007\u0007\bဉ\u0004", new Object[]{"k", "b", "c", "d", "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new ofi();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ofi.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
